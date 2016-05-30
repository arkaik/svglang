package interp.datatype;

import java.text.MessageFormat;
import parser.*;

public class SvglangLine extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
	protected float x2;
	protected float y2;

    public SvglangLine(float x, float y, float xx, float yy)
    {
        value = null;
        posx = x;
        posy = y;
        x2 = xx;
        y2 = yy;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";	//Black;
		name = "_";
		code =	"var {0} = document.createElementNS(svgNS, \"line\");\n"+
				"{0}.setAttribute(\"id\",\"{0}\");\n"+
				"{0}.setAttribute(\"x1\",\"{1}\");\n"+
				"{0}.setAttribute(\"y1\",\"{2}\");\n"+
				"{0}.setAttribute(\"x2\",\"{3}\");\n"+
				"{0}.setAttribute(\"y2\",\"{4}\");\n";
    }

    public String getType(){
		return "SvglangLine";
    }


	public String toString(){
		return "Rectangle";	//Afegir atributs
	}

	//GETTERS
	public float getX2(){
		return x2;
	}

	public float getY2(){
		return y2;
	}

	public String getFullCode() {
        return MessageFormat.format(code, name, posx, posy, x2, y2);
    }

	//SETTERS
	public void setX2(float h){
		x2 = h;
	}

	public void setY2(float w){
		y2 = w;
	}

	public boolean isLine() { return true; }

	public SvglangLine copy() {
        return new SvglangLine(posx, posy, x2, y2);
    }

}
