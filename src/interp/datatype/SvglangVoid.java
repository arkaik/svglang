package interp.datatype;

import interp.Data;

public class SvglangVoid extends Data
{
    public SvglangVoid()
    {
        value = null;
    }

    public String getType()
    {
       return "void";
    }
    
    public boolean isVoid() { return true; }
    
	public String toString()
    {
        return "null";
    }
    
}