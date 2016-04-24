// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-24 22:09:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "DISP", "DIV", "DO", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MOVEMENT", "MUL", "NOT", "NOT_EQUAL", "OR", "PAIR", "PAIR_ASSIGN", "PAIR_INDEX", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "RETURN", "ROTATE", "ROTATEREL", "ROTATION", "SCALE", "SCALEREL", "STRING", "TEXT", "THEN", "TRANS", "TRANSREL", "TRUE", "WHILE", "WRITE", "WS", "'#'", "'$SHOW'", "'&'", "'('", "')'", "','", "'.'", "';'", "'@'"
    };

    public static final int EOF=-1;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
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
    public static final int FLOAT=21;
    public static final int FUNC=22;
    public static final int FUNCALL=23;
    public static final int GE=24;
    public static final int GT=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int INT=28;
    public static final int LE=29;
    public static final int LIST_FUNCTIONS=30;
    public static final int LIST_INSTR=31;
    public static final int LT=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int MOVEMENT=35;
    public static final int MUL=36;
    public static final int NOT=37;
    public static final int NOT_EQUAL=38;
    public static final int OR=39;
    public static final int PAIR=40;
    public static final int PAIR_ASSIGN=41;
    public static final int PAIR_INDEX=42;
    public static final int PARAMS=43;
    public static final int PLUS=44;
    public static final int PREF=45;
    public static final int PVALUE=46;
    public static final int READ=47;
    public static final int RECT=48;
    public static final int RETURN=49;
    public static final int ROTATE=50;
    public static final int ROTATEREL=51;
    public static final int ROTATION=52;
    public static final int SCALE=53;
    public static final int SCALEREL=54;
    public static final int STRING=55;
    public static final int TEXT=56;
    public static final int THEN=57;
    public static final int TRANS=58;
    public static final int TRANSREL=59;
    public static final int TRUE=60;
    public static final int WHILE=61;
    public static final int WRITE=62;
    public static final int WS=63;

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:8: ( func )+ EOF
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC||LA1_0==65) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog192);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog195);  
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
            // 63:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:63:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:67:1: func : ( FUNC ^ ID params block_instructions ENDFUNC !| macro );
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:67:6: ( FUNC ^ ID params block_instructions ENDFUNC !| macro )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==65) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:67:8: FUNC ^ ID params block_instructions ENDFUNC !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func222); 
                    FUNC3_tree = 
                    (AslTree)adaptor.create(FUNC3)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_func225); 
                    ID4_tree = 
                    (AslTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                    pushFollow(FOLLOW_params_in_func227);
                    params5=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params5.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func229);
                    block_instructions6=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions6.getTree());

                    ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func231); 

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:68:5: macro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_macro_in_func238);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:71:1: macro : '$SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal9=null;

        AslTree string_literal9_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:71:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:71:9: '$SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal9=(Token)match(input,65,FOLLOW_65_in_macro255); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        AslParser.paramlist_return paramlist11 =null;


        AslTree char_literal10_tree=null;
        AslTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:10: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,67,FOLLOW_67_in_params267);  
            stream_67.add(char_literal10);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==66) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params269);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,68,FOLLOW_68_in_params272);  
            stream_68.add(char_literal12);


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
            // 75:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:75:41: ( paramlist )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:79:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal14=null;
        AslParser.param_return param13 =null;

        AslParser.param_return param15 =null;


        AslTree char_literal14_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:79:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:79:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist298);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:79:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==69) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:79:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,69,FOLLOW_69_in_paramlist301); 

            	    pushFollow(FOLLOW_param_in_paramlist304);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;

        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==66) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:13: '&' id= ID
                    {
                    char_literal16=(Token)match(input,66,FOLLOW_66_in_param329);  
                    stream_66.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param333);  
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
                    // 84:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:26: ^( PREF[$id,$id.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:85:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param356);  
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
                    // 85:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:85:22: ^( PVALUE[$id,$id.text] )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions390);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==71) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,71,FOLLOW_71_in_block_instructions393);  
            	    stream_71.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions395);
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
            // 91:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:91:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:1: instruction : ( assign | pair_assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | transform | animation |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign20 =null;

        AslParser.pair_assign_return pair_assign21 =null;

        AslParser.ite_stmt_return ite_stmt22 =null;

        AslParser.while_stmt_return while_stmt23 =null;

        AslParser.funcall_return funcall24 =null;

        AslParser.return_stmt_return return_stmt25 =null;

        AslParser.read_return read26 =null;

        AslParser.write_return write27 =null;

        AslParser.set_return set28 =null;

        AslParser.transform_return transform29 =null;

        AslParser.animation_return animation30 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:9: ( assign | pair_assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | transform | animation |)
            int alt7=12;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt7=1;
                    }
                    break;
                case 70:
                    {
                    alt7=2;
                    }
                    break;
                case 67:
                    {
                    alt7=5;
                    }
                    break;
                case 64:
                case 72:
                    {
                    alt7=9;
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
                alt7=3;
                }
                break;
            case WHILE:
                {
                alt7=4;
                }
                break;
            case RETURN:
                {
                alt7=6;
                }
                break;
            case READ:
                {
                alt7=7;
                }
                break;
            case WRITE:
                {
                alt7=8;
                }
                break;
            case ROTATE:
            case ROTATEREL:
            case SCALE:
            case SCALEREL:
            case TRANS:
            case TRANSREL:
                {
                alt7=10;
                }
                break;
            case MOVEMENT:
            case ROTATION:
                {
                alt7=11;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 71:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction444);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:11: pair_assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_pair_assign_in_instruction466);
                    pair_assign21=pair_assign();

                    state._fsp--;

                    adaptor.addChild(root_0, pair_assign21.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction480);
                    ite_stmt22=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction500);
                    while_stmt23=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt23.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction520);
                    funcall24=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall24.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction541);
                    return_stmt25=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:102:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction558);
                    read26=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read26.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:103:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction583);
                    write27=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write27.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:104:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction606);
                    set28=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set28.getTree());

                    }
                    break;
                case 10 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:11: transform
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_transform_in_instruction622);
                    transform29=transform();

                    state._fsp--;

                    adaptor.addChild(root_0, transform29.getTree());

                    }
                    break;
                case 11 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:11: animation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_animation_in_instruction636);
                    animation30=animation();

                    state._fsp--;

                    adaptor.addChild(root_0, animation30.getTree());

                    }
                    break;
                case 12 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:108:9: 
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


    public static class transform_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transform"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:111:1: transform : ( TRANS ^ ID FLOAT FLOAT | TRANSREL ^ ID FLOAT FLOAT | SCALE ^ ID FLOAT ( FLOAT )? | SCALEREL ^ ID FLOAT ( FLOAT )? | ROTATE ^ ID FLOAT ( FLOAT )? | ROTATEREL ^ ID FLOAT ( FLOAT )? );
    public final AslParser.transform_return transform() throws RecognitionException {
        AslParser.transform_return retval = new AslParser.transform_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANS31=null;
        Token ID32=null;
        Token FLOAT33=null;
        Token FLOAT34=null;
        Token TRANSREL35=null;
        Token ID36=null;
        Token FLOAT37=null;
        Token FLOAT38=null;
        Token SCALE39=null;
        Token ID40=null;
        Token FLOAT41=null;
        Token FLOAT42=null;
        Token SCALEREL43=null;
        Token ID44=null;
        Token FLOAT45=null;
        Token FLOAT46=null;
        Token ROTATE47=null;
        Token ID48=null;
        Token FLOAT49=null;
        Token FLOAT50=null;
        Token ROTATEREL51=null;
        Token ID52=null;
        Token FLOAT53=null;
        Token FLOAT54=null;

        AslTree TRANS31_tree=null;
        AslTree ID32_tree=null;
        AslTree FLOAT33_tree=null;
        AslTree FLOAT34_tree=null;
        AslTree TRANSREL35_tree=null;
        AslTree ID36_tree=null;
        AslTree FLOAT37_tree=null;
        AslTree FLOAT38_tree=null;
        AslTree SCALE39_tree=null;
        AslTree ID40_tree=null;
        AslTree FLOAT41_tree=null;
        AslTree FLOAT42_tree=null;
        AslTree SCALEREL43_tree=null;
        AslTree ID44_tree=null;
        AslTree FLOAT45_tree=null;
        AslTree FLOAT46_tree=null;
        AslTree ROTATE47_tree=null;
        AslTree ID48_tree=null;
        AslTree FLOAT49_tree=null;
        AslTree FLOAT50_tree=null;
        AslTree ROTATEREL51_tree=null;
        AslTree ID52_tree=null;
        AslTree FLOAT53_tree=null;
        AslTree FLOAT54_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:111:11: ( TRANS ^ ID FLOAT FLOAT | TRANSREL ^ ID FLOAT FLOAT | SCALE ^ ID FLOAT ( FLOAT )? | SCALEREL ^ ID FLOAT ( FLOAT )? | ROTATE ^ ID FLOAT ( FLOAT )? | ROTATEREL ^ ID FLOAT ( FLOAT )? )
            int alt12=6;
            switch ( input.LA(1) ) {
            case TRANS:
                {
                alt12=1;
                }
                break;
            case TRANSREL:
                {
                alt12=2;
                }
                break;
            case SCALE:
                {
                alt12=3;
                }
                break;
            case SCALEREL:
                {
                alt12=4;
                }
                break;
            case ROTATE:
                {
                alt12=5;
                }
                break;
            case ROTATEREL:
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:111:13: TRANS ^ ID FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANS31=(Token)match(input,TRANS,FOLLOW_TRANS_in_transform685); 
                    TRANS31_tree = 
                    (AslTree)adaptor.create(TRANS31)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANS31_tree, root_0);


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_transform688); 
                    ID32_tree = 
                    (AslTree)adaptor.create(ID32)
                    ;
                    adaptor.addChild(root_0, ID32_tree);


                    FLOAT33=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform690); 
                    FLOAT33_tree = 
                    (AslTree)adaptor.create(FLOAT33)
                    ;
                    adaptor.addChild(root_0, FLOAT33_tree);


                    FLOAT34=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform692); 
                    FLOAT34_tree = 
                    (AslTree)adaptor.create(FLOAT34)
                    ;
                    adaptor.addChild(root_0, FLOAT34_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:112:4: TRANSREL ^ ID FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANSREL35=(Token)match(input,TRANSREL,FOLLOW_TRANSREL_in_transform697); 
                    TRANSREL35_tree = 
                    (AslTree)adaptor.create(TRANSREL35)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANSREL35_tree, root_0);


                    ID36=(Token)match(input,ID,FOLLOW_ID_in_transform700); 
                    ID36_tree = 
                    (AslTree)adaptor.create(ID36)
                    ;
                    adaptor.addChild(root_0, ID36_tree);


                    FLOAT37=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform702); 
                    FLOAT37_tree = 
                    (AslTree)adaptor.create(FLOAT37)
                    ;
                    adaptor.addChild(root_0, FLOAT37_tree);


                    FLOAT38=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform704); 
                    FLOAT38_tree = 
                    (AslTree)adaptor.create(FLOAT38)
                    ;
                    adaptor.addChild(root_0, FLOAT38_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:4: SCALE ^ ID FLOAT ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALE39=(Token)match(input,SCALE,FOLLOW_SCALE_in_transform709); 
                    SCALE39_tree = 
                    (AslTree)adaptor.create(SCALE39)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALE39_tree, root_0);


                    ID40=(Token)match(input,ID,FOLLOW_ID_in_transform712); 
                    ID40_tree = 
                    (AslTree)adaptor.create(ID40)
                    ;
                    adaptor.addChild(root_0, ID40_tree);


                    FLOAT41=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform714); 
                    FLOAT41_tree = 
                    (AslTree)adaptor.create(FLOAT41)
                    ;
                    adaptor.addChild(root_0, FLOAT41_tree);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:20: ( FLOAT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FLOAT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:21: FLOAT
                            {
                            FLOAT42=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform717); 
                            FLOAT42_tree = 
                            (AslTree)adaptor.create(FLOAT42)
                            ;
                            adaptor.addChild(root_0, FLOAT42_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:4: SCALEREL ^ ID FLOAT ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALEREL43=(Token)match(input,SCALEREL,FOLLOW_SCALEREL_in_transform724); 
                    SCALEREL43_tree = 
                    (AslTree)adaptor.create(SCALEREL43)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALEREL43_tree, root_0);


                    ID44=(Token)match(input,ID,FOLLOW_ID_in_transform727); 
                    ID44_tree = 
                    (AslTree)adaptor.create(ID44)
                    ;
                    adaptor.addChild(root_0, ID44_tree);


                    FLOAT45=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform729); 
                    FLOAT45_tree = 
                    (AslTree)adaptor.create(FLOAT45)
                    ;
                    adaptor.addChild(root_0, FLOAT45_tree);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:23: ( FLOAT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FLOAT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:114:24: FLOAT
                            {
                            FLOAT46=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform732); 
                            FLOAT46_tree = 
                            (AslTree)adaptor.create(FLOAT46)
                            ;
                            adaptor.addChild(root_0, FLOAT46_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:4: ROTATE ^ ID FLOAT ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATE47=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_transform740); 
                    ROTATE47_tree = 
                    (AslTree)adaptor.create(ROTATE47)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATE47_tree, root_0);


                    ID48=(Token)match(input,ID,FOLLOW_ID_in_transform743); 
                    ID48_tree = 
                    (AslTree)adaptor.create(ID48)
                    ;
                    adaptor.addChild(root_0, ID48_tree);


                    FLOAT49=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform745); 
                    FLOAT49_tree = 
                    (AslTree)adaptor.create(FLOAT49)
                    ;
                    adaptor.addChild(root_0, FLOAT49_tree);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:21: ( FLOAT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==FLOAT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:22: FLOAT
                            {
                            FLOAT50=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform748); 
                            FLOAT50_tree = 
                            (AslTree)adaptor.create(FLOAT50)
                            ;
                            adaptor.addChild(root_0, FLOAT50_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:4: ROTATEREL ^ ID FLOAT ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATEREL51=(Token)match(input,ROTATEREL,FOLLOW_ROTATEREL_in_transform755); 
                    ROTATEREL51_tree = 
                    (AslTree)adaptor.create(ROTATEREL51)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATEREL51_tree, root_0);


                    ID52=(Token)match(input,ID,FOLLOW_ID_in_transform758); 
                    ID52_tree = 
                    (AslTree)adaptor.create(ID52)
                    ;
                    adaptor.addChild(root_0, ID52_tree);


                    FLOAT53=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform760); 
                    FLOAT53_tree = 
                    (AslTree)adaptor.create(FLOAT53)
                    ;
                    adaptor.addChild(root_0, FLOAT53_tree);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:24: ( FLOAT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==FLOAT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:25: FLOAT
                            {
                            FLOAT54=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform763); 
                            FLOAT54_tree = 
                            (AslTree)adaptor.create(FLOAT54)
                            ;
                            adaptor.addChild(root_0, FLOAT54_tree);


                            }
                            break;

                    }


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:1: animation : ( MOVEMENT ^ ID INT INT INT | ROTATION ^ ID FLOAT );
    public final AslParser.animation_return animation() throws RecognitionException {
        AslParser.animation_return retval = new AslParser.animation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVEMENT55=null;
        Token ID56=null;
        Token INT57=null;
        Token INT58=null;
        Token INT59=null;
        Token ROTATION60=null;
        Token ID61=null;
        Token FLOAT62=null;

        AslTree MOVEMENT55_tree=null;
        AslTree ID56_tree=null;
        AslTree INT57_tree=null;
        AslTree INT58_tree=null;
        AslTree INT59_tree=null;
        AslTree ROTATION60_tree=null;
        AslTree ID61_tree=null;
        AslTree FLOAT62_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:11: ( MOVEMENT ^ ID INT INT INT | ROTATION ^ ID FLOAT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MOVEMENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==ROTATION) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:13: MOVEMENT ^ ID INT INT INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MOVEMENT55=(Token)match(input,MOVEMENT,FOLLOW_MOVEMENT_in_animation776); 
                    MOVEMENT55_tree = 
                    (AslTree)adaptor.create(MOVEMENT55)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MOVEMENT55_tree, root_0);


                    ID56=(Token)match(input,ID,FOLLOW_ID_in_animation779); 
                    ID56_tree = 
                    (AslTree)adaptor.create(ID56)
                    ;
                    adaptor.addChild(root_0, ID56_tree);


                    INT57=(Token)match(input,INT,FOLLOW_INT_in_animation781); 
                    INT57_tree = 
                    (AslTree)adaptor.create(INT57)
                    ;
                    adaptor.addChild(root_0, INT57_tree);


                    INT58=(Token)match(input,INT,FOLLOW_INT_in_animation783); 
                    INT58_tree = 
                    (AslTree)adaptor.create(INT58)
                    ;
                    adaptor.addChild(root_0, INT58_tree);


                    INT59=(Token)match(input,INT,FOLLOW_INT_in_animation785); 
                    INT59_tree = 
                    (AslTree)adaptor.create(INT59)
                    ;
                    adaptor.addChild(root_0, INT59_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:4: ROTATION ^ ID FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATION60=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_animation791); 
                    ROTATION60_tree = 
                    (AslTree)adaptor.create(ROTATION60)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATION60_tree, root_0);


                    ID61=(Token)match(input,ID,FOLLOW_ID_in_animation794); 
                    ID61_tree = 
                    (AslTree)adaptor.create(ID61)
                    ;
                    adaptor.addChild(root_0, ID61_tree);


                    FLOAT62=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation796); 
                    FLOAT62_tree = 
                    (AslTree)adaptor.create(FLOAT62)
                    ;
                    adaptor.addChild(root_0, FLOAT62_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID63=null;
        AslParser.expr_return expr64 =null;


        AslTree eq_tree=null;
        AslTree ID63_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:10: ID eq= EQUAL expr
            {
            ID63=(Token)match(input,ID,FOLLOW_ID_in_assign808);  
            stream_ID.add(ID63);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign812);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign814);
            expr64=expr();

            state._fsp--;

            stream_expr.add(expr64.getTree());

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
            // 125:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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


    public static class pair_assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pair_assign"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:1: pair_assign : ID '.' PAIR_ASSIGN eq= EQUAL expr -> ^( PAIR_ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr ) ;
    public final AslParser.pair_assign_return pair_assign() throws RecognitionException {
        AslParser.pair_assign_return retval = new AslParser.pair_assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID65=null;
        Token char_literal66=null;
        Token PAIR_ASSIGN67=null;
        AslParser.expr_return expr68 =null;


        AslTree eq_tree=null;
        AslTree ID65_tree=null;
        AslTree char_literal66_tree=null;
        AslTree PAIR_ASSIGN67_tree=null;
        RewriteRuleTokenStream stream_PAIR_ASSIGN=new RewriteRuleTokenStream(adaptor,"token PAIR_ASSIGN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:13: ( ID '.' PAIR_ASSIGN eq= EQUAL expr -> ^( PAIR_ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:15: ID '.' PAIR_ASSIGN eq= EQUAL expr
            {
            ID65=(Token)match(input,ID,FOLLOW_ID_in_pair_assign843);  
            stream_ID.add(ID65);


            char_literal66=(Token)match(input,70,FOLLOW_70_in_pair_assign845);  
            stream_70.add(char_literal66);


            PAIR_ASSIGN67=(Token)match(input,PAIR_ASSIGN,FOLLOW_PAIR_ASSIGN_in_pair_assign847);  
            stream_PAIR_ASSIGN.add(PAIR_ASSIGN67);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_pair_assign851);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_pair_assign853);
            expr68=expr();

            state._fsp--;

            stream_expr.add(expr68.getTree());

            // AST REWRITE
            // elements: PAIR_ASSIGN, ID, expr, PAIR_ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 129:48: -> ^( PAIR_ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:51: ^( PAIR_ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PAIR_ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PAIR_ASSIGN.nextNode()
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
    // $ANTLR end "pair_assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF69=null;
        Token THEN71=null;
        Token ELSE73=null;
        Token ENDIF75=null;
        AslParser.expr_return expr70 =null;

        AslParser.block_instructions_return block_instructions72 =null;

        AslParser.block_instructions_return block_instructions74 =null;


        AslTree IF69_tree=null;
        AslTree THEN71_tree=null;
        AslTree ELSE73_tree=null;
        AslTree ENDIF75_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF69=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt879); 
            IF69_tree = 
            (AslTree)adaptor.create(IF69)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF69_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt882);
            expr70=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr70.getTree());

            THEN71=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt884); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt887);
            block_instructions72=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions72.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:46: ( ELSE ! block_instructions )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:47: ELSE ! block_instructions
                    {
                    ELSE73=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt890); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt893);
                    block_instructions74=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions74.getTree());

                    }
                    break;

            }


            ENDIF75=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt897); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE76=null;
        Token DO78=null;
        Token ENDWHILE80=null;
        AslParser.expr_return expr77 =null;

        AslParser.block_instructions_return block_instructions79 =null;


        AslTree WHILE76_tree=null;
        AslTree DO78_tree=null;
        AslTree ENDWHILE80_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE76=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt920); 
            WHILE76_tree = 
            (AslTree)adaptor.create(WHILE76)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE76_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt923);
            expr77=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr77.getTree());

            DO78=(Token)match(input,DO,FOLLOW_DO_in_while_stmt925); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt928);
            block_instructions79=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions79.getTree());

            ENDWHILE80=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt930); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN81=null;
        AslParser.expr_return expr82 =null;


        AslTree RETURN81_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN81=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt953); 
            RETURN81_tree = 
            (AslTree)adaptor.create(RETURN81)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN81_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:23: ( expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CIRCLE||LA15_0==ELLIPSE||LA15_0==FALSE||LA15_0==ID||LA15_0==INT||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==RECT||LA15_0==TEXT||LA15_0==TRUE||LA15_0==67) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt956);
                    expr82=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr82.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ83=null;
        Token ID84=null;

        AslTree READ83_tree=null;
        AslTree ID84_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ83=(Token)match(input,READ,FOLLOW_READ_in_read975); 
            READ83_tree = 
            (AslTree)adaptor.create(READ83)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ83_tree, root_0);


            ID84=(Token)match(input,ID,FOLLOW_ID_in_read978); 
            ID84_tree = 
            (AslTree)adaptor.create(ID84)
            ;
            adaptor.addChild(root_0, ID84_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE85=null;
        Token STRING87=null;
        AslParser.expr_return expr86 =null;


        AslTree WRITE85_tree=null;
        AslTree STRING87_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE85=(Token)match(input,WRITE,FOLLOW_WRITE_in_write998); 
            WRITE85_tree = 
            (AslTree)adaptor.create(WRITE85)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE85_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:18: ( expr | STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CIRCLE||LA16_0==ELLIPSE||LA16_0==FALSE||LA16_0==ID||LA16_0==INT||LA16_0==MINUS||LA16_0==NOT||LA16_0==PLUS||LA16_0==RECT||LA16_0==TEXT||LA16_0==TRUE||LA16_0==67) ) {
                alt16=1;
            }
            else if ( (LA16_0==STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1002);
                    expr86=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr86.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:26: STRING
                    {
                    STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_write1006); 
                    STRING87_tree = 
                    (AslTree)adaptor.create(STRING87)
                    ;
                    adaptor.addChild(root_0, STRING87_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:1: set : ID ( '@' ^| '#' ^) STRING ( FLOAT )+ ;
    public final AslParser.set_return set() throws RecognitionException {
        AslParser.set_return retval = new AslParser.set_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID88=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Token STRING91=null;
        Token FLOAT92=null;

        AslTree ID88_tree=null;
        AslTree char_literal89_tree=null;
        AslTree char_literal90_tree=null;
        AslTree STRING91_tree=null;
        AslTree FLOAT92_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:6: ( ID ( '@' ^| '#' ^) STRING ( FLOAT )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:8: ID ( '@' ^| '#' ^) STRING ( FLOAT )+
            {
            root_0 = (AslTree)adaptor.nil();


            ID88=(Token)match(input,ID,FOLLOW_ID_in_set1026); 
            ID88_tree = 
            (AslTree)adaptor.create(ID88)
            ;
            adaptor.addChild(root_0, ID88_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:11: ( '@' ^| '#' ^)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==72) ) {
                alt17=1;
            }
            else if ( (LA17_0==64) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:12: '@' ^
                    {
                    char_literal89=(Token)match(input,72,FOLLOW_72_in_set1029); 
                    char_literal89_tree = 
                    (AslTree)adaptor.create(char_literal89)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal89_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:17: '#' ^
                    {
                    char_literal90=(Token)match(input,64,FOLLOW_64_in_set1032); 
                    char_literal90_tree = 
                    (AslTree)adaptor.create(char_literal90)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal90_tree, root_0);


                    }
                    break;

            }


            STRING91=(Token)match(input,STRING,FOLLOW_STRING_in_set1036); 
            STRING91_tree = 
            (AslTree)adaptor.create(STRING91)
            ;
            adaptor.addChild(root_0, STRING91_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:30: ( FLOAT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FLOAT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:152:30: FLOAT
            	    {
            	    FLOAT92=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_set1038); 
            	    FLOAT92_tree = 
            	    (AslTree)adaptor.create(FLOAT92)
            	    ;
            	    adaptor.addChild(root_0, FLOAT92_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:1: expr : ( boolexpr | graphicexpr );
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr93 =null;

        AslParser.graphicexpr_return graphicexpr94 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:6: ( boolexpr | graphicexpr )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FALSE||LA19_0==ID||LA19_0==INT||LA19_0==MINUS||LA19_0==NOT||LA19_0==PLUS||LA19_0==TRUE||LA19_0==67) ) {
                alt19=1;
            }
            else if ( (LA19_0==CIRCLE||LA19_0==ELLIPSE||LA19_0==RECT||LA19_0==TEXT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:155:8: boolexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_boolexpr_in_expr1050);
                    boolexpr93=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr93.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:5: graphicexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_graphicexpr_in_expr1056);
                    graphicexpr94=graphicexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, graphicexpr94.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:1: graphicexpr : graphicconst -> ^( DISP graphicconst ) ;
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicconst_return graphicconst95 =null;


        RewriteRuleSubtreeStream stream_graphicconst=new RewriteRuleSubtreeStream(adaptor,"rule graphicconst");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:13: ( graphicconst -> ^( DISP graphicconst ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:17: graphicconst
            {
            pushFollow(FOLLOW_graphicconst_in_graphicexpr1069);
            graphicconst95=graphicconst();

            state._fsp--;

            stream_graphicconst.add(graphicconst95.getTree());

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
            // 159:30: -> ^( DISP graphicconst )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:33: ^( DISP graphicconst )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:1: graphicconst : ( RECT ^ FLOAT FLOAT FLOAT FLOAT | CIRCLE ^ FLOAT FLOAT FLOAT | TEXT ^ FLOAT FLOAT STRING | ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT );
    public final AslParser.graphicconst_return graphicconst() throws RecognitionException {
        AslParser.graphicconst_return retval = new AslParser.graphicconst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT96=null;
        Token FLOAT97=null;
        Token FLOAT98=null;
        Token FLOAT99=null;
        Token FLOAT100=null;
        Token CIRCLE101=null;
        Token FLOAT102=null;
        Token FLOAT103=null;
        Token FLOAT104=null;
        Token TEXT105=null;
        Token FLOAT106=null;
        Token FLOAT107=null;
        Token STRING108=null;
        Token ELLIPSE109=null;
        Token FLOAT110=null;
        Token FLOAT111=null;
        Token FLOAT112=null;
        Token FLOAT113=null;

        AslTree RECT96_tree=null;
        AslTree FLOAT97_tree=null;
        AslTree FLOAT98_tree=null;
        AslTree FLOAT99_tree=null;
        AslTree FLOAT100_tree=null;
        AslTree CIRCLE101_tree=null;
        AslTree FLOAT102_tree=null;
        AslTree FLOAT103_tree=null;
        AslTree FLOAT104_tree=null;
        AslTree TEXT105_tree=null;
        AslTree FLOAT106_tree=null;
        AslTree FLOAT107_tree=null;
        AslTree STRING108_tree=null;
        AslTree ELLIPSE109_tree=null;
        AslTree FLOAT110_tree=null;
        AslTree FLOAT111_tree=null;
        AslTree FLOAT112_tree=null;
        AslTree FLOAT113_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:13: ( RECT ^ FLOAT FLOAT FLOAT FLOAT | CIRCLE ^ FLOAT FLOAT FLOAT | TEXT ^ FLOAT FLOAT STRING | ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RECT:
                {
                alt20=1;
                }
                break;
            case CIRCLE:
                {
                alt20=2;
                }
                break;
            case TEXT:
                {
                alt20=3;
                }
                break;
            case ELLIPSE:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:17: RECT ^ FLOAT FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT96=(Token)match(input,RECT,FOLLOW_RECT_in_graphicconst1089); 
                    RECT96_tree = 
                    (AslTree)adaptor.create(RECT96)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT96_tree, root_0);


                    FLOAT97=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1092); 
                    FLOAT97_tree = 
                    (AslTree)adaptor.create(FLOAT97)
                    ;
                    adaptor.addChild(root_0, FLOAT97_tree);


                    FLOAT98=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1094); 
                    FLOAT98_tree = 
                    (AslTree)adaptor.create(FLOAT98)
                    ;
                    adaptor.addChild(root_0, FLOAT98_tree);


                    FLOAT99=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1096); 
                    FLOAT99_tree = 
                    (AslTree)adaptor.create(FLOAT99)
                    ;
                    adaptor.addChild(root_0, FLOAT99_tree);


                    FLOAT100=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1098); 
                    FLOAT100_tree = 
                    (AslTree)adaptor.create(FLOAT100)
                    ;
                    adaptor.addChild(root_0, FLOAT100_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:6: CIRCLE ^ FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE101=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicconst1105); 
                    CIRCLE101_tree = 
                    (AslTree)adaptor.create(CIRCLE101)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE101_tree, root_0);


                    FLOAT102=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1108); 
                    FLOAT102_tree = 
                    (AslTree)adaptor.create(FLOAT102)
                    ;
                    adaptor.addChild(root_0, FLOAT102_tree);


                    FLOAT103=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1110); 
                    FLOAT103_tree = 
                    (AslTree)adaptor.create(FLOAT103)
                    ;
                    adaptor.addChild(root_0, FLOAT103_tree);


                    FLOAT104=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1112); 
                    FLOAT104_tree = 
                    (AslTree)adaptor.create(FLOAT104)
                    ;
                    adaptor.addChild(root_0, FLOAT104_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:164:6: TEXT ^ FLOAT FLOAT STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT105=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicconst1119); 
                    TEXT105_tree = 
                    (AslTree)adaptor.create(TEXT105)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT105_tree, root_0);


                    FLOAT106=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1122); 
                    FLOAT106_tree = 
                    (AslTree)adaptor.create(FLOAT106)
                    ;
                    adaptor.addChild(root_0, FLOAT106_tree);


                    FLOAT107=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1124); 
                    FLOAT107_tree = 
                    (AslTree)adaptor.create(FLOAT107)
                    ;
                    adaptor.addChild(root_0, FLOAT107_tree);


                    STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_graphicconst1126); 
                    STRING108_tree = 
                    (AslTree)adaptor.create(STRING108)
                    ;
                    adaptor.addChild(root_0, STRING108_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:165:6: ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE109=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicconst1133); 
                    ELLIPSE109_tree = 
                    (AslTree)adaptor.create(ELLIPSE109)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE109_tree, root_0);


                    FLOAT110=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1136); 
                    FLOAT110_tree = 
                    (AslTree)adaptor.create(FLOAT110)
                    ;
                    adaptor.addChild(root_0, FLOAT110_tree);


                    FLOAT111=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1138); 
                    FLOAT111_tree = 
                    (AslTree)adaptor.create(FLOAT111)
                    ;
                    adaptor.addChild(root_0, FLOAT111_tree);


                    FLOAT112=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1140); 
                    FLOAT112_tree = 
                    (AslTree)adaptor.create(FLOAT112)
                    ;
                    adaptor.addChild(root_0, FLOAT112_tree);


                    FLOAT113=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1142); 
                    FLOAT113_tree = 
                    (AslTree)adaptor.create(FLOAT113)
                    ;
                    adaptor.addChild(root_0, FLOAT113_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR115=null;
        AslParser.boolterm_return boolterm114 =null;

        AslParser.boolterm_return boolterm116 =null;


        AslTree OR115_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr1165);
            boolterm114=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm114.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:26: ( OR ^ boolterm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:27: OR ^ boolterm
            	    {
            	    OR115=(Token)match(input,OR,FOLLOW_OR_in_boolexpr1168); 
            	    OR115_tree = 
            	    (AslTree)adaptor.create(OR115)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR115_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr1171);
            	    boolterm116=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm116.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND118=null;
        AslParser.boolfact_return boolfact117 =null;

        AslParser.boolfact_return boolfact119 =null;


        AslTree AND118_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1191);
            boolfact117=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact117.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:22: ( AND ^ boolfact )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:23: AND ^ boolfact
            	    {
            	    AND118=(Token)match(input,AND,FOLLOW_AND_in_boolterm1194); 
            	    AND118_tree = 
            	    (AslTree)adaptor.create(AND118)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND118_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1197);
            	    boolfact119=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact119.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL121=null;
        Token NOT_EQUAL122=null;
        Token LT123=null;
        Token LE124=null;
        Token GT125=null;
        Token GE126=null;
        AslParser.num_expr_return num_expr120 =null;

        AslParser.num_expr_return num_expr127 =null;


        AslTree EQUAL121_tree=null;
        AslTree NOT_EQUAL122_tree=null;
        AslTree LT123_tree=null;
        AslTree LE124_tree=null;
        AslTree GT125_tree=null;
        AslTree GE126_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1217);
            num_expr120=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr120.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EQUAL||(LA24_0 >= GE && LA24_0 <= GT)||LA24_0==LE||LA24_0==LT||LA24_0==NOT_EQUAL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt23=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt23=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt23=2;
                        }
                        break;
                    case LT:
                        {
                        alt23=3;
                        }
                        break;
                    case LE:
                        {
                        alt23=4;
                        }
                        break;
                    case GT:
                        {
                        alt23=5;
                        }
                        break;
                    case GE:
                        {
                        alt23=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:24: EQUAL ^
                            {
                            EQUAL121=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1221); 
                            EQUAL121_tree = 
                            (AslTree)adaptor.create(EQUAL121)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL121_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL122=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1226); 
                            NOT_EQUAL122_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL122)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL122_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:46: LT ^
                            {
                            LT123=(Token)match(input,LT,FOLLOW_LT_in_boolfact1231); 
                            LT123_tree = 
                            (AslTree)adaptor.create(LT123)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT123_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:52: LE ^
                            {
                            LE124=(Token)match(input,LE,FOLLOW_LE_in_boolfact1236); 
                            LE124_tree = 
                            (AslTree)adaptor.create(LE124)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE124_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:58: GT ^
                            {
                            GT125=(Token)match(input,GT,FOLLOW_GT_in_boolfact1241); 
                            GT125_tree = 
                            (AslTree)adaptor.create(GT125)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT125_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:64: GE ^
                            {
                            GE126=(Token)match(input,GE,FOLLOW_GE_in_boolfact1246); 
                            GE126_tree = 
                            (AslTree)adaptor.create(GE126)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE126_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1250);
                    num_expr127=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr127.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS129=null;
        Token MINUS130=null;
        AslParser.term_return term128 =null;

        AslParser.term_return term131 =null;


        AslTree PLUS129_tree=null;
        AslTree MINUS130_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1270);
            term128=term();

            state._fsp--;

            adaptor.addChild(root_0, term128.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:18: ( ( PLUS ^| MINUS ^) term )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==MINUS||LA26_0==PLUS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:20: ( PLUS ^| MINUS ^)
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==PLUS) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==MINUS) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:21: PLUS ^
            	            {
            	            PLUS129=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1275); 
            	            PLUS129_tree = 
            	            (AslTree)adaptor.create(PLUS129)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS129_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:29: MINUS ^
            	            {
            	            MINUS130=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1280); 
            	            MINUS130_tree = 
            	            (AslTree)adaptor.create(MINUS130)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS130_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1284);
            	    term131=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term131.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL133=null;
        Token DIV134=null;
        Token MOD135=null;
        AslParser.factor_return factor132 =null;

        AslParser.factor_return factor136 =null;


        AslTree MUL133_tree=null;
        AslTree DIV134_tree=null;
        AslTree MOD135_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1308);
            factor132=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor132.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DIV||LA28_0==MOD||LA28_0==MUL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case MOD:
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
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:23: MUL ^
            	            {
            	            MUL133=(Token)match(input,MUL,FOLLOW_MUL_in_term1313); 
            	            MUL133_tree = 
            	            (AslTree)adaptor.create(MUL133)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL133_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:30: DIV ^
            	            {
            	            DIV134=(Token)match(input,DIV,FOLLOW_DIV_in_term1318); 
            	            DIV134_tree = 
            	            (AslTree)adaptor.create(DIV134)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV134_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:37: MOD ^
            	            {
            	            MOD135=(Token)match(input,MOD,FOLLOW_MOD_in_term1323); 
            	            MOD135_tree = 
            	            (AslTree)adaptor.create(MOD135)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD135_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1327);
            	    factor136=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor136.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT137=null;
        Token PLUS138=null;
        Token MINUS139=null;
        AslParser.atom_return atom140 =null;


        AslTree NOT137_tree=null;
        AslTree PLUS138_tree=null;
        AslTree MINUS139_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt29=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt29=1;
                    }
                    break;
                case PLUS:
                    {
                    alt29=2;
                    }
                    break;
                case MINUS:
                    {
                    alt29=3;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:14: NOT ^
                    {
                    NOT137=(Token)match(input,NOT,FOLLOW_NOT_in_factor1350); 
                    NOT137_tree = 
                    (AslTree)adaptor.create(NOT137)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT137_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:21: PLUS ^
                    {
                    PLUS138=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1355); 
                    PLUS138_tree = 
                    (AslTree)adaptor.create(PLUS138)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS138_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:29: MINUS ^
                    {
                    MINUS139=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1360); 
                    MINUS139_tree = 
                    (AslTree)adaptor.create(MINUS139)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS139_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1365);
            atom140=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom140.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:1: atom : ( ID | INT | pair | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID141=null;
        Token INT142=null;
        Token char_literal145=null;
        Token char_literal147=null;
        AslParser.pair_return pair143 =null;

        AslParser.funcall_return funcall144 =null;

        AslParser.expr_return expr146 =null;


        AslTree b_tree=null;
        AslTree ID141_tree=null;
        AslTree INT142_tree=null;
        AslTree char_literal145_tree=null;
        AslTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:9: ( ID | INT | pair | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt31=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 70:
                    {
                    alt31=3;
                    }
                    break;
                case 67:
                    {
                    alt31=5;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQUAL:
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
                case 68:
                case 69:
                case 71:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt31=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt31=4;
                }
                break;
            case 67:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID141=(Token)match(input,ID,FOLLOW_ID_in_atom1390); 
                    ID141_tree = 
                    (AslTree)adaptor.create(ID141)
                    ;
                    adaptor.addChild(root_0, ID141_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:191:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT142=(Token)match(input,INT,FOLLOW_INT_in_atom1404); 
                    INT142_tree = 
                    (AslTree)adaptor.create(INT142)
                    ;
                    adaptor.addChild(root_0, INT142_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:11: pair
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_pair_in_atom1416);
                    pair143=pair();

                    state._fsp--;

                    adaptor.addChild(root_0, pair143.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:13: (b= TRUE |b= FALSE )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==TRUE) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==FALSE) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }
                    switch (alt30) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1433);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1439);  
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
                    // 193:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:36: ^( BOOLEAN[$b,$b.text] )
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
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1462);
                    funcall144=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall144.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal145=(Token)match(input,67,FOLLOW_67_in_atom1476); 

                    pushFollow(FOLLOW_expr_in_atom1479);
                    expr146=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr146.getTree());

                    char_literal147=(Token)match(input,68,FOLLOW_68_in_atom1481); 

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


    public static class pair_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pair"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:1: pair : ID '.' PAIR_INDEX -> ^( PAIR ID PAIR_INDEX ) ;
    public final AslParser.pair_return pair() throws RecognitionException {
        AslParser.pair_return retval = new AslParser.pair_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID148=null;
        Token char_literal149=null;
        Token PAIR_INDEX150=null;

        AslTree ID148_tree=null;
        AslTree char_literal149_tree=null;
        AslTree PAIR_INDEX150_tree=null;
        RewriteRuleTokenStream stream_PAIR_INDEX=new RewriteRuleTokenStream(adaptor,"token PAIR_INDEX");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:6: ( ID '.' PAIR_INDEX -> ^( PAIR ID PAIR_INDEX ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:8: ID '.' PAIR_INDEX
            {
            ID148=(Token)match(input,ID,FOLLOW_ID_in_pair1500);  
            stream_ID.add(ID148);


            char_literal149=(Token)match(input,70,FOLLOW_70_in_pair1502);  
            stream_70.add(char_literal149);


            PAIR_INDEX150=(Token)match(input,PAIR_INDEX,FOLLOW_PAIR_INDEX_in_pair1504);  
            stream_PAIR_INDEX.add(PAIR_INDEX150);


            // AST REWRITE
            // elements: ID, PAIR_INDEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 199:26: -> ^( PAIR ID PAIR_INDEX )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:29: ^( PAIR ID PAIR_INDEX )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PAIR, "PAIR")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PAIR_INDEX.nextNode()
                );

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
    // $ANTLR end "pair"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        AslParser.expr_list_return expr_list153 =null;


        AslTree ID151_tree=null;
        AslTree char_literal152_tree=null;
        AslTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:13: ID '(' ( expr_list )? ')'
            {
            ID151=(Token)match(input,ID,FOLLOW_ID_in_funcall1529);  
            stream_ID.add(ID151);


            char_literal152=(Token)match(input,67,FOLLOW_67_in_funcall1531);  
            stream_67.add(char_literal152);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:20: ( expr_list )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CIRCLE||LA32_0==ELLIPSE||LA32_0==FALSE||LA32_0==ID||LA32_0==INT||LA32_0==MINUS||LA32_0==NOT||LA32_0==PLUS||LA32_0==RECT||LA32_0==TEXT||LA32_0==TRUE||LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1533);
                    expr_list153=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list153.getTree());

                    }
                    break;

            }


            char_literal154=(Token)match(input,68,FOLLOW_68_in_funcall1536);  
            stream_68.add(char_literal154);


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
            // 204:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:61: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal156=null;
        AslParser.expr_return expr155 =null;

        AslParser.expr_return expr157 =null;


        AslTree char_literal156_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1569);
            expr155=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr155.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:18: ( ',' ! expr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==69) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:19: ',' ! expr
            	    {
            	    char_literal156=(Token)match(input,69,FOLLOW_69_in_expr_list1572); 

            	    pushFollow(FOLLOW_expr_in_expr_list1575);
            	    expr157=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr157.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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


 

    public static final BitSet FOLLOW_func_in_prog192 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_prog195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func222 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_func225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_func227 = new BitSet(new long[]{0x6C7E80080C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_block_instructions_in_func229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_func238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_macro255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_params267 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_paramlist_in_params269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_params272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_paramlist301 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_param_in_paramlist304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_66_in_param329 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_block_instructions393 = new BitSet(new long[]{0x6C7E80080C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_instruction_in_block_instructions395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assign_in_instruction444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_assign_in_instruction466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transform_in_instruction622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_animation_in_instruction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_transform685 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform688 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform690 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSREL_in_transform697 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform700 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform702 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_transform709 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform712 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform714 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_FLOAT_in_transform717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALEREL_in_transform724 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform729 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_FLOAT_in_transform732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_transform740 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform743 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform745 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_FLOAT_in_transform748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATEREL_in_transform755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_transform758 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_transform760 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_FLOAT_in_transform763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEMENT_in_animation776 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_animation779 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_animation781 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_animation783 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INT_in_animation785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATION_in_animation791 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_animation794 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_animation796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign808 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign812 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pair_assign843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_pair_assign845 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_PAIR_ASSIGN_in_pair_assign847 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_pair_assign851 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_pair_assign853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt879 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_ite_stmt882 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt884 = new BitSet(new long[]{0x6C7E80080C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt887 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt890 = new BitSet(new long[]{0x6C7E80080C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt893 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt920 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_while_stmt923 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt925 = new BitSet(new long[]{0x6C7E80080C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt928 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt953 = new BitSet(new long[]{0x1101102214102102L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_return_stmt956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read975 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_read978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write998 = new BitSet(new long[]{0x1181102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_write1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000101L});
    public static final BitSet FOLLOW_72_in_set1029 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64_in_set1032 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_STRING_in_set1036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_set1038 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_boolexpr_in_expr1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_expr1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicconst_in_graphicexpr1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicconst1089 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1092 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicconst1105 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1110 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicconst1119 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1122 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1124 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_STRING_in_graphicconst1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicconst1133 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1136 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1140 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1165 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr1168 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1171 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1191 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1194 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1217 = new BitSet(new long[]{0x0000004123040002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1221 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1226 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_boolfact1231 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_boolfact1236 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_boolfact1241 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_boolfact1246 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1270 = new BitSet(new long[]{0x0000100200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1275 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1280 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_num_expr1284 = new BitSet(new long[]{0x0000100200000002L});
    public static final BitSet FOLLOW_factor_in_term1308 = new BitSet(new long[]{0x0000001400000802L});
    public static final BitSet FOLLOW_MUL_in_term1313 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_term1318 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_term1323 = new BitSet(new long[]{0x1000102214100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term1327 = new BitSet(new long[]{0x0000001400000802L});
    public static final BitSet FOLLOW_NOT_in_factor1350 = new BitSet(new long[]{0x1000000014100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_factor1355 = new BitSet(new long[]{0x1000000014100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_factor1360 = new BitSet(new long[]{0x1000000014100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_factor1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_atom1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_atom1476 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_atom1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pair1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_pair1502 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PAIR_INDEX_in_pair1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_funcall1531 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000018L});
    public static final BitSet FOLLOW_expr_list_in_funcall1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcall1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_expr_list1572 = new BitSet(new long[]{0x1101102214102100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr_list1575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});

}