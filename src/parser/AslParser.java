// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-28 13:50:18

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AND", "ARGLIST", "ARRAY", "ASSIGN", "BOOLEAN", "CIRCLE", "COLOR", "COMMENT", "DISP", "DIV", "DO", "DRAW", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQ", "EQUAL", "ESC_SEQ", "FALSE", "FILL", "FLOAT", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LOOP", "LT", "MACRO", "MINUS", "MOD", "MOVEMENT", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "REL", "RETURN", "ROTATE", "ROTATEREL", "ROTATION", "SCALE", "SCALEREL", "STRING", "STROKE", "TEXT", "THEN", "TIME", "TRANS", "TRANSFORM", "TRANSREL", "TRUE", "WHILE", "WRITE", "WS", "'$SHOW'", "'&'", "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int ABS=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ARRAY=7;
    public static final int ASSIGN=8;
    public static final int BOOLEAN=9;
    public static final int CIRCLE=10;
    public static final int COLOR=11;
    public static final int COMMENT=12;
    public static final int DISP=13;
    public static final int DIV=14;
    public static final int DO=15;
    public static final int DRAW=16;
    public static final int ELLIPSE=17;
    public static final int ELSE=18;
    public static final int ENDFUNC=19;
    public static final int ENDIF=20;
    public static final int ENDWHILE=21;
    public static final int EQ=22;
    public static final int EQUAL=23;
    public static final int ESC_SEQ=24;
    public static final int FALSE=25;
    public static final int FILL=26;
    public static final int FLOAT=27;
    public static final int FUNC=28;
    public static final int FUNCALL=29;
    public static final int GE=30;
    public static final int GT=31;
    public static final int ID=32;
    public static final int IF=33;
    public static final int INT=34;
    public static final int LE=35;
    public static final int LIST_FUNCTIONS=36;
    public static final int LIST_INSTR=37;
    public static final int LOOP=38;
    public static final int LT=39;
    public static final int MACRO=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MOVEMENT=43;
    public static final int MUL=44;
    public static final int NOT=45;
    public static final int NOT_EQUAL=46;
    public static final int OR=47;
    public static final int PARAMS=48;
    public static final int PLUS=49;
    public static final int PREF=50;
    public static final int PVALUE=51;
    public static final int READ=52;
    public static final int RECT=53;
    public static final int REL=54;
    public static final int RETURN=55;
    public static final int ROTATE=56;
    public static final int ROTATEREL=57;
    public static final int ROTATION=58;
    public static final int SCALE=59;
    public static final int SCALEREL=60;
    public static final int STRING=61;
    public static final int STROKE=62;
    public static final int TEXT=63;
    public static final int THEN=64;
    public static final int TIME=65;
    public static final int TRANS=66;
    public static final int TRANSFORM=67;
    public static final int TRANSREL=68;
    public static final int TRUE=69;
    public static final int WHILE=70;
    public static final int WRITE=71;
    public static final int WS=72;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/falc/FIB/cl/svglang/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:8: ( func )+ EOF
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog210);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog213);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 65:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func240); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func243); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func245);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func247);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func249); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,75,FOLLOW_75_in_params268);  
            stream_75.add(char_literal8);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==74) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params270);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,76,FOLLOW_76_in_params273);  
            stream_76.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 73:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist299);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==77) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,77,FOLLOW_77_in_paramlist302); 

            	    pushFollow(FOLLOW_param_in_paramlist305);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==74) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,74,FOLLOW_74_in_param330);  
                    stream_74.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param334);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 82:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param357);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 83:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions391);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==78) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,78,FOLLOW_78_in_block_instructions394);  
            	    stream_78.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions396);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 89:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:1: instruction : ( assign | declare | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | draw | fill | transform -> ^( TRANSFORM transform ) | animation | macro -> ^( MACRO macro ) | loop |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.declare_return declare19 =null;

        AslParser.ite_stmt_return ite_stmt20 =null;

        AslParser.while_stmt_return while_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.read_return read24 =null;

        AslParser.write_return write25 =null;

        AslParser.set_return set26 =null;

        AslParser.draw_return draw27 =null;

        AslParser.fill_return fill28 =null;

        AslParser.transform_return transform29 =null;

        AslParser.animation_return animation30 =null;

        AslParser.macro_return macro31 =null;

        AslParser.loop_return loop32 =null;


        RewriteRuleSubtreeStream stream_transform=new RewriteRuleSubtreeStream(adaptor,"rule transform");
        RewriteRuleSubtreeStream stream_macro=new RewriteRuleSubtreeStream(adaptor,"rule macro");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:9: ( assign | declare | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | draw | fill | transform -> ^( TRANSFORM transform ) | animation | macro -> ^( MACRO macro ) | loop |)
            int alt6=16;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt6=1;
                    }
                    break;
                case 75:
                    {
                    alt6=5;
                    }
                    break;
                case ABS:
                case REL:
                    {
                    alt6=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }

                }
                break;
            case CIRCLE:
            case ELLIPSE:
            case RECT:
            case TEXT:
                {
                alt6=2;
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case WHILE:
                {
                alt6=4;
                }
                break;
            case RETURN:
                {
                alt6=6;
                }
                break;
            case READ:
                {
                alt6=7;
                }
                break;
            case WRITE:
                {
                alt6=8;
                }
                break;
            case DRAW:
                {
                alt6=10;
                }
                break;
            case FILL:
                {
                alt6=11;
                }
                break;
            case ROTATE:
            case ROTATEREL:
            case SCALE:
            case SCALEREL:
            case TRANS:
            case TRANSREL:
                {
                alt6=12;
                }
                break;
            case MOVEMENT:
            case ROTATION:
                {
                alt6=13;
                }
                break;
            case 73:
                {
                alt6=14;
                }
                break;
            case LOOP:
                {
                alt6=15;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 78:
                {
                alt6=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction445);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:11: declare
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_declare_in_instruction467);
                    declare19=declare();

                    state._fsp--;

                    adaptor.addChild(root_0, declare19.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction481);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction501);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction521);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction542);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction559);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction584);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:102:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction607);
                    set26=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set26.getTree());

                    }
                    break;
                case 10 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:103:11: draw
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_draw_in_instruction623);
                    draw27=draw();

                    state._fsp--;

                    adaptor.addChild(root_0, draw27.getTree());

                    }
                    break;
                case 11 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:104:11: fill
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_fill_in_instruction638);
                    fill28=fill();

                    state._fsp--;

                    adaptor.addChild(root_0, fill28.getTree());

                    }
                    break;
                case 12 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:11: transform
                    {
                    pushFollow(FOLLOW_transform_in_instruction650);
                    transform29=transform();

                    state._fsp--;

                    stream_transform.add(transform29.getTree());

                    // AST REWRITE
                    // elements: transform
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:21: -> ^( TRANSFORM transform )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:24: ^( TRANSFORM transform )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(TRANSFORM, "TRANSFORM")
                        , root_1);

                        adaptor.addChild(root_1, stream_transform.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 13 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:11: animation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_animation_in_instruction671);
                    animation30=animation();

                    state._fsp--;

                    adaptor.addChild(root_0, animation30.getTree());

                    }
                    break;
                case 14 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:107:13: macro
                    {
                    pushFollow(FOLLOW_macro_in_instruction687);
                    macro31=macro();

                    state._fsp--;

                    stream_macro.add(macro31.getTree());

                    // AST REWRITE
                    // elements: macro
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 107:20: -> ^( MACRO macro )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:107:23: ^( MACRO macro )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(MACRO, "MACRO")
                        , root_1);

                        adaptor.addChild(root_1, stream_macro.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 15 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:108:11: loop
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_loop_in_instruction709);
                    loop32=loop();

                    state._fsp--;

                    adaptor.addChild(root_0, loop32.getTree());

                    }
                    break;
                case 16 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class macro_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macro"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:112:1: macro : '$SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal33=null;

        AslTree string_literal33_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:112:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:112:9: '$SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal33=(Token)match(input,73,FOLLOW_73_in_macro755); 
            string_literal33_tree = 
            (AslTree)adaptor.create(string_literal33)
            ;
            adaptor.addChild(root_0, string_literal33_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "macro"


    public static class loop_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loop"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:1: loop : LOOP ^ animation ;
    public final AslParser.loop_return loop() throws RecognitionException {
        AslParser.loop_return retval = new AslParser.loop_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token LOOP34=null;
        AslParser.animation_return animation35 =null;


        AslTree LOOP34_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:6: ( LOOP ^ animation )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:8: LOOP ^ animation
            {
            root_0 = (AslTree)adaptor.nil();


            LOOP34=(Token)match(input,LOOP,FOLLOW_LOOP_in_loop768); 
            LOOP34_tree = 
            (AslTree)adaptor.create(LOOP34)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(LOOP34_tree, root_0);


            pushFollow(FOLLOW_animation_in_loop771);
            animation35=animation();

            state._fsp--;

            adaptor.addChild(root_0, animation35.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loop"


    public static class transform_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transform"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:1: transform : ( TRANS ^ ID atom ( FLOAT )? | TRANSREL ^ ID arglist | SCALE ^ ID atom ( FLOAT )? | SCALEREL ^ ID arglist | ROTATE ^ ID atom ( FLOAT )? | ROTATEREL ^ ID arglist );
    public final AslParser.transform_return transform() throws RecognitionException {
        AslParser.transform_return retval = new AslParser.transform_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANS36=null;
        Token ID37=null;
        Token FLOAT39=null;
        Token TRANSREL40=null;
        Token ID41=null;
        Token SCALE43=null;
        Token ID44=null;
        Token FLOAT46=null;
        Token SCALEREL47=null;
        Token ID48=null;
        Token ROTATE50=null;
        Token ID51=null;
        Token FLOAT53=null;
        Token ROTATEREL54=null;
        Token ID55=null;
        AslParser.atom_return atom38 =null;

        AslParser.arglist_return arglist42 =null;

        AslParser.atom_return atom45 =null;

        AslParser.arglist_return arglist49 =null;

        AslParser.atom_return atom52 =null;

        AslParser.arglist_return arglist56 =null;


        AslTree TRANS36_tree=null;
        AslTree ID37_tree=null;
        AslTree FLOAT39_tree=null;
        AslTree TRANSREL40_tree=null;
        AslTree ID41_tree=null;
        AslTree SCALE43_tree=null;
        AslTree ID44_tree=null;
        AslTree FLOAT46_tree=null;
        AslTree SCALEREL47_tree=null;
        AslTree ID48_tree=null;
        AslTree ROTATE50_tree=null;
        AslTree ID51_tree=null;
        AslTree FLOAT53_tree=null;
        AslTree ROTATEREL54_tree=null;
        AslTree ID55_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:11: ( TRANS ^ ID atom ( FLOAT )? | TRANSREL ^ ID arglist | SCALE ^ ID atom ( FLOAT )? | SCALEREL ^ ID arglist | ROTATE ^ ID atom ( FLOAT )? | ROTATEREL ^ ID arglist )
            int alt10=6;
            switch ( input.LA(1) ) {
            case TRANS:
                {
                alt10=1;
                }
                break;
            case TRANSREL:
                {
                alt10=2;
                }
                break;
            case SCALE:
                {
                alt10=3;
                }
                break;
            case SCALEREL:
                {
                alt10=4;
                }
                break;
            case ROTATE:
                {
                alt10=5;
                }
                break;
            case ROTATEREL:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:13: TRANS ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANS36=(Token)match(input,TRANS,FOLLOW_TRANS_in_transform780); 
                    TRANS36_tree = 
                    (AslTree)adaptor.create(TRANS36)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANS36_tree, root_0);


                    ID37=(Token)match(input,ID,FOLLOW_ID_in_transform783); 
                    ID37_tree = 
                    (AslTree)adaptor.create(ID37)
                    ;
                    adaptor.addChild(root_0, ID37_tree);


                    pushFollow(FOLLOW_atom_in_transform785);
                    atom38=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom38.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:28: ( FLOAT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FLOAT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:29: FLOAT
                            {
                            FLOAT39=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform788); 
                            FLOAT39_tree = 
                            (AslTree)adaptor.create(FLOAT39)
                            ;
                            adaptor.addChild(root_0, FLOAT39_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:4: TRANSREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANSREL40=(Token)match(input,TRANSREL,FOLLOW_TRANSREL_in_transform795); 
                    TRANSREL40_tree = 
                    (AslTree)adaptor.create(TRANSREL40)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANSREL40_tree, root_0);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_transform798); 
                    ID41_tree = 
                    (AslTree)adaptor.create(ID41)
                    ;
                    adaptor.addChild(root_0, ID41_tree);


                    pushFollow(FOLLOW_arglist_in_transform800);
                    arglist42=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist42.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:4: SCALE ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALE43=(Token)match(input,SCALE,FOLLOW_SCALE_in_transform805); 
                    SCALE43_tree = 
                    (AslTree)adaptor.create(SCALE43)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALE43_tree, root_0);


                    ID44=(Token)match(input,ID,FOLLOW_ID_in_transform808); 
                    ID44_tree = 
                    (AslTree)adaptor.create(ID44)
                    ;
                    adaptor.addChild(root_0, ID44_tree);


                    pushFollow(FOLLOW_atom_in_transform810);
                    atom45=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom45.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:19: ( FLOAT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FLOAT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:20: FLOAT
                            {
                            FLOAT46=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform813); 
                            FLOAT46_tree = 
                            (AslTree)adaptor.create(FLOAT46)
                            ;
                            adaptor.addChild(root_0, FLOAT46_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:4: SCALEREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALEREL47=(Token)match(input,SCALEREL,FOLLOW_SCALEREL_in_transform820); 
                    SCALEREL47_tree = 
                    (AslTree)adaptor.create(SCALEREL47)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALEREL47_tree, root_0);


                    ID48=(Token)match(input,ID,FOLLOW_ID_in_transform823); 
                    ID48_tree = 
                    (AslTree)adaptor.create(ID48)
                    ;
                    adaptor.addChild(root_0, ID48_tree);


                    pushFollow(FOLLOW_arglist_in_transform825);
                    arglist49=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist49.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:123:4: ROTATE ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATE50=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_transform831); 
                    ROTATE50_tree = 
                    (AslTree)adaptor.create(ROTATE50)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATE50_tree, root_0);


                    ID51=(Token)match(input,ID,FOLLOW_ID_in_transform834); 
                    ID51_tree = 
                    (AslTree)adaptor.create(ID51)
                    ;
                    adaptor.addChild(root_0, ID51_tree);


                    pushFollow(FOLLOW_atom_in_transform836);
                    atom52=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom52.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:123:20: ( FLOAT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FLOAT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:123:21: FLOAT
                            {
                            FLOAT53=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform839); 
                            FLOAT53_tree = 
                            (AslTree)adaptor.create(FLOAT53)
                            ;
                            adaptor.addChild(root_0, FLOAT53_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:4: ROTATEREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATEREL54=(Token)match(input,ROTATEREL,FOLLOW_ROTATEREL_in_transform846); 
                    ROTATEREL54_tree = 
                    (AslTree)adaptor.create(ROTATEREL54)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATEREL54_tree, root_0);


                    ID55=(Token)match(input,ID,FOLLOW_ID_in_transform849); 
                    ID55_tree = 
                    (AslTree)adaptor.create(ID55)
                    ;
                    adaptor.addChild(root_0, ID55_tree);


                    pushFollow(FOLLOW_arglist_in_transform851);
                    arglist56=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transform"


    public static class animation_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "animation"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:1: animation : ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT FLOAT );
    public final AslParser.animation_return animation() throws RecognitionException {
        AslParser.animation_return retval = new AslParser.animation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVEMENT57=null;
        Token ID58=null;
        Token FLOAT59=null;
        Token FLOAT60=null;
        Token FLOAT61=null;
        Token ROTATION62=null;
        Token ID63=null;
        Token FLOAT64=null;
        Token FLOAT65=null;

        AslTree MOVEMENT57_tree=null;
        AslTree ID58_tree=null;
        AslTree FLOAT59_tree=null;
        AslTree FLOAT60_tree=null;
        AslTree FLOAT61_tree=null;
        AslTree ROTATION62_tree=null;
        AslTree ID63_tree=null;
        AslTree FLOAT64_tree=null;
        AslTree FLOAT65_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:11: ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT FLOAT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==MOVEMENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==ROTATION) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:13: MOVEMENT ^ ID FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MOVEMENT57=(Token)match(input,MOVEMENT,FOLLOW_MOVEMENT_in_animation862); 
                    MOVEMENT57_tree = 
                    (AslTree)adaptor.create(MOVEMENT57)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MOVEMENT57_tree, root_0);


                    ID58=(Token)match(input,ID,FOLLOW_ID_in_animation865); 
                    ID58_tree = 
                    (AslTree)adaptor.create(ID58)
                    ;
                    adaptor.addChild(root_0, ID58_tree);


                    FLOAT59=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation867); 
                    FLOAT59_tree = 
                    (AslTree)adaptor.create(FLOAT59)
                    ;
                    adaptor.addChild(root_0, FLOAT59_tree);


                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation869); 
                    FLOAT60_tree = 
                    (AslTree)adaptor.create(FLOAT60)
                    ;
                    adaptor.addChild(root_0, FLOAT60_tree);


                    FLOAT61=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation871); 
                    FLOAT61_tree = 
                    (AslTree)adaptor.create(FLOAT61)
                    ;
                    adaptor.addChild(root_0, FLOAT61_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:4: ROTATION ^ ID FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATION62=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_animation876); 
                    ROTATION62_tree = 
                    (AslTree)adaptor.create(ROTATION62)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATION62_tree, root_0);


                    ID63=(Token)match(input,ID,FOLLOW_ID_in_animation879); 
                    ID63_tree = 
                    (AslTree)adaptor.create(ID63)
                    ;
                    adaptor.addChild(root_0, ID63_tree);


                    FLOAT64=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation881); 
                    FLOAT64_tree = 
                    (AslTree)adaptor.create(FLOAT64)
                    ;
                    adaptor.addChild(root_0, FLOAT64_tree);


                    FLOAT65=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation883); 
                    FLOAT65_tree = 
                    (AslTree)adaptor.create(FLOAT65)
                    ;
                    adaptor.addChild(root_0, FLOAT65_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "animation"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID66=null;
        AslParser.expr_return expr67 =null;


        AslTree eq_tree=null;
        AslTree ID66_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:10: ID eq= EQUAL expr
            {
            ID66=(Token)match(input,ID,FOLLOW_ID_in_assign894);  
            stream_ID.add(ID66);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign898);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign900);
            expr67=expr();

            state._fsp--;

            stream_expr.add(expr67.getTree());

            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 133:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:30: ^( ASSIGN[$eq,\":=\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class declare_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declare"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:1: declare : graphicexpr ;
    public final AslParser.declare_return declare() throws RecognitionException {
        AslParser.declare_return retval = new AslParser.declare_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicexpr_return graphicexpr68 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:9: ( graphicexpr )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:11: graphicexpr
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_graphicexpr_in_declare928);
            graphicexpr68=graphicexpr();

            state._fsp--;

            adaptor.addChild(root_0, graphicexpr68.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declare"


    public static class draw_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "draw"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:1: draw : DRAW ^ ID ;
    public final AslParser.draw_return draw() throws RecognitionException {
        AslParser.draw_return retval = new AslParser.draw_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DRAW69=null;
        Token ID70=null;

        AslTree DRAW69_tree=null;
        AslTree ID70_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:6: ( DRAW ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:8: DRAW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            DRAW69=(Token)match(input,DRAW,FOLLOW_DRAW_in_draw939); 
            DRAW69_tree = 
            (AslTree)adaptor.create(DRAW69)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DRAW69_tree, root_0);


            ID70=(Token)match(input,ID,FOLLOW_ID_in_draw942); 
            ID70_tree = 
            (AslTree)adaptor.create(ID70)
            ;
            adaptor.addChild(root_0, ID70_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "draw"


    public static class fill_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fill"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:1: fill : FILL ^ ID COLOR ;
    public final AslParser.fill_return fill() throws RecognitionException {
        AslParser.fill_return retval = new AslParser.fill_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FILL71=null;
        Token ID72=null;
        Token COLOR73=null;

        AslTree FILL71_tree=null;
        AslTree ID72_tree=null;
        AslTree COLOR73_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:6: ( FILL ^ ID COLOR )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:8: FILL ^ ID COLOR
            {
            root_0 = (AslTree)adaptor.nil();


            FILL71=(Token)match(input,FILL,FOLLOW_FILL_in_fill953); 
            FILL71_tree = 
            (AslTree)adaptor.create(FILL71)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FILL71_tree, root_0);


            ID72=(Token)match(input,ID,FOLLOW_ID_in_fill956); 
            ID72_tree = 
            (AslTree)adaptor.create(ID72)
            ;
            adaptor.addChild(root_0, ID72_tree);


            COLOR73=(Token)match(input,COLOR,FOLLOW_COLOR_in_fill958); 
            COLOR73_tree = 
            (AslTree)adaptor.create(COLOR73)
            ;
            adaptor.addChild(root_0, COLOR73_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fill"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF74=null;
        Token THEN76=null;
        Token ELSE78=null;
        Token ENDIF80=null;
        AslParser.expr_return expr75 =null;

        AslParser.block_instructions_return block_instructions77 =null;

        AslParser.block_instructions_return block_instructions79 =null;


        AslTree IF74_tree=null;
        AslTree THEN76_tree=null;
        AslTree ELSE78_tree=null;
        AslTree ENDIF80_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF74=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt970); 
            IF74_tree = 
            (AslTree)adaptor.create(IF74)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF74_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt973);
            expr75=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr75.getTree());

            THEN76=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt975); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt978);
            block_instructions77=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions77.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:46: ( ELSE ! block_instructions )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:47: ELSE ! block_instructions
                    {
                    ELSE78=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt981); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt984);
                    block_instructions79=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions79.getTree());

                    }
                    break;

            }


            ENDIF80=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt988); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE81=null;
        Token DO83=null;
        Token ENDWHILE85=null;
        AslParser.expr_return expr82 =null;

        AslParser.block_instructions_return block_instructions84 =null;


        AslTree WHILE81_tree=null;
        AslTree DO83_tree=null;
        AslTree ENDWHILE85_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE81=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1011); 
            WHILE81_tree = 
            (AslTree)adaptor.create(WHILE81)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE81_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1014);
            expr82=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr82.getTree());

            DO83=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1016); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1019);
            block_instructions84=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions84.getTree());

            ENDWHILE85=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1021); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN86=null;
        AslParser.expr_return expr87 =null;


        AslTree RETURN86_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN86=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1044); 
            RETURN86_tree = 
            (AslTree)adaptor.create(RETURN86)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN86_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:23: ( expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==FLOAT||LA13_0==ID||LA13_0==INT||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE||LA13_0==75||LA13_0==79) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1047);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ88=null;
        Token ID89=null;

        AslTree READ88_tree=null;
        AslTree ID89_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ88=(Token)match(input,READ,FOLLOW_READ_in_read1066); 
            READ88_tree = 
            (AslTree)adaptor.create(READ88)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ88_tree, root_0);


            ID89=(Token)match(input,ID,FOLLOW_ID_in_read1069); 
            ID89_tree = 
            (AslTree)adaptor.create(ID89)
            ;
            adaptor.addChild(root_0, ID89_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE90=null;
        Token STRING92=null;
        AslParser.expr_return expr91 =null;


        AslTree WRITE90_tree=null;
        AslTree STRING92_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE90=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1089); 
            WRITE90_tree = 
            (AslTree)adaptor.create(WRITE90)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE90_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:18: ( expr | STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FALSE||LA14_0==FLOAT||LA14_0==ID||LA14_0==INT||LA14_0==MINUS||LA14_0==NOT||LA14_0==PLUS||LA14_0==TRUE||LA14_0==75||LA14_0==79) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1093);
                    expr91=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr91.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:26: STRING
                    {
                    STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_write1097); 
                    STRING92_tree = 
                    (AslTree)adaptor.create(STRING92)
                    ;
                    adaptor.addChild(root_0, STRING92_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class set_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "set"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:1: set : ID ( REL ^| ABS ^) ID arglist ( time )? ;
    public final AslParser.set_return set() throws RecognitionException {
        AslParser.set_return retval = new AslParser.set_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID93=null;
        Token REL94=null;
        Token ABS95=null;
        Token ID96=null;
        AslParser.arglist_return arglist97 =null;

        AslParser.time_return time98 =null;


        AslTree ID93_tree=null;
        AslTree REL94_tree=null;
        AslTree ABS95_tree=null;
        AslTree ID96_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:6: ( ID ( REL ^| ABS ^) ID arglist ( time )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:8: ID ( REL ^| ABS ^) ID arglist ( time )?
            {
            root_0 = (AslTree)adaptor.nil();


            ID93=(Token)match(input,ID,FOLLOW_ID_in_set1117); 
            ID93_tree = 
            (AslTree)adaptor.create(ID93)
            ;
            adaptor.addChild(root_0, ID93_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:11: ( REL ^| ABS ^)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==REL) ) {
                alt15=1;
            }
            else if ( (LA15_0==ABS) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:12: REL ^
                    {
                    REL94=(Token)match(input,REL,FOLLOW_REL_in_set1120); 
                    REL94_tree = 
                    (AslTree)adaptor.create(REL94)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(REL94_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:17: ABS ^
                    {
                    ABS95=(Token)match(input,ABS,FOLLOW_ABS_in_set1123); 
                    ABS95_tree = 
                    (AslTree)adaptor.create(ABS95)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ABS95_tree, root_0);


                    }
                    break;

            }


            ID96=(Token)match(input,ID,FOLLOW_ID_in_set1127); 
            ID96_tree = 
            (AslTree)adaptor.create(ID96)
            ;
            adaptor.addChild(root_0, ID96_tree);


            pushFollow(FOLLOW_arglist_in_set1129);
            arglist97=arglist();

            state._fsp--;

            adaptor.addChild(root_0, arglist97.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:34: ( time )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==81) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:34: time
                    {
                    pushFollow(FOLLOW_time_in_set1131);
                    time98=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time98.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "set"


    public static class time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:1: time : '{' expr ( ',' expr )? '}' -> ^( TIME expr ( expr )? ) ;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal103=null;
        AslParser.expr_return expr100 =null;

        AslParser.expr_return expr102 =null;


        AslTree char_literal99_tree=null;
        AslTree char_literal101_tree=null;
        AslTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:6: ( '{' expr ( ',' expr )? '}' -> ^( TIME expr ( expr )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:9: '{' expr ( ',' expr )? '}'
            {
            char_literal99=(Token)match(input,81,FOLLOW_81_in_time1144);  
            stream_81.add(char_literal99);


            pushFollow(FOLLOW_expr_in_time1146);
            expr100=expr();

            state._fsp--;

            stream_expr.add(expr100.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:18: ( ',' expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==77) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:19: ',' expr
                    {
                    char_literal101=(Token)match(input,77,FOLLOW_77_in_time1149);  
                    stream_77.add(char_literal101);


                    pushFollow(FOLLOW_expr_in_time1151);
                    expr102=expr();

                    state._fsp--;

                    stream_expr.add(expr102.getTree());

                    }
                    break;

            }


            char_literal103=(Token)match(input,82,FOLLOW_82_in_time1155);  
            stream_82.add(char_literal103);


            // AST REWRITE
            // elements: expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 168:34: -> ^( TIME expr ( expr )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:37: ^( TIME expr ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIME, "TIME")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:49: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:1: expr : boolexpr ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr104 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:6: ( boolexpr )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:8: boolexpr
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolexpr_in_expr1175);
            boolexpr104=boolexpr();

            state._fsp--;

            adaptor.addChild(root_0, boolexpr104.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class graphicexpr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphicexpr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:1: graphicexpr : graphicconst -> ^( DISP graphicconst ) ;
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicconst_return graphicconst105 =null;


        RewriteRuleSubtreeStream stream_graphicconst=new RewriteRuleSubtreeStream(adaptor,"rule graphicconst");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:13: ( graphicconst -> ^( DISP graphicconst ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:17: graphicconst
            {
            pushFollow(FOLLOW_graphicconst_in_graphicexpr1191);
            graphicconst105=graphicconst();

            state._fsp--;

            stream_graphicconst.add(graphicconst105.getTree());

            // AST REWRITE
            // elements: graphicconst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 174:30: -> ^( DISP graphicconst )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:33: ^( DISP graphicconst )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(DISP, "DISP")
                , root_1);

                adaptor.addChild(root_1, stream_graphicconst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphicexpr"


    public static class graphicconst_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphicconst"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:177:1: graphicconst : ( RECT ^ ID arglist | CIRCLE ^ ID arglist | TEXT ^ ID arglist | ELLIPSE ^ ID arglist );
    public final AslParser.graphicconst_return graphicconst() throws RecognitionException {
        AslParser.graphicconst_return retval = new AslParser.graphicconst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT106=null;
        Token ID107=null;
        Token CIRCLE109=null;
        Token ID110=null;
        Token TEXT112=null;
        Token ID113=null;
        Token ELLIPSE115=null;
        Token ID116=null;
        AslParser.arglist_return arglist108 =null;

        AslParser.arglist_return arglist111 =null;

        AslParser.arglist_return arglist114 =null;

        AslParser.arglist_return arglist117 =null;


        AslTree RECT106_tree=null;
        AslTree ID107_tree=null;
        AslTree CIRCLE109_tree=null;
        AslTree ID110_tree=null;
        AslTree TEXT112_tree=null;
        AslTree ID113_tree=null;
        AslTree ELLIPSE115_tree=null;
        AslTree ID116_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:177:13: ( RECT ^ ID arglist | CIRCLE ^ ID arglist | TEXT ^ ID arglist | ELLIPSE ^ ID arglist )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RECT:
                {
                alt18=1;
                }
                break;
            case CIRCLE:
                {
                alt18=2;
                }
                break;
            case TEXT:
                {
                alt18=3;
                }
                break;
            case ELLIPSE:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:177:17: RECT ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT106=(Token)match(input,RECT,FOLLOW_RECT_in_graphicconst1211); 
                    RECT106_tree = 
                    (AslTree)adaptor.create(RECT106)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT106_tree, root_0);


                    ID107=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1214); 
                    ID107_tree = 
                    (AslTree)adaptor.create(ID107)
                    ;
                    adaptor.addChild(root_0, ID107_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1216);
                    arglist108=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist108.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:6: CIRCLE ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE109=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicconst1223); 
                    CIRCLE109_tree = 
                    (AslTree)adaptor.create(CIRCLE109)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE109_tree, root_0);


                    ID110=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1226); 
                    ID110_tree = 
                    (AslTree)adaptor.create(ID110)
                    ;
                    adaptor.addChild(root_0, ID110_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1228);
                    arglist111=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist111.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:6: TEXT ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT112=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicconst1235); 
                    TEXT112_tree = 
                    (AslTree)adaptor.create(TEXT112)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT112_tree, root_0);


                    ID113=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1238); 
                    ID113_tree = 
                    (AslTree)adaptor.create(ID113)
                    ;
                    adaptor.addChild(root_0, ID113_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1240);
                    arglist114=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist114.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:180:6: ELLIPSE ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE115=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicconst1247); 
                    ELLIPSE115_tree = 
                    (AslTree)adaptor.create(ELLIPSE115)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE115_tree, root_0);


                    ID116=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1250); 
                    ID116_tree = 
                    (AslTree)adaptor.create(ID116)
                    ;
                    adaptor.addChild(root_0, ID116_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1252);
                    arglist117=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist117.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphicconst"


    public static class boolexpr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolexpr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR119=null;
        AslParser.boolterm_return boolterm118 =null;

        AslParser.boolterm_return boolterm120 =null;


        AslTree OR119_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr1275);
            boolterm118=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm118.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:26: ( OR ^ boolterm )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:27: OR ^ boolterm
            	    {
            	    OR119=(Token)match(input,OR,FOLLOW_OR_in_boolexpr1278); 
            	    OR119_tree = 
            	    (AslTree)adaptor.create(OR119)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR119_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr1281);
            	    boolterm120=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm120.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolexpr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND122=null;
        AslParser.boolfact_return boolfact121 =null;

        AslParser.boolfact_return boolfact123 =null;


        AslTree AND122_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1301);
            boolfact121=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact121.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:22: ( AND ^ boolfact )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:23: AND ^ boolfact
            	    {
            	    AND122=(Token)match(input,AND,FOLLOW_AND_in_boolterm1304); 
            	    AND122_tree = 
            	    (AslTree)adaptor.create(AND122)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND122_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1307);
            	    boolfact123=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact123.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:1: boolfact : num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQ125=null;
        Token NOT_EQUAL126=null;
        Token LT127=null;
        Token LE128=null;
        Token GT129=null;
        Token GE130=null;
        AslParser.num_expr_return num_expr124 =null;

        AslParser.num_expr_return num_expr131 =null;


        AslTree EQ125_tree=null;
        AslTree NOT_EQUAL126_tree=null;
        AslTree LT127_tree=null;
        AslTree LE128_tree=null;
        AslTree GT129_tree=null;
        AslTree GE130_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:9: ( num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:13: num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1327);
            num_expr124=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr124.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:22: ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQ||(LA22_0 >= GE && LA22_0 <= GT)||LA22_0==LE||LA22_0==LT||LA22_0==NOT_EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:23: ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:23: ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt21=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt21=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt21=2;
                        }
                        break;
                    case LT:
                        {
                        alt21=3;
                        }
                        break;
                    case LE:
                        {
                        alt21=4;
                        }
                        break;
                    case GT:
                        {
                        alt21=5;
                        }
                        break;
                    case GE:
                        {
                        alt21=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:24: EQ ^
                            {
                            EQ125=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1331); 
                            EQ125_tree = 
                            (AslTree)adaptor.create(EQ125)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQ125_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:30: NOT_EQUAL ^
                            {
                            NOT_EQUAL126=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1336); 
                            NOT_EQUAL126_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL126)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL126_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:43: LT ^
                            {
                            LT127=(Token)match(input,LT,FOLLOW_LT_in_boolfact1341); 
                            LT127_tree = 
                            (AslTree)adaptor.create(LT127)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT127_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:49: LE ^
                            {
                            LE128=(Token)match(input,LE,FOLLOW_LE_in_boolfact1346); 
                            LE128_tree = 
                            (AslTree)adaptor.create(LE128)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE128_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:55: GT ^
                            {
                            GT129=(Token)match(input,GT,FOLLOW_GT_in_boolfact1351); 
                            GT129_tree = 
                            (AslTree)adaptor.create(GT129)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT129_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:61: GE ^
                            {
                            GE130=(Token)match(input,GE,FOLLOW_GE_in_boolfact1356); 
                            GE130_tree = 
                            (AslTree)adaptor.create(GE130)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE130_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1360);
                    num_expr131=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr131.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS133=null;
        Token MINUS134=null;
        AslParser.term_return term132 =null;

        AslParser.term_return term135 =null;


        AslTree PLUS133_tree=null;
        AslTree MINUS134_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1380);
            term132=term();

            state._fsp--;

            adaptor.addChild(root_0, term132.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:18: ( ( PLUS ^| MINUS ^) term )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:20: ( PLUS ^| MINUS ^)
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==PLUS) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==MINUS) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:21: PLUS ^
            	            {
            	            PLUS133=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1385); 
            	            PLUS133_tree = 
            	            (AslTree)adaptor.create(PLUS133)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS133_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:29: MINUS ^
            	            {
            	            MINUS134=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1390); 
            	            MINUS134_tree = 
            	            (AslTree)adaptor.create(MINUS134)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS134_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1394);
            	    term135=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term135.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL137=null;
        Token DIV138=null;
        Token MOD139=null;
        AslParser.factor_return factor136 =null;

        AslParser.factor_return factor140 =null;


        AslTree MUL137_tree=null;
        AslTree DIV138_tree=null;
        AslTree MOD139_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1418);
            factor136=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor136.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DIV||LA26_0==MOD||LA26_0==MUL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:23: MUL ^
            	            {
            	            MUL137=(Token)match(input,MUL,FOLLOW_MUL_in_term1423); 
            	            MUL137_tree = 
            	            (AslTree)adaptor.create(MUL137)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL137_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:30: DIV ^
            	            {
            	            DIV138=(Token)match(input,DIV,FOLLOW_DIV_in_term1428); 
            	            DIV138_tree = 
            	            (AslTree)adaptor.create(DIV138)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV138_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:37: MOD ^
            	            {
            	            MOD139=(Token)match(input,MOD,FOLLOW_MOD_in_term1433); 
            	            MOD139_tree = 
            	            (AslTree)adaptor.create(MOD139)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD139_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1437);
            	    factor140=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor140.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:1: factor : ( ( NOT ^| PLUS ^| MINUS ^) factor | atom );
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT141=null;
        Token PLUS142=null;
        Token MINUS143=null;
        AslParser.factor_return factor144 =null;

        AslParser.atom_return atom145 =null;


        AslTree NOT141_tree=null;
        AslTree PLUS142_tree=null;
        AslTree MINUS143_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:9: ( ( NOT ^| PLUS ^| MINUS ^) factor | atom )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==MINUS||LA28_0==NOT||LA28_0==PLUS) ) {
                alt28=1;
            }
            else if ( (LA28_0==FALSE||LA28_0==FLOAT||LA28_0==ID||LA28_0==INT||LA28_0==TRUE||LA28_0==75||LA28_0==79) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:13: ( NOT ^| PLUS ^| MINUS ^) factor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:13: ( NOT ^| PLUS ^| MINUS ^)
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case NOT:
                        {
                        alt27=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt27=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:14: NOT ^
                            {
                            NOT141=(Token)match(input,NOT,FOLLOW_NOT_in_factor1460); 
                            NOT141_tree = 
                            (AslTree)adaptor.create(NOT141)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT141_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:21: PLUS ^
                            {
                            PLUS142=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1465); 
                            PLUS142_tree = 
                            (AslTree)adaptor.create(PLUS142)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(PLUS142_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:29: MINUS ^
                            {
                            MINUS143=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1470); 
                            MINUS143_tree = 
                            (AslTree)adaptor.create(MINUS143)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(MINUS143_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_factor_in_factor1474);
                    factor144=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor144.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:200:13: atom
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_factor1488);
                    atom145=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom145.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:1: atom : ( ID | FLOAT | INT | array | arrayacc | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! boolexpr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID146=null;
        Token FLOAT147=null;
        Token INT148=null;
        Token char_literal152=null;
        Token char_literal154=null;
        AslParser.array_return array149 =null;

        AslParser.arrayacc_return arrayacc150 =null;

        AslParser.funcall_return funcall151 =null;

        AslParser.boolexpr_return boolexpr153 =null;


        AslTree b_tree=null;
        AslTree ID146_tree=null;
        AslTree FLOAT147_tree=null;
        AslTree INT148_tree=null;
        AslTree char_literal152_tree=null;
        AslTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:9: ( ID | FLOAT | INT | array | arrayacc | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! boolexpr ')' !)
            int alt30=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 79:
                    {
                    alt30=5;
                    }
                    break;
                case 75:
                    {
                    alt30=7;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQ:
                case FLOAT:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case THEN:
                case 76:
                case 77:
                case 78:
                case 80:
                case 82:
                    {
                    alt30=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }

                }
                break;
            case FLOAT:
                {
                alt30=2;
                }
                break;
            case INT:
                {
                alt30=3;
                }
                break;
            case 79:
                {
                alt30=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt30=6;
                }
                break;
            case 75:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID146=(Token)match(input,ID,FOLLOW_ID_in_atom1513); 
                    ID146_tree = 
                    (AslTree)adaptor.create(ID146)
                    ;
                    adaptor.addChild(root_0, ID146_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:5: FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FLOAT147=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1519); 
                    FLOAT147_tree = 
                    (AslTree)adaptor.create(FLOAT147)
                    ;
                    adaptor.addChild(root_0, FLOAT147_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:5: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT148=(Token)match(input,INT,FOLLOW_INT_in_atom1525); 
                    INT148_tree = 
                    (AslTree)adaptor.create(INT148)
                    ;
                    adaptor.addChild(root_0, INT148_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:209:5: array
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_atom1531);
                    array149=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array149.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:210:5: arrayacc
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayacc_in_atom1537);
                    arrayacc150=arrayacc();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayacc150.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:13: (b= TRUE |b= FALSE )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==TRUE) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==FALSE) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1554);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1560);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 211:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1583);
                    funcall151=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall151.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:213:13: '(' ! boolexpr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal152=(Token)match(input,75,FOLLOW_75_in_atom1597); 

                    pushFollow(FOLLOW_boolexpr_in_atom1600);
                    boolexpr153=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr153.getTree());

                    char_literal154=(Token)match(input,76,FOLLOW_76_in_atom1602); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class array_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:1: array : '[' atom ( ',' atom )* ']' -> ^( ARRAY ( atom )+ ) ;
    public final AslParser.array_return array() throws RecognitionException {
        AslParser.array_return retval = new AslParser.array_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        AslParser.atom_return atom156 =null;

        AslParser.atom_return atom158 =null;


        AslTree char_literal155_tree=null;
        AslTree char_literal157_tree=null;
        AslTree char_literal159_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:7: ( '[' atom ( ',' atom )* ']' -> ^( ARRAY ( atom )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:9: '[' atom ( ',' atom )* ']'
            {
            char_literal155=(Token)match(input,79,FOLLOW_79_in_array1621);  
            stream_79.add(char_literal155);


            pushFollow(FOLLOW_atom_in_array1623);
            atom156=atom();

            state._fsp--;

            stream_atom.add(atom156.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:18: ( ',' atom )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==77) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:19: ',' atom
            	    {
            	    char_literal157=(Token)match(input,77,FOLLOW_77_in_array1626);  
            	    stream_77.add(char_literal157);


            	    pushFollow(FOLLOW_atom_in_array1628);
            	    atom158=atom();

            	    state._fsp--;

            	    stream_atom.add(atom158.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            char_literal159=(Token)match(input,80,FOLLOW_80_in_array1632);  
            stream_80.add(char_literal159);


            // AST REWRITE
            // elements: atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 217:34: -> ^( ARRAY ( atom )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:37: ^( ARRAY ( atom )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                if ( !(stream_atom.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_atom.hasNext() ) {
                    adaptor.addChild(root_1, stream_atom.nextTree());

                }
                stream_atom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class arrayacc_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayacc"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:219:1: arrayacc : ID '[' INT ']' ;
    public final AslParser.arrayacc_return arrayacc() throws RecognitionException {
        AslParser.arrayacc_return retval = new AslParser.arrayacc_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID160=null;
        Token char_literal161=null;
        Token INT162=null;
        Token char_literal163=null;

        AslTree ID160_tree=null;
        AslTree char_literal161_tree=null;
        AslTree INT162_tree=null;
        AslTree char_literal163_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:2: ( ID '[' INT ']' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:4: ID '[' INT ']'
            {
            root_0 = (AslTree)adaptor.nil();


            ID160=(Token)match(input,ID,FOLLOW_ID_in_arrayacc1651); 
            ID160_tree = 
            (AslTree)adaptor.create(ID160)
            ;
            adaptor.addChild(root_0, ID160_tree);


            char_literal161=(Token)match(input,79,FOLLOW_79_in_arrayacc1653); 
            char_literal161_tree = 
            (AslTree)adaptor.create(char_literal161)
            ;
            adaptor.addChild(root_0, char_literal161_tree);


            INT162=(Token)match(input,INT,FOLLOW_INT_in_arrayacc1655); 
            INT162_tree = 
            (AslTree)adaptor.create(INT162)
            ;
            adaptor.addChild(root_0, INT162_tree);


            char_literal163=(Token)match(input,80,FOLLOW_80_in_arrayacc1657); 
            char_literal163_tree = 
            (AslTree)adaptor.create(char_literal163)
            ;
            adaptor.addChild(root_0, char_literal163_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayacc"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID164=null;
        Token char_literal165=null;
        Token char_literal167=null;
        AslParser.expr_list_return expr_list166 =null;


        AslTree ID164_tree=null;
        AslTree char_literal165_tree=null;
        AslTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:13: ID '(' ( expr_list )? ')'
            {
            ID164=(Token)match(input,ID,FOLLOW_ID_in_funcall1670);  
            stream_ID.add(ID164);


            char_literal165=(Token)match(input,75,FOLLOW_75_in_funcall1672);  
            stream_75.add(char_literal165);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:20: ( expr_list )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==FALSE||LA32_0==FLOAT||LA32_0==ID||LA32_0==INT||LA32_0==MINUS||LA32_0==NOT||LA32_0==PLUS||LA32_0==TRUE||LA32_0==75||LA32_0==79) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1674);
                    expr_list166=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list166.getTree());

                    }
                    break;

            }


            char_literal167=(Token)match(input,76,FOLLOW_76_in_funcall1677);  
            stream_76.add(char_literal167);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 224:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class arglist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arglist"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:227:1: arglist : '(' ( expr_list )? ')' -> ^( ARGLIST ( expr_list )? ) ;
    public final AslParser.arglist_return arglist() throws RecognitionException {
        AslParser.arglist_return retval = new AslParser.arglist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal168=null;
        Token char_literal170=null;
        AslParser.expr_list_return expr_list169 =null;


        AslTree char_literal168_tree=null;
        AslTree char_literal170_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:2: ( '(' ( expr_list )? ')' -> ^( ARGLIST ( expr_list )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:4: '(' ( expr_list )? ')'
            {
            char_literal168=(Token)match(input,75,FOLLOW_75_in_arglist1710);  
            stream_75.add(char_literal168);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:8: ( expr_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FALSE||LA33_0==FLOAT||LA33_0==ID||LA33_0==INT||LA33_0==MINUS||LA33_0==NOT||LA33_0==PLUS||LA33_0==TRUE||LA33_0==75||LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:8: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_arglist1712);
                    expr_list169=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list169.getTree());

                    }
                    break;

            }


            char_literal170=(Token)match(input,76,FOLLOW_76_in_arglist1715);  
            stream_76.add(char_literal170);


            // AST REWRITE
            // elements: expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 228:23: -> ^( ARGLIST ( expr_list )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:26: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:36: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal172=null;
        AslParser.expr_return expr171 =null;

        AslParser.expr_return expr173 =null;


        AslTree char_literal172_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1734);
            expr171=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr171.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:18: ( ',' ! expr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==77) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:19: ',' ! expr
            	    {
            	    char_literal172=(Token)match(input,77,FOLLOW_77_in_expr_list1737); 

            	    pushFollow(FOLLOW_expr_in_expr_list1740);
            	    expr173=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr173.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog210 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EOF_in_prog213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func240 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_func243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_params_in_func245 = new BitSet(new long[]{0x9FB0084304030400L,0x00000000000042D4L});
    public static final BitSet FOLLOW_block_instructions_in_func247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_params268 = new BitSet(new long[]{0x0000000100000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_paramlist_in_params270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_params273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_paramlist302 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_param_in_paramlist305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_74_in_param330 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_param334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_block_instructions394 = new BitSet(new long[]{0x9FB0084304030400L,0x00000000000042D4L});
    public static final BitSet FOLLOW_instruction_in_block_instructions396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assign_in_instruction445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_instruction467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_draw_in_instruction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fill_in_instruction638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transform_in_instruction650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_animation_in_instruction671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_instruction687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_macro755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loop768 = new BitSet(new long[]{0x0400080000000000L});
    public static final BitSet FOLLOW_animation_in_loop771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_transform780 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform783 = new BitSet(new long[]{0x000000050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_atom_in_transform785 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSREL_in_transform795 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_transform800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_transform805 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform808 = new BitSet(new long[]{0x000000050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_atom_in_transform810 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALEREL_in_transform820 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_transform825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_transform831 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform834 = new BitSet(new long[]{0x000000050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_atom_in_transform836 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATEREL_in_transform846 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_transform851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEMENT_in_animation862 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_animation865 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation867 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation869 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATION_in_animation876 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_animation879 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation881 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign894 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_in_assign898 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_assign900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_declare928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_draw939 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_draw942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILL_in_fill953 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_fill956 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLOR_in_fill958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt970 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_ite_stmt973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt975 = new BitSet(new long[]{0x9FB0084304030400L,0x00000000000042D4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt978 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt981 = new BitSet(new long[]{0x9FB0084304030400L,0x00000000000042D4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1011 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_while_stmt1014 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1016 = new BitSet(new long[]{0x9FB0084304030400L,0x00000000000042D4L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1019 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1044 = new BitSet(new long[]{0x000222050A000002L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_return_stmt1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1066 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_read1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1089 = new BitSet(new long[]{0x200222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_write1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set1117 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_REL_in_set1120 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ABS_in_set1123 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_set1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_set1129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_time_in_set1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_time1144 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_time1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000042000L});
    public static final BitSet FOLLOW_77_in_time1149 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_time1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_time1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolexpr_in_expr1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicconst_in_graphicexpr1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicconst1211 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicconst1223 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicconst1235 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicconst1247 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1275 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr1278 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1281 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1301 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1304 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1307 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1327 = new BitSet(new long[]{0x00004088C0400002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1331 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1336 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_LT_in_boolfact1341 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_LE_in_boolfact1346 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_GT_in_boolfact1351 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_GE_in_boolfact1356 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1380 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1385 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1390 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_term_in_num_expr1394 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_factor_in_term1418 = new BitSet(new long[]{0x0000140000004002L});
    public static final BitSet FOLLOW_MUL_in_term1423 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_DIV_in_term1428 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_MOD_in_term1433 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_factor_in_term1437 = new BitSet(new long[]{0x0000140000004002L});
    public static final BitSet FOLLOW_NOT_in_factor1460 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_PLUS_in_factor1465 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_MINUS_in_factor1470 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_factor_in_factor1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factor1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_atom1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayacc_in_atom1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_atom1597 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_boolexpr_in_atom1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_atom1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_array1621 = new BitSet(new long[]{0x000000050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_atom_in_array1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_77_in_array1626 = new BitSet(new long[]{0x000000050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_atom_in_array1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_80_in_array1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayacc1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayacc1653 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_arrayacc1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayacc1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_funcall1672 = new BitSet(new long[]{0x000222050A000000L,0x0000000000009820L});
    public static final BitSet FOLLOW_expr_list_in_funcall1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_funcall1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_arglist1710 = new BitSet(new long[]{0x000222050A000000L,0x0000000000009820L});
    public static final BitSet FOLLOW_expr_list_in_arglist1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_arglist1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_expr_list1737 = new BitSet(new long[]{0x000222050A000000L,0x0000000000008820L});
    public static final BitSet FOLLOW_expr_in_expr_list1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});

}