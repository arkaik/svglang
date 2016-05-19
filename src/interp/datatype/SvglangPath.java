package interp.datatype;

import interp.Data;
import parser.*;

public class SvglangPath extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;

    public SvglangPath(float x, float y)
    {
        value = null;
        posx = x;
        posy = y;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";	//Black;
    }

    public String getType(){
		return "SvglangPath";
    }


	public String toString(){
		return "Path";	//Afegir atributs
	}

	//GETTERS

	public boolean isPath() { return true; }

	public SvglangPath copy() {
        return new SvglangPath(posx, posy);
    }
}
