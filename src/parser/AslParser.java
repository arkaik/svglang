// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-15 09:19:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "CREATE", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int CIRCLE=8;
    public static final int COMMENT=9;
    public static final int CREATE=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int ELSE=13;
    public static final int ENDFUNC=14;
    public static final int ENDIF=15;
    public static final int ENDWHILE=16;
    public static final int EQUAL=17;
    public static final int ESC_SEQ=18;
    public static final int FALSE=19;
    public static final int FUNC=20;
    public static final int FUNCALL=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INT=26;
    public static final int LE=27;
    public static final int LIST_FUNCTIONS=28;
    public static final int LIST_INSTR=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NOT=34;
    public static final int NOT_EQUAL=35;
    public static final int OR=36;
    public static final int PARAMS=37;
    public static final int PLUS=38;
    public static final int PREF=39;
    public static final int PVALUE=40;
    public static final int READ=41;
    public static final int RECT=42;
    public static final int RETURN=43;
    public static final int STRING=44;
    public static final int THEN=45;
    public static final int TRUE=46;
    public static final int WHILE=47;
    public static final int WRITE=48;
    public static final int WS=49;

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:8: ( func )+
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
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog163);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog166);  
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
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:64:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:64:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func193); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func196); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func198);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func200);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func202); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,51,FOLLOW_51_in_params221);  
            stream_51.add(char_literal8);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==50) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params223);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,52,FOLLOW_52_in_params226);  
            stream_52.add(char_literal10);


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
            // 68:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:41: ( paramlist )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist252);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,53,FOLLOW_53_in_paramlist255); 

            	    pushFollow(FOLLOW_param_in_paramlist258);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,50,FOLLOW_50_in_param283);  
                    stream_50.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param287);  
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
                    // 77:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:26: ^( PREF[$id,$id.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param310);  
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
                    // 78:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:22: ^( PVALUE[$id,$id.text] )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions344);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==54) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,54,FOLLOW_54_in_block_instructions347);  
            	    stream_54.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions349);
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
            // 84:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;

        AslParser.create_return create25 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create |)
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==51) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case CREATE:
                {
                alt6=8;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 54:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction398);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction420);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:91:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction440);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction460);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction481);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction498);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction523);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:13: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_instruction548);
                    create25=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create25.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:9: 
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


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID26=null;
        AslParser.expr_return expr27 =null;


        AslTree eq_tree=null;
        AslTree ID26_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:10: ID eq= EQUAL expr
            {
            ID26=(Token)match(input,ID,FOLLOW_ID_in_assign605);  
            stream_ID.add(ID26);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign609);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign611);
            expr27=expr();

            state._fsp--;

            stream_expr.add(expr27.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 101:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF28=null;
        Token THEN30=null;
        Token ELSE32=null;
        Token ENDIF34=null;
        AslParser.expr_return expr29 =null;

        AslParser.block_instructions_return block_instructions31 =null;

        AslParser.block_instructions_return block_instructions33 =null;


        AslTree IF28_tree=null;
        AslTree THEN30_tree=null;
        AslTree ELSE32_tree=null;
        AslTree ENDIF34_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF28=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt640); 
            IF28_tree = 
            (AslTree)adaptor.create(IF28)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF28_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt643);
            expr29=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr29.getTree());

            THEN30=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt645); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt648);
            block_instructions31=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions31.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:47: ELSE ! block_instructions
                    {
                    ELSE32=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt651); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt654);
                    block_instructions33=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions33.getTree());

                    }
                    break;

            }


            ENDIF34=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt658); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE35=null;
        Token DO37=null;
        Token ENDWHILE39=null;
        AslParser.expr_return expr36 =null;

        AslParser.block_instructions_return block_instructions38 =null;


        AslTree WHILE35_tree=null;
        AslTree DO37_tree=null;
        AslTree ENDWHILE39_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE35=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt681); 
            WHILE35_tree = 
            (AslTree)adaptor.create(WHILE35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE35_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt684);
            expr36=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr36.getTree());

            DO37=(Token)match(input,DO,FOLLOW_DO_in_while_stmt686); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt689);
            block_instructions38=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions38.getTree());

            ENDWHILE39=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt691); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN40=null;
        AslParser.expr_return expr41 =null;


        AslTree RETURN40_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN40=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt714); 
            RETURN40_tree = 
            (AslTree)adaptor.create(RETURN40)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN40_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt717);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ42=null;
        Token ID43=null;

        AslTree READ42_tree=null;
        AslTree ID43_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ42=(Token)match(input,READ,FOLLOW_READ_in_read736); 
            READ42_tree = 
            (AslTree)adaptor.create(READ42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ42_tree, root_0);


            ID43=(Token)match(input,ID,FOLLOW_ID_in_read739); 
            ID43_tree = 
            (AslTree)adaptor.create(ID43)
            ;
            adaptor.addChild(root_0, ID43_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE44=null;
        Token STRING46=null;
        AslParser.expr_return expr45 =null;


        AslTree WRITE44_tree=null;
        AslTree STRING46_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE44=(Token)match(input,WRITE,FOLLOW_WRITE_in_write759); 
            WRITE44_tree = 
            (AslTree)adaptor.create(WRITE44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE44_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==51) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write763);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:26: STRING
                    {
                    STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_write767); 
                    STRING46_tree = 
                    (AslTree)adaptor.create(STRING46)
                    ;
                    adaptor.addChild(root_0, STRING46_tree);


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


    public static class create_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:1: create : CREATE ^ entity INT INT INT INT ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE47=null;
        Token INT49=null;
        Token INT50=null;
        Token INT51=null;
        Token INT52=null;
        AslParser.entity_return entity48 =null;


        AslTree CREATE47_tree=null;
        AslTree INT49_tree=null;
        AslTree INT50_tree=null;
        AslTree INT51_tree=null;
        AslTree INT52_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:9: ( CREATE ^ entity INT INT INT INT )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:13: CREATE ^ entity INT INT INT INT
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE47=(Token)match(input,CREATE,FOLLOW_CREATE_in_create790); 
            CREATE47_tree = 
            (AslTree)adaptor.create(CREATE47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE47_tree, root_0);


            pushFollow(FOLLOW_entity_in_create793);
            entity48=entity();

            state._fsp--;

            adaptor.addChild(root_0, entity48.getTree());

            INT49=(Token)match(input,INT,FOLLOW_INT_in_create795); 
            INT49_tree = 
            (AslTree)adaptor.create(INT49)
            ;
            adaptor.addChild(root_0, INT49_tree);


            INT50=(Token)match(input,INT,FOLLOW_INT_in_create797); 
            INT50_tree = 
            (AslTree)adaptor.create(INT50)
            ;
            adaptor.addChild(root_0, INT50_tree);


            INT51=(Token)match(input,INT,FOLLOW_INT_in_create799); 
            INT51_tree = 
            (AslTree)adaptor.create(INT51)
            ;
            adaptor.addChild(root_0, INT51_tree);


            INT52=(Token)match(input,INT,FOLLOW_INT_in_create801); 
            INT52_tree = 
            (AslTree)adaptor.create(INT52)
            ;
            adaptor.addChild(root_0, INT52_tree);


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
    // $ANTLR end "create"


    public static class entity_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:1: entity : ( RECT | CIRCLE );
    public final AslParser.entity_return entity() throws RecognitionException {
        AslParser.entity_return retval = new AslParser.entity_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set53=null;

        AslTree set53_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:9: ( RECT | CIRCLE )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set53=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set53)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "entity"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR55=null;
        AslParser.boolterm_return boolterm54 =null;

        AslParser.boolterm_return boolterm56 =null;


        AslTree OR55_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:9: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr858);
            boolterm54=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm54.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:22: ( OR ^ boolterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:23: OR ^ boolterm
            	    {
            	    OR55=(Token)match(input,OR,FOLLOW_OR_in_expr861); 
            	    OR55_tree = 
            	    (AslTree)adaptor.create(OR55)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR55_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr864);
            	    boolterm56=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm56.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND58=null;
        AslParser.boolfact_return boolfact57 =null;

        AslParser.boolfact_return boolfact59 =null;


        AslTree AND58_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm884);
            boolfact57=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact57.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:22: ( AND ^ boolfact )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:23: AND ^ boolfact
            	    {
            	    AND58=(Token)match(input,AND,FOLLOW_AND_in_boolterm887); 
            	    AND58_tree = 
            	    (AslTree)adaptor.create(AND58)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND58_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm890);
            	    boolfact59=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact59.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL61=null;
        Token NOT_EQUAL62=null;
        Token LT63=null;
        Token LE64=null;
        Token GT65=null;
        Token GE66=null;
        AslParser.num_expr_return num_expr60 =null;

        AslParser.num_expr_return num_expr67 =null;


        AslTree EQUAL61_tree=null;
        AslTree NOT_EQUAL62_tree=null;
        AslTree LT63_tree=null;
        AslTree LE64_tree=null;
        AslTree GT65_tree=null;
        AslTree GE66_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact910);
            num_expr60=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr60.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NOT_EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt12=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt12=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt12=2;
                        }
                        break;
                    case LT:
                        {
                        alt12=3;
                        }
                        break;
                    case LE:
                        {
                        alt12=4;
                        }
                        break;
                    case GT:
                        {
                        alt12=5;
                        }
                        break;
                    case GE:
                        {
                        alt12=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:24: EQUAL ^
                            {
                            EQUAL61=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact914); 
                            EQUAL61_tree = 
                            (AslTree)adaptor.create(EQUAL61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL61_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL62=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact919); 
                            NOT_EQUAL62_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL62_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:46: LT ^
                            {
                            LT63=(Token)match(input,LT,FOLLOW_LT_in_boolfact924); 
                            LT63_tree = 
                            (AslTree)adaptor.create(LT63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT63_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:52: LE ^
                            {
                            LE64=(Token)match(input,LE,FOLLOW_LE_in_boolfact929); 
                            LE64_tree = 
                            (AslTree)adaptor.create(LE64)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE64_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:58: GT ^
                            {
                            GT65=(Token)match(input,GT,FOLLOW_GT_in_boolfact934); 
                            GT65_tree = 
                            (AslTree)adaptor.create(GT65)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT65_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:64: GE ^
                            {
                            GE66=(Token)match(input,GE,FOLLOW_GE_in_boolfact939); 
                            GE66_tree = 
                            (AslTree)adaptor.create(GE66)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE66_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact943);
                    num_expr67=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr67.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS69=null;
        Token MINUS70=null;
        AslParser.term_return term68 =null;

        AslParser.term_return term71 =null;


        AslTree PLUS69_tree=null;
        AslTree MINUS70_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr963);
            term68=term();

            state._fsp--;

            adaptor.addChild(root_0, term68.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:18: ( ( PLUS ^| MINUS ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:20: ( PLUS ^| MINUS ^)
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==PLUS) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==MINUS) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:21: PLUS ^
            	            {
            	            PLUS69=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr968); 
            	            PLUS69_tree = 
            	            (AslTree)adaptor.create(PLUS69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS69_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:29: MINUS ^
            	            {
            	            MINUS70=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr973); 
            	            MINUS70_tree = 
            	            (AslTree)adaptor.create(MINUS70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS70_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr977);
            	    term71=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term71.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL73=null;
        Token DIV74=null;
        Token MOD75=null;
        AslParser.factor_return factor72 =null;

        AslParser.factor_return factor76 =null;


        AslTree MUL73_tree=null;
        AslTree DIV74_tree=null;
        AslTree MOD75_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1001);
            factor72=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor72.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DIV||(LA17_0 >= MOD && LA17_0 <= MUL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:23: MUL ^
            	            {
            	            MUL73=(Token)match(input,MUL,FOLLOW_MUL_in_term1006); 
            	            MUL73_tree = 
            	            (AslTree)adaptor.create(MUL73)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL73_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:30: DIV ^
            	            {
            	            DIV74=(Token)match(input,DIV,FOLLOW_DIV_in_term1011); 
            	            DIV74_tree = 
            	            (AslTree)adaptor.create(DIV74)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV74_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:37: MOD ^
            	            {
            	            MOD75=(Token)match(input,MOD,FOLLOW_MOD_in_term1016); 
            	            MOD75_tree = 
            	            (AslTree)adaptor.create(MOD75)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD75_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1020);
            	    factor76=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor76.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT77=null;
        Token PLUS78=null;
        Token MINUS79=null;
        AslParser.atom_return atom80 =null;


        AslTree NOT77_tree=null;
        AslTree PLUS78_tree=null;
        AslTree MINUS79_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt18=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt18=1;
                    }
                    break;
                case PLUS:
                    {
                    alt18=2;
                    }
                    break;
                case MINUS:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:14: NOT ^
                    {
                    NOT77=(Token)match(input,NOT,FOLLOW_NOT_in_factor1043); 
                    NOT77_tree = 
                    (AslTree)adaptor.create(NOT77)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT77_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:21: PLUS ^
                    {
                    PLUS78=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1048); 
                    PLUS78_tree = 
                    (AslTree)adaptor.create(PLUS78)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS78_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:29: MINUS ^
                    {
                    MINUS79=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1053); 
                    MINUS79_tree = 
                    (AslTree)adaptor.create(MINUS79)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS79_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1058);
            atom80=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom80.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID81=null;
        Token INT82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        AslParser.funcall_return funcall83 =null;

        AslParser.expr_return expr85 =null;


        AslTree b_tree=null;
        AslTree ID81_tree=null;
        AslTree INT82_tree=null;
        AslTree char_literal84_tree=null;
        AslTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==51) ) {
                    alt20=4;
                }
                else if ( (LA20_1==AND||(LA20_1 >= DIV && LA20_1 <= EQUAL)||(LA20_1 >= GE && LA20_1 <= GT)||LA20_1==LE||(LA20_1 >= LT && LA20_1 <= MUL)||(LA20_1 >= NOT_EQUAL && LA20_1 <= OR)||LA20_1==PLUS||LA20_1==THEN||(LA20_1 >= 52 && LA20_1 <= 54)) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt20=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt20=3;
                }
                break;
            case 51:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_atom1083); 
                    ID81_tree = 
                    (AslTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT82=(Token)match(input,INT,FOLLOW_INT_in_atom1097); 
                    INT82_tree = 
                    (AslTree)adaptor.create(INT82)
                    ;
                    adaptor.addChild(root_0, INT82_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:13: (b= TRUE |b= FALSE )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TRUE) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==FALSE) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1114);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1120);  
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
                    // 156:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:36: ^( BOOLEAN[$b,$b.text] )
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
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1143);
                    funcall83=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall83.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal84=(Token)match(input,51,FOLLOW_51_in_atom1157); 

                    pushFollow(FOLLOW_expr_in_atom1160);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());

                    char_literal86=(Token)match(input,52,FOLLOW_52_in_atom1162); 

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


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        AslParser.expr_list_return expr_list89 =null;


        AslTree ID87_tree=null;
        AslTree char_literal88_tree=null;
        AslTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:13: ID '(' ( expr_list )? ')'
            {
            ID87=(Token)match(input,ID,FOLLOW_ID_in_funcall1183);  
            stream_ID.add(ID87);


            char_literal88=(Token)match(input,51,FOLLOW_51_in_funcall1185);  
            stream_51.add(char_literal88);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:20: ( expr_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FALSE||LA21_0==ID||LA21_0==INT||LA21_0==MINUS||LA21_0==NOT||LA21_0==PLUS||LA21_0==TRUE||LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1187);
                    expr_list89=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list89.getTree());

                    }
                    break;

            }


            char_literal90=(Token)match(input,52,FOLLOW_52_in_funcall1190);  
            stream_52.add(char_literal90);


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
            // 162:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:61: ( expr_list )?
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


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal92=null;
        AslParser.expr_return expr91 =null;

        AslParser.expr_return expr93 =null;


        AslTree char_literal92_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1223);
            expr91=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr91.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:18: ( ',' ! expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:19: ',' ! expr
            	    {
            	    char_literal92=(Token)match(input,53,FOLLOW_53_in_expr_list1226); 

            	    pushFollow(FOLLOW_expr_in_expr_list1229);
            	    expr93=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr93.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func196 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_params_in_func198 = new BitSet(new long[]{0x00418A0003000400L});
    public static final BitSet FOLLOW_block_instructions_in_func200 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_params221 = new BitSet(new long[]{0x0014000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params223 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_params226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist252 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_paramlist255 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist258 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_50_in_param283 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions344 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_block_instructions347 = new BitSet(new long[]{0x00418A0003000400L});
    public static final BitSet FOLLOW_instruction_in_block_instructions349 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assign609 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_expr_in_assign611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt640 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt643 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt645 = new BitSet(new long[]{0x00418A0003000400L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt648 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt651 = new BitSet(new long[]{0x00418A0003000400L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt681 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_expr_in_while_stmt684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt686 = new BitSet(new long[]{0x00418A0003000400L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt689 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt714 = new BitSet(new long[]{0x0008404485080002L});
    public static final BitSet FOLLOW_expr_in_return_stmt717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read736 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_read739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write759 = new BitSet(new long[]{0x0008504485080000L});
    public static final BitSet FOLLOW_expr_in_write763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create790 = new BitSet(new long[]{0x0000040000000100L});
    public static final BitSet FOLLOW_entity_in_create793 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_create795 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_create797 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_create799 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_create801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr858 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_expr861 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_boolterm_in_expr864 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm884 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm887 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm890 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact910 = new BitSet(new long[]{0x0000000848C20002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact914 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact919 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_LT_in_boolfact924 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_LE_in_boolfact929 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_GT_in_boolfact934 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_GE_in_boolfact939 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr963 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr968 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr973 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_term_in_num_expr977 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_factor_in_term1001 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_MUL_in_term1006 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_DIV_in_term1011 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_MOD_in_term1016 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_factor_in_term1020 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_NOT_in_factor1043 = new BitSet(new long[]{0x0008400005080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1048 = new BitSet(new long[]{0x0008400005080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1053 = new BitSet(new long[]{0x0008400005080000L});
    public static final BitSet FOLLOW_atom_in_factor1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom1157 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_expr_in_atom1160 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1183 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funcall1185 = new BitSet(new long[]{0x0018404485080000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1187 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_funcall1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1223 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expr_list1226 = new BitSet(new long[]{0x0008404485080000L});
    public static final BitSet FOLLOW_expr_in_expr_list1229 = new BitSet(new long[]{0x0020000000000002L});

}