package interp.datatype;

import java.text.MessageFormat;
import parser.*;

public class SvglangCircle extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
	protected float radius;

    public SvglangCircle(float x, float y, float r)
    {
        value = null;
        posx = x;
        posy = y;
        radius = r;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";
		name = "_";
		code = 	"var {0} = document.createElementNS(svgNS, \"circle\");\n"+
				"{0}.setAttribute(\"id\",\"{0}\");\n"+
				"{0}.setAttribute(\"cx\",\"{1}\");\n"+
				"{0}.setAttribute(\"cy\",\"{2}\");\n"+
				"{0}.setAttribute(\"r\",\"{3}\");";

    }

    public String getType(){
		return "SvglangRectangle";
    }


	public String toString(){
		return "Circle";	//Afegir atributs
	}

	//GETTERS
	public float getRadius(){
		return radius;
	}

	public String getFullCode() {
        return MessageFormat.format(code, name, posx, posy, radius);
    }

	//SETTERS
	public void setRadius(float r){
		radius = r;
	}

	public boolean isCircle() { return true; }

	public SvglangCircle copy() {
		SvglangCircle sc = new SvglangCircle(posx, posy, radius);
		sc.setName(name);
		return sc;
    }

}
