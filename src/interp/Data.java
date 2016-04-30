/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;
import java.util.ArrayList;

public abstract class Data<T> {

 /** Value of the data */
    protected T value;


    /** Default Constructor */
    public Data() {  }

    /** Constructor Template */
    public Data(T v) { value = v; }

    /** Copy constructor */
    public Data(Data<T> d) { value = d.value; }

    /** Returns the type of data */
    public abstract String getType();

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return false; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return false; }

	/** Indicates whether the data is Float */
    public boolean isFloat() { return false; }

    /** Indicates whether the data is float */
    public boolean isFloat() { return type == Type.FLOAT; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return false; }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        throw new RuntimeException ("Incorrect type");
    }

	/**
     * Gets the value of an float data.
     */
    public float getFloatValue() {
        throw new RuntimeException ("Incorrect type");
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        throw new RuntimeException ("Incorrect type");
    }


    /** Defines a new Template value */
	public void setValue(T v) {
        value = v;
    }

	public T getValue() {
        return value;
    }

	/** Defines the value from another data */
	public void setData(Data<T> d) {
        value = d.value;
    }

//     /** Defines a Boolean value for the data */
//     public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }
//
//     /** Defines an integer value for the data */
//     public void setValue(int v) { type = Type.INTEGER; value = v; }
//
//     /** Defines an integer value for the data */
//     public void setValue(float v) { type = Type.FLOAT; fvalue = v; }
//
//     /** Copies the value from another data */
//     public void setData(Data d) { type = d.type; value = d.value; }

    /** Returns a string representing the data in textual form. */
    public abstract String toString();

    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        throw new RuntimeException ("INCORRECT TYPE DIVISION 0");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */

    public void evaluateArithmetic (int op, Data d) {
        throw new RuntimeException ("INCORRECT TYPE FOR ARITHMETIC OP");

    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
		throw new RuntimeException ("INCORRECT TYPE FOR EVALUATERELATIONAL OP");
	}
}
