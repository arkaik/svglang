package interp.datatype;

import interp.Data;
import parser.*;

public class SvglangInteger extends Data
{
    public SvglangInteger(int v)
    {
        super(v);
    }

	/** Copy constructor */
    public SvglangInteger(Data d) { super(d); }

    public String getType()
    {
       return "Integer";
    }

    public boolean isInteger() { return true; }

	public int getIntegerValue() {
        return (int) value;
    }

	public String toString()
    {
        return Integer.toString((int) value);
    }

	private void checkDivZero(Data d) {
        if ((int) d.getValue() == 0) throw new RuntimeException ("Division by zero");
    }

	public void evaluateArithmetic (int op, Data d) {
        //assert type == Type.INTEGER && d.type == Type.INTEGER;
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

    	public Data evaluateRelational (int op, Data d) {
        switch (op) {
            case AslLexer.EQUAL: return new SvglangBoolean( (int) value == (int) d.getValue());
            case AslLexer.NOT_EQUAL: return new SvglangBoolean( (int) value != (int) d.getValue());
            case AslLexer.LT: return new SvglangBoolean( (int) value < (int) d.getValue());
            case AslLexer.LE: return new SvglangBoolean( (int) value <= (int) d.getValue());
            case AslLexer.GT: return new SvglangBoolean( (int) value > (int) d.getValue());
            case AslLexer.GE: return new SvglangBoolean( (int) value >= (int) d.getValue());
            default: assert false;
        }
        return null;
    }
}
