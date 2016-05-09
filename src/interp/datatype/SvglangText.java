package interp.datatype;

import interp.Data;
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
        value = null;
        posx = x;
        posy = y;
        size = 1;
        text = t;
        rot = 0;
        scalex = scaley = 1;
        color = "#000000";
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

	//SETTERS
	public void setText(String t){
		text = t;
	}

	public void setSize(float s){
		size = s;
	}

	//public boolean isRectangle() { return true; }

}
