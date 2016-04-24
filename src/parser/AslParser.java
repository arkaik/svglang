// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-18 12:46:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "DISP", "DIV", "DO", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "RETURN", "STRING", "TEXT", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'#'", "'&'", "'('", "')'", "','", "';'", "'@'", "'@SHOW'"
    };

    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int CIRCLE=8;
    public static final int COMMENT=9;
    public static final int DISP=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int ELLIPSE=13;
    public static final int ELSE=14;
    public static final int ENDFUNC=15;
    public static final int ENDIF=16;
    public static final int ENDWHILE=17;
    public static final int EQUAL=18;
    public static final int ESC_SEQ=19;
    public static final int FALSE=20;
    public static final int FUNC=21;
    public static final int FUNCALL=22;
    public static final int GE=23;
    public static final int GT=24;
    public static final int ID=25;
    public static final int IF=26;
    public static final int INT=27;
    public static final int LE=28;
    public static final int LIST_FUNCTIONS=29;
    public static final int LIST_INSTR=30;
    public static final int LT=31;
    public static final int MINUS=32;
    public static final int MOD=33;
    public static final int MUL=34;
    public static final int NOT=35;
    public static final int NOT_EQUAL=36;
    public static final int OR=37;
    public static final int PARAMS=38;
    public static final int PLUS=39;
    public static final int PREF=40;
    public static final int PVALUE=41;
    public static final int READ=42;
    public static final int RECT=43;
    public static final int RETURN=44;
    public static final int STRING=45;
    public static final int TEXT=46;
    public static final int THEN=47;
    public static final int TRUE=48;
    public static final int WHILE=49;
    public static final int WRITE=50;
    public static final int WS=51;

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:8: ( func )+ EOF
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC||LA1_0==59) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog177);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog180);  
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
            // 61:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:61:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:1: func : ( FUNC ^ ID params block_instructions ENDFUNC !| macro );
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:6: ( FUNC ^ ID params block_instructions ENDFUNC !| macro )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:8: FUNC ^ ID params block_instructions ENDFUNC !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func207); 
                    FUNC3_tree = 
                    (AslTree)adaptor.create(FUNC3)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_func210); 
                    ID4_tree = 
                    (AslTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                    pushFollow(FOLLOW_params_in_func212);
                    params5=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params5.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func214);
                    block_instructions6=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions6.getTree());

                    ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func216); 

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:66:5: macro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_macro_in_func223);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:1: macro : '@SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal9=null;

        AslTree string_literal9_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:7: ( '@SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:9: '@SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal9=(Token)match(input,59,FOLLOW_59_in_macro240); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        AslParser.paramlist_return paramlist11 =null;


        AslTree char_literal10_tree=null;
        AslTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:10: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,54,FOLLOW_54_in_params252);  
            stream_54.add(char_literal10);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==53) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params254);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,55,FOLLOW_55_in_params257);  
            stream_55.add(char_literal12);


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

        Token char_literal14=null;
        AslParser.param_return param13 =null;

        AslParser.param_return param15 =null;


        AslTree char_literal14_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist283);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==56) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,56,FOLLOW_56_in_paramlist286); 

            	    pushFollow(FOLLOW_param_in_paramlist289);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;

        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:82:13: '&' id= ID
                    {
                    char_literal16=(Token)match(input,53,FOLLOW_53_in_param314);  
                    stream_53.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param318);  
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
                    id=(Token)match(input,ID,FOLLOW_ID_in_param341);  
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

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions375);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==57) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,57,FOLLOW_57_in_block_instructions378);  
            	    stream_57.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions380);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set |);
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set |)
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
                case 54:
                    {
                    alt7=4;
                    }
                    break;
                case 52:
                case 58:
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
            case 57:
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction429);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction451);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction471);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction491);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction512);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction529);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction554);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction577);
                    set27=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set27.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:103:9: 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:10: ID eq= EQUAL expr
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_assign628);  
            stream_ID.add(ID28);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign632);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign634);
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
            // 106:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF30=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt663); 
            IF30_tree = 
            (AslTree)adaptor.create(IF30)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF30_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt666);
            expr31=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr31.getTree());

            THEN32=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt668); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt671);
            block_instructions33=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions33.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:110:47: ELSE ! block_instructions
                    {
                    ELSE34=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt674); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt677);
                    block_instructions35=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions35.getTree());

                    }
                    break;

            }


            ENDIF36=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt681); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE37=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt704); 
            WHILE37_tree = 
            (AslTree)adaptor.create(WHILE37)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE37_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt707);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            DO39=(Token)match(input,DO,FOLLOW_DO_in_while_stmt709); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt712);
            block_instructions40=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions40.getTree());

            ENDWHILE41=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt714); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN42=null;
        AslParser.expr_return expr43 =null;


        AslTree RETURN42_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN42=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt737); 
            RETURN42_tree = 
            (AslTree)adaptor.create(RETURN42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN42_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DISP||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==54) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt740);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ44=null;
        Token ID45=null;

        AslTree READ44_tree=null;
        AslTree ID45_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ44=(Token)match(input,READ,FOLLOW_READ_in_read759); 
            READ44_tree = 
            (AslTree)adaptor.create(READ44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ44_tree, root_0);


            ID45=(Token)match(input,ID,FOLLOW_ID_in_read762); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:1: write : WRITE ^ ( expr | STRING ) ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write782); 
            WRITE46_tree = 
            (AslTree)adaptor.create(WRITE46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE46_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DISP||LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==54) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write786);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:126:26: STRING
                    {
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_write790); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:1: set : ID ( '@' ^| '#' ^) STRING ( INT )+ ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:6: ( ID ( '@' ^| '#' ^) STRING ( INT )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:8: ID ( '@' ^| '#' ^) STRING ( INT )+
            {
            root_0 = (AslTree)adaptor.nil();


            ID49=(Token)match(input,ID,FOLLOW_ID_in_set810); 
            ID49_tree = 
            (AslTree)adaptor.create(ID49)
            ;
            adaptor.addChild(root_0, ID49_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:11: ( '@' ^| '#' ^)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==58) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:12: '@' ^
                    {
                    char_literal50=(Token)match(input,58,FOLLOW_58_in_set813); 
                    char_literal50_tree = 
                    (AslTree)adaptor.create(char_literal50)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:17: '#' ^
                    {
                    char_literal51=(Token)match(input,52,FOLLOW_52_in_set816); 
                    char_literal51_tree = 
                    (AslTree)adaptor.create(char_literal51)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal51_tree, root_0);


                    }
                    break;

            }


            STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_set820); 
            STRING52_tree = 
            (AslTree)adaptor.create(STRING52)
            ;
            adaptor.addChild(root_0, STRING52_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:30: ( INT )+
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
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:30: INT
            	    {
            	    INT53=(Token)match(input,INT,FOLLOW_INT_in_set822); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:132:1: expr : ( boolexpr | graphicexpr );
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr54 =null;

        AslParser.graphicexpr_return graphicexpr55 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:132:6: ( boolexpr | graphicexpr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INT||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE||LA13_0==54) ) {
                alt13=1;
            }
            else if ( (LA13_0==DISP) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:132:8: boolexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_boolexpr_in_expr834);
                    boolexpr54=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr54.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:5: graphicexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_graphicexpr_in_expr840);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:1: graphicexpr : DISP ^ graphicconst ;
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DISP56=null;
        AslParser.graphicconst_return graphicconst57 =null;


        AslTree DISP56_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:13: ( DISP ^ graphicconst )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:136:17: DISP ^ graphicconst
            {
            root_0 = (AslTree)adaptor.nil();


            DISP56=(Token)match(input,DISP,FOLLOW_DISP_in_graphicexpr853); 
            DISP56_tree = 
            (AslTree)adaptor.create(DISP56)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DISP56_tree, root_0);


            pushFollow(FOLLOW_graphicconst_in_graphicexpr856);
            graphicconst57=graphicconst();

            state._fsp--;

            adaptor.addChild(root_0, graphicconst57.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:1: graphicconst : ( RECT ^ INT INT INT INT | CIRCLE ^ INT INT INT | TEXT ^ INT INT STRING | ELLIPSE ^ INT INT INT INT );
    public final AslParser.graphicconst_return graphicconst() throws RecognitionException {
        AslParser.graphicconst_return retval = new AslParser.graphicconst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT58=null;
        Token INT59=null;
        Token INT60=null;
        Token INT61=null;
        Token INT62=null;
        Token CIRCLE63=null;
        Token INT64=null;
        Token INT65=null;
        Token INT66=null;
        Token TEXT67=null;
        Token INT68=null;
        Token INT69=null;
        Token STRING70=null;
        Token ELLIPSE71=null;
        Token INT72=null;
        Token INT73=null;
        Token INT74=null;
        Token INT75=null;

        AslTree RECT58_tree=null;
        AslTree INT59_tree=null;
        AslTree INT60_tree=null;
        AslTree INT61_tree=null;
        AslTree INT62_tree=null;
        AslTree CIRCLE63_tree=null;
        AslTree INT64_tree=null;
        AslTree INT65_tree=null;
        AslTree INT66_tree=null;
        AslTree TEXT67_tree=null;
        AslTree INT68_tree=null;
        AslTree INT69_tree=null;
        AslTree STRING70_tree=null;
        AslTree ELLIPSE71_tree=null;
        AslTree INT72_tree=null;
        AslTree INT73_tree=null;
        AslTree INT74_tree=null;
        AslTree INT75_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:13: ( RECT ^ INT INT INT INT | CIRCLE ^ INT INT INT | TEXT ^ INT INT STRING | ELLIPSE ^ INT INT INT INT )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:139:17: RECT ^ INT INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT58=(Token)match(input,RECT,FOLLOW_RECT_in_graphicconst868); 
                    RECT58_tree = 
                    (AslTree)adaptor.create(RECT58)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT58_tree, root_0);


                    INT59=(Token)match(input,INT,FOLLOW_INT_in_graphicconst871); 
                    INT59_tree = 
                    (AslTree)adaptor.create(INT59)
                    ;
                    adaptor.addChild(root_0, INT59_tree);


                    INT60=(Token)match(input,INT,FOLLOW_INT_in_graphicconst873); 
                    INT60_tree = 
                    (AslTree)adaptor.create(INT60)
                    ;
                    adaptor.addChild(root_0, INT60_tree);


                    INT61=(Token)match(input,INT,FOLLOW_INT_in_graphicconst875); 
                    INT61_tree = 
                    (AslTree)adaptor.create(INT61)
                    ;
                    adaptor.addChild(root_0, INT61_tree);


                    INT62=(Token)match(input,INT,FOLLOW_INT_in_graphicconst877); 
                    INT62_tree = 
                    (AslTree)adaptor.create(INT62)
                    ;
                    adaptor.addChild(root_0, INT62_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:140:6: CIRCLE ^ INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE63=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicconst884); 
                    CIRCLE63_tree = 
                    (AslTree)adaptor.create(CIRCLE63)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE63_tree, root_0);


                    INT64=(Token)match(input,INT,FOLLOW_INT_in_graphicconst887); 
                    INT64_tree = 
                    (AslTree)adaptor.create(INT64)
                    ;
                    adaptor.addChild(root_0, INT64_tree);


                    INT65=(Token)match(input,INT,FOLLOW_INT_in_graphicconst889); 
                    INT65_tree = 
                    (AslTree)adaptor.create(INT65)
                    ;
                    adaptor.addChild(root_0, INT65_tree);


                    INT66=(Token)match(input,INT,FOLLOW_INT_in_graphicconst891); 
                    INT66_tree = 
                    (AslTree)adaptor.create(INT66)
                    ;
                    adaptor.addChild(root_0, INT66_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:6: TEXT ^ INT INT STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT67=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicconst898); 
                    TEXT67_tree = 
                    (AslTree)adaptor.create(TEXT67)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT67_tree, root_0);


                    INT68=(Token)match(input,INT,FOLLOW_INT_in_graphicconst901); 
                    INT68_tree = 
                    (AslTree)adaptor.create(INT68)
                    ;
                    adaptor.addChild(root_0, INT68_tree);


                    INT69=(Token)match(input,INT,FOLLOW_INT_in_graphicconst903); 
                    INT69_tree = 
                    (AslTree)adaptor.create(INT69)
                    ;
                    adaptor.addChild(root_0, INT69_tree);


                    STRING70=(Token)match(input,STRING,FOLLOW_STRING_in_graphicconst905); 
                    STRING70_tree = 
                    (AslTree)adaptor.create(STRING70)
                    ;
                    adaptor.addChild(root_0, STRING70_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:142:6: ELLIPSE ^ INT INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE71=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicconst912); 
                    ELLIPSE71_tree = 
                    (AslTree)adaptor.create(ELLIPSE71)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE71_tree, root_0);


                    INT72=(Token)match(input,INT,FOLLOW_INT_in_graphicconst915); 
                    INT72_tree = 
                    (AslTree)adaptor.create(INT72)
                    ;
                    adaptor.addChild(root_0, INT72_tree);


                    INT73=(Token)match(input,INT,FOLLOW_INT_in_graphicconst917); 
                    INT73_tree = 
                    (AslTree)adaptor.create(INT73)
                    ;
                    adaptor.addChild(root_0, INT73_tree);


                    INT74=(Token)match(input,INT,FOLLOW_INT_in_graphicconst919); 
                    INT74_tree = 
                    (AslTree)adaptor.create(INT74)
                    ;
                    adaptor.addChild(root_0, INT74_tree);


                    INT75=(Token)match(input,INT,FOLLOW_INT_in_graphicconst921); 
                    INT75_tree = 
                    (AslTree)adaptor.create(INT75)
                    ;
                    adaptor.addChild(root_0, INT75_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR77=null;
        AslParser.boolterm_return boolterm76 =null;

        AslParser.boolterm_return boolterm78 =null;


        AslTree OR77_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr944);
            boolterm76=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm76.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:26: ( OR ^ boolterm )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:27: OR ^ boolterm
            	    {
            	    OR77=(Token)match(input,OR,FOLLOW_OR_in_boolexpr947); 
            	    OR77_tree = 
            	    (AslTree)adaptor.create(OR77)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR77_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr950);
            	    boolterm78=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm78.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND80=null;
        AslParser.boolfact_return boolfact79 =null;

        AslParser.boolfact_return boolfact81 =null;


        AslTree AND80_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm970);
            boolfact79=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact79.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:22: ( AND ^ boolfact )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:23: AND ^ boolfact
            	    {
            	    AND80=(Token)match(input,AND,FOLLOW_AND_in_boolterm973); 
            	    AND80_tree = 
            	    (AslTree)adaptor.create(AND80)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND80_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm976);
            	    boolfact81=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact81.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL83=null;
        Token NOT_EQUAL84=null;
        Token LT85=null;
        Token LE86=null;
        Token GT87=null;
        Token GE88=null;
        AslParser.num_expr_return num_expr82 =null;

        AslParser.num_expr_return num_expr89 =null;


        AslTree EQUAL83_tree=null;
        AslTree NOT_EQUAL84_tree=null;
        AslTree LT85_tree=null;
        AslTree LE86_tree=null;
        AslTree GT87_tree=null;
        AslTree GE88_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact996);
            num_expr82=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr82.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUAL||(LA18_0 >= GE && LA18_0 <= GT)||LA18_0==LE||LA18_0==LT||LA18_0==NOT_EQUAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:24: EQUAL ^
                            {
                            EQUAL83=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1000); 
                            EQUAL83_tree = 
                            (AslTree)adaptor.create(EQUAL83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL83_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL84=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1005); 
                            NOT_EQUAL84_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL84_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:46: LT ^
                            {
                            LT85=(Token)match(input,LT,FOLLOW_LT_in_boolfact1010); 
                            LT85_tree = 
                            (AslTree)adaptor.create(LT85)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT85_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:52: LE ^
                            {
                            LE86=(Token)match(input,LE,FOLLOW_LE_in_boolfact1015); 
                            LE86_tree = 
                            (AslTree)adaptor.create(LE86)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE86_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:58: GT ^
                            {
                            GT87=(Token)match(input,GT,FOLLOW_GT_in_boolfact1020); 
                            GT87_tree = 
                            (AslTree)adaptor.create(GT87)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT87_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:64: GE ^
                            {
                            GE88=(Token)match(input,GE,FOLLOW_GE_in_boolfact1025); 
                            GE88_tree = 
                            (AslTree)adaptor.create(GE88)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE88_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1029);
                    num_expr89=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr89.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS91=null;
        Token MINUS92=null;
        AslParser.term_return term90 =null;

        AslParser.term_return term93 =null;


        AslTree PLUS91_tree=null;
        AslTree MINUS92_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1049);
            term90=term();

            state._fsp--;

            adaptor.addChild(root_0, term90.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:18: ( ( PLUS ^| MINUS ^) term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:20: ( PLUS ^| MINUS ^)
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
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:21: PLUS ^
            	            {
            	            PLUS91=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1054); 
            	            PLUS91_tree = 
            	            (AslTree)adaptor.create(PLUS91)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS91_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:29: MINUS ^
            	            {
            	            MINUS92=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1059); 
            	            MINUS92_tree = 
            	            (AslTree)adaptor.create(MINUS92)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS92_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1063);
            	    term93=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term93.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL95=null;
        Token DIV96=null;
        Token MOD97=null;
        AslParser.factor_return factor94 =null;

        AslParser.factor_return factor98 =null;


        AslTree MUL95_tree=null;
        AslTree DIV96_tree=null;
        AslTree MOD97_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1087);
            factor94=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor94.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DIV||(LA22_0 >= MOD && LA22_0 <= MUL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:23: MUL ^
            	            {
            	            MUL95=(Token)match(input,MUL,FOLLOW_MUL_in_term1092); 
            	            MUL95_tree = 
            	            (AslTree)adaptor.create(MUL95)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL95_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:30: DIV ^
            	            {
            	            DIV96=(Token)match(input,DIV,FOLLOW_DIV_in_term1097); 
            	            DIV96_tree = 
            	            (AslTree)adaptor.create(DIV96)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV96_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:37: MOD ^
            	            {
            	            MOD97=(Token)match(input,MOD,FOLLOW_MOD_in_term1102); 
            	            MOD97_tree = 
            	            (AslTree)adaptor.create(MOD97)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD97_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1106);
            	    factor98=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor98.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT99=null;
        Token PLUS100=null;
        Token MINUS101=null;
        AslParser.atom_return atom102 =null;


        AslTree NOT99_tree=null;
        AslTree PLUS100_tree=null;
        AslTree MINUS101_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:14: NOT ^
                    {
                    NOT99=(Token)match(input,NOT,FOLLOW_NOT_in_factor1129); 
                    NOT99_tree = 
                    (AslTree)adaptor.create(NOT99)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT99_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:21: PLUS ^
                    {
                    PLUS100=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1134); 
                    PLUS100_tree = 
                    (AslTree)adaptor.create(PLUS100)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS100_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:161:29: MINUS ^
                    {
                    MINUS101=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1139); 
                    MINUS101_tree = 
                    (AslTree)adaptor.create(MINUS101)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS101_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1144);
            atom102=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom102.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:167:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID103=null;
        Token INT104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        AslParser.funcall_return funcall105 =null;

        AslParser.expr_return expr107 =null;


        AslTree b_tree=null;
        AslTree ID103_tree=null;
        AslTree INT104_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:167:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt25=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==54) ) {
                    alt25=4;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= DO)||(LA25_1 >= ELSE && LA25_1 <= EQUAL)||(LA25_1 >= GE && LA25_1 <= GT)||LA25_1==LE||(LA25_1 >= LT && LA25_1 <= MUL)||(LA25_1 >= NOT_EQUAL && LA25_1 <= OR)||LA25_1==PLUS||LA25_1==THEN||(LA25_1 >= 55 && LA25_1 <= 57)) ) {
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
            case 54:
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:167:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID103=(Token)match(input,ID,FOLLOW_ID_in_atom1169); 
                    ID103_tree = 
                    (AslTree)adaptor.create(ID103)
                    ;
                    adaptor.addChild(root_0, ID103_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT104=(Token)match(input,INT,FOLLOW_INT_in_atom1183); 
                    INT104_tree = 
                    (AslTree)adaptor.create(INT104)
                    ;
                    adaptor.addChild(root_0, INT104_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:13: (b= TRUE |b= FALSE )
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
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1200);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1206);  
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
                    // 169:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1229);
                    funcall105=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall105.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal106=(Token)match(input,54,FOLLOW_54_in_atom1243); 

                    pushFollow(FOLLOW_expr_in_atom1246);
                    expr107=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr107.getTree());

                    char_literal108=(Token)match(input,55,FOLLOW_55_in_atom1248); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID109=null;
        Token char_literal110=null;
        Token char_literal112=null;
        AslParser.expr_list_return expr_list111 =null;


        AslTree ID109_tree=null;
        AslTree char_literal110_tree=null;
        AslTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:13: ID '(' ( expr_list )? ')'
            {
            ID109=(Token)match(input,ID,FOLLOW_ID_in_funcall1269);  
            stream_ID.add(ID109);


            char_literal110=(Token)match(input,54,FOLLOW_54_in_funcall1271);  
            stream_54.add(char_literal110);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:20: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DISP||LA26_0==FALSE||LA26_0==ID||LA26_0==INT||LA26_0==MINUS||LA26_0==NOT||LA26_0==PLUS||LA26_0==TRUE||LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1273);
                    expr_list111=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list111.getTree());

                    }
                    break;

            }


            char_literal112=(Token)match(input,55,FOLLOW_55_in_funcall1276);  
            stream_55.add(char_literal112);


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
            // 175:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:61: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal114=null;
        AslParser.expr_return expr113 =null;

        AslParser.expr_return expr115 =null;


        AslTree char_literal114_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1309);
            expr113=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr113.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:18: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:19: ',' ! expr
            	    {
            	    char_literal114=(Token)match(input,56,FOLLOW_56_in_expr_list1312); 

            	    pushFollow(FOLLOW_expr_in_expr_list1315);
            	    expr115=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr115.getTree());

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


 

    public static final BitSet FOLLOW_func_in_prog177 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_EOF_in_prog180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_func210 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_params_in_func212 = new BitSet(new long[]{0x0206140006000000L});
    public static final BitSet FOLLOW_block_instructions_in_func214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_func223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_macro240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_params252 = new BitSet(new long[]{0x00A0000002000000L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_paramlist286 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_53_in_param314 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_param318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions375 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_block_instructions378 = new BitSet(new long[]{0x0206140006000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions380 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign628 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign632 = new BitSet(new long[]{0x004100890A100400L});
    public static final BitSet FOLLOW_expr_in_assign634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt663 = new BitSet(new long[]{0x004100890A100400L});
    public static final BitSet FOLLOW_expr_in_ite_stmt666 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt668 = new BitSet(new long[]{0x0206140006000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt671 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt674 = new BitSet(new long[]{0x0206140006000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt677 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt704 = new BitSet(new long[]{0x004100890A100400L});
    public static final BitSet FOLLOW_expr_in_while_stmt707 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt709 = new BitSet(new long[]{0x0206140006000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt712 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt737 = new BitSet(new long[]{0x004100890A100402L});
    public static final BitSet FOLLOW_expr_in_return_stmt740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read759 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_read762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write782 = new BitSet(new long[]{0x004120890A100400L});
    public static final BitSet FOLLOW_expr_in_write786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set810 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_58_in_set813 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_52_in_set816 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STRING_in_set820 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_set822 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_boolexpr_in_expr834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_expr840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISP_in_graphicexpr853 = new BitSet(new long[]{0x0000480000002100L});
    public static final BitSet FOLLOW_graphicconst_in_graphicexpr856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicconst868 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst871 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst875 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicconst884 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst889 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicconst898 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst901 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst903 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STRING_in_graphicconst905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicconst912 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst915 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst917 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst919 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_graphicconst921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr944 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr947 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr950 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm970 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm973 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm976 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact996 = new BitSet(new long[]{0x0000001091840002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1000 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1005 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_LT_in_boolfact1010 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_LE_in_boolfact1015 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_GT_in_boolfact1020 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_GE_in_boolfact1025 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1049 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1054 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1059 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_term_in_num_expr1063 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_factor_in_term1087 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_MUL_in_term1092 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_DIV_in_term1097 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_MOD_in_term1102 = new BitSet(new long[]{0x004100890A100000L});
    public static final BitSet FOLLOW_factor_in_term1106 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_NOT_in_factor1129 = new BitSet(new long[]{0x004100000A100000L});
    public static final BitSet FOLLOW_PLUS_in_factor1134 = new BitSet(new long[]{0x004100000A100000L});
    public static final BitSet FOLLOW_MINUS_in_factor1139 = new BitSet(new long[]{0x004100000A100000L});
    public static final BitSet FOLLOW_atom_in_factor1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom1243 = new BitSet(new long[]{0x004100890A100400L});
    public static final BitSet FOLLOW_expr_in_atom1246 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1269 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funcall1271 = new BitSet(new long[]{0x00C100890A100400L});
    public static final BitSet FOLLOW_expr_list_in_funcall1273 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_funcall1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1309 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expr_list1312 = new BitSet(new long[]{0x004100890A100400L});
    public static final BitSet FOLLOW_expr_in_expr_list1315 = new BitSet(new long[]{0x0100000000000002L});

}