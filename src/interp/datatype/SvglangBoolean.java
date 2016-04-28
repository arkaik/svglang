package interp.datatype;

import interp.Data;
import parser.*;

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
    
	public String toString()
    {
        return value == 1 ? "true" : "false";
    }
    
	public Data evaluateRelational (int op, Data d) {
        //assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new SvglangBoolean(value == d.getValue());
            case AslLexer.NOT_EQUAL: return new SvglangBoolean(value != d.getValue());
            case AslLexer.LT: return new SvglangBoolean(value < d.getValue());
            case AslLexer.LE: return new SvglangBoolean(value <= d.getValue());
            case AslLexer.GT: return new SvglangBoolean(value > d.getValue());
            case AslLexer.GE: return new SvglangBoolean(value >= d.getValue());
            default: assert false;
        }
        return null;
    }
}