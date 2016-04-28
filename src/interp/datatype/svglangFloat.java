package interp.datatypes;

import interp.DataType;

public class svglangFloat extends Data
{
    public svglangFloat(float v)
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
    
	public String toString();
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
}