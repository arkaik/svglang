package interp.datatypes;

import interp.DataType;

public class svglangBoolean extends Data
{
    public svglangBoolean(Boolean v)
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