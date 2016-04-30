package interp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
//import java.lang.Thread.State;
import javax.xml.transform.stream.StreamResult;
import java.io.OutputStreamWriter;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class WebExecution extends Application {

    public void start(Stage stage) {
        //stage = new Stage();
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);

        try {
            String content = new String(Files.readAllBytes(Paths.get("default.js")));
            webEngine.loadContent("<html>"
                +"<head><script>"
                +"function setContent() {\n"
                +content
                +"} </script></head>"
                +"<body onLoad='setContent()'>"
                +"</body>"
                +"</html>");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        webEngine.getLoadWorker().stateProperty().addListener(
            new ChangeListener<State>() {
                public void changed(ObservableValue ov, State oldState, State newState) {

                    if (newState == Worker.State.SUCCEEDED) {

                        Document doc = webEngine.getDocument();
                        try {
                            Transformer transformer = TransformerFactory.newInstance().newTransformer();
                            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
                            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

                            transformer.transform(new DOMSource(doc),
                                    new StreamResult(new OutputStreamWriter(System.out, "UTF-8")));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }


                    }
                }
            });

        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
    }

}
