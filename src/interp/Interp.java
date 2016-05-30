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

import parser.*;
import interp.datatype.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.text.MessageFormat;
import java.io.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /** Default output **/
    private PrintWriter writer;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;

    /** Show or not the result viewer*/
    private boolean show = false;

    /** Number of anonym variables in interpret */
    private int anon = 0;

    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }

    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            if (f.getType() == AslLexer.FUNC) {
                String fname = f.getChild(0).getText();
                if (FuncName2Tree.containsKey(fname)) {
                    throw new RuntimeException("Multiple definitions of function " + fname);
                }
                FuncName2Tree.put(fname, f);
            }
            else if (f.getType() == AslLexer.MACRO)
            {
                show = true;
            }
        }
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.FLOAT: T.setFloatValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}

    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {

        if (funcname.equals("main")) {
            try {
                writer = new PrintWriter("default.js", "UTF-8");
                writer.println("var svg = document.createElementNS(\"http://www.w3.org/2000/svg\", \"svg\");");
                writer.println("var svgNS = svg.namespaceURI;");
                writer.println("var _defs = document.createElementNS(svgNS, \"defs\");");
                writer.println("svg.appendChild(_defs);");
                writer.println("var _anon = 0;");
                writer.println("var _loop = false;");
                writer.println("document.body.appendChild(svg);");
            }
            catch (Exception e) {
                System.err.println("DANGER DANGER: " + e.getMessage());
            }
        }

        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);

        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);

        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new SvglangVoid();

        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);

        // Destroy the activation record
        Stack.popActivationRecord();

        if (funcname.equals("main")) {
            writer.close();
            if (show) javafx.application.Application.launch(WebExecution.class);
        }
        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;

        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }

        return null;
    }

    /**
     * Executes an instruction.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;

        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case AslLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));

                if (value instanceof SvglangObject) {
                        SvglangObject so = (SvglangObject) value;
                        String name = t.getChild(0).getText();
                        if (t.getChild(0).getText().equals("anon")) {
                            anon += 1;
                            name = "anon__"+anon;
                        }
                        so.setName(name);
                        writer.print(so.getFullCode());
                        writer.println("_defs.appendChild("+name+");");
                        Stack.defineVariable(t.getChild(0).getText(), so);
                }
                else Stack.defineVariable(t.getChild(0).getText(), value);

                return null;

			//Array Assigment
            case AslLexer.ARRAY_ASSIGN:
				value = evaluateExpression(t.getChild(2));
				Data index = evaluateExpression(t.getChild(1));
				Stack.defineVariable (t.getChild(0).getText(), index, value);
				return null;

            // If-then-else
            case AslLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new SvglangVoid(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case AslLexer.READ:
                String token = null;
                token = stdin.next();
                //TODO rehacer esta parte
                Data val = null;
                if (token.matches("^\\d+"))
                {
                    val = new SvglangInteger(Integer.parseInt(token));
                }
                else if (token.matches("^\\d+(\\.\\d+)?"))
                {
                    val = new SvglangFloat(Float.parseFloat(token));
                }

                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case AslLexer.WRITE:
                AslTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == AslLexer.STRING) {
                    System.out.format(v.getStringValue() + "\n");
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString() + "\n");
                return null;

            case AslLexer.DRAW:
                //TODO <use> & <defs> & <symbol>
                writer.println("var _u = document.createElementNS(svgNS, \"use\");");

                String id = t.getChild(0).getText();
                String name = id;
                if (id.equals("anon")) name = "anon__"+anon;

                SvglangObject so  = (SvglangObject) Stack.getVariable(id);
                float px = so.getPosx(); float py = so.getPosy();
                writer.println("_u.setAttributeNS(\"http://www.w3.org/1999/xlink\", \"xlink:href\", \"#"+name+"\");");
                writer.println("_u.setAttribute(\"x\",\""+px+"\");");
                writer.println("_u.setAttribute(\"y\",\""+py+"\");");
                writer.println("svg.appendChild(_u);");
                return null;

            case AslLexer.FILL:
                String id1 = t.getChild(0).getText();
                String name1 = id1;
                if (id1.equals("anon")) name1 = "anon__"+anon;
                //CANVI IMPORTANT PER DESCOMENTAR

                SvglangString expr = (SvglangString)evaluateExpression(t.getChild(1));
                checkColor(expr);
                writer.println(name1+".style.fill = \""+ expr.toString() +"\";");
                //writer.println(name1+".style.fill = \""+t.getChild(1).getText()+"\";");
                return null;

            case AslLexer.STROKE:
                SvglangString colex = (SvglangString)evaluateExpression(t.getChild(1));
                checkColor(colex);
                writer.println(t.getChild(0).getText()+".style.stroke = \""+t.getChild(1).getText()+"\";");
                writer.println(t.getChild(0).getText()+".style['stroke-width'] = \""+colex.toString()+"\";");
                return null;

            case AslLexer.TRANSFORM:
                executeTransformation(t.getChild(0));
                return null;

            case AslLexer.ANIMATION:
                executeAnimation(t.getChild(0));
                return null;

            // Function call
            case AslLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            case AslLexer.DISP:
                evaluateDisplay(t.getChild(0));
                return null;

            case AslLexer.REL:
                relativeSet(t);
                return null;

            case AslLexer.ABS:
                absoluteSet(t);
                return null;

            case AslLexer.CLICK:
                String cid = t.getChild(0).getText();
                String funcname = t.getChild(1).getText();
                System.out.println(cid+" "+funcname);
                writer.println( funcname+" = function() {\n"/*+
                                "\tvar "+cid+" = document.getElementById(\""+cid+"\");\n"*/);
                executeFunction(funcname, t.getChild(2));
                writer.println( "}\n"+
                                cid+".setAttribute(\"onclick\", \"window."+funcname+"()\");\n");
                return null;

            case AslLexer.LOOP:
                assert t.getChild(0).getType() == AslLexer.REL || t.getChild(0).getType() == AslLexer.ABS || t.getChild(0).getType() == AslLexer.TRANSFORM;
                writer.println("_loop = true;");
                executeInstruction(t.getChild(0));
                writer.println("_loop = false;");
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        //assert false;
        return null;
    }

    private Data executeAnimation (AslTree t) {
        String id = t.getChild(0).getText();
        String name = id;
        if (id.equals("anon")) name = "anon__"+anon;
        SvglangObject so = (SvglangObject) Stack.getVariable(id);
        AslTree args = t.getChild(1);
        switch (t.getType()) {
            case AslLexer.MOVEMENT:
                float ox = so.getPosx(); float oy = so.getPosy();

                Float ftx = data2float(evaluateExpression(args.getChild(0)));
                Float fty = data2float(evaluateExpression(args.getChild(1)));

                so.setPosx(ftx); so.setPosy(fty);
                int nlt = so.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"translate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ox+" "+oy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+ftx+" "+fty+"\")");

                Data c1 = evaluateExpression(args.getChild(2));

                if (args.getChildCount() == 4) {
                    Data c2 = evaluateExpression(args.getChild(3));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                so.setNumTransform(nlt+1);
                break;
            case AslLexer.ROTATION:
                float rot = so.getRot();
                Float fr = data2float(evaluateExpression(args.getChild(1)));
                Float fax = data2float(evaluateExpression(args.getChild(2)));
                Float fay = data2float(evaluateExpression(args.getChild(2)));

                Data c1 = evaluateExpression(args.getChild(2));

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"rotate\")");

                writer.println("_elem.setAttribute(\"from\", \""+rot+" "+fax+" "+fay+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+fr+" "+fax+" "+fay+"\")");

                if (args.getChildCount() == 4) {
                    Data c2 = evaluateExpression(args.getChild(3));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                so.setNumTransform(nlt+1);
                break;
            case AslLexer.SCALING:
                break;
            default: assert false;
        }
        return null;
    }

    /**
    *   Evaluates and generate code for SVG transformations.
    * @param t The AST of the expression
    * @return The value of the expression.
    */
    //TODO previous transformations
    private Data executeTransformation (AslTree t) {
        String id = t.getChild(0).getText();
        String name = id;
        if (id.equals("anon")) name = "anon__"+anon;
        SvglangObject so = (SvglangObject) Stack.getVariable(id);
        AslTree args = t.getChild(1);
        switch (t.getType()) {
            case AslLexer.SCALEREL:
                if (args.getChildCount() == 1) {

                    float sf = so.getScalex();

                    Float fv = data2float(evaluateExpression(args.getChild(0)));
                    sf *= fv;

                    so.setScalex(sf); so.setScaley(sf);
                    writer.println(name+".setAttribute(\"transform\", \"scale("+sf+")\");");
                }
                else {
                    Float fv = data2float(evaluateExpression(args.getChild(0)));
                    Float fw = data2float(evaluateExpression(args.getChild(1)));
                    float sf = so.getScalex(); float sg = so.getScaley();

                    sf *= fv; sg *= fw;

                    //TODO Check transformation, we need the actual scale factor
                    writer.println(id+".setAttribute(\"transform\", \"scale("+sf+" "+sg+")\");");
                }
                break;
            case AslLexer.ROTATEREL:
                assert args.getChildCount() >= 1;

                float rot = so.getRot();

                Float fv = data2float(evaluateExpression(args.getChild(0)));

                rot += fv;
                if (rot > 360) rot -= 360;
                so.setRot(rot);

                if (args.getChildCount() > 1) {
                    float vx = data2float(evaluateExpression(args.getChild(1)));
                    float vy = data2float(evaluateExpression(args.getChild(2)));
                    writer.println(name+".setAttribute(\"transform\", \"rotate("+rot+", "+vx+", "+vy+")\");");
                }
                else writer.println(name+".setAttribute(\"transform\", \"rotate("+rot+")\");");
                break;
            case AslLexer.TRANSREL:
                float px = so.getPosx();
                float py = so.getPosy();
                float fpx = data2float(evaluateExpression(args.getChild(0)));
                float fpy = data2float(evaluateExpression(args.getChild(1)));
                writer.println(name+".setAttribute(\"transform\", \"translate("+(px+fpx)+", "+(py+fpy)+")\");");
            //TODO
                break;
            case AslLexer.TRANS:
                Float fvt1 = data2float(evaluateExpression(args.getChild(0)));
                Float fvt2 = data2float(evaluateExpression(args.getChild(1)));

                float tx = so.getPosx();
                float ty = so.getPosy();

                so.setPosx(tx); so.setPosy(ty);
                String tt = "translate("+fvt1+", "+fvt2+")";
                so.addTransformCode(tt);
                writer.println(name+".setAttribute(\"transform\", \""+so.getTransformCode()+"\");");
                break;
            case AslLexer.SCALE:
                assert args.getChildCount() == 2;
                Float fvs1 = data2float(evaluateExpression(args.getChild(0)));
                Float fvs2 = data2float(evaluateExpression(args.getChild(1)));

                so.setScalex(fvs1); so.setScaley(fvs2);
                String ss = "scale("+fvs1+", "+fvs2+")";
                so.addTransformCode(ss);
                writer.println(name+".setAttribute(\"transform\", \""+so.getTransformCode()+"\");");
                break;
            case AslLexer.ROTATE:
                assert args.getChildCount() >= 1;

                Float fv1 = data2float(evaluateExpression(args.getChild(0)));

                if (fv1 > 360) fv1 -= 360;
                so.setRot(fv1);

                if (args.getChildCount() > 1) {
                    Data vx = evaluateExpression(args.getChild(1)); Data vy = evaluateExpression(args.getChild(2));
                    checkNumeric(vx); checkNumeric(vy);
                    writer.println(name+".setAttribute(\"transform\", \"rotate("+fv1+", "+vx.getValue()+", "+vy.getValue()+")\");");
                }
                else writer.println(name+".setAttribute(\"transform\", \"rotate("+fv1+")\");");

                break;
            default:
                break;
        }
        return null;
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */

    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = Stack.getVariable(t.getText()).copy();
                break;
            // An integer literal
            case AslLexer.INT:
                value = new SvglangInteger(t.getIntValue());
                break;
            // An float literal
            case AslLexer.FLOAT:
                value = new SvglangFloat(t.getFloatValue());
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new SvglangBoolean(t.getBooleanValue());
                break;
			case AslLexer.STRING:
                value = new SvglangString(t.getStringValue());
                break;
			// A array AFEGIT!
            case AslLexer.ARRAY:
				Data index = evaluateExpression(t.getChild(1));
 				//value = new SvglangArray((Data)Stack.getArrayVal(t.getChild(0).getText(), index));
 				value = Stack.getArrayVal(t.getChild(0).getText(), index);

				break;
            case AslLexer.ARRAYSIZE:
                Data d = Stack.getVariable(t.getText());
                if (d.isArray()) value = new SvglangInteger(((SvglangArray) d).getLength());
                else throw new RuntimeException ("argument should be an array");

                break;
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }

        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case AslLexer.PLUS:
                    checkInteger(value);
                    break;
                case AslLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case AslLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
								case AslLexer.RAND:
										//if (t.getChild(0).getChildCount() == 2) {	//Dos parametres
											Data value1 = evaluateExpression(t.getChild(0).getChild(0));
											Data value2 = evaluateExpression(t.getChild(0).getChild(1));
											checkInteger(value1);
											checkInteger(value2);
											Random rand = new Random();
											value.setValue(rand.nextInt((value2.getIntegerValue() - value1.getIntegerValue()) + 1) + value1.getIntegerValue());	//Genera random entre value i value2
//                     }
//                     else if (t.getChild(0).getChildCount() == 1){ //Un parametre
// 											Data value2 = evaluateExpression(t.getChild(0).getChild(0));
// 											                    System.out.println(value2.getIntegerValue());
// 											checkInteger(value2);
// 											Random rand = new Random();
// 											value.setValue(rand.nextInt((value2.getIntegerValue()) + 1));	//Genera random entre 0 i value2
//                     }
// 										else {	// 0 o mes de 2 parametres, genera un random
// 											Random rand = new Random();
// 											value.setValue(rand.nextInt(100));	//Genera random entre value i value2
//                     }
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: break; //assert false; // Should never happen
        }

        setLineNumber(previous_line);
        return value;
    }

    private Data evaluateDisplay(AslTree t) {
        String id = t.getChild(0).getText();

        AslTree arglist = t.getChild(1);

        float rx = data2float(evaluateExpression(arglist.getChild(0)));
        float ry = data2float(evaluateExpression(arglist.getChild(1)));

        String name = id;
        if (name.equals("anon")) {
            anon += 1;
            name = "anon__"+anon;
        }
        else {
            writer.print(   "var _eim = document.getElementById("+id+");\n"+
                            "if (_eim) _eim.parentNode.removeChild(_eim);");
        }

        switch (t.getType()) {
            case AslLexer.RECT:
                assert arglist.getChildCount() == 4;
				float rw = data2float(evaluateExpression(arglist.getChild(2)));
                float rh = data2float(evaluateExpression(arglist.getChild(3)));
                SvglangRectangle sr = new SvglangRectangle(rx, ry, rw, rh);
                sr.setName(name);

                Stack.defineVariable(id, sr);

                writer.print(sr.getFullCode());
                break;
            case AslLexer.CIRCLE:
                assert arglist.getChildCount() == 3;
                float rr =  data2float(evaluateExpression(arglist.getChild(2)));
                SvglangCircle sc = new SvglangCircle(rx, ry, rr);
                sc.setName(name);
                Stack.defineVariable(id, sc);

                writer.print(sc.getFullCode());
                break;
            case AslLexer.TEXT:
                assert arglist.getChildCount() >= 3;
                String rt = arglist.getChild(2).getStringValue();
                SvglangText st = new SvglangText(rx, ry, rt);
                st.setName(name);
                Stack.defineVariable(id, st);

                writer.print(st.getFullCode());
                break;
            case AslLexer.ELLIPSE:
                assert arglist.getChildCount() == 4;
                float rrx =  data2float(evaluateExpression(arglist.getChild(2)));
                float rry =  data2float(evaluateExpression(arglist.getChild(3)));
                SvglangEllipse se = new SvglangEllipse(rx, ry, rrx, rry);
                se.setName(name);
                Stack.defineVariable(id, se);

                writer.print(se.getFullCode());
                break;
            case AslLexer.PATH:
                String d = "M"+rx+","+ry;
                for (int i = 2; i < arglist.getChildCount(); i++) {
                    d += arglist.getChild(i).getStringValue();
                }
                SvglangPath sp = new SvglangPath(rx, ry);
                sp.setName(name); sp.setD(d);
                Stack.defineVariable(id, sp);

                writer.print(sp.getFullCode());
                break;
            case AslLexer.LINE:
                assert arglist.getChildCount() == 4;
                float lx =  data2float(evaluateExpression(arglist.getChild(2)));
                float ly =  data2float(evaluateExpression(arglist.getChild(3)));

                SvglangLine sl = new SvglangLine(rx, ry, lx, ly);
                sl.setName(name); sl.setD(d);
                Stack.defineVariable(id, sl);

                writer.print(sl.getFullCode());
                break;
            default:
                break;
        }

        writer.println("_defs.appendChild("+name+");");


        return null;
    }

    private Data relativeSet(AslTree t) {
        String id = t.getChild(0).getText();

        String name = id;
        if (id.equals("anon")) name = "anon__"+anon;

        String property = t.getChild(1).getStringValue();
        AslTree args = t.getChild(2);
        SvglangObject obj = (SvglangObject) Stack.getVariable(id);
        //Tenemos tiempo, hurra!
        if (t.getChildCount() == 4) {
            AslTree time = t.getChild(3);

            if (property.equals("position")) {

                float ox = obj.getPosx(); float oy = obj.getPosy();

                Float ftx = data2float(evaluateExpression(args.getChild(0)));
                Float fty = data2float(evaluateExpression(args.getChild(1)));

                obj.setPosx(ox+ftx); obj.setPosy(oy+fty);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"translate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ox+" "+oy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(ox+ftx)+" "+(oy+fty)+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);

            }
            else if (property.equals("rotation")) {

                Data ax = evaluateExpression(args.getChild(1));
                Data ay = evaluateExpression(args.getChild(2));

                float ro = obj.getRot();

                Float fgr = data2float(evaluateExpression(args.getChild(0)));
                Float fax, fay;

                Object oax = ax.getValue();
                if (ax.isInteger()) fax = ((Integer) oax).floatValue();
                else fax = (Float) oax;

                Object oay = ay.getValue();
                if (ax.isInteger()) fay = ((Integer) oay).floatValue();
                else fay = (Float) oay;

                obj.setRot(ro+fgr);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"rotate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ro+" "+fax+" "+fay+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(ro+fgr)+" "+fax+" "+fay+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                //AslTree time = t.getChild(3);
                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else if (property.equals("scale")) {
                float fsx = data2float(evaluateExpression(t.getChild(0)));
                float fsy = data2float(evaluateExpression(t.getChild(1)));

                float sx = obj.setScalex(); float sy = obj.setScaley();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"scale\")");

                writer.println("_elem.setAttribute(\"from\", \""+sx+" "+sy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(sx+fsx)+" "+(sy+fsy)+"\")");

                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else {

                int nlt1 = obj.getNumTransform();
                String v = "";
                for (int i = 0; i < args.getChildCount(); i++) {
                    String auxt = args.getChild(i).getText();
                    if (auxt.charAt(0) == '"' && auxt.charAt(auxt.length()-1) == '"') auxt = auxt.substring(1, auxt.length()-1);
                    v += auxt;
                    if (i != args.getChildCount()-1) v += ";";
                }

                writer.println("var _elem = document.createElementNS(svgNS,\"animate\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt1+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \""+property+"\")");
                writer.println("_elem.setAttribute(\"values\", \""+v+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt1 != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt1-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }

                writer.println(name+".appendChild(_elem);");

            }

            writer.println("if (_loop) _elem.setAttribute(\"repeatCount\",\"indefinite\");");

        }
        else { //LMAO, instant setting
            if (property.equals("position")) {
                Data tx = evaluateExpression(args.getChild(0)); Data ty = evaluateExpression(args.getChild(1));
                float ox = obj.getPosx(); float oy = obj.getPosy();

                Float ftx, fty;

                Object otx = tx.getValue();
                if (tx.isInteger()) ftx = ((Integer) otx).floatValue();
                else ftx = (Float) otx;

                Object oty = ty.getValue();
                if (tx.isInteger()) fty = ((Integer) oty).floatValue();
                else fty = (Float) oty;

                obj.setPosx(ox+ftx); obj.setPosy(oy+fty);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"translate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ox+" "+oy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(ox+ftx)+" "+(oy+fty)+"\")");

                if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+(nlt-1)+".end\")");
                else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                writer.println("_elem.setAttribute(\"dur\", \"0s\")");

                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else if (property.equals("rotation")) {
                System.out.println("Rotation");
                Data gr = evaluateExpression(args.getChild(0));
                Data ax = evaluateExpression(args.getChild(1));
                Data ay = evaluateExpression(args.getChild(2));

                float ro = obj.getRot();

                Float fgr, fax, fay;

                Object ogr = gr.getValue();
                if (gr.isInteger()) fgr = ((Integer) ogr).floatValue();
                else fgr = (Float) ogr;

                Object oax = ax.getValue();
                if (ax.isInteger()) fax = ((Integer) oax).floatValue();
                else fax = (Float) oax;

                Object oay = ay.getValue();
                if (ax.isInteger()) fay = ((Integer) oay).floatValue();
                else fay = (Float) oay;

                obj.setRot(ro+fgr);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"rotate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ro+" "+fax+" "+fay+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(ro+fgr)+" "+fax+" "+fay+"\")");

                if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+(nlt-1)+".end\")");
                else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                writer.println("_elem.setAttribute(\"dur\", \"0s\")");

                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
        }

        return null;
    }

    private Data absoluteSet(AslTree t) {
        String id = t.getChild(0).getText();

        String name = id;
        if (id.equals("anon")) name = "anon__"+anon;

        String property = t.getChild(1).getStringValue();
        AslTree args = t.getChild(2);
        SvglangObject obj = (SvglangObject) Stack.getVariable(id);
        //Tenemos tiempo, hurra!
        if (t.getChildCount() == 4) {
            AslTree time = t.getChild(3);

            if (property.equals("position")) {

                Data tx = evaluateExpression(args.getChild(0)); Data ty = evaluateExpression(args.getChild(1));

                float ox = obj.getPosx(); float oy = obj.getPosy();

                Float ftx, fty;

                Object otx = tx.getValue();
                if (tx.isInteger()) ftx = ((Integer) otx).floatValue();
                else ftx = (Float) otx;

                Object oty = ty.getValue();
                if (tx.isInteger()) fty = ((Integer) oty).floatValue();
                else fty = (Float) oty;

                obj.setPosx(ftx); obj.setPosy(fty);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"translate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ox+" "+oy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+ftx+" "+fty+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);

            }
            else if (property.equals("rotation")) {
                Data gr = evaluateExpression(args.getChild(0));
                Data ax = evaluateExpression(args.getChild(1));
                Data ay = evaluateExpression(args.getChild(2));

                float ro = obj.getRot();

                Float fgr, fax, fay;

                Object ogr = gr.getValue();
                if (gr.isInteger()) fgr = ((Integer) ogr).floatValue();
                else fgr = (Float) ogr;

                Object oax = ax.getValue();
                if (ax.isInteger()) fax = ((Integer) oax).floatValue();
                else fax = (Float) oax;

                Object oay = ay.getValue();
                if (ax.isInteger()) fay = ((Integer) oay).floatValue();
                else fay = (Float) oay;

                obj.setRot(fgr);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"rotate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ro+" "+fax+" "+fay+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+fgr+" "+fax+" "+fay+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                //AslTree time = t.getChild(3);
                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }
                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else {

                int nlt1 = obj.getNumTransform();
                String v = "";
                for (int i = 0; i < args.getChildCount(); i++) {
                    String auxt = args.getChild(i).getText();
                    if (auxt.charAt(0) == '"' && auxt.charAt(auxt.length()-1) == '"') auxt = auxt.substring(1, auxt.length()-1);
                    v += auxt;
                    if (i != args.getChildCount()-1) v += ";";
                }

                writer.println("var _elem = document.createElementNS(svgNS,\"animate\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt1+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \""+property+"\")");
                writer.println("_elem.setAttribute(\"values\", \""+v+"\")");

                Data c1 = evaluateExpression(time.getChild(0));

                if (time.getChildCount() == 2) {
                    Data c2 = evaluateExpression(time.getChild(1));
                    writer.println("_elem.setAttribute(\"begin\", \""+c1.toString()+"s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c2.toString()+"s\")");
                }
                else {
                    if (nlt1 != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+"_"+(nlt1-1)+".end\")");
                    else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                    writer.println("_elem.setAttribute(\"dur\", \""+c1.toString()+"s\")");
                }

                writer.println(name+".appendChild(_elem);");

            }

            writer.println("if (_loop) _elem.setAttribute(\"repeatCount\",\"indefinite\");");

        }
        else { //LMAO, instant setting
            if (property.equals("position")) {
                Data tx = evaluateExpression(args.getChild(0)); Data ty = evaluateExpression(args.getChild(1));
                float ox = obj.getPosx(); float oy = obj.getPosy();

                Float ftx, fty;

                Object otx = tx.getValue();
                if (tx.isInteger()) ftx = ((Integer) otx).floatValue();
                else ftx = (Float) otx;

                Object oty = ty.getValue();
                if (tx.isInteger()) fty = ((Integer) oty).floatValue();
                else fty = (Float) oty;

                obj.setPosx(ftx); obj.setPosy(fty);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"translate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ox+" "+oy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+ftx+" "+fty+"\")");

                if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+(nlt-1)+".end\")");
                else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                writer.println("_elem.setAttribute(\"dur\", \"0s\")");

                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else if (property.equals("rotation")) {
                System.out.println("Rotation");

                float ro = obj.getRot();

                Float fgr = data2float(evaluateExpression(args.getChild(0)));
                Float fax = data2float(evaluateExpression(args.getChild(1)));
                Float fay = data2float(evaluateExpression(args.getChild(2)));

                obj.setRot(ro+fgr);
                int nlt = obj.getNumTransform();

                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"rotate\")");

                writer.println("_elem.setAttribute(\"from\", \""+ro+" "+fax+" "+fay+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(ro+fgr)+" "+fax+" "+fay+"\")");

                if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+(nlt-1)+".end\")");
                else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                writer.println("_elem.setAttribute(\"dur\", \"0s\")");

                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);
            }
            else if (property.equals("scale")) {
                float sx = data2float(evaluateExpression(args.getChild(0)));
                float sy = data2float(evaluateExpression(args.getChild(1)));
                float scx = obj.getScalex();
                float scy = obj.getScaley();

                int nlt = obj.getNumTransform();
                writer.println("var _elem = document.createElementNS(svgNS,\"animateTransform\")");
                writer.println("_elem.setAttribute(\"id\", \""+name+"_"+nlt+"\")");
                writer.println("_elem.setAttribute(\"attributeName\", \"transform\")");
                writer.println("_elem.setAttribute(\"type\", \"scale\")");

                writer.println("_elem.setAttribute(\"from\", \""+scx+" "+scy+"\")");
                writer.println("_elem.setAttribute(\"to\", \""+(sx*scx)+" "+(sy*scy)+"\")");

                if (nlt != 0) writer.println("_elem.setAttribute(\"begin\", \""+id+(nlt-1)+".end\")");
                else writer.println("_elem.setAttribute(\"begin\", \"0s\")");
                writer.println("_elem.setAttribute(\"dur\", \"0s\")");

                writer.println("_elem.setAttribute(\"fill\", \"freeze\")");
                writer.println(name+".appendChild(_elem);");
                obj.setNumTransform(nlt+1);



            }
            else {
                String v = "";
                for (int i = 0; i < args.getChildCount(); i++) {
                    String auxt = args.getChild(i).getText();
                    if (auxt.charAt(0) == '"' && auxt.charAt(auxt.length()-1) == '"') auxt = auxt.substring(1, auxt.length()-1);
                    v += auxt;
                    if (i != args.getChildCount()-1) v += ";";
                }

                writer.println(name+".setAttribute(\""+property+"\",\""+v+"\");");
            }
        }

        return null;
    }

    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;

            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;

            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting integer expression");
        }
    }

    private void checkFloat (Data b) {
        if (!b.isFloat()) {
            throw new RuntimeException ("Expecting float expression");
        }
    }

    private void checkNumeric (Data b) {
        if (!b.isFloat() && !b.isInteger()) {
            throw new RuntimeException ("Expecting numeric expression");
        }
    }

    private void checkString (Data b) {
        if (!b.isString()) {
            throw new RuntimeException ("Expecting string expression");
        }
    }

    private void checkColor (Data b) {
        String color = (String) b.getValue();

        if (!b.isString() && color.charAt(0) != '#' ) {
            throw new RuntimeException ("Expecting string expression");
        }
    }

    private float data2float (Data a) {
        checkNumeric(a);

        Float fl; Object obj = a.getValue();
        if (a.isInteger()) fl = ((Integer) obj).floatValue();
        else fl = (Float) obj;

        return fl;
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */

    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function

        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == AslLexer.PVALUE) {
                // Pass by value: evaluate the expression

                //AFEGIT! Si es pasa un array per valor, es pasa per referencia igualment
                if(Stack.isArray(a.getText())){ //Miro si es un array
					if (a.getType() != AslLexer.ID) {
						throw new RuntimeException("Wrong argument for pass by reference");
					}
					// Find the variable and pass the reference
					Data v = Stack.getVariable(a.getText());
					Params.add(i,v);
                }

                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != AslLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();

        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");

        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);

        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }

        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
