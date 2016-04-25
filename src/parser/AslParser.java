// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-25 07:51:11

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CIRCLE", "COMMENT", "COMP", "DISP", "DIV", "DO", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MOVEMENT", "MUL", "NOT", "NOT_EQUAL", "OR", "PAIR", "PAIR_ASSIGN", "PAIR_INDEX", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "RETURN", "ROTATE", "ROTATEREL", "ROTATION", "SCALE", "SCALEREL", "STRING", "TEXT", "THEN", "TRANS", "TRANSREL", "TRUE", "TUPLA", "WHILE", "WRITE", "WS", "'#'", "'$SHOW'", "'&'", "'('", "')'", "','", "'.'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int CIRCLE=8;
    public static final int COMMENT=9;
    public static final int COMP=10;
    public static final int DISP=11;
    public static final int DIV=12;
    public static final int DO=13;
    public static final int ELLIPSE=14;
    public static final int ELSE=15;
    public static final int ENDFUNC=16;
    public static final int ENDIF=17;
    public static final int ENDWHILE=18;
    public static final int EQUAL=19;
    public static final int ESC_SEQ=20;
    public static final int FALSE=21;
    public static final int FLOAT=22;
    public static final int FUNC=23;
    public static final int FUNCALL=24;
    public static final int GE=25;
    public static final int GT=26;
    public static final int ID=27;
    public static final int IF=28;
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
    public static final int TUPLA=61;
    public static final int WHILE=62;
    public static final int WRITE=63;
    public static final int WS=64;

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

                if ( (LA1_0==FUNC||LA1_0==66) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:65:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog206);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog209);  
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:1: func : ( FUNC ^ ID params block_instructions ENDFUNC !| macro );
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:6: ( FUNC ^ ID params block_instructions ENDFUNC !| macro )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==66) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:8: FUNC ^ ID params block_instructions ENDFUNC !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func236); 
                    FUNC3_tree = 
                    (AslTree)adaptor.create(FUNC3)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_func239); 
                    ID4_tree = 
                    (AslTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                    pushFollow(FOLLOW_params_in_func241);
                    params5=params();

                    state._fsp--;

                    adaptor.addChild(root_0, params5.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func243);
                    block_instructions6=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions6.getTree());

                    ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func245); 

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:70:5: macro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_macro_in_func252);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:1: macro : '$SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal9=null;

        AslTree string_literal9_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:73:9: '$SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal9=(Token)match(input,66,FOLLOW_66_in_macro269); 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        AslParser.paramlist_return paramlist11 =null;


        AslTree char_literal10_tree=null;
        AslTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:10: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,68,FOLLOW_68_in_params281);  
            stream_68.add(char_literal10);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==67) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params283);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,69,FOLLOW_69_in_params286);  
            stream_69.add(char_literal12);


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
            // 77:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:77:41: ( paramlist )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal14=null;
        AslParser.param_return param13 =null;

        AslParser.param_return param15 =null;


        AslTree char_literal14_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist312);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==70) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:81:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,70,FOLLOW_70_in_paramlist315); 

            	    pushFollow(FOLLOW_param_in_paramlist318);
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:86:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;

        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:86:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==67) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:86:13: '&' id= ID
                    {
                    char_literal16=(Token)match(input,67,FOLLOW_67_in_param343);  
                    stream_67.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param347);  
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
                    // 86:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:86:26: ^( PREF[$id,$id.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param370);  
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
                    // 87:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:87:22: ^( PVALUE[$id,$id.text] )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:91:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions404);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==72) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:92:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,72,FOLLOW_72_in_block_instructions407);  
            	    stream_72.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions409);
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
            // 93:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:93:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:1: instruction : ( assign | pair_assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | transform | animation | macro |);
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

        AslParser.macro_return macro31 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:9: ( assign | pair_assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | transform | animation | macro |)
            int alt7=13;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt7=1;
                    }
                    break;
                case 71:
                    {
                    alt7=2;
                    }
                    break;
                case 68:
                    {
                    alt7=5;
                    }
                    break;
                case 65:
                case 73:
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
            case 66:
                {
                alt7=12;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 72:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction458);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:11: pair_assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_pair_assign_in_instruction480);
                    pair_assign21=pair_assign();

                    state._fsp--;

                    adaptor.addChild(root_0, pair_assign21.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction494);
                    ite_stmt22=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction514);
                    while_stmt23=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt23.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:102:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction534);
                    funcall24=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall24.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:103:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction555);
                    return_stmt25=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:104:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction572);
                    read26=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read26.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction597);
                    write27=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write27.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction620);
                    set28=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set28.getTree());

                    }
                    break;
                case 10 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:107:11: transform
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_transform_in_instruction636);
                    transform29=transform();

                    state._fsp--;

                    adaptor.addChild(root_0, transform29.getTree());

                    }
                    break;
                case 11 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:108:11: animation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_animation_in_instruction650);
                    animation30=animation();

                    state._fsp--;

                    adaptor.addChild(root_0, animation30.getTree());

                    }
                    break;
                case 12 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:13: macro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_macro_in_instruction666);
                    macro31=macro();

                    state._fsp--;

                    adaptor.addChild(root_0, macro31.getTree());

                    }
                    break;
                case 13 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:111:9: 
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:1: transform : ( TRANS ^ ID atom ( atom )? | TRANSREL ^ ID atom ( atom )? | SCALE ^ ID atom ( atom )? | SCALEREL ^ ID atom ( atom )? | ROTATE ^ ID atom ( atom )? | ROTATEREL ^ ID atom ( atom )? );
    public final AslParser.transform_return transform() throws RecognitionException {
        AslParser.transform_return retval = new AslParser.transform_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANS32=null;
        Token ID33=null;
        Token TRANSREL36=null;
        Token ID37=null;
        Token SCALE40=null;
        Token ID41=null;
        Token SCALEREL44=null;
        Token ID45=null;
        Token ROTATE48=null;
        Token ID49=null;
        Token ROTATEREL52=null;
        Token ID53=null;
        AslParser.atom_return atom34 =null;

        AslParser.atom_return atom35 =null;

        AslParser.atom_return atom38 =null;

        AslParser.atom_return atom39 =null;

        AslParser.atom_return atom42 =null;

        AslParser.atom_return atom43 =null;

        AslParser.atom_return atom46 =null;

        AslParser.atom_return atom47 =null;

        AslParser.atom_return atom50 =null;

        AslParser.atom_return atom51 =null;

        AslParser.atom_return atom54 =null;

        AslParser.atom_return atom55 =null;


        AslTree TRANS32_tree=null;
        AslTree ID33_tree=null;
        AslTree TRANSREL36_tree=null;
        AslTree ID37_tree=null;
        AslTree SCALE40_tree=null;
        AslTree ID41_tree=null;
        AslTree SCALEREL44_tree=null;
        AslTree ID45_tree=null;
        AslTree ROTATE48_tree=null;
        AslTree ID49_tree=null;
        AslTree ROTATEREL52_tree=null;
        AslTree ID53_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:11: ( TRANS ^ ID atom ( atom )? | TRANSREL ^ ID atom ( atom )? | SCALE ^ ID atom ( atom )? | SCALEREL ^ ID atom ( atom )? | ROTATE ^ ID atom ( atom )? | ROTATEREL ^ ID atom ( atom )? )
            int alt14=6;
            switch ( input.LA(1) ) {
            case TRANS:
                {
                alt14=1;
                }
                break;
            case TRANSREL:
                {
                alt14=2;
                }
                break;
            case SCALE:
                {
                alt14=3;
                }
                break;
            case SCALEREL:
                {
                alt14=4;
                }
                break;
            case ROTATE:
                {
                alt14=5;
                }
                break;
            case ROTATEREL:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:13: TRANS ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANS32=(Token)match(input,TRANS,FOLLOW_TRANS_in_transform714); 
                    TRANS32_tree = 
                    (AslTree)adaptor.create(TRANS32)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANS32_tree, root_0);


                    ID33=(Token)match(input,ID,FOLLOW_ID_in_transform717); 
                    ID33_tree = 
                    (AslTree)adaptor.create(ID33)
                    ;
                    adaptor.addChild(root_0, ID33_tree);


                    pushFollow(FOLLOW_atom_in_transform719);
                    atom34=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom34.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:28: ( atom )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0 >= FALSE && LA8_0 <= FLOAT)||LA8_0==ID||LA8_0==TRUE||LA8_0==68||LA8_0==74) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:115:29: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform722);
                            atom35=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom35.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:4: TRANSREL ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANSREL36=(Token)match(input,TRANSREL,FOLLOW_TRANSREL_in_transform729); 
                    TRANSREL36_tree = 
                    (AslTree)adaptor.create(TRANSREL36)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANSREL36_tree, root_0);


                    ID37=(Token)match(input,ID,FOLLOW_ID_in_transform732); 
                    ID37_tree = 
                    (AslTree)adaptor.create(ID37)
                    ;
                    adaptor.addChild(root_0, ID37_tree);


                    pushFollow(FOLLOW_atom_in_transform734);
                    atom38=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom38.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:22: ( atom )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0 >= FALSE && LA9_0 <= FLOAT)||LA9_0==ID||LA9_0==TRUE||LA9_0==68||LA9_0==74) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:116:23: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform737);
                            atom39=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom39.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:4: SCALE ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALE40=(Token)match(input,SCALE,FOLLOW_SCALE_in_transform744); 
                    SCALE40_tree = 
                    (AslTree)adaptor.create(SCALE40)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALE40_tree, root_0);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_transform747); 
                    ID41_tree = 
                    (AslTree)adaptor.create(ID41)
                    ;
                    adaptor.addChild(root_0, ID41_tree);


                    pushFollow(FOLLOW_atom_in_transform749);
                    atom42=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom42.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:19: ( atom )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0 >= FALSE && LA10_0 <= FLOAT)||LA10_0==ID||LA10_0==TRUE||LA10_0==68||LA10_0==74) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:20: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform752);
                            atom43=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom43.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:4: SCALEREL ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALEREL44=(Token)match(input,SCALEREL,FOLLOW_SCALEREL_in_transform760); 
                    SCALEREL44_tree = 
                    (AslTree)adaptor.create(SCALEREL44)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALEREL44_tree, root_0);


                    ID45=(Token)match(input,ID,FOLLOW_ID_in_transform763); 
                    ID45_tree = 
                    (AslTree)adaptor.create(ID45)
                    ;
                    adaptor.addChild(root_0, ID45_tree);


                    pushFollow(FOLLOW_atom_in_transform765);
                    atom46=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom46.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:22: ( atom )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0 >= FALSE && LA11_0 <= FLOAT)||LA11_0==ID||LA11_0==TRUE||LA11_0==68||LA11_0==74) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:118:23: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform768);
                            atom47=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom47.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:4: ROTATE ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATE48=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_transform776); 
                    ROTATE48_tree = 
                    (AslTree)adaptor.create(ROTATE48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATE48_tree, root_0);


                    ID49=(Token)match(input,ID,FOLLOW_ID_in_transform779); 
                    ID49_tree = 
                    (AslTree)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


                    pushFollow(FOLLOW_atom_in_transform781);
                    atom50=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom50.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:20: ( atom )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0 >= FALSE && LA12_0 <= FLOAT)||LA12_0==ID||LA12_0==TRUE||LA12_0==68||LA12_0==74) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:119:21: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform784);
                            atom51=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom51.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:4: ROTATEREL ^ ID atom ( atom )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATEREL52=(Token)match(input,ROTATEREL,FOLLOW_ROTATEREL_in_transform791); 
                    ROTATEREL52_tree = 
                    (AslTree)adaptor.create(ROTATEREL52)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATEREL52_tree, root_0);


                    ID53=(Token)match(input,ID,FOLLOW_ID_in_transform794); 
                    ID53_tree = 
                    (AslTree)adaptor.create(ID53)
                    ;
                    adaptor.addChild(root_0, ID53_tree);


                    pushFollow(FOLLOW_atom_in_transform796);
                    atom54=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom54.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:23: ( atom )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0 >= FALSE && LA13_0 <= FLOAT)||LA13_0==ID||LA13_0==TRUE||LA13_0==68||LA13_0==74) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:24: atom
                            {
                            pushFollow(FOLLOW_atom_in_transform799);
                            atom55=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom55.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:1: animation : ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT );
    public final AslParser.animation_return animation() throws RecognitionException {
        AslParser.animation_return retval = new AslParser.animation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVEMENT56=null;
        Token ID57=null;
        Token FLOAT58=null;
        Token FLOAT59=null;
        Token FLOAT60=null;
        Token ROTATION61=null;
        Token ID62=null;
        Token FLOAT63=null;

        AslTree MOVEMENT56_tree=null;
        AslTree ID57_tree=null;
        AslTree FLOAT58_tree=null;
        AslTree FLOAT59_tree=null;
        AslTree FLOAT60_tree=null;
        AslTree ROTATION61_tree=null;
        AslTree ID62_tree=null;
        AslTree FLOAT63_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:11: ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MOVEMENT) ) {
                alt15=1;
            }
            else if ( (LA15_0==ROTATION) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:13: MOVEMENT ^ ID FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MOVEMENT56=(Token)match(input,MOVEMENT,FOLLOW_MOVEMENT_in_animation812); 
                    MOVEMENT56_tree = 
                    (AslTree)adaptor.create(MOVEMENT56)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MOVEMENT56_tree, root_0);


                    ID57=(Token)match(input,ID,FOLLOW_ID_in_animation815); 
                    ID57_tree = 
                    (AslTree)adaptor.create(ID57)
                    ;
                    adaptor.addChild(root_0, ID57_tree);


                    FLOAT58=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation817); 
                    FLOAT58_tree = 
                    (AslTree)adaptor.create(FLOAT58)
                    ;
                    adaptor.addChild(root_0, FLOAT58_tree);


                    FLOAT59=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation819); 
                    FLOAT59_tree = 
                    (AslTree)adaptor.create(FLOAT59)
                    ;
                    adaptor.addChild(root_0, FLOAT59_tree);


                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation821); 
                    FLOAT60_tree = 
                    (AslTree)adaptor.create(FLOAT60)
                    ;
                    adaptor.addChild(root_0, FLOAT60_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:4: ROTATION ^ ID FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATION61=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_animation827); 
                    ROTATION61_tree = 
                    (AslTree)adaptor.create(ROTATION61)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATION61_tree, root_0);


                    ID62=(Token)match(input,ID,FOLLOW_ID_in_animation830); 
                    ID62_tree = 
                    (AslTree)adaptor.create(ID62)
                    ;
                    adaptor.addChild(root_0, ID62_tree);


                    FLOAT63=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation832); 
                    FLOAT63_tree = 
                    (AslTree)adaptor.create(FLOAT63)
                    ;
                    adaptor.addChild(root_0, FLOAT63_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID64=null;
        AslParser.expr_return expr65 =null;


        AslTree eq_tree=null;
        AslTree ID64_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:10: ID eq= EQUAL expr
            {
            ID64=(Token)match(input,ID,FOLLOW_ID_in_assign844);  
            stream_ID.add(ID64);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign848);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign850);
            expr65=expr();

            state._fsp--;

            stream_expr.add(expr65.getTree());

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
            // 129:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:1: pair_assign : ID '.' ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr ) ;
    public final AslParser.pair_assign_return pair_assign() throws RecognitionException {
        AslParser.pair_assign_return retval = new AslParser.pair_assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID66=null;
        Token char_literal67=null;
        Token ID68=null;
        AslParser.expr_return expr69 =null;


        AslTree eq_tree=null;
        AslTree ID66_tree=null;
        AslTree char_literal67_tree=null;
        AslTree ID68_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:13: ( ID '.' ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:15: ID '.' ID eq= EQUAL expr
            {
            ID66=(Token)match(input,ID,FOLLOW_ID_in_pair_assign879);  
            stream_ID.add(ID66);


            char_literal67=(Token)match(input,71,FOLLOW_71_in_pair_assign881);  
            stream_71.add(char_literal67);


            ID68=(Token)match(input,ID,FOLLOW_ID_in_pair_assign883);  
            stream_ID.add(ID68);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_pair_assign887);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_pair_assign889);
            expr69=expr();

            state._fsp--;

            stream_expr.add(expr69.getTree());

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
            // 133:39: -> ^( ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:133:42: ^( ASSIGN[$eq,\":=\"] ID PAIR_ASSIGN expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                (AslTree)adaptor.create(PAIR_ASSIGN, "PAIR_ASSIGN")
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF70=null;
        Token THEN72=null;
        Token ELSE74=null;
        Token ENDIF76=null;
        AslParser.expr_return expr71 =null;

        AslParser.block_instructions_return block_instructions73 =null;

        AslParser.block_instructions_return block_instructions75 =null;


        AslTree IF70_tree=null;
        AslTree THEN72_tree=null;
        AslTree ELSE74_tree=null;
        AslTree ENDIF76_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF70=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt915); 
            IF70_tree = 
            (AslTree)adaptor.create(IF70)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF70_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt918);
            expr71=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr71.getTree());

            THEN72=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt920); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt923);
            block_instructions73=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions73.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:46: ( ELSE ! block_instructions )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:47: ELSE ! block_instructions
                    {
                    ELSE74=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt926); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt929);
                    block_instructions75=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions75.getTree());

                    }
                    break;

            }


            ENDIF76=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt933); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE77=null;
        Token DO79=null;
        Token ENDWHILE81=null;
        AslParser.expr_return expr78 =null;

        AslParser.block_instructions_return block_instructions80 =null;


        AslTree WHILE77_tree=null;
        AslTree DO79_tree=null;
        AslTree ENDWHILE81_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:141:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE77=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt956); 
            WHILE77_tree = 
            (AslTree)adaptor.create(WHILE77)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE77_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt959);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());

            DO79=(Token)match(input,DO,FOLLOW_DO_in_while_stmt961); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt964);
            block_instructions80=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions80.getTree());

            ENDWHILE81=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt966); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN82=null;
        AslParser.expr_return expr83 =null;


        AslTree RETURN82_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN82=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt989); 
            RETURN82_tree = 
            (AslTree)adaptor.create(RETURN82)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN82_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:23: ( expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CIRCLE||LA17_0==ELLIPSE||(LA17_0 >= FALSE && LA17_0 <= FLOAT)||LA17_0==ID||LA17_0==MINUS||LA17_0==NOT||LA17_0==PLUS||LA17_0==RECT||LA17_0==TEXT||LA17_0==TRUE||LA17_0==68||LA17_0==74) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:145:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt992);
                    expr83=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr83.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ84=null;
        Token ID85=null;

        AslTree READ84_tree=null;
        AslTree ID85_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:149:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ84=(Token)match(input,READ,FOLLOW_READ_in_read1011); 
            READ84_tree = 
            (AslTree)adaptor.create(READ84)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ84_tree, root_0);


            ID85=(Token)match(input,ID,FOLLOW_ID_in_read1014); 
            ID85_tree = 
            (AslTree)adaptor.create(ID85)
            ;
            adaptor.addChild(root_0, ID85_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE86=null;
        Token STRING88=null;
        AslParser.expr_return expr87 =null;


        AslTree WRITE86_tree=null;
        AslTree STRING88_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE86=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1034); 
            WRITE86_tree = 
            (AslTree)adaptor.create(WRITE86)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE86_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:18: ( expr | STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CIRCLE||LA18_0==ELLIPSE||(LA18_0 >= FALSE && LA18_0 <= FLOAT)||LA18_0==ID||LA18_0==MINUS||LA18_0==NOT||LA18_0==PLUS||LA18_0==RECT||LA18_0==TEXT||LA18_0==TRUE||LA18_0==68||LA18_0==74) ) {
                alt18=1;
            }
            else if ( (LA18_0==STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1038);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:153:26: STRING
                    {
                    STRING88=(Token)match(input,STRING,FOLLOW_STRING_in_write1042); 
                    STRING88_tree = 
                    (AslTree)adaptor.create(STRING88)
                    ;
                    adaptor.addChild(root_0, STRING88_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:1: set : ID ( '@' ^| '#' ^) STRING ( FLOAT )+ ;
    public final AslParser.set_return set() throws RecognitionException {
        AslParser.set_return retval = new AslParser.set_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID89=null;
        Token char_literal90=null;
        Token char_literal91=null;
        Token STRING92=null;
        Token FLOAT93=null;

        AslTree ID89_tree=null;
        AslTree char_literal90_tree=null;
        AslTree char_literal91_tree=null;
        AslTree STRING92_tree=null;
        AslTree FLOAT93_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:6: ( ID ( '@' ^| '#' ^) STRING ( FLOAT )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:8: ID ( '@' ^| '#' ^) STRING ( FLOAT )+
            {
            root_0 = (AslTree)adaptor.nil();


            ID89=(Token)match(input,ID,FOLLOW_ID_in_set1062); 
            ID89_tree = 
            (AslTree)adaptor.create(ID89)
            ;
            adaptor.addChild(root_0, ID89_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:11: ( '@' ^| '#' ^)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==73) ) {
                alt19=1;
            }
            else if ( (LA19_0==65) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:12: '@' ^
                    {
                    char_literal90=(Token)match(input,73,FOLLOW_73_in_set1065); 
                    char_literal90_tree = 
                    (AslTree)adaptor.create(char_literal90)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal90_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:17: '#' ^
                    {
                    char_literal91=(Token)match(input,65,FOLLOW_65_in_set1068); 
                    char_literal91_tree = 
                    (AslTree)adaptor.create(char_literal91)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal91_tree, root_0);


                    }
                    break;

            }


            STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_set1072); 
            STRING92_tree = 
            (AslTree)adaptor.create(STRING92)
            ;
            adaptor.addChild(root_0, STRING92_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:30: ( FLOAT )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==FLOAT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:156:30: FLOAT
            	    {
            	    FLOAT93=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_set1074); 
            	    FLOAT93_tree = 
            	    (AslTree)adaptor.create(FLOAT93)
            	    ;
            	    adaptor.addChild(root_0, FLOAT93_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:1: expr : ( boolexpr | graphicexpr );
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr94 =null;

        AslParser.graphicexpr_return graphicexpr95 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:6: ( boolexpr | graphicexpr )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= FALSE && LA21_0 <= FLOAT)||LA21_0==ID||LA21_0==MINUS||LA21_0==NOT||LA21_0==PLUS||LA21_0==TRUE||LA21_0==68||LA21_0==74) ) {
                alt21=1;
            }
            else if ( (LA21_0==CIRCLE||LA21_0==ELLIPSE||LA21_0==RECT||LA21_0==TEXT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:159:8: boolexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_boolexpr_in_expr1086);
                    boolexpr94=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr94.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:160:5: graphicexpr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_graphicexpr_in_expr1092);
                    graphicexpr95=graphicexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, graphicexpr95.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:1: graphicexpr : graphicconst -> ^( DISP graphicconst ) ;
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicconst_return graphicconst96 =null;


        RewriteRuleSubtreeStream stream_graphicconst=new RewriteRuleSubtreeStream(adaptor,"rule graphicconst");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:13: ( graphicconst -> ^( DISP graphicconst ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:17: graphicconst
            {
            pushFollow(FOLLOW_graphicconst_in_graphicexpr1105);
            graphicconst96=graphicconst();

            state._fsp--;

            stream_graphicconst.add(graphicconst96.getTree());

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
            // 163:30: -> ^( DISP graphicconst )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:163:33: ^( DISP graphicconst )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:1: graphicconst : ( RECT ^ FLOAT FLOAT FLOAT FLOAT | CIRCLE ^ FLOAT FLOAT FLOAT | TEXT ^ FLOAT FLOAT STRING | ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT );
    public final AslParser.graphicconst_return graphicconst() throws RecognitionException {
        AslParser.graphicconst_return retval = new AslParser.graphicconst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT97=null;
        Token FLOAT98=null;
        Token FLOAT99=null;
        Token FLOAT100=null;
        Token FLOAT101=null;
        Token CIRCLE102=null;
        Token FLOAT103=null;
        Token FLOAT104=null;
        Token FLOAT105=null;
        Token TEXT106=null;
        Token FLOAT107=null;
        Token FLOAT108=null;
        Token STRING109=null;
        Token ELLIPSE110=null;
        Token FLOAT111=null;
        Token FLOAT112=null;
        Token FLOAT113=null;
        Token FLOAT114=null;

        AslTree RECT97_tree=null;
        AslTree FLOAT98_tree=null;
        AslTree FLOAT99_tree=null;
        AslTree FLOAT100_tree=null;
        AslTree FLOAT101_tree=null;
        AslTree CIRCLE102_tree=null;
        AslTree FLOAT103_tree=null;
        AslTree FLOAT104_tree=null;
        AslTree FLOAT105_tree=null;
        AslTree TEXT106_tree=null;
        AslTree FLOAT107_tree=null;
        AslTree FLOAT108_tree=null;
        AslTree STRING109_tree=null;
        AslTree ELLIPSE110_tree=null;
        AslTree FLOAT111_tree=null;
        AslTree FLOAT112_tree=null;
        AslTree FLOAT113_tree=null;
        AslTree FLOAT114_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:13: ( RECT ^ FLOAT FLOAT FLOAT FLOAT | CIRCLE ^ FLOAT FLOAT FLOAT | TEXT ^ FLOAT FLOAT STRING | ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RECT:
                {
                alt22=1;
                }
                break;
            case CIRCLE:
                {
                alt22=2;
                }
                break;
            case TEXT:
                {
                alt22=3;
                }
                break;
            case ELLIPSE:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:17: RECT ^ FLOAT FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT97=(Token)match(input,RECT,FOLLOW_RECT_in_graphicconst1125); 
                    RECT97_tree = 
                    (AslTree)adaptor.create(RECT97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT97_tree, root_0);


                    FLOAT98=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1128); 
                    FLOAT98_tree = 
                    (AslTree)adaptor.create(FLOAT98)
                    ;
                    adaptor.addChild(root_0, FLOAT98_tree);


                    FLOAT99=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1130); 
                    FLOAT99_tree = 
                    (AslTree)adaptor.create(FLOAT99)
                    ;
                    adaptor.addChild(root_0, FLOAT99_tree);


                    FLOAT100=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1132); 
                    FLOAT100_tree = 
                    (AslTree)adaptor.create(FLOAT100)
                    ;
                    adaptor.addChild(root_0, FLOAT100_tree);


                    FLOAT101=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1134); 
                    FLOAT101_tree = 
                    (AslTree)adaptor.create(FLOAT101)
                    ;
                    adaptor.addChild(root_0, FLOAT101_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:167:6: CIRCLE ^ FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE102=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicconst1141); 
                    CIRCLE102_tree = 
                    (AslTree)adaptor.create(CIRCLE102)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE102_tree, root_0);


                    FLOAT103=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1144); 
                    FLOAT103_tree = 
                    (AslTree)adaptor.create(FLOAT103)
                    ;
                    adaptor.addChild(root_0, FLOAT103_tree);


                    FLOAT104=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1146); 
                    FLOAT104_tree = 
                    (AslTree)adaptor.create(FLOAT104)
                    ;
                    adaptor.addChild(root_0, FLOAT104_tree);


                    FLOAT105=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1148); 
                    FLOAT105_tree = 
                    (AslTree)adaptor.create(FLOAT105)
                    ;
                    adaptor.addChild(root_0, FLOAT105_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:168:6: TEXT ^ FLOAT FLOAT STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT106=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicconst1155); 
                    TEXT106_tree = 
                    (AslTree)adaptor.create(TEXT106)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT106_tree, root_0);


                    FLOAT107=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1158); 
                    FLOAT107_tree = 
                    (AslTree)adaptor.create(FLOAT107)
                    ;
                    adaptor.addChild(root_0, FLOAT107_tree);


                    FLOAT108=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1160); 
                    FLOAT108_tree = 
                    (AslTree)adaptor.create(FLOAT108)
                    ;
                    adaptor.addChild(root_0, FLOAT108_tree);


                    STRING109=(Token)match(input,STRING,FOLLOW_STRING_in_graphicconst1162); 
                    STRING109_tree = 
                    (AslTree)adaptor.create(STRING109)
                    ;
                    adaptor.addChild(root_0, STRING109_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:6: ELLIPSE ^ FLOAT FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE110=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicconst1169); 
                    ELLIPSE110_tree = 
                    (AslTree)adaptor.create(ELLIPSE110)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE110_tree, root_0);


                    FLOAT111=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1172); 
                    FLOAT111_tree = 
                    (AslTree)adaptor.create(FLOAT111)
                    ;
                    adaptor.addChild(root_0, FLOAT111_tree);


                    FLOAT112=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1174); 
                    FLOAT112_tree = 
                    (AslTree)adaptor.create(FLOAT112)
                    ;
                    adaptor.addChild(root_0, FLOAT112_tree);


                    FLOAT113=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1176); 
                    FLOAT113_tree = 
                    (AslTree)adaptor.create(FLOAT113)
                    ;
                    adaptor.addChild(root_0, FLOAT113_tree);


                    FLOAT114=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_graphicconst1178); 
                    FLOAT114_tree = 
                    (AslTree)adaptor.create(FLOAT114)
                    ;
                    adaptor.addChild(root_0, FLOAT114_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR116=null;
        AslParser.boolterm_return boolterm115 =null;

        AslParser.boolterm_return boolterm117 =null;


        AslTree OR116_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr1201);
            boolterm115=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm115.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:26: ( OR ^ boolterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:27: OR ^ boolterm
            	    {
            	    OR116=(Token)match(input,OR,FOLLOW_OR_in_boolexpr1204); 
            	    OR116_tree = 
            	    (AslTree)adaptor.create(OR116)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR116_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr1207);
            	    boolterm117=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm117.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND119=null;
        AslParser.boolfact_return boolfact118 =null;

        AslParser.boolfact_return boolfact120 =null;


        AslTree AND119_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1227);
            boolfact118=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact118.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:22: ( AND ^ boolfact )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:23: AND ^ boolfact
            	    {
            	    AND119=(Token)match(input,AND,FOLLOW_AND_in_boolterm1230); 
            	    AND119_tree = 
            	    (AslTree)adaptor.create(AND119)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND119_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1233);
            	    boolfact120=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact120.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL122=null;
        Token NOT_EQUAL123=null;
        Token LT124=null;
        Token LE125=null;
        Token GT126=null;
        Token GE127=null;
        AslParser.num_expr_return num_expr121 =null;

        AslParser.num_expr_return num_expr128 =null;


        AslTree EQUAL122_tree=null;
        AslTree NOT_EQUAL123_tree=null;
        AslTree LT124_tree=null;
        AslTree LE125_tree=null;
        AslTree GT126_tree=null;
        AslTree GE127_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1253);
            num_expr121=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr121.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQUAL||(LA26_0 >= GE && LA26_0 <= GT)||LA26_0==LE||LA26_0==LT||LA26_0==NOT_EQUAL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt25=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt25=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt25=2;
                        }
                        break;
                    case LT:
                        {
                        alt25=3;
                        }
                        break;
                    case LE:
                        {
                        alt25=4;
                        }
                        break;
                    case GT:
                        {
                        alt25=5;
                        }
                        break;
                    case GE:
                        {
                        alt25=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:24: EQUAL ^
                            {
                            EQUAL122=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1257); 
                            EQUAL122_tree = 
                            (AslTree)adaptor.create(EQUAL122)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL122_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL123=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1262); 
                            NOT_EQUAL123_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL123)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL123_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:46: LT ^
                            {
                            LT124=(Token)match(input,LT,FOLLOW_LT_in_boolfact1267); 
                            LT124_tree = 
                            (AslTree)adaptor.create(LT124)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT124_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:52: LE ^
                            {
                            LE125=(Token)match(input,LE,FOLLOW_LE_in_boolfact1272); 
                            LE125_tree = 
                            (AslTree)adaptor.create(LE125)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE125_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:58: GT ^
                            {
                            GT126=(Token)match(input,GT,FOLLOW_GT_in_boolfact1277); 
                            GT126_tree = 
                            (AslTree)adaptor.create(GT126)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT126_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:64: GE ^
                            {
                            GE127=(Token)match(input,GE,FOLLOW_GE_in_boolfact1282); 
                            GE127_tree = 
                            (AslTree)adaptor.create(GE127)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE127_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1286);
                    num_expr128=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr128.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS130=null;
        Token MINUS131=null;
        AslParser.term_return term129 =null;

        AslParser.term_return term132 =null;


        AslTree PLUS130_tree=null;
        AslTree MINUS131_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1306);
            term129=term();

            state._fsp--;

            adaptor.addChild(root_0, term129.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:18: ( ( PLUS ^| MINUS ^) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:20: ( PLUS ^| MINUS ^)
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PLUS) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==MINUS) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:21: PLUS ^
            	            {
            	            PLUS130=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1311); 
            	            PLUS130_tree = 
            	            (AslTree)adaptor.create(PLUS130)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS130_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:29: MINUS ^
            	            {
            	            MINUS131=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1316); 
            	            MINUS131_tree = 
            	            (AslTree)adaptor.create(MINUS131)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS131_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1320);
            	    term132=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term132.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL134=null;
        Token DIV135=null;
        Token MOD136=null;
        AslParser.factor_return factor133 =null;

        AslParser.factor_return factor137 =null;


        AslTree MUL134_tree=null;
        AslTree DIV135_tree=null;
        AslTree MOD136_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1344);
            factor133=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor133.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DIV||LA30_0==MOD||LA30_0==MUL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:23: MUL ^
            	            {
            	            MUL134=(Token)match(input,MUL,FOLLOW_MUL_in_term1349); 
            	            MUL134_tree = 
            	            (AslTree)adaptor.create(MUL134)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL134_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:30: DIV ^
            	            {
            	            DIV135=(Token)match(input,DIV,FOLLOW_DIV_in_term1354); 
            	            DIV135_tree = 
            	            (AslTree)adaptor.create(DIV135)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV135_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:37: MOD ^
            	            {
            	            MOD136=(Token)match(input,MOD,FOLLOW_MOD_in_term1359); 
            	            MOD136_tree = 
            	            (AslTree)adaptor.create(MOD136)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD136_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1363);
            	    factor137=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor137.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT138=null;
        Token PLUS139=null;
        Token MINUS140=null;
        AslParser.atom_return atom141 =null;


        AslTree NOT138_tree=null;
        AslTree PLUS139_tree=null;
        AslTree MINUS140_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt31=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt31=1;
                    }
                    break;
                case PLUS:
                    {
                    alt31=2;
                    }
                    break;
                case MINUS:
                    {
                    alt31=3;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:14: NOT ^
                    {
                    NOT138=(Token)match(input,NOT,FOLLOW_NOT_in_factor1386); 
                    NOT138_tree = 
                    (AslTree)adaptor.create(NOT138)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT138_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:21: PLUS ^
                    {
                    PLUS139=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1391); 
                    PLUS139_tree = 
                    (AslTree)adaptor.create(PLUS139)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS139_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:29: MINUS ^
                    {
                    MINUS140=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1396); 
                    MINUS140_tree = 
                    (AslTree)adaptor.create(MINUS140)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS140_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1401);
            atom141=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom141.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:1: atom : ( FLOAT | ID | tupla | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token FLOAT142=null;
        Token ID143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        AslParser.tupla_return tupla144 =null;

        AslParser.expr_return expr146 =null;


        AslTree b_tree=null;
        AslTree FLOAT142_tree=null;
        AslTree ID143_tree=null;
        AslTree char_literal145_tree=null;
        AslTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:9: ( FLOAT | ID | tupla | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt33=5;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt33=1;
                }
                break;
            case ID:
                {
                alt33=2;
                }
                break;
            case 74:
                {
                alt33=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt33=4;
                }
                break;
            case 68:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:13: FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FLOAT142=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1426); 
                    FLOAT142_tree = 
                    (AslTree)adaptor.create(FLOAT142)
                    ;
                    adaptor.addChild(root_0, FLOAT142_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:5: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID143=(Token)match(input,ID,FOLLOW_ID_in_atom1432); 
                    ID143_tree = 
                    (AslTree)adaptor.create(ID143)
                    ;
                    adaptor.addChild(root_0, ID143_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:196:11: tupla
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_tupla_in_atom1444);
                    tupla144=tupla();

                    state._fsp--;

                    adaptor.addChild(root_0, tupla144.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:13: (b= TRUE |b= FALSE )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==TRUE) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==FALSE) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1461);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1467);  
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
                    // 197:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal145=(Token)match(input,68,FOLLOW_68_in_atom1499); 

                    pushFollow(FOLLOW_expr_in_atom1502);
                    expr146=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr146.getTree());

                    char_literal147=(Token)match(input,69,FOLLOW_69_in_atom1504); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:1: pair : ID '.' PAIR_INDEX -> ^( PAIR ID PAIR_INDEX ) ;
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
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:6: ( ID '.' PAIR_INDEX -> ^( PAIR ID PAIR_INDEX ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:8: ID '.' PAIR_INDEX
            {
            ID148=(Token)match(input,ID,FOLLOW_ID_in_pair1523);  
            stream_ID.add(ID148);


            char_literal149=(Token)match(input,71,FOLLOW_71_in_pair1525);  
            stream_71.add(char_literal149);


            PAIR_INDEX150=(Token)match(input,PAIR_INDEX,FOLLOW_PAIR_INDEX_in_pair1527);  
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
            // 203:26: -> ^( PAIR ID PAIR_INDEX )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:29: ^( PAIR ID PAIR_INDEX )
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


    public static class component_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "component"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:1: component : '.' PAIR_INDEX ;
    public final AslParser.component_return component() throws RecognitionException {
        AslParser.component_return retval = new AslParser.component_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal151=null;
        Token PAIR_INDEX152=null;

        AslTree char_literal151_tree=null;
        AslTree PAIR_INDEX152_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:12: ( '.' PAIR_INDEX )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:206:16: '.' PAIR_INDEX
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal151=(Token)match(input,71,FOLLOW_71_in_component1551); 
            char_literal151_tree = 
            (AslTree)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            PAIR_INDEX152=(Token)match(input,PAIR_INDEX,FOLLOW_PAIR_INDEX_in_component1553); 
            PAIR_INDEX152_tree = 
            (AslTree)adaptor.create(PAIR_INDEX152)
            ;
            adaptor.addChild(root_0, PAIR_INDEX152_tree);


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
    // $ANTLR end "component"


    public static class tupla_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tupla"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:1: tupla : '{' expr_list '}' -> ^( TUPLA expr_list ) ;
    public final AslParser.tupla_return tupla() throws RecognitionException {
        AslParser.tupla_return retval = new AslParser.tupla_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal153=null;
        Token char_literal155=null;
        AslParser.expr_list_return expr_list154 =null;


        AslTree char_literal153_tree=null;
        AslTree char_literal155_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:7: ( '{' expr_list '}' -> ^( TUPLA expr_list ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:9: '{' expr_list '}'
            {
            char_literal153=(Token)match(input,74,FOLLOW_74_in_tupla1562);  
            stream_74.add(char_literal153);


            pushFollow(FOLLOW_expr_list_in_tupla1564);
            expr_list154=expr_list();

            state._fsp--;

            stream_expr_list.add(expr_list154.getTree());

            char_literal155=(Token)match(input,75,FOLLOW_75_in_tupla1566);  
            stream_75.add(char_literal155);


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
            // 208:27: -> ^( TUPLA expr_list )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:30: ^( TUPLA expr_list )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TUPLA, "TUPLA")
                , root_1);

                adaptor.addChild(root_1, stream_expr_list.nextTree());

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
    // $ANTLR end "tupla"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID156=null;
        Token char_literal157=null;
        Token char_literal159=null;
        AslParser.expr_list_return expr_list158 =null;


        AslTree ID156_tree=null;
        AslTree char_literal157_tree=null;
        AslTree char_literal159_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:13: ID '(' ( expr_list )? ')'
            {
            ID156=(Token)match(input,ID,FOLLOW_ID_in_funcall1586);  
            stream_ID.add(ID156);


            char_literal157=(Token)match(input,68,FOLLOW_68_in_funcall1588);  
            stream_68.add(char_literal157);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:20: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==CIRCLE||LA34_0==ELLIPSE||(LA34_0 >= FALSE && LA34_0 <= FLOAT)||LA34_0==ID||LA34_0==MINUS||LA34_0==NOT||LA34_0==PLUS||LA34_0==RECT||LA34_0==TEXT||LA34_0==TRUE||LA34_0==68||LA34_0==74) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1590);
                    expr_list158=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list158.getTree());

                    }
                    break;

            }


            char_literal159=(Token)match(input,69,FOLLOW_69_in_funcall1593);  
            stream_69.add(char_literal159);


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
            // 211:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:61: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal161=null;
        AslParser.expr_return expr160 =null;

        AslParser.expr_return expr162 =null;


        AslTree char_literal161_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1626);
            expr160=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr160.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==70) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:19: ',' ! expr
            	    {
            	    char_literal161=(Token)match(input,70,FOLLOW_70_in_expr_list1629); 

            	    pushFollow(FOLLOW_expr_in_expr_list1632);
            	    expr162=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr162.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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


 

    public static final BitSet FOLLOW_func_in_prog206 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EOF_in_prog209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func236 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_func239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_params_in_func241 = new BitSet(new long[]{0xCC7E800818000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_block_instructions_in_func243 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_func252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_macro269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_params281 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_paramlist_in_params283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_params286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_paramlist315 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_paramlist318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_67_in_param343 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_param347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_block_instructions407 = new BitSet(new long[]{0xCC7E800818000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_instruction_in_block_instructions409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_assign_in_instruction458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_assign_in_instruction480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transform_in_instruction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_animation_in_instruction650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_instruction666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_transform714 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform717 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform719 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSREL_in_transform729 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform732 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform734 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_transform744 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform747 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform749 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALEREL_in_transform760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform763 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform765 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_transform776 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform779 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform781 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATEREL_in_transform791 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_transform794 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform796 = new BitSet(new long[]{0x1000000008600002L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_transform799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEMENT_in_animation812 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_animation815 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_animation817 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_animation819 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_animation821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATION_in_animation827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_animation830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_animation832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assign848 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_assign850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pair_assign879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_pair_assign881 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_pair_assign883 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_pair_assign887 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_pair_assign889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt915 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_ite_stmt918 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt920 = new BitSet(new long[]{0xCC7E800818000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt923 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt926 = new BitSet(new long[]{0xCC7E800818000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt929 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt956 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_while_stmt959 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_while_stmt961 = new BitSet(new long[]{0xCC7E800818000000L,0x0000000000000104L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt964 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt989 = new BitSet(new long[]{0x1101102208604102L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_return_stmt992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1011 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_read1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1034 = new BitSet(new long[]{0x1181102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_write1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_73_in_set1065 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_65_in_set1068 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_STRING_in_set1072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_set1074 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_boolexpr_in_expr1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_expr1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicconst_in_graphicexpr1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicconst1125 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1128 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1132 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicconst1141 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1144 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1146 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicconst1155 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1158 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1160 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_STRING_in_graphicconst1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicconst1169 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1172 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1174 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1176 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FLOAT_in_graphicconst1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1201 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr1204 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1207 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1227 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1230 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1233 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1253 = new BitSet(new long[]{0x0000004126080002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1257 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1262 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_LT_in_boolfact1267 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_LE_in_boolfact1272 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_GT_in_boolfact1277 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_GE_in_boolfact1282 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1306 = new BitSet(new long[]{0x0000100200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1311 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1316 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_term_in_num_expr1320 = new BitSet(new long[]{0x0000100200000002L});
    public static final BitSet FOLLOW_factor_in_term1344 = new BitSet(new long[]{0x0000001400001002L});
    public static final BitSet FOLLOW_MUL_in_term1349 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_DIV_in_term1354 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MOD_in_term1359 = new BitSet(new long[]{0x1000102208600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_factor_in_term1363 = new BitSet(new long[]{0x0000001400001002L});
    public static final BitSet FOLLOW_NOT_in_factor1386 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_PLUS_in_factor1391 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MINUS_in_factor1396 = new BitSet(new long[]{0x1000000008600000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_factor1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupla_in_atom1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_atom1499 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_atom1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pair1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_pair1525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PAIR_INDEX_in_pair1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_component1551 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PAIR_INDEX_in_component1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_tupla1562 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_list_in_tupla1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_tupla1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcall1588 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000430L});
    public static final BitSet FOLLOW_expr_list_in_funcall1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_funcall1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_list1629 = new BitSet(new long[]{0x1101102208604100L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_expr_list1632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});

}