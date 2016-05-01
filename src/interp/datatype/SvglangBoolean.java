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
        return (boolean) value;
    }

	public String toString()
    {
        return Boolean.toString((boolean) value);
    }

	public Data evaluateBoolean (int op, Data d) {
        switch (op) {
            case AslLexer.AND: return new SvglangBoolean((boolean) value && (boolean) d.getValue());
            case AslLexer.OR: return new SvglangBoolean( (boolean) value || (boolean) d.getValue());
            default: assert false;
        }
        return null;
    }
}
