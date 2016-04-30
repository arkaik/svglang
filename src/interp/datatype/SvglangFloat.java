package interp.datatype;

import interp.Data;

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
        return value;
    }
    
	public String toString()
    {
        return Float.toString(value);
    }
    
	private void checkDivZero(Data d) {
        if (d.value == 0.) throw new RuntimeException ("Division by zero");
    }
    
	public void evaluateArithmetic (int op, Data d) {
        //assert type == Type.INTEGER && d.type == Type.INTEGER;
        switch (op) {
            case AslLexer.PLUS: value += d.value; break;
            case AslLexer.MINUS: value -= d.value; break;
            case AslLexer.MUL: value *= d.value; break;
            case AslLexer.DIV: checkDivZero(d); value /= d.value; break;
            case AslLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }
    	public Data evaluateRelational (int op, Data d) {
        //assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new SvglangFloat(value == d.getValue());
            case AslLexer.NOT_EQUAL: return new SvglangFloat(value != d.getValue());
            case AslLexer.LT: return new SvglangFloat(value < d.getValue());
            case AslLexer.LE: return new SvglangFloat(value <= d.getValue());
            case AslLexer.GT: return new SvglangFloat(value > d.getValue());
            case AslLexer.GE: return new SvglangFloat(value >= d.getValue());
            default: assert false;
        }
        return null;
    }
}