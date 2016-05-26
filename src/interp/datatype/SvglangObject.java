package interp.datatype;

import interp.Data;
import java.text.MessageFormat;
import parser.*;

public abstract class SvglangObject extends Data
{
    //protected Object value;
    protected float posx;
    protected float posy;
    protected float rot;
    protected float scalex;
    protected float scaley;
    protected int num_transform;
    protected String color;
    protected String name;
    protected String code;
    protected String tcode;

    public SvglangObject()
    {
        value = null;
        name = "_";
        tcode = "";
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

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    // Return formatted code
    public abstract String getFullCode();

    public int getNumTransform(){
		return num_transform;
	}

    public String getTransformCode(){
        return tcode;
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

    public void setName(String n) {
        name = n;
    }

    public void setCode(String c) {
        code = c;
    }

    public void setNumTransform(int x){
		num_transform = x;
	}
    public void addTransformCode(String tc){
        tcode = tcode+tc+" ";
    }

    public abstract Data copy();

}
