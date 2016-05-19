package interp.datatype;

import interp.Data;
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
