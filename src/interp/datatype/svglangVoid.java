package interp.datatypes;

import interp.DataType;

public class svglangVoid extends Data
{
    public svglangVoid()
    {
        value = null;
    }

    public String getType()
    {
       return "void";
    }
    
    public boolean isVoid() { return true; }
    
	public String toString();
    {
        return "null";
    }
    
	public Data evaluateRelational (int op, Data d) {
        throw new RuntimeException ("Evaluate a Void Type");
}