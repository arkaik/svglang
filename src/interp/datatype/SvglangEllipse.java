package interp.datatype;

import java.text.MessageFormat;
import parser.*;

public class SvglangEllipse extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
	protected float rx;
	protected float ry;

    public SvglangEllipse(float x, float y, float r1, float r2)
    {
        value = null;
        posx = x;
        posy = y;
        rx = r1;
        ry = r2;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";	//Black;
		name = "_";
		code = 	"var {0} = document.createElementNS(svgNS, \"ellipse\");\n"+
				"{0}.setAttribute(\"id\",\"{0}\");\n"+
				"{0}.setAttribute(\"cx\",\"{0}\");\n"+
				"{0}.setAttribute(\"cy\",\"{1}\");\n"+
				"{0}.setAttribute(\"rx\",\"{2}\");\n"+
				"{0}.setAttribute(\"ry\",\"{3}\");";
    }

    public String getType(){
		return "SvglangEllipse";
    }


	public String toString(){
		return "Circle";	//Afegir atributs
	}

	//GETTERS
	public float getRx(){
		return rx;
	}

	public float getRy(){
		return ry;
	}

	public String getFullCode() {
        return MessageFormat.format(code, name, posx, posy, rx, ry);
    }

	//SETTERS
	public void setRx(float r){
		rx = r;
	}

	public void setRy(float r){
		ry = r;
	}

	public boolean isEllipse() { return true; }

	public SvglangEllipse copy() {
        return new SvglangEllipse(posx, posy, rx, ry);
    }
}
