package interp.datatype;

import interp.Data;
import parser.*;

public abstract class SvglangObject extends Data
{
    protected float posx;
    protected float posy;
    protected float rot;
    protected float scalex;
    protected float scaley;
    protected int num_transform;
    protected String color;

    public SvglangObject()
    {
        value = null;
    }

    public abstract String getType();


	public abstract String toString();

	//GETTERS
	public float getPosx(){
		return posx;
	}

	public float getPosy(){
		return posy;
	}

	public float getRot(){
		return rot;
	}

	public float getScalex(){
		return scalex;
	}

	public float getScaley(){
		return scaley;
	}

	public String getColor(){
		return color;
	}

	//SETTERS
	public void setPosx(float x){
		posx = x;
	}

	public void setPosy(float y){
		posy = y;
	}

	public void setRot(float r){
		rot = r;
	}

	public void setScalex(float s){
		scalex = s;
	}

	public void setScaley(float s){
		scaley = s;
	}

	public void setColor(String c){
		color = c;
	}

    public void setNumTransform(int x){
		num_transform = x;
	}

    public int getNumTransform(){
		return num_transform;
	}

}
