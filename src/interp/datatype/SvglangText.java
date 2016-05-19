package interp.datatype;

import java.text.MessageFormat;
import parser.*;

public class SvglangText extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
	protected String text;
	protected float size;

    public SvglangText( float x, float y, String t)
    {
        super();
        posx = x;
        posy = y;
        size = 1;
        text = t;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";	//Black
		code = 	"var {0} = document.createElementNS(svgNS, \"text\");\n"+
				"{0}.setAttribute(\"id\",\"{0}\");\n"+
				"{0}.setAttribute(\"x\",\"{1}\");\n"+
				"{0}.setAttribute(\"y\",\"{2}\");\n"+
				"var _t = document.createTextNode(\"{3}\")\n"+
				"{0}.appendChild(_t);";
    }

    public String getType(){
		return "SvglangText";
    }


	public String toString(){
		return ("SvglangText: " + text);	//Afegir atributs
	}

	//GETTERS
	public String getText(){
		return text;
	}

	public float getSize(){
		return size;
	}

	public String getFullCode() {
        return MessageFormat.format(code, name, posx, posy, text);
    }

	//SETTERS
	public void setText(String t){
		text = t;
	}

	public void setSize(float s){
		size = s;
	}

	public boolean isText() { return true; }

	public SvglangText copy() {
        return new SvglangText(posx, posy, text);
    }

}
