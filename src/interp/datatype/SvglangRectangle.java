package interp.datatype;

import interp.Data;
import parser.*;
import java.awt.Color;

public class SvglangRectangle extends SvglangObject
{

//     protected float posx;
//     protected float posy;
//     protected float rot;
//     protected float scalex;
//     protected float scaley;
//     protected Color color;
	protected float height;
	protected float width;
    
    public SvglangRectangle(float x, float y, float w, float h)
    {
        value = null;
        posx = x;
        posy = y;
        width = w;
        height = h;
        rot = 0;
        scalex = scaley = 1;
        color = Color.black;
    }

    public String getType(){
		return "SvglangRectangle";
    }


	public String toString(){
		return "Rectangle";	//Afegir atributs
	}
	
	//GETTERS
	public float getHeight(){
		return height;
	}
	
	public float getWidth(){
		return width;
	}
	
	//SETTERS
	public void setHeigth(float h){
		height = h;
	}
	
	public void setWidth(float w){
		width = w;
	}
	
	//public boolean isRectangle() { return true; }

}
