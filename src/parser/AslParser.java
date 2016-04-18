// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-18 09:45:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "DIV", "DO", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "RETURN", "STRING", "TEXT", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'#'", "'&'", "'('", "')'", "','", "';'", "'@'", "'@SHOW'"
    };

    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int CIRCLE=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int DO=11;
    public static final int ELLIPSE=12;
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
    public static final int TEXT=45;
    public static final int THEN=46;
    public static final int TRUE=47;
    public static final int WHILE=48;
    public static final int WRITE=49;
    public static final int WS=50;

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

                if ( (LA1_0==FUNC||LA1_0==58) ) {
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:64:1: func : ( FUNC ^ ID params block_instructions ENDFUNC !| macro );
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;

        AslParser.macro_return macro8 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !| macro )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==58) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
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
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:5: macro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_macro_in_func209);
                    macro8=macro();

                    state._fsp--;

                    adaptor.addChild(root_0, macro8.getTree());

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
    // $ANTLR end "func"


    public static class macro_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macro"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:1: macro : '@SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal9=null;

        AslTree string_literal9_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:7: ( '@SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:9: '@SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal9=(Token)match(input,58,FOLLOW_58_in_macro226); 
            string_literal9_tree = 
            (AslTree)adaptor.create(string_literal9)
            ;
            adaptor.addChild(root_0, string_literal9_tree);


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


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        AslParser.paramlist_return paramlist11 =null;


        AslTree char_literal10_tree=null;
        AslTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:10: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,53,FOLLOW_53_in_params238);  
            stream_53.add(char_literal10);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params240);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,54,FOLLOW_54_in_params243);  
            stream_54.add(char_literal12);


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
            // 72:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:72:41: ( paramlist )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal14=null;
        AslParser.param_return param13 =null;

        AslParser.param_return param15 =null;


        AslTree char_literal14_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:76:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:76:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist269);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:76:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==55) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:76:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,55,FOLLOW_55_in_paramlist272); 

            	    pushFollow(FOLLOW_param_in_paramlist275);
            	    param15=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param15.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;

        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:13: '&' id= ID
                    {
                    char_literal16=(Token)match(input,52,FOLLOW_52_in_param300);  
                    stream_52.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param304);  
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
                    // 81:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:26: ^( PREF[$id,$id.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param327);  
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
                    // 82:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:22: ^( PVALUE[$id,$id.text] )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:86:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions361);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==56) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,56,FOLLOW_56_in_block_instructions364);  
            	    stream_56.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions366);
            	    instruction19=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // 88:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;

        AslParser.set_return set27 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set |)
            int alt7=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt7=1;
                    }
                    break;
                case 53:
                    {
                    alt7=4;
                    }
                    break;
                case 51:
                case 57:
                    {
                    alt7=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case RETURN:
                {
                alt7=5;
                }
                break;
            case READ:
                {
                alt7=6;
                }
                break;
            case WRITE:
                {
                alt7=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 56:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction415);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction437);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction457);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction477);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction498);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction515);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction540);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction563);
                    set27=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set27.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:102:9: 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID28=null;
        AslParser.expr_return expr29 =null;


        AslTree eq_tree=null;
        AslTree ID28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:10: ID eq= EQUAL expr
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_assign614);  
            stream_ID.add(ID28);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign618);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign620);
            expr29=expr();

            state._fsp--;

            stream_expr.add(expr29.getTree());

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
            // 105:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF30=null;
        Token THEN32=null;
        Token ELSE34=null;
        Token ENDIF36=null;
        AslParser.expr_return expr31 =null;

        AslParser.block_instructions_return block_instructions33 =null;

        AslParser.block_instructions_return block_instructions35 =null;


        AslTree IF30_tree=null;
        AslTree THEN32_tree=null;
        AslTree ELSE34_tree=null;
        AslTree ENDIF36_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF30=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt649); 
            IF30_tree = 
            (AslTree)adaptor.create(IF30)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF30_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt652);
            expr31=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr31.getTree());

            THEN32=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt654); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt657);
            block_instructions33=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions33.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:47: ELSE ! block_instructions
                    {
                    ELSE34=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt660); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt663);
                    block_instructions35=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions35.getTree());

                    }
                    break;

            }


            ENDIF36=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt667); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE37=null;
        Token DO39=null;
        Token ENDWHILE41=null;
        AslParser.expr_return expr38 =null;

        AslParser.block_instructions_return block_instructions40 =null;


        AslTree WHILE37_tree=null;
        AslTree DO39_tree=null;
        AslTree ENDWHILE41_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE37=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt690); 
            WHILE37_tree = 
            (AslTree)adaptor.create(WHILE37)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE37_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt693);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            DO39=(Token)match(input,DO,FOLLOW_DO_in_while_stmt695); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt698);
            block_instructions40=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions40.getTree());

            ENDWHILE41=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt700); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN42=null;
        AslParser.expr_return expr43 =null;


        AslTree RETURN42_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN42=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt723); 
            RETURN42_tree = 
            (AslTree)adaptor.create(RETURN42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN42_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CIRCLE||LA9_0==ELLIPSE||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==RECT||LA9_0==TEXT||LA9_0==TRUE||LA9_0==53) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt726);
                    expr43=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr43.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ44=null;
        Token ID45=null;

        AslTree READ44_tree=null;
        AslTree ID45_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ44=(Token)match(input,READ,FOLLOW_READ_in_read745); 
            READ44_tree = 
            (AslTree)adaptor.create(READ44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ44_tree, root_0);


            ID45=(Token)match(input,ID,FOLLOW_ID_in_read748); 
            ID45_tree = 
            (AslTree)adaptor.create(ID45)
            ;
            adaptor.addChild(root_0, ID45_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE46=null;
        Token STRING48=null;
        AslParser.expr_return expr47 =null;


        AslTree WRITE46_tree=null;
        AslTree STRING48_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write768); 
            WRITE46_tree = 
            (AslTree)adaptor.create(WRITE46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE46_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CIRCLE||LA10_0==ELLIPSE||LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==RECT||LA10_0==TEXT||LA10_0==TRUE||LA10_0==53) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write772);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:26: STRING
                    {
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_write776); 
                    STRING48_tree = 
                    (AslTree)adaptor.create(STRING48)
                    ;
                    adaptor.addChild(root_0, STRING48_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:1: set : ID ( '@' ^| '#' ^) STRING ( INT )+ ;
    public final AslParser.set_return set() throws RecognitionException {
        AslParser.set_return retval = new AslParser.set_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token STRING52=null;
        Token INT53=null;

        AslTree ID49_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal51_tree=null;
        AslTree STRING52_tree=null;
        AslTree INT53_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:6: ( ID ( '@' ^| '#' ^) STRING ( INT )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:8: ID ( '@' ^| '#' ^) STRING ( INT )+
            {
            root_0 = (AslTree)adaptor.nil();


            ID49=(Token)match(input,ID,FOLLOW_ID_in_set804); 
            ID49_tree = 
            (AslTree)adaptor.create(ID49)
            ;
            adaptor.addChild(root_0, ID49_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:11: ( '@' ^| '#' ^)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==57) ) {
                alt11=1;
            }
            else if ( (LA11_0==51) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:12: '@' ^
                    {
                    char_literal50=(Token)match(input,57,FOLLOW_57_in_set807); 
                    char_literal50_tree = 
                    (AslTree)adaptor.create(char_literal50)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:17: '#' ^
                    {
                    char_literal51=(Token)match(input,51,FOLLOW_51_in_set810); 
                    char_literal51_tree = 
                    (AslTree)adaptor.create(char_literal51)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal51_tree, root_0);


                    }
                    break;

            }


            STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_set814); 
            STRING52_tree = 
            (AslTree)adaptor.create(STRING52)
            ;
            adaptor.addChild(root_0, STRING52_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:30: ( INT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:128:30: INT
            	    {
            	    INT53=(Token)match(input,INT,FOLLOW_INT_in_set816); 
            	    INT53_tree = 
            	    (AslTree)adaptor.create(INT53)
            	    ;
            	    adaptor.addChild(root_0, INT53_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "set"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:131:1: expr : ( boolexpr | graphicexpr );
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr54 =null;

        AslParser.graphicexpr_return graphicexpr55 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:131:6: ( boolexpr | graphicexpr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INT||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE||LA13_0==53) ) {
                alt13=1;
            }
            else if ( (LA13_0==CIRCLE||LA13_0==ELLIPSE||LA13_0==RECT||LA13_0==TEXT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:131:8: boolexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_boolexpr_in_expr836);
                    boolexpr54=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr54.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:132:5: graphicexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_graphicexpr_in_expr842);
                    graphicexpr55=graphicexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, graphicexpr55.getTree());

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
    // $ANTLR end "expr"


    public static class graphicexpr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphicexpr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:135:1: graphicexpr : ( RECT ^ INT INT INT INT | CIRCLE ^ INT INT INT | TEXT ^ INT INT STRING | ELLIPSE ^ INT INT INT INT );
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT56=null;
        Token INT57=null;
        Token INT58=null;
        Token INT59=null;
        Token INT60=null;
        Token CIRCLE61=null;
        Token INT62=null;
        Token INT63=null;
        Token INT64=null;
        Token TEXT65=null;
        Token INT66=null;
        Token INT67=null;
        Token STRING68=null;
        Token ELLIPSE69=null;
        Token INT70=null;
        Token INT71=null;
        Token INT72=null;
        Token INT73=null;

        AslTree RECT56_tree=null;
        AslTree INT57_tree=null;
        AslTree INT58_tree=null;
        AslTree INT59_tree=null;
        AslTree INT60_tree=null;
        AslTree CIRCLE61_tree=null;
        AslTree INT62_tree=null;
        AslTree INT63_tree=null;
        AslTree INT64_tree=null;
        AslTree TEXT65_tree=null;
        AslTree INT66_tree=null;
        AslTree INT67_tree=null;
        AslTree STRING68_tree=null;
        AslTree ELLIPSE69_tree=null;
        AslTree INT70_tree=null;
        AslTree INT71_tree=null;
        AslTree INT72_tree=null;
        AslTree INT73_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:135:13: ( RECT ^ INT INT INT INT | CIRCLE ^ INT INT INT | TEXT ^ INT INT STRING | ELLIPSE ^ INT INT INT INT )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RECT:
                {
                alt14=1;
                }
                break;
            case CIRCLE:
                {
                alt14=2;
                }
                break;
            case TEXT:
                {
                alt14=3;
                }
                break;
            case ELLIPSE:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:135:15: RECT ^ INT INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT56=(Token)match(input,RECT,FOLLOW_RECT_in_graphicexpr854); 
                    RECT56_tree = 
                    (AslTree)adaptor.create(RECT56)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT56_tree, root_0);


                    INT57=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr857); 
                    INT57_tree = 
                    (AslTree)adaptor.create(INT57)
                    ;
                    adaptor.addChild(root_0, INT57_tree);


                    INT58=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr859); 
                    INT58_tree = 
                    (AslTree)adaptor.create(INT58)
                    ;
                    adaptor.addChild(root_0, INT58_tree);


                    INT59=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr861); 
                    INT59_tree = 
                    (AslTree)adaptor.create(INT59)
                    ;
                    adaptor.addChild(root_0, INT59_tree);


                    INT60=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr863); 
                    INT60_tree = 
                    (AslTree)adaptor.create(INT60)
                    ;
                    adaptor.addChild(root_0, INT60_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:6: CIRCLE ^ INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE61=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicexpr870); 
                    CIRCLE61_tree = 
                    (AslTree)adaptor.create(CIRCLE61)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE61_tree, root_0);


                    INT62=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr873); 
                    INT62_tree = 
                    (AslTree)adaptor.create(INT62)
                    ;
                    adaptor.addChild(root_0, INT62_tree);


                    INT63=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr875); 
                    INT63_tree = 
                    (AslTree)adaptor.create(INT63)
                    ;
                    adaptor.addChild(root_0, INT63_tree);


                    INT64=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr877); 
                    INT64_tree = 
                    (AslTree)adaptor.create(INT64)
                    ;
                    adaptor.addChild(root_0, INT64_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:6: TEXT ^ INT INT STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT65=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicexpr884); 
                    TEXT65_tree = 
                    (AslTree)adaptor.create(TEXT65)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT65_tree, root_0);


                    INT66=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr887); 
                    INT66_tree = 
                    (AslTree)adaptor.create(INT66)
                    ;
                    adaptor.addChild(root_0, INT66_tree);


                    INT67=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr889); 
                    INT67_tree = 
                    (AslTree)adaptor.create(INT67)
                    ;
                    adaptor.addChild(root_0, INT67_tree);


                    STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_graphicexpr891); 
                    STRING68_tree = 
                    (AslTree)adaptor.create(STRING68)
                    ;
                    adaptor.addChild(root_0, STRING68_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:138:6: ELLIPSE ^ INT INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE69=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicexpr898); 
                    ELLIPSE69_tree = 
                    (AslTree)adaptor.create(ELLIPSE69)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE69_tree, root_0);


                    INT70=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr901); 
                    INT70_tree = 
                    (AslTree)adaptor.create(INT70)
                    ;
                    adaptor.addChild(root_0, INT70_tree);


                    INT71=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr903); 
                    INT71_tree = 
                    (AslTree)adaptor.create(INT71)
                    ;
                    adaptor.addChild(root_0, INT71_tree);


                    INT72=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr905); 
                    INT72_tree = 
                    (AslTree)adaptor.create(INT72)
                    ;
                    adaptor.addChild(root_0, INT72_tree);


                    INT73=(Token)match(input,INT,FOLLOW_INT_in_graphicexpr907); 
                    INT73_tree = 
                    (AslTree)adaptor.create(INT73)
                    ;
                    adaptor.addChild(root_0, INT73_tree);


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
    // $ANTLR end "graphicexpr"


    public static class boolexpr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolexpr"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR75=null;
        AslParser.boolterm_return boolterm74 =null;

        AslParser.boolterm_return boolterm76 =null;


        AslTree OR75_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr930);
            boolterm74=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm74.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:26: ( OR ^ boolterm )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:27: OR ^ boolterm
            	    {
            	    OR75=(Token)match(input,OR,FOLLOW_OR_in_boolexpr933); 
            	    OR75_tree = 
            	    (AslTree)adaptor.create(OR75)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR75_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr936);
            	    boolterm76=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm76.getTree());

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
    // $ANTLR end "boolexpr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND78=null;
        AslParser.boolfact_return boolfact77 =null;

        AslParser.boolfact_return boolfact79 =null;


        AslTree AND78_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm956);
            boolfact77=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact77.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:22: ( AND ^ boolfact )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:23: AND ^ boolfact
            	    {
            	    AND78=(Token)match(input,AND,FOLLOW_AND_in_boolterm959); 
            	    AND78_tree = 
            	    (AslTree)adaptor.create(AND78)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND78_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm962);
            	    boolfact79=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact79.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL81=null;
        Token NOT_EQUAL82=null;
        Token LT83=null;
        Token LE84=null;
        Token GT85=null;
        Token GE86=null;
        AslParser.num_expr_return num_expr80 =null;

        AslParser.num_expr_return num_expr87 =null;


        AslTree EQUAL81_tree=null;
        AslTree NOT_EQUAL82_tree=null;
        AslTree LT83_tree=null;
        AslTree LE84_tree=null;
        AslTree GT85_tree=null;
        AslTree GE86_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact982);
            num_expr80=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr80.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUAL||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NOT_EQUAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt17=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt17=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt17=2;
                        }
                        break;
                    case LT:
                        {
                        alt17=3;
                        }
                        break;
                    case LE:
                        {
                        alt17=4;
                        }
                        break;
                    case GT:
                        {
                        alt17=5;
                        }
                        break;
                    case GE:
                        {
                        alt17=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:24: EQUAL ^
                            {
                            EQUAL81=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact986); 
                            EQUAL81_tree = 
                            (AslTree)adaptor.create(EQUAL81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL81_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL82=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact991); 
                            NOT_EQUAL82_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL82_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:46: LT ^
                            {
                            LT83=(Token)match(input,LT,FOLLOW_LT_in_boolfact996); 
                            LT83_tree = 
                            (AslTree)adaptor.create(LT83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT83_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:52: LE ^
                            {
                            LE84=(Token)match(input,LE,FOLLOW_LE_in_boolfact1001); 
                            LE84_tree = 
                            (AslTree)adaptor.create(LE84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE84_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:58: GT ^
                            {
                            GT85=(Token)match(input,GT,FOLLOW_GT_in_boolfact1006); 
                            GT85_tree = 
                            (AslTree)adaptor.create(GT85)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT85_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:148:64: GE ^
                            {
                            GE86=(Token)match(input,GE,FOLLOW_GE_in_boolfact1011); 
                            GE86_tree = 
                            (AslTree)adaptor.create(GE86)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE86_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1015);
                    num_expr87=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr87.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS89=null;
        Token MINUS90=null;
        AslParser.term_return term88 =null;

        AslParser.term_return term91 =null;


        AslTree PLUS89_tree=null;
        AslTree MINUS90_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1035);
            term88=term();

            state._fsp--;

            adaptor.addChild(root_0, term88.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:18: ( ( PLUS ^| MINUS ^) term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:20: ( PLUS ^| MINUS ^)
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==PLUS) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==MINUS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:21: PLUS ^
            	            {
            	            PLUS89=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1040); 
            	            PLUS89_tree = 
            	            (AslTree)adaptor.create(PLUS89)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS89_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:151:29: MINUS ^
            	            {
            	            MINUS90=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1045); 
            	            MINUS90_tree = 
            	            (AslTree)adaptor.create(MINUS90)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS90_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1049);
            	    term91=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term91.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL93=null;
        Token DIV94=null;
        Token MOD95=null;
        AslParser.factor_return factor92 =null;

        AslParser.factor_return factor96 =null;


        AslTree MUL93_tree=null;
        AslTree DIV94_tree=null;
        AslTree MOD95_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1073);
            factor92=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor92.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DIV||(LA22_0 >= MOD && LA22_0 <= MUL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:23: MUL ^
            	            {
            	            MUL93=(Token)match(input,MUL,FOLLOW_MUL_in_term1078); 
            	            MUL93_tree = 
            	            (AslTree)adaptor.create(MUL93)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL93_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:30: DIV ^
            	            {
            	            DIV94=(Token)match(input,DIV,FOLLOW_DIV_in_term1083); 
            	            DIV94_tree = 
            	            (AslTree)adaptor.create(DIV94)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV94_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:37: MOD ^
            	            {
            	            MOD95=(Token)match(input,MOD,FOLLOW_MOD_in_term1088); 
            	            MOD95_tree = 
            	            (AslTree)adaptor.create(MOD95)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD95_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1092);
            	    factor96=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor96.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT97=null;
        Token PLUS98=null;
        Token MINUS99=null;
        AslParser.atom_return atom100 =null;


        AslTree NOT97_tree=null;
        AslTree PLUS98_tree=null;
        AslTree MINUS99_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt23=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt23=1;
                    }
                    break;
                case PLUS:
                    {
                    alt23=2;
                    }
                    break;
                case MINUS:
                    {
                    alt23=3;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:14: NOT ^
                    {
                    NOT97=(Token)match(input,NOT,FOLLOW_NOT_in_factor1115); 
                    NOT97_tree = 
                    (AslTree)adaptor.create(NOT97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT97_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:21: PLUS ^
                    {
                    PLUS98=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1120); 
                    PLUS98_tree = 
                    (AslTree)adaptor.create(PLUS98)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS98_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:157:29: MINUS ^
                    {
                    MINUS99=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1125); 
                    MINUS99_tree = 
                    (AslTree)adaptor.create(MINUS99)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS99_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1130);
            atom100=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom100.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID101=null;
        Token INT102=null;
        Token char_literal104=null;
        Token char_literal106=null;
        AslParser.funcall_return funcall103 =null;

        AslParser.expr_return expr105 =null;


        AslTree b_tree=null;
        AslTree ID101_tree=null;
        AslTree INT102_tree=null;
        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt25=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==53) ) {
                    alt25=4;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= DO)||(LA25_1 >= ELSE && LA25_1 <= EQUAL)||(LA25_1 >= GE && LA25_1 <= GT)||LA25_1==LE||(LA25_1 >= LT && LA25_1 <= MUL)||(LA25_1 >= NOT_EQUAL && LA25_1 <= OR)||LA25_1==PLUS||LA25_1==THEN||(LA25_1 >= 54 && LA25_1 <= 56)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt25=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt25=3;
                }
                break;
            case 53:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID101=(Token)match(input,ID,FOLLOW_ID_in_atom1155); 
                    ID101_tree = 
                    (AslTree)adaptor.create(ID101)
                    ;
                    adaptor.addChild(root_0, ID101_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:164:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT102=(Token)match(input,INT,FOLLOW_INT_in_atom1169); 
                    INT102_tree = 
                    (AslTree)adaptor.create(INT102)
                    ;
                    adaptor.addChild(root_0, INT102_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:13: (b= TRUE |b= FALSE )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TRUE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==FALSE) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1186);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1192);  
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
                    // 165:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1215);
                    funcall103=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall103.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:167:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal104=(Token)match(input,53,FOLLOW_53_in_atom1229); 

                    pushFollow(FOLLOW_expr_in_atom1232);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());

                    char_literal106=(Token)match(input,54,FOLLOW_54_in_atom1234); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        AslParser.expr_list_return expr_list109 =null;


        AslTree ID107_tree=null;
        AslTree char_literal108_tree=null;
        AslTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:13: ID '(' ( expr_list )? ')'
            {
            ID107=(Token)match(input,ID,FOLLOW_ID_in_funcall1255);  
            stream_ID.add(ID107);


            char_literal108=(Token)match(input,53,FOLLOW_53_in_funcall1257);  
            stream_53.add(char_literal108);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:20: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CIRCLE||LA26_0==ELLIPSE||LA26_0==FALSE||LA26_0==ID||LA26_0==INT||LA26_0==MINUS||LA26_0==NOT||LA26_0==PLUS||LA26_0==RECT||LA26_0==TEXT||LA26_0==TRUE||LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1259);
                    expr_list109=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list109.getTree());

                    }
                    break;

            }


            char_literal110=(Token)match(input,54,FOLLOW_54_in_funcall1262);  
            stream_54.add(char_literal110);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 171:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:61: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal112=null;
        AslParser.expr_return expr111 =null;

        AslParser.expr_return expr113 =null;


        AslTree char_literal112_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1295);
            expr111=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr111.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:18: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:19: ',' ! expr
            	    {
            	    char_literal112=(Token)match(input,55,FOLLOW_55_in_expr_list1298); 

            	    pushFollow(FOLLOW_expr_in_expr_list1301);
            	    expr113=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr113.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0400000000100000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func196 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_params_in_func198 = new BitSet(new long[]{0x01030A0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_func200 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_func209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_macro226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_params238 = new BitSet(new long[]{0x0050000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params240 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_params243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist269 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_paramlist272 = new BitSet(new long[]{0x0010000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist275 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_52_in_param300 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions361 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_block_instructions364 = new BitSet(new long[]{0x01030A0003000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions366 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assign618 = new BitSet(new long[]{0x0020A44485081100L});
    public static final BitSet FOLLOW_expr_in_assign620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt649 = new BitSet(new long[]{0x0020A44485081100L});
    public static final BitSet FOLLOW_expr_in_ite_stmt652 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt654 = new BitSet(new long[]{0x01030A0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt657 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt660 = new BitSet(new long[]{0x01030A0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt690 = new BitSet(new long[]{0x0020A44485081100L});
    public static final BitSet FOLLOW_expr_in_while_stmt693 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DO_in_while_stmt695 = new BitSet(new long[]{0x01030A0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt698 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt723 = new BitSet(new long[]{0x0020A44485081102L});
    public static final BitSet FOLLOW_expr_in_return_stmt726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read745 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_read748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write768 = new BitSet(new long[]{0x0020B44485081100L});
    public static final BitSet FOLLOW_expr_in_write772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set804 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_set807 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51_in_set810 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_STRING_in_set814 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_set816 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_boolexpr_in_expr836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_expr842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicexpr854 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr857 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr859 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr861 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicexpr870 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr873 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr875 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicexpr884 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr887 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr889 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_STRING_in_graphicexpr891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicexpr898 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr901 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr903 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr905 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INT_in_graphicexpr907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr930 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr933 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr936 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm956 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm959 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm962 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact982 = new BitSet(new long[]{0x0000000848C20002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact986 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact991 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_LT_in_boolfact996 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_LE_in_boolfact1001 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_GT_in_boolfact1006 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_GE_in_boolfact1011 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1035 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1040 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1045 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_term_in_num_expr1049 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_factor_in_term1073 = new BitSet(new long[]{0x0000000300000402L});
    public static final BitSet FOLLOW_MUL_in_term1078 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_DIV_in_term1083 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_MOD_in_term1088 = new BitSet(new long[]{0x0020804485080000L});
    public static final BitSet FOLLOW_factor_in_term1092 = new BitSet(new long[]{0x0000000300000402L});
    public static final BitSet FOLLOW_NOT_in_factor1115 = new BitSet(new long[]{0x0020800005080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1120 = new BitSet(new long[]{0x0020800005080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1125 = new BitSet(new long[]{0x0020800005080000L});
    public static final BitSet FOLLOW_atom_in_factor1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom1229 = new BitSet(new long[]{0x0020A44485081100L});
    public static final BitSet FOLLOW_expr_in_atom1232 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1255 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_funcall1257 = new BitSet(new long[]{0x0060A44485081100L});
    public static final BitSet FOLLOW_expr_list_in_funcall1259 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funcall1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1295 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_expr_list1298 = new BitSet(new long[]{0x0020A44485081100L});
    public static final BitSet FOLLOW_expr_in_expr_list1301 = new BitSet(new long[]{0x0080000000000002L});

}