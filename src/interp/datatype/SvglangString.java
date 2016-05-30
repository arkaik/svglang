package interp.datatype;

import interp.Data;
import parser.*;

public class SvglangString extends Data
{
    public SvglangString(String v)
    {
        super(v);
    }

    public SvglangString(Data d) { super(d); }
    
    public String getType()
    {
       return "String";
    }

    public boolean isString() { return true; }

		public String getStringValue() {
        return (String) value;
    }

		public String toString()
    {
        return (String) value;
    }

    public SvglangString copy()
    {
        return new SvglangString((String) value);
    }
}
