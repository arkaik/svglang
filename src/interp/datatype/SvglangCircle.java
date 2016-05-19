package interp.datatype;

import interp.Data;
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

	//SETTERS
	public void setRadius(float r){
		radius = r;
	}

	public boolean isCircle() { return true; }

	public SvglangCircle copy() {
        return new SvglangCircle(posx, posy, radius);
    }

}
