package interp.datatype;

import interp.Data;
import parser.*;

public class SvglangString extends Data
{
    public SvglangString(String v)
    {
        super(v);
    }

	/** Copy constructor */
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

	/*private void checkDivZero(Data d) {
        if ((int) d.getValue() == 0) throw new RuntimeException ("Division by zero");
    }

	public void evaluateArithmetic (int op, Data d) {
        int iv = (int) value;
        switch (op) {
            case AslLexer.PLUS: iv += (int) d.getValue(); break;
            case AslLexer.MINUS: iv -= (int) d.getValue(); break;
            case AslLexer.MUL: iv *= (int) d.getValue(); break;
            case AslLexer.DIV: checkDivZero(d); iv /= (int) d.getValue(); break;
            case AslLexer.MOD: checkDivZero(d); iv %= (int) d.getValue(); break;
            default: assert false;
        }
        value = iv;
    }
*/
    public Data evaluateRelational (int op, Data d) {
        assert getType() == d.getType();
        switch (op) {
            case AslLexer.EQUAL: return new SvglangBoolean( ((String) value).equals((String) d.getValue()));
            case AslLexer.NOT_EQUAL: return new SvglangBoolean(!((String) value).equals((String) d.getValue()));
            case AslLexer.LT: return new SvglangBoolean( ((String) value).compareTo( (String) d.getValue()) < 0);
            case AslLexer.LE: return new SvglangBoolean( ((String) value).compareTo((String) d.getValue()) <= 0);
            case AslLexer.GT: return new SvglangBoolean( ((String) value).compareTo((String) d.getValue()) > 0);
            case AslLexer.GE: return new SvglangBoolean( ((String) value).compareTo((String) d.getValue()) >= 0);
            default: assert false;
        }
        return null;
    }

    public SvglangString copy()
    {
        return new SvglangString((String) value);
    }
}
