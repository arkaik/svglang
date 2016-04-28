package interp.datatype;

import interp.Data;

public class SvglangBoolean extends Data
{
    public SvglangBoolean(Boolean v)
    {
        super(v);
    }

    public String getType()
    {
       return "Boolean";
    }
    
    public boolean isBoolean() { return true; }
    
	public boolean getBooleanValue() {
        return value == 1;
    }
    
	public String toString();
    {
        return value == 1 ? "true" : "false";
    }
}