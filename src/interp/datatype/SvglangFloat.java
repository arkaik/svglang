package interp.datatype;

import interp.Data;
import parser.*;

public class SvglangFloat extends Data
{
    public SvglangFloat(float v)
    {
        super(v);
    }

    public String getType()
    {
       return "Float";
    }

    public boolean isFloat() { return true; }

	public float getFloatValue() {
        return (float) value;
    }

	public String toString()
    {
        return Float.toString((float) value);
    }

	private void checkDivZero(Data d) {
        if ((float) d.getValue() == 0.) throw new RuntimeException ("Division by zero");
    }

	public void evaluateArithmetic (int op, Data d) {

        float fv = (float) value;
        switch (op) {
            case AslLexer.PLUS: fv += (float) d.getValue(); break;
            case AslLexer.MINUS: fv -= (float) d.getValue(); break;
            case AslLexer.MUL: fv *= (float) d.getValue(); break;
            case AslLexer.DIV: checkDivZero(d); fv /= (float) d.getValue(); break;
            case AslLexer.MOD: checkDivZero(d); fv %= (float) d.getValue(); break;
            default: assert false;
        }
        value = fv;
    }

    public Data evaluateRelational (int op, Data d) {
        //assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new SvglangBoolean((float) value == (float) d.getValue());
            case AslLexer.NOT_EQUAL: return new SvglangBoolean((float) value != (float) d.getValue());
            case AslLexer.LT: return new SvglangBoolean((float) value < (float) d.getValue());
            case AslLexer.LE: return new SvglangBoolean((float) value <= (float) d.getValue());
            case AslLexer.GT: return new SvglangBoolean((float) value > (float) d.getValue());
            case AslLexer.GE: return new SvglangBoolean((float) value >= (float) d.getValue());
            default: assert false;
        }
        return null;
    }

    public SvglangFloat copy()
    {
        return new SvglangFloat((Float) value);
    }
}
