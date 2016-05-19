package interp.datatype;

import java.text.MessageFormat;
import parser.*;

public class SvglangPath extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
//     protected String name;
//     protected String code;
        protected String d;

    public SvglangPath(float x, float y)
    {
        super();
        posx = x;
        posy = y;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";	//Black;
        code = "var {0} = document.createElementNS(svgNS, \"path\");\n"+
                "{0}.setAttribute(\"id\",\"{0}\");\n"+
                "{0}.setAttribute(\"d\",\"{1}\");\n"+
                "{0}.style.fill = \"none\";\n"+
                "{0}.style.stroke = \"#000000\";\n";
    }

    public String getType(){
		return "SvglangPath";
    }


	public String toString(){
		return "Path";	//Afegir atributs
	}

	//GETTERS
    public String getD() {
        return d;
    }

    public String getFullCode() {
        return MessageFormat.format(code, name, d);
    }

    public void setD(String dinst) {
        d = dinst;
    }
	public boolean isPath() { return true; }

	public SvglangPath copy() {
        SvglangPath sp = new SvglangPath(posx, posy);
        sp.setName(name); sp.setD(d);
        return sp;
    }
}
