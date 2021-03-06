package interp.datatype;

import interp.Data;
import java.util.ArrayList;
import parser.*;

public class SvglangArray extends Data
{
	protected String subtype;
	protected ArrayList<Object> value;
	protected int length;

    public SvglangArray(int i, Object o)
    {
		String string = o.getClass().toString();
		String[] parts = string.split("\\.");
		subtype = parts[parts.length-1];
		
		ArrayList<Object> v = new ArrayList<Object>();
		switch (subtype) {
			case "Integer":
				for (int j = 0; j < i; j++){
					v.add(0);
				}
				break;
			case "Boolean":
				for (int j = 0; j < i; j++){
					v.add(false);
				}
				break;
			case "Float":
				for (int j = 0; j < i; j++){
					v.add(0.);
				}
				break;
			case "String":
				for (int j = 0; j < i; j++){
					v.add("");
				}
				break;
			default: throw new RuntimeException ("Cas variable no tractada");
		}

		v.add(o);
        value = v;
        length = i+1;
    }

	/** Copy constructor */
    public SvglangArray(Data d) { super(d); }

    public String getType()
    {
       return ("Array<" + subtype +">");
    }
    
	public String getSubType()
    {
       return subtype;
    }

    public boolean isArray() { return true; }
    
	public void setValue(int i, Object o)
    {
		switch (subtype) {
			case "Integer":
				for (int j = value.size(); j <= i; j++){
					value.add(0);
				}
				break;
			case "Boolean":
				for (int j = value.size(); j <= i; j++){
					value.add(false);
				}
				break;
			case "Float":
				for (int j = value.size(); j <= i; j++){
					value.add(0.);
				}
			case "String":
				for (int j = 0; j < i; j++){
					value.add("");
				}
				break;
			default: throw new RuntimeException ("Cas variable no tractada ");
		}
		
		//value.add(o);
		if (i > length) length = i+1;
		value.set(i, o);
    }
    
	public Object getValue(int i)
    {
//        ArrayList<Object> o = (ArrayList<Object>)value;
       return value.get(i);
    }
    
	public int getLength()
    {
       return length;
    }

// 	public int getIntegerValue() {
//         return (int) value;
//     }

	public String toString()
    {
        return ("Array<" + subtype +">");
    }

// 	private void checkDivZero(Data d) {
//         if ((int) d.getValue() == 0) throw new RuntimeException ("Division by zero");
//     }
// 
// 	public void evaluateArithmetic (int op, Data d) {
//         //assert type == Type.INTEGER && d.type == Type.INTEGER;
//         int iv = (int) value;
//         switch (op) {
//             case AslLexer.PLUS: iv += (int) d.getValue(); break;
//             case AslLexer.MINUS: iv -= (int) d.getValue(); break;
//             case AslLexer.MUL: iv *= (int) d.getValue(); break;
//             case AslLexer.DIV: checkDivZero(d); iv /= (int) d.getValue(); break;
//             case AslLexer.MOD: checkDivZero(d); iv %= (int) d.getValue(); break;
//             default: assert false;
//         }
//         value = iv;
//     }
// 
//     	public Data evaluateRelational (int op, Data d) {
//         assert getType() == d.getType();
//         switch (op) {
//             case AslLexer.EQUAL: return new SvglangBoolean( (int) value == (int) d.getValue());
//             case AslLexer.NOT_EQUAL: return new SvglangBoolean( (int) value != (int) d.getValue());
//             case AslLexer.LT: return new SvglangBoolean( (int) value < (int) d.getValue());
//             case AslLexer.LE: return new SvglangBoolean( (int) value <= (int) d.getValue());
//             case AslLexer.GT: return new SvglangBoolean( (int) value > (int) d.getValue());
//             case AslLexer.GE: return new SvglangBoolean( (int) value >= (int) d.getValue());
//             default: assert false;
//         }
//         return null;
//     }

public SvglangArray copy()	//FALT IMPLEMENTAR BÉ
    {
        return new SvglangArray(0, value);
    }
}
