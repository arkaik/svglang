// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-05-02 09:55:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AND", "ARGLIST", "ARRAY", "ASSIGN", "BOOLEAN", "CIRCLE", "COLOR", "COMMENT", "DISP", "DIV", "DO", "DRAW", "ELLIPSE", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQ", "EQUAL", "ESC_SEQ", "FALSE", "FILL", "FLOAT", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LINE", "LIST_FUNCTIONS", "LIST_INSTR", "LOOP", "LT", "MACRO", "MINUS", "MOD", "MOVEMENT", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RECT", "REL", "RETURN", "ROTATE", "ROTATEREL", "ROTATION", "SCALE", "SCALEREL", "STRING", "STROKE", "TEXT", "THEN", "TIME", "TRANS", "TRANSFORM", "TRANSREL", "TRUE", "WHILE", "WRITE", "WS", "'$SHOW'", "'&'", "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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
    public static final int LINE=36;
    public static final int LIST_FUNCTIONS=37;
    public static final int LIST_INSTR=38;
    public static final int LOOP=39;
    public static final int LT=40;
    public static final int MACRO=41;
    public static final int MINUS=42;
    public static final int MOD=43;
    public static final int MOVEMENT=44;
    public static final int MUL=45;
    public static final int NOT=46;
    public static final int NOT_EQUAL=47;
    public static final int OR=48;
    public static final int PARAMS=49;
    public static final int PLUS=50;
    public static final int PREF=51;
    public static final int PVALUE=52;
    public static final int READ=53;
    public static final int RECT=54;
    public static final int REL=55;
    public static final int RETURN=56;
    public static final int ROTATE=57;
    public static final int ROTATEREL=58;
    public static final int ROTATION=59;
    public static final int SCALE=60;
    public static final int SCALEREL=61;
    public static final int STRING=62;
    public static final int STROKE=63;
    public static final int TEXT=64;
    public static final int THEN=65;
    public static final int TIME=66;
    public static final int TRANS=67;
    public static final int TRANSFORM=68;
    public static final int TRANSREL=69;
    public static final int TRUE=70;
    public static final int WHILE=71;
    public static final int WRITE=72;
    public static final int WS=73;

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

                if ( (LA1_0==FUNC||LA1_0==74) ) {
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:1: func : ( FUNC ^ ID params block_instructions ENDFUNC !| macro -> ^( MACRO macro ) );
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
        RewriteRuleSubtreeStream stream_macro=new RewriteRuleSubtreeStream(adaptor,"rule macro");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:69:6: ( FUNC ^ ID params block_instructions ENDFUNC !| macro -> ^( MACRO macro ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==74) ) {
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
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:70:7: macro
                    {
                    pushFollow(FOLLOW_macro_in_func258);
                    macro8=macro();

                    state._fsp--;

                    stream_macro.add(macro8.getTree());

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
                    // 70:14: -> ^( MACRO macro )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:70:17: ^( MACRO macro )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        AslParser.paramlist_return paramlist10 =null;


        AslTree char_literal9_tree=null;
        AslTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:10: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,76,FOLLOW_76_in_params286);  
            stream_76.add(char_literal9);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==75) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params288);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,77,FOLLOW_77_in_params291);  
            stream_77.add(char_literal11);


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
            // 74:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:74:41: ( paramlist )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal13=null;
        AslParser.param_return param12 =null;

        AslParser.param_return param14 =null;


        AslTree char_literal13_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:10: ( param ( ',' ! param )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist317);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==78) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:78:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,78,FOLLOW_78_in_paramlist320); 

            	    pushFollow(FOLLOW_param_in_paramlist323);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal15=null;

        AslTree id_tree=null;
        AslTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==75) ) {
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:13: '&' id= ID
                    {
                    char_literal15=(Token)match(input,75,FOLLOW_75_in_param348);  
                    stream_75.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param352);  
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
                    // 83:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:83:26: ^( PREF[$id,$id.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param375);  
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
                    // 84:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:84:22: ^( PVALUE[$id,$id.text] )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:88:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal17=null;
        AslParser.instruction_return instruction16 =null;

        AslParser.instruction_return instruction18 =null;


        AslTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions409);
            instruction16=instruction();

            state._fsp--;

            stream_instruction.add(instruction16.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==79) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:89:25: ';' instruction
            	    {
            	    char_literal17=(Token)match(input,79,FOLLOW_79_in_block_instructions412);  
            	    stream_79.add(char_literal17);


            	    pushFollow(FOLLOW_instruction_in_block_instructions414);
            	    instruction18=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction18.getTree());

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
            // 90:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:90:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:94:1: instruction : ( assign | declare | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | draw | fill | stroke | transform -> ^( TRANSFORM transform ) | animation | loop |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign19 =null;

        AslParser.declare_return declare20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;

        AslParser.set_return set27 =null;

        AslParser.draw_return draw28 =null;

        AslParser.fill_return fill29 =null;

        AslParser.stroke_return stroke30 =null;

        AslParser.transform_return transform31 =null;

        AslParser.animation_return animation32 =null;

        AslParser.loop_return loop33 =null;


        RewriteRuleSubtreeStream stream_transform=new RewriteRuleSubtreeStream(adaptor,"rule transform");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:9: ( assign | declare | ite_stmt | while_stmt | funcall | return_stmt | read | write | set | draw | fill | stroke | transform -> ^( TRANSFORM transform ) | animation | loop |)
            int alt7=16;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt7=1;
                    }
                    break;
                case 76:
                    {
                    alt7=5;
                    }
                    break;
                case ABS:
                case REL:
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
            case CIRCLE:
            case ELLIPSE:
            case LINE:
            case RECT:
            case TEXT:
                {
                alt7=2;
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
            case DRAW:
                {
                alt7=10;
                }
                break;
            case FILL:
                {
                alt7=11;
                }
                break;
            case STROKE:
                {
                alt7=12;
                }
                break;
            case ROTATE:
            case ROTATEREL:
            case SCALE:
            case SCALEREL:
            case TRANS:
            case TRANSREL:
                {
                alt7=13;
                }
                break;
            case MOVEMENT:
            case ROTATION:
                {
                alt7=14;
                }
                break;
            case LOOP:
                {
                alt7=15;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 79:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:95:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction463);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:96:11: declare
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_declare_in_instruction485);
                    declare20=declare();

                    state._fsp--;

                    adaptor.addChild(root_0, declare20.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:97:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction499);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:98:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction519);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:99:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction539);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:100:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction560);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 7 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:101:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction577);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:102:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction602);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 9 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:103:11: set
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_set_in_instruction625);
                    set27=set();

                    state._fsp--;

                    adaptor.addChild(root_0, set27.getTree());

                    }
                    break;
                case 10 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:104:11: draw
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_draw_in_instruction641);
                    draw28=draw();

                    state._fsp--;

                    adaptor.addChild(root_0, draw28.getTree());

                    }
                    break;
                case 11 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:105:11: fill
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_fill_in_instruction656);
                    fill29=fill();

                    state._fsp--;

                    adaptor.addChild(root_0, fill29.getTree());

                    }
                    break;
                case 12 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:106:11: stroke
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_stroke_in_instruction668);
                    stroke30=stroke();

                    state._fsp--;

                    adaptor.addChild(root_0, stroke30.getTree());

                    }
                    break;
                case 13 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:107:11: transform
                    {
                    pushFollow(FOLLOW_transform_in_instruction680);
                    transform31=transform();

                    state._fsp--;

                    stream_transform.add(transform31.getTree());

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
                    // 107:21: -> ^( TRANSFORM transform )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:107:24: ^( TRANSFORM transform )
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
                case 14 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:108:11: animation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_animation_in_instruction701);
                    animation32=animation();

                    state._fsp--;

                    adaptor.addChild(root_0, animation32.getTree());

                    }
                    break;
                case 15 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:109:11: loop
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_loop_in_instruction715);
                    loop33=loop();

                    state._fsp--;

                    adaptor.addChild(root_0, loop33.getTree());

                    }
                    break;
                case 16 :
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


    public static class macro_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macro"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:1: macro : '$SHOW' ;
    public final AslParser.macro_return macro() throws RecognitionException {
        AslParser.macro_return retval = new AslParser.macro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal34=null;

        AslTree string_literal34_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:113:9: '$SHOW'
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal34=(Token)match(input,74,FOLLOW_74_in_macro761); 
            string_literal34_tree = 
            (AslTree)adaptor.create(string_literal34)
            ;
            adaptor.addChild(root_0, string_literal34_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:1: loop : LOOP ^ animation ;
    public final AslParser.loop_return loop() throws RecognitionException {
        AslParser.loop_return retval = new AslParser.loop_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token LOOP35=null;
        AslParser.animation_return animation36 =null;


        AslTree LOOP35_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:6: ( LOOP ^ animation )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:117:8: LOOP ^ animation
            {
            root_0 = (AslTree)adaptor.nil();


            LOOP35=(Token)match(input,LOOP,FOLLOW_LOOP_in_loop774); 
            LOOP35_tree = 
            (AslTree)adaptor.create(LOOP35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(LOOP35_tree, root_0);


            pushFollow(FOLLOW_animation_in_loop777);
            animation36=animation();

            state._fsp--;

            adaptor.addChild(root_0, animation36.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:1: transform : ( TRANS ^ ID atom ( FLOAT )? | TRANSREL ^ ID arglist | SCALE ^ ID atom ( FLOAT )? | SCALEREL ^ ID arglist | ROTATE ^ ID atom ( FLOAT )? | ROTATEREL ^ ID arglist );
    public final AslParser.transform_return transform() throws RecognitionException {
        AslParser.transform_return retval = new AslParser.transform_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANS37=null;
        Token ID38=null;
        Token FLOAT40=null;
        Token TRANSREL41=null;
        Token ID42=null;
        Token SCALE44=null;
        Token ID45=null;
        Token FLOAT47=null;
        Token SCALEREL48=null;
        Token ID49=null;
        Token ROTATE51=null;
        Token ID52=null;
        Token FLOAT54=null;
        Token ROTATEREL55=null;
        Token ID56=null;
        AslParser.atom_return atom39 =null;

        AslParser.arglist_return arglist43 =null;

        AslParser.atom_return atom46 =null;

        AslParser.arglist_return arglist50 =null;

        AslParser.atom_return atom53 =null;

        AslParser.arglist_return arglist57 =null;


        AslTree TRANS37_tree=null;
        AslTree ID38_tree=null;
        AslTree FLOAT40_tree=null;
        AslTree TRANSREL41_tree=null;
        AslTree ID42_tree=null;
        AslTree SCALE44_tree=null;
        AslTree ID45_tree=null;
        AslTree FLOAT47_tree=null;
        AslTree SCALEREL48_tree=null;
        AslTree ID49_tree=null;
        AslTree ROTATE51_tree=null;
        AslTree ID52_tree=null;
        AslTree FLOAT54_tree=null;
        AslTree ROTATEREL55_tree=null;
        AslTree ID56_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:11: ( TRANS ^ ID atom ( FLOAT )? | TRANSREL ^ ID arglist | SCALE ^ ID atom ( FLOAT )? | SCALEREL ^ ID arglist | ROTATE ^ ID atom ( FLOAT )? | ROTATEREL ^ ID arglist )
            int alt11=6;
            switch ( input.LA(1) ) {
            case TRANS:
                {
                alt11=1;
                }
                break;
            case TRANSREL:
                {
                alt11=2;
                }
                break;
            case SCALE:
                {
                alt11=3;
                }
                break;
            case SCALEREL:
                {
                alt11=4;
                }
                break;
            case ROTATE:
                {
                alt11=5;
                }
                break;
            case ROTATEREL:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:13: TRANS ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANS37=(Token)match(input,TRANS,FOLLOW_TRANS_in_transform786); 
                    TRANS37_tree = 
                    (AslTree)adaptor.create(TRANS37)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANS37_tree, root_0);


                    ID38=(Token)match(input,ID,FOLLOW_ID_in_transform789); 
                    ID38_tree = 
                    (AslTree)adaptor.create(ID38)
                    ;
                    adaptor.addChild(root_0, ID38_tree);


                    pushFollow(FOLLOW_atom_in_transform791);
                    atom39=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom39.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:28: ( FLOAT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==FLOAT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:120:29: FLOAT
                            {
                            FLOAT40=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform794); 
                            FLOAT40_tree = 
                            (AslTree)adaptor.create(FLOAT40)
                            ;
                            adaptor.addChild(root_0, FLOAT40_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:121:4: TRANSREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TRANSREL41=(Token)match(input,TRANSREL,FOLLOW_TRANSREL_in_transform801); 
                    TRANSREL41_tree = 
                    (AslTree)adaptor.create(TRANSREL41)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TRANSREL41_tree, root_0);


                    ID42=(Token)match(input,ID,FOLLOW_ID_in_transform804); 
                    ID42_tree = 
                    (AslTree)adaptor.create(ID42)
                    ;
                    adaptor.addChild(root_0, ID42_tree);


                    pushFollow(FOLLOW_arglist_in_transform806);
                    arglist43=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist43.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:4: SCALE ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALE44=(Token)match(input,SCALE,FOLLOW_SCALE_in_transform811); 
                    SCALE44_tree = 
                    (AslTree)adaptor.create(SCALE44)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALE44_tree, root_0);


                    ID45=(Token)match(input,ID,FOLLOW_ID_in_transform814); 
                    ID45_tree = 
                    (AslTree)adaptor.create(ID45)
                    ;
                    adaptor.addChild(root_0, ID45_tree);


                    pushFollow(FOLLOW_atom_in_transform816);
                    atom46=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom46.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:19: ( FLOAT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FLOAT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:122:20: FLOAT
                            {
                            FLOAT47=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform819); 
                            FLOAT47_tree = 
                            (AslTree)adaptor.create(FLOAT47)
                            ;
                            adaptor.addChild(root_0, FLOAT47_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:123:4: SCALEREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SCALEREL48=(Token)match(input,SCALEREL,FOLLOW_SCALEREL_in_transform826); 
                    SCALEREL48_tree = 
                    (AslTree)adaptor.create(SCALEREL48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SCALEREL48_tree, root_0);


                    ID49=(Token)match(input,ID,FOLLOW_ID_in_transform829); 
                    ID49_tree = 
                    (AslTree)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


                    pushFollow(FOLLOW_arglist_in_transform831);
                    arglist50=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist50.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:4: ROTATE ^ ID atom ( FLOAT )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATE51=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_transform837); 
                    ROTATE51_tree = 
                    (AslTree)adaptor.create(ROTATE51)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATE51_tree, root_0);


                    ID52=(Token)match(input,ID,FOLLOW_ID_in_transform840); 
                    ID52_tree = 
                    (AslTree)adaptor.create(ID52)
                    ;
                    adaptor.addChild(root_0, ID52_tree);


                    pushFollow(FOLLOW_atom_in_transform842);
                    atom53=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom53.getTree());

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:20: ( FLOAT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==FLOAT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:124:21: FLOAT
                            {
                            FLOAT54=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_transform845); 
                            FLOAT54_tree = 
                            (AslTree)adaptor.create(FLOAT54)
                            ;
                            adaptor.addChild(root_0, FLOAT54_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:125:4: ROTATEREL ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATEREL55=(Token)match(input,ROTATEREL,FOLLOW_ROTATEREL_in_transform852); 
                    ROTATEREL55_tree = 
                    (AslTree)adaptor.create(ROTATEREL55)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATEREL55_tree, root_0);


                    ID56=(Token)match(input,ID,FOLLOW_ID_in_transform855); 
                    ID56_tree = 
                    (AslTree)adaptor.create(ID56)
                    ;
                    adaptor.addChild(root_0, ID56_tree);


                    pushFollow(FOLLOW_arglist_in_transform857);
                    arglist57=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist57.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:1: animation : ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT FLOAT );
    public final AslParser.animation_return animation() throws RecognitionException {
        AslParser.animation_return retval = new AslParser.animation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVEMENT58=null;
        Token ID59=null;
        Token FLOAT60=null;
        Token FLOAT61=null;
        Token FLOAT62=null;
        Token ROTATION63=null;
        Token ID64=null;
        Token FLOAT65=null;
        Token FLOAT66=null;

        AslTree MOVEMENT58_tree=null;
        AslTree ID59_tree=null;
        AslTree FLOAT60_tree=null;
        AslTree FLOAT61_tree=null;
        AslTree FLOAT62_tree=null;
        AslTree ROTATION63_tree=null;
        AslTree ID64_tree=null;
        AslTree FLOAT65_tree=null;
        AslTree FLOAT66_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:11: ( MOVEMENT ^ ID FLOAT FLOAT FLOAT | ROTATION ^ ID FLOAT FLOAT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MOVEMENT) ) {
                alt12=1;
            }
            else if ( (LA12_0==ROTATION) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:129:13: MOVEMENT ^ ID FLOAT FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MOVEMENT58=(Token)match(input,MOVEMENT,FOLLOW_MOVEMENT_in_animation868); 
                    MOVEMENT58_tree = 
                    (AslTree)adaptor.create(MOVEMENT58)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MOVEMENT58_tree, root_0);


                    ID59=(Token)match(input,ID,FOLLOW_ID_in_animation871); 
                    ID59_tree = 
                    (AslTree)adaptor.create(ID59)
                    ;
                    adaptor.addChild(root_0, ID59_tree);


                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation873); 
                    FLOAT60_tree = 
                    (AslTree)adaptor.create(FLOAT60)
                    ;
                    adaptor.addChild(root_0, FLOAT60_tree);


                    FLOAT61=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation875); 
                    FLOAT61_tree = 
                    (AslTree)adaptor.create(FLOAT61)
                    ;
                    adaptor.addChild(root_0, FLOAT61_tree);


                    FLOAT62=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation877); 
                    FLOAT62_tree = 
                    (AslTree)adaptor.create(FLOAT62)
                    ;
                    adaptor.addChild(root_0, FLOAT62_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:130:4: ROTATION ^ ID FLOAT FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ROTATION63=(Token)match(input,ROTATION,FOLLOW_ROTATION_in_animation882); 
                    ROTATION63_tree = 
                    (AslTree)adaptor.create(ROTATION63)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ROTATION63_tree, root_0);


                    ID64=(Token)match(input,ID,FOLLOW_ID_in_animation885); 
                    ID64_tree = 
                    (AslTree)adaptor.create(ID64)
                    ;
                    adaptor.addChild(root_0, ID64_tree);


                    FLOAT65=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation887); 
                    FLOAT65_tree = 
                    (AslTree)adaptor.create(FLOAT65)
                    ;
                    adaptor.addChild(root_0, FLOAT65_tree);


                    FLOAT66=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_animation889); 
                    FLOAT66_tree = 
                    (AslTree)adaptor.create(FLOAT66)
                    ;
                    adaptor.addChild(root_0, FLOAT66_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:134:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID67=null;
        AslParser.expr_return expr68 =null;


        AslTree eq_tree=null;
        AslTree ID67_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:134:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:134:10: ID eq= EQUAL expr
            {
            ID67=(Token)match(input,ID,FOLLOW_ID_in_assign900);  
            stream_ID.add(ID67);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign904);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign906);
            expr68=expr();

            state._fsp--;

            stream_expr.add(expr68.getTree());

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
            // 134:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:134:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:1: declare : graphicexpr ;
    public final AslParser.declare_return declare() throws RecognitionException {
        AslParser.declare_return retval = new AslParser.declare_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicexpr_return graphicexpr69 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:9: ( graphicexpr )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:137:11: graphicexpr
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_graphicexpr_in_declare934);
            graphicexpr69=graphicexpr();

            state._fsp--;

            adaptor.addChild(root_0, graphicexpr69.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:140:1: draw : DRAW ^ ID ;
    public final AslParser.draw_return draw() throws RecognitionException {
        AslParser.draw_return retval = new AslParser.draw_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DRAW70=null;
        Token ID71=null;

        AslTree DRAW70_tree=null;
        AslTree ID71_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:140:6: ( DRAW ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:140:8: DRAW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            DRAW70=(Token)match(input,DRAW,FOLLOW_DRAW_in_draw945); 
            DRAW70_tree = 
            (AslTree)adaptor.create(DRAW70)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DRAW70_tree, root_0);


            ID71=(Token)match(input,ID,FOLLOW_ID_in_draw948); 
            ID71_tree = 
            (AslTree)adaptor.create(ID71)
            ;
            adaptor.addChild(root_0, ID71_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:143:1: fill : FILL ^ ID COLOR ;
    public final AslParser.fill_return fill() throws RecognitionException {
        AslParser.fill_return retval = new AslParser.fill_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FILL72=null;
        Token ID73=null;
        Token COLOR74=null;

        AslTree FILL72_tree=null;
        AslTree ID73_tree=null;
        AslTree COLOR74_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:143:6: ( FILL ^ ID COLOR )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:143:8: FILL ^ ID COLOR
            {
            root_0 = (AslTree)adaptor.nil();


            FILL72=(Token)match(input,FILL,FOLLOW_FILL_in_fill959); 
            FILL72_tree = 
            (AslTree)adaptor.create(FILL72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FILL72_tree, root_0);


            ID73=(Token)match(input,ID,FOLLOW_ID_in_fill962); 
            ID73_tree = 
            (AslTree)adaptor.create(ID73)
            ;
            adaptor.addChild(root_0, ID73_tree);


            COLOR74=(Token)match(input,COLOR,FOLLOW_COLOR_in_fill964); 
            COLOR74_tree = 
            (AslTree)adaptor.create(COLOR74)
            ;
            adaptor.addChild(root_0, COLOR74_tree);


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


    public static class stroke_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stroke"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:1: stroke : STROKE ^ ID COLOR INT ;
    public final AslParser.stroke_return stroke() throws RecognitionException {
        AslParser.stroke_return retval = new AslParser.stroke_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token STROKE75=null;
        Token ID76=null;
        Token COLOR77=null;
        Token INT78=null;

        AslTree STROKE75_tree=null;
        AslTree ID76_tree=null;
        AslTree COLOR77_tree=null;
        AslTree INT78_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:8: ( STROKE ^ ID COLOR INT )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:146:10: STROKE ^ ID COLOR INT
            {
            root_0 = (AslTree)adaptor.nil();


            STROKE75=(Token)match(input,STROKE,FOLLOW_STROKE_in_stroke977); 
            STROKE75_tree = 
            (AslTree)adaptor.create(STROKE75)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(STROKE75_tree, root_0);


            ID76=(Token)match(input,ID,FOLLOW_ID_in_stroke980); 
            ID76_tree = 
            (AslTree)adaptor.create(ID76)
            ;
            adaptor.addChild(root_0, ID76_tree);


            COLOR77=(Token)match(input,COLOR,FOLLOW_COLOR_in_stroke982); 
            COLOR77_tree = 
            (AslTree)adaptor.create(COLOR77)
            ;
            adaptor.addChild(root_0, COLOR77_tree);


            INT78=(Token)match(input,INT,FOLLOW_INT_in_stroke984); 
            INT78_tree = 
            (AslTree)adaptor.create(INT78)
            ;
            adaptor.addChild(root_0, INT78_tree);


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
    // $ANTLR end "stroke"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF79=null;
        Token THEN81=null;
        Token ELSE83=null;
        Token ENDIF85=null;
        AslParser.expr_return expr80 =null;

        AslParser.block_instructions_return block_instructions82 =null;

        AslParser.block_instructions_return block_instructions84 =null;


        AslTree IF79_tree=null;
        AslTree THEN81_tree=null;
        AslTree ELSE83_tree=null;
        AslTree ENDIF85_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF79=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt996); 
            IF79_tree = 
            (AslTree)adaptor.create(IF79)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF79_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt999);
            expr80=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr80.getTree());

            THEN81=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt1001); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1004);
            block_instructions82=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions82.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:46: ( ELSE ! block_instructions )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ELSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:150:47: ELSE ! block_instructions
                    {
                    ELSE83=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1007); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1010);
                    block_instructions84=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions84.getTree());

                    }
                    break;

            }


            ENDIF85=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt1014); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE86=null;
        Token DO88=null;
        Token ENDWHILE90=null;
        AslParser.expr_return expr87 =null;

        AslParser.block_instructions_return block_instructions89 =null;


        AslTree WHILE86_tree=null;
        AslTree DO88_tree=null;
        AslTree ENDWHILE90_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:154:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE86=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1037); 
            WHILE86_tree = 
            (AslTree)adaptor.create(WHILE86)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE86_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1040);
            expr87=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr87.getTree());

            DO88=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1042); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1045);
            block_instructions89=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions89.getTree());

            ENDWHILE90=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1047); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN91=null;
        AslParser.expr_return expr92 =null;


        AslTree RETURN91_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:13: ( RETURN ^ ( expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN91=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1070); 
            RETURN91_tree = 
            (AslTree)adaptor.create(RETURN91)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN91_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:23: ( expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FALSE||LA14_0==FLOAT||LA14_0==ID||LA14_0==INT||LA14_0==MINUS||LA14_0==NOT||LA14_0==PLUS||LA14_0==TRUE||LA14_0==76||LA14_0==80) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:158:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1073);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ93=null;
        Token ID94=null;

        AslTree READ93_tree=null;
        AslTree ID94_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:6: ( READ ^ ID )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:162:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ93=(Token)match(input,READ,FOLLOW_READ_in_read1092); 
            READ93_tree = 
            (AslTree)adaptor.create(READ93)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ93_tree, root_0);


            ID94=(Token)match(input,ID,FOLLOW_ID_in_read1095); 
            ID94_tree = 
            (AslTree)adaptor.create(ID94)
            ;
            adaptor.addChild(root_0, ID94_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE95=null;
        Token STRING97=null;
        AslParser.expr_return expr96 =null;


        AslTree WRITE95_tree=null;
        AslTree STRING97_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:7: ( WRITE ^ ( expr | STRING ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE95=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1115); 
            WRITE95_tree = 
            (AslTree)adaptor.create(WRITE95)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE95_tree, root_0);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:18: ( expr | STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FALSE||LA15_0==FLOAT||LA15_0==ID||LA15_0==INT||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==TRUE||LA15_0==76||LA15_0==80) ) {
                alt15=1;
            }
            else if ( (LA15_0==STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1119);
                    expr96=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr96.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:166:26: STRING
                    {
                    STRING97=(Token)match(input,STRING,FOLLOW_STRING_in_write1123); 
                    STRING97_tree = 
                    (AslTree)adaptor.create(STRING97)
                    ;
                    adaptor.addChild(root_0, STRING97_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:1: set : ID ( REL ^| ABS ^) ID arglist ( time )? ;
    public final AslParser.set_return set() throws RecognitionException {
        AslParser.set_return retval = new AslParser.set_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID98=null;
        Token REL99=null;
        Token ABS100=null;
        Token ID101=null;
        AslParser.arglist_return arglist102 =null;

        AslParser.time_return time103 =null;


        AslTree ID98_tree=null;
        AslTree REL99_tree=null;
        AslTree ABS100_tree=null;
        AslTree ID101_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:6: ( ID ( REL ^| ABS ^) ID arglist ( time )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:8: ID ( REL ^| ABS ^) ID arglist ( time )?
            {
            root_0 = (AslTree)adaptor.nil();


            ID98=(Token)match(input,ID,FOLLOW_ID_in_set1143); 
            ID98_tree = 
            (AslTree)adaptor.create(ID98)
            ;
            adaptor.addChild(root_0, ID98_tree);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:11: ( REL ^| ABS ^)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==REL) ) {
                alt16=1;
            }
            else if ( (LA16_0==ABS) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:12: REL ^
                    {
                    REL99=(Token)match(input,REL,FOLLOW_REL_in_set1146); 
                    REL99_tree = 
                    (AslTree)adaptor.create(REL99)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(REL99_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:17: ABS ^
                    {
                    ABS100=(Token)match(input,ABS,FOLLOW_ABS_in_set1149); 
                    ABS100_tree = 
                    (AslTree)adaptor.create(ABS100)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ABS100_tree, root_0);


                    }
                    break;

            }


            ID101=(Token)match(input,ID,FOLLOW_ID_in_set1153); 
            ID101_tree = 
            (AslTree)adaptor.create(ID101)
            ;
            adaptor.addChild(root_0, ID101_tree);


            pushFollow(FOLLOW_arglist_in_set1155);
            arglist102=arglist();

            state._fsp--;

            adaptor.addChild(root_0, arglist102.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:34: ( time )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==82) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:169:34: time
                    {
                    pushFollow(FOLLOW_time_in_set1157);
                    time103=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time103.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:1: time : '{' expr ( ',' expr )? '}' -> ^( TIME expr ( expr )? ) ;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        AslParser.expr_return expr105 =null;

        AslParser.expr_return expr107 =null;


        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:6: ( '{' expr ( ',' expr )? '}' -> ^( TIME expr ( expr )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:9: '{' expr ( ',' expr )? '}'
            {
            char_literal104=(Token)match(input,82,FOLLOW_82_in_time1170);  
            stream_82.add(char_literal104);


            pushFollow(FOLLOW_expr_in_time1172);
            expr105=expr();

            state._fsp--;

            stream_expr.add(expr105.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:18: ( ',' expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==78) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:19: ',' expr
                    {
                    char_literal106=(Token)match(input,78,FOLLOW_78_in_time1175);  
                    stream_78.add(char_literal106);


                    pushFollow(FOLLOW_expr_in_time1177);
                    expr107=expr();

                    state._fsp--;

                    stream_expr.add(expr107.getTree());

                    }
                    break;

            }


            char_literal108=(Token)match(input,83,FOLLOW_83_in_time1181);  
            stream_83.add(char_literal108);


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
            // 172:34: -> ^( TIME expr ( expr )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:37: ^( TIME expr ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIME, "TIME")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:49: ( expr )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:1: expr : boolexpr ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.boolexpr_return boolexpr109 =null;



        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:6: ( boolexpr )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:8: boolexpr
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolexpr_in_expr1201);
            boolexpr109=boolexpr();

            state._fsp--;

            adaptor.addChild(root_0, boolexpr109.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:1: graphicexpr : graphicconst -> ^( DISP graphicconst ) ;
    public final AslParser.graphicexpr_return graphicexpr() throws RecognitionException {
        AslParser.graphicexpr_return retval = new AslParser.graphicexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.graphicconst_return graphicconst110 =null;


        RewriteRuleSubtreeStream stream_graphicconst=new RewriteRuleSubtreeStream(adaptor,"rule graphicconst");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:13: ( graphicconst -> ^( DISP graphicconst ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:17: graphicconst
            {
            pushFollow(FOLLOW_graphicconst_in_graphicexpr1217);
            graphicconst110=graphicconst();

            state._fsp--;

            stream_graphicconst.add(graphicconst110.getTree());

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
            // 178:30: -> ^( DISP graphicconst )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:33: ^( DISP graphicconst )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:1: graphicconst : ( RECT ^ ID arglist | CIRCLE ^ ID arglist | TEXT ^ ID arglist | ELLIPSE ^ ID arglist | LINE ^ ID arglist );
    public final AslParser.graphicconst_return graphicconst() throws RecognitionException {
        AslParser.graphicconst_return retval = new AslParser.graphicconst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECT111=null;
        Token ID112=null;
        Token CIRCLE114=null;
        Token ID115=null;
        Token TEXT117=null;
        Token ID118=null;
        Token ELLIPSE120=null;
        Token ID121=null;
        Token LINE123=null;
        Token ID124=null;
        AslParser.arglist_return arglist113 =null;

        AslParser.arglist_return arglist116 =null;

        AslParser.arglist_return arglist119 =null;

        AslParser.arglist_return arglist122 =null;

        AslParser.arglist_return arglist125 =null;


        AslTree RECT111_tree=null;
        AslTree ID112_tree=null;
        AslTree CIRCLE114_tree=null;
        AslTree ID115_tree=null;
        AslTree TEXT117_tree=null;
        AslTree ID118_tree=null;
        AslTree ELLIPSE120_tree=null;
        AslTree ID121_tree=null;
        AslTree LINE123_tree=null;
        AslTree ID124_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:13: ( RECT ^ ID arglist | CIRCLE ^ ID arglist | TEXT ^ ID arglist | ELLIPSE ^ ID arglist | LINE ^ ID arglist )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RECT:
                {
                alt19=1;
                }
                break;
            case CIRCLE:
                {
                alt19=2;
                }
                break;
            case TEXT:
                {
                alt19=3;
                }
                break;
            case ELLIPSE:
                {
                alt19=4;
                }
                break;
            case LINE:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:17: RECT ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RECT111=(Token)match(input,RECT,FOLLOW_RECT_in_graphicconst1237); 
                    RECT111_tree = 
                    (AslTree)adaptor.create(RECT111)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RECT111_tree, root_0);


                    ID112=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1240); 
                    ID112_tree = 
                    (AslTree)adaptor.create(ID112)
                    ;
                    adaptor.addChild(root_0, ID112_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1242);
                    arglist113=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist113.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:6: CIRCLE ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CIRCLE114=(Token)match(input,CIRCLE,FOLLOW_CIRCLE_in_graphicconst1249); 
                    CIRCLE114_tree = 
                    (AslTree)adaptor.create(CIRCLE114)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CIRCLE114_tree, root_0);


                    ID115=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1252); 
                    ID115_tree = 
                    (AslTree)adaptor.create(ID115)
                    ;
                    adaptor.addChild(root_0, ID115_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1254);
                    arglist116=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist116.getTree());

                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:183:6: TEXT ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    TEXT117=(Token)match(input,TEXT,FOLLOW_TEXT_in_graphicconst1261); 
                    TEXT117_tree = 
                    (AslTree)adaptor.create(TEXT117)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(TEXT117_tree, root_0);


                    ID118=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1264); 
                    ID118_tree = 
                    (AslTree)adaptor.create(ID118)
                    ;
                    adaptor.addChild(root_0, ID118_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1266);
                    arglist119=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist119.getTree());

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:6: ELLIPSE ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ELLIPSE120=(Token)match(input,ELLIPSE,FOLLOW_ELLIPSE_in_graphicconst1273); 
                    ELLIPSE120_tree = 
                    (AslTree)adaptor.create(ELLIPSE120)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELLIPSE120_tree, root_0);


                    ID121=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1276); 
                    ID121_tree = 
                    (AslTree)adaptor.create(ID121)
                    ;
                    adaptor.addChild(root_0, ID121_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1278);
                    arglist122=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist122.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:6: LINE ^ ID arglist
                    {
                    root_0 = (AslTree)adaptor.nil();


                    LINE123=(Token)match(input,LINE,FOLLOW_LINE_in_graphicconst1285); 
                    LINE123_tree = 
                    (AslTree)adaptor.create(LINE123)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LINE123_tree, root_0);


                    ID124=(Token)match(input,ID,FOLLOW_ID_in_graphicconst1288); 
                    ID124_tree = 
                    (AslTree)adaptor.create(ID124)
                    ;
                    adaptor.addChild(root_0, ID124_tree);


                    pushFollow(FOLLOW_arglist_in_graphicconst1290);
                    arglist125=arglist();

                    state._fsp--;

                    adaptor.addChild(root_0, arglist125.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:1: boolexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.boolexpr_return boolexpr() throws RecognitionException {
        AslParser.boolexpr_return retval = new AslParser.boolexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR127=null;
        AslParser.boolterm_return boolterm126 =null;

        AslParser.boolterm_return boolterm128 =null;


        AslTree OR127_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:13: ( boolterm ( OR ^ boolterm )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:17: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexpr1313);
            boolterm126=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm126.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:26: ( OR ^ boolterm )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:27: OR ^ boolterm
            	    {
            	    OR127=(Token)match(input,OR,FOLLOW_OR_in_boolexpr1316); 
            	    OR127_tree = 
            	    (AslTree)adaptor.create(OR127)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR127_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolexpr1319);
            	    boolterm128=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm128.getTree());

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
    // $ANTLR end "boolexpr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND130=null;
        AslParser.boolfact_return boolfact129 =null;

        AslParser.boolfact_return boolfact131 =null;


        AslTree AND130_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:9: ( boolfact ( AND ^ boolfact )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1339);
            boolfact129=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact129.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:22: ( AND ^ boolfact )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:23: AND ^ boolfact
            	    {
            	    AND130=(Token)match(input,AND,FOLLOW_AND_in_boolterm1342); 
            	    AND130_tree = 
            	    (AslTree)adaptor.create(AND130)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND130_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1345);
            	    boolfact131=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact131.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:1: boolfact : num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQ133=null;
        Token NOT_EQUAL134=null;
        Token LT135=null;
        Token LE136=null;
        Token GT137=null;
        Token GE138=null;
        AslParser.num_expr_return num_expr132 =null;

        AslParser.num_expr_return num_expr139 =null;


        AslTree EQ133_tree=null;
        AslTree NOT_EQUAL134_tree=null;
        AslTree LT135_tree=null;
        AslTree LE136_tree=null;
        AslTree GT137_tree=null;
        AslTree GE138_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:9: ( num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:13: num_expr ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1365);
            num_expr132=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr132.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:22: ( ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EQ||(LA23_0 >= GE && LA23_0 <= GT)||LA23_0==LE||LA23_0==LT||LA23_0==NOT_EQUAL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:23: ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:23: ( EQ ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt22=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt22=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt22=2;
                        }
                        break;
                    case LT:
                        {
                        alt22=3;
                        }
                        break;
                    case LE:
                        {
                        alt22=4;
                        }
                        break;
                    case GT:
                        {
                        alt22=5;
                        }
                        break;
                    case GE:
                        {
                        alt22=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:24: EQ ^
                            {
                            EQ133=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1369); 
                            EQ133_tree = 
                            (AslTree)adaptor.create(EQ133)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQ133_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:30: NOT_EQUAL ^
                            {
                            NOT_EQUAL134=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1374); 
                            NOT_EQUAL134_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL134)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL134_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:43: LT ^
                            {
                            LT135=(Token)match(input,LT,FOLLOW_LT_in_boolfact1379); 
                            LT135_tree = 
                            (AslTree)adaptor.create(LT135)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT135_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:49: LE ^
                            {
                            LE136=(Token)match(input,LE,FOLLOW_LE_in_boolfact1384); 
                            LE136_tree = 
                            (AslTree)adaptor.create(LE136)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE136_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:55: GT ^
                            {
                            GT137=(Token)match(input,GT,FOLLOW_GT_in_boolfact1389); 
                            GT137_tree = 
                            (AslTree)adaptor.create(GT137)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT137_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:61: GE ^
                            {
                            GE138=(Token)match(input,GE,FOLLOW_GE_in_boolfact1394); 
                            GE138_tree = 
                            (AslTree)adaptor.create(GE138)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE138_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1398);
                    num_expr139=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr139.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS141=null;
        Token MINUS142=null;
        AslParser.term_return term140 =null;

        AslParser.term_return term143 =null;


        AslTree PLUS141_tree=null;
        AslTree MINUS142_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1418);
            term140=term();

            state._fsp--;

            adaptor.addChild(root_0, term140.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:18: ( ( PLUS ^| MINUS ^) term )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:20: ( PLUS ^| MINUS ^)
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==PLUS) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==MINUS) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:21: PLUS ^
            	            {
            	            PLUS141=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1423); 
            	            PLUS141_tree = 
            	            (AslTree)adaptor.create(PLUS141)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS141_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:29: MINUS ^
            	            {
            	            MINUS142=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1428); 
            	            MINUS142_tree = 
            	            (AslTree)adaptor.create(MINUS142)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS142_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1432);
            	    term143=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term143.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL145=null;
        Token DIV146=null;
        Token MOD147=null;
        AslParser.factor_return factor144 =null;

        AslParser.factor_return factor148 =null;


        AslTree MUL145_tree=null;
        AslTree DIV146_tree=null;
        AslTree MOD147_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1456);
            factor144=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor144.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIV||LA27_0==MOD||LA27_0==MUL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:23: MUL ^
            	            {
            	            MUL145=(Token)match(input,MUL,FOLLOW_MUL_in_term1461); 
            	            MUL145_tree = 
            	            (AslTree)adaptor.create(MUL145)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL145_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:30: DIV ^
            	            {
            	            DIV146=(Token)match(input,DIV,FOLLOW_DIV_in_term1466); 
            	            DIV146_tree = 
            	            (AslTree)adaptor.create(DIV146)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV146_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:37: MOD ^
            	            {
            	            MOD147=(Token)match(input,MOD,FOLLOW_MOD_in_term1471); 
            	            MOD147_tree = 
            	            (AslTree)adaptor.create(MOD147)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD147_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1475);
            	    factor148=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor148.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:1: factor : ( ( NOT ^| PLUS ^| MINUS ^) factor | atom );
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT149=null;
        Token PLUS150=null;
        Token MINUS151=null;
        AslParser.factor_return factor152 =null;

        AslParser.atom_return atom153 =null;


        AslTree NOT149_tree=null;
        AslTree PLUS150_tree=null;
        AslTree MINUS151_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:9: ( ( NOT ^| PLUS ^| MINUS ^) factor | atom )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==MINUS||LA29_0==NOT||LA29_0==PLUS) ) {
                alt29=1;
            }
            else if ( (LA29_0==FALSE||LA29_0==FLOAT||LA29_0==ID||LA29_0==INT||LA29_0==TRUE||LA29_0==76||LA29_0==80) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:13: ( NOT ^| PLUS ^| MINUS ^) factor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:13: ( NOT ^| PLUS ^| MINUS ^)
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case NOT:
                        {
                        alt28=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt28=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }

                    switch (alt28) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:14: NOT ^
                            {
                            NOT149=(Token)match(input,NOT,FOLLOW_NOT_in_factor1498); 
                            NOT149_tree = 
                            (AslTree)adaptor.create(NOT149)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT149_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:21: PLUS ^
                            {
                            PLUS150=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1503); 
                            PLUS150_tree = 
                            (AslTree)adaptor.create(PLUS150)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(PLUS150_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:29: MINUS ^
                            {
                            MINUS151=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1508); 
                            MINUS151_tree = 
                            (AslTree)adaptor.create(MINUS151)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(MINUS151_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_factor_in_factor1512);
                    factor152=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor152.getTree());

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:205:13: atom
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_factor1526);
                    atom153=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom153.getTree());

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:1: atom : ( ID | FLOAT | INT | array | arrayacc | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! boolexpr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID154=null;
        Token FLOAT155=null;
        Token INT156=null;
        Token char_literal160=null;
        Token char_literal162=null;
        AslParser.array_return array157 =null;

        AslParser.arrayacc_return arrayacc158 =null;

        AslParser.funcall_return funcall159 =null;

        AslParser.boolexpr_return boolexpr161 =null;


        AslTree b_tree=null;
        AslTree ID154_tree=null;
        AslTree FLOAT155_tree=null;
        AslTree INT156_tree=null;
        AslTree char_literal160_tree=null;
        AslTree char_literal162_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:9: ( ID | FLOAT | INT | array | arrayacc | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! boolexpr ')' !)
            int alt31=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 80:
                    {
                    alt31=5;
                    }
                    break;
                case 76:
                    {
                    alt31=7;
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
                case 77:
                case 78:
                case 79:
                case 81:
                case 83:
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
            case FLOAT:
                {
                alt31=2;
                }
                break;
            case INT:
                {
                alt31=3;
                }
                break;
            case 80:
                {
                alt31=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt31=6;
                }
                break;
            case 76:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:211:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID154=(Token)match(input,ID,FOLLOW_ID_in_atom1551); 
                    ID154_tree = 
                    (AslTree)adaptor.create(ID154)
                    ;
                    adaptor.addChild(root_0, ID154_tree);


                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:5: FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FLOAT155=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1557); 
                    FLOAT155_tree = 
                    (AslTree)adaptor.create(FLOAT155)
                    ;
                    adaptor.addChild(root_0, FLOAT155_tree);


                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:213:5: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT156=(Token)match(input,INT,FOLLOW_INT_in_atom1563); 
                    INT156_tree = 
                    (AslTree)adaptor.create(INT156)
                    ;
                    adaptor.addChild(root_0, INT156_tree);


                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:214:5: array
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_atom1569);
                    array157=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array157.getTree());

                    }
                    break;
                case 5 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:5: arrayacc
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayacc_in_atom1575);
                    arrayacc158=arrayacc();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayacc158.getTree());

                    }
                    break;
                case 6 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:13: (b= TRUE |b= FALSE )
                    {
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:13: (b= TRUE |b= FALSE )
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
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1592);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1598);  
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
                    // 216:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1621);
                    funcall159=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall159.getTree());

                    }
                    break;
                case 8 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:13: '(' ! boolexpr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal160=(Token)match(input,76,FOLLOW_76_in_atom1635); 

                    pushFollow(FOLLOW_boolexpr_in_atom1638);
                    boolexpr161=boolexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexpr161.getTree());

                    char_literal162=(Token)match(input,77,FOLLOW_77_in_atom1640); 

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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:1: array : '[' atom ( ',' atom )* ']' -> ^( ARRAY ( atom )+ ) ;
    public final AslParser.array_return array() throws RecognitionException {
        AslParser.array_return retval = new AslParser.array_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal163=null;
        Token char_literal165=null;
        Token char_literal167=null;
        AslParser.atom_return atom164 =null;

        AslParser.atom_return atom166 =null;


        AslTree char_literal163_tree=null;
        AslTree char_literal165_tree=null;
        AslTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:7: ( '[' atom ( ',' atom )* ']' -> ^( ARRAY ( atom )+ ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:9: '[' atom ( ',' atom )* ']'
            {
            char_literal163=(Token)match(input,80,FOLLOW_80_in_array1659);  
            stream_80.add(char_literal163);


            pushFollow(FOLLOW_atom_in_array1661);
            atom164=atom();

            state._fsp--;

            stream_atom.add(atom164.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:18: ( ',' atom )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==78) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:19: ',' atom
            	    {
            	    char_literal165=(Token)match(input,78,FOLLOW_78_in_array1664);  
            	    stream_78.add(char_literal165);


            	    pushFollow(FOLLOW_atom_in_array1666);
            	    atom166=atom();

            	    state._fsp--;

            	    stream_atom.add(atom166.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            char_literal167=(Token)match(input,81,FOLLOW_81_in_array1670);  
            stream_81.add(char_literal167);


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
            // 222:34: -> ^( ARRAY ( atom )+ )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:37: ^( ARRAY ( atom )+ )
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:1: arrayacc : ID '[' INT ']' ;
    public final AslParser.arrayacc_return arrayacc() throws RecognitionException {
        AslParser.arrayacc_return retval = new AslParser.arrayacc_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID168=null;
        Token char_literal169=null;
        Token INT170=null;
        Token char_literal171=null;

        AslTree ID168_tree=null;
        AslTree char_literal169_tree=null;
        AslTree INT170_tree=null;
        AslTree char_literal171_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:2: ( ID '[' INT ']' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:4: ID '[' INT ']'
            {
            root_0 = (AslTree)adaptor.nil();


            ID168=(Token)match(input,ID,FOLLOW_ID_in_arrayacc1689); 
            ID168_tree = 
            (AslTree)adaptor.create(ID168)
            ;
            adaptor.addChild(root_0, ID168_tree);


            char_literal169=(Token)match(input,80,FOLLOW_80_in_arrayacc1691); 
            char_literal169_tree = 
            (AslTree)adaptor.create(char_literal169)
            ;
            adaptor.addChild(root_0, char_literal169_tree);


            INT170=(Token)match(input,INT,FOLLOW_INT_in_arrayacc1693); 
            INT170_tree = 
            (AslTree)adaptor.create(INT170)
            ;
            adaptor.addChild(root_0, INT170_tree);


            char_literal171=(Token)match(input,81,FOLLOW_81_in_arrayacc1695); 
            char_literal171_tree = 
            (AslTree)adaptor.create(char_literal171)
            ;
            adaptor.addChild(root_0, char_literal171_tree);


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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        AslParser.expr_list_return expr_list174 =null;


        AslTree ID172_tree=null;
        AslTree char_literal173_tree=null;
        AslTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:13: ID '(' ( expr_list )? ')'
            {
            ID172=(Token)match(input,ID,FOLLOW_ID_in_funcall1708);  
            stream_ID.add(ID172);


            char_literal173=(Token)match(input,76,FOLLOW_76_in_funcall1710);  
            stream_76.add(char_literal173);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:20: ( expr_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FALSE||LA33_0==FLOAT||LA33_0==ID||LA33_0==INT||LA33_0==MINUS||LA33_0==NOT||LA33_0==PLUS||LA33_0==TRUE||LA33_0==76||LA33_0==80) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1712);
                    expr_list174=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list174.getTree());

                    }
                    break;

            }


            char_literal175=(Token)match(input,77,FOLLOW_77_in_funcall1715);  
            stream_77.add(char_literal175);


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
            // 229:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:61: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:232:1: arglist : '(' ( expr_list )? ')' -> ^( ARGLIST ( expr_list )? ) ;
    public final AslParser.arglist_return arglist() throws RecognitionException {
        AslParser.arglist_return retval = new AslParser.arglist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal176=null;
        Token char_literal178=null;
        AslParser.expr_list_return expr_list177 =null;


        AslTree char_literal176_tree=null;
        AslTree char_literal178_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:2: ( '(' ( expr_list )? ')' -> ^( ARGLIST ( expr_list )? ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:4: '(' ( expr_list )? ')'
            {
            char_literal176=(Token)match(input,76,FOLLOW_76_in_arglist1748);  
            stream_76.add(char_literal176);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:8: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FALSE||LA34_0==FLOAT||LA34_0==ID||LA34_0==INT||LA34_0==MINUS||LA34_0==NOT||LA34_0==PLUS||LA34_0==TRUE||LA34_0==76||LA34_0==80) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:8: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_arglist1750);
                    expr_list177=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list177.getTree());

                    }
                    break;

            }


            char_literal178=(Token)match(input,77,FOLLOW_77_in_arglist1753);  
            stream_77.add(char_literal178);


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
            // 233:23: -> ^( ARGLIST ( expr_list )? )
            {
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:26: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:36: ( expr_list )?
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
    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal180=null;
        AslParser.expr_return expr179 =null;

        AslParser.expr_return expr181 =null;


        AslTree char_literal180_tree=null;

        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:10: ( expr ( ',' ! expr )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1772);
            expr179=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr179.getTree());

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==78) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:19: ',' ! expr
            	    {
            	    char_literal180=(Token)match(input,78,FOLLOW_78_in_expr_list1775); 

            	    pushFollow(FOLLOW_expr_in_expr_list1778);
            	    expr181=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr181.getTree());

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


 

    public static final BitSet FOLLOW_func_in_prog210 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EOF_in_prog213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func240 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_func243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_params_in_func245 = new BitSet(new long[]{0xBF60109304030400L,0x00000000000081A9L});
    public static final BitSet FOLLOW_block_instructions_in_func247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macro_in_func258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_params286 = new BitSet(new long[]{0x0000000100000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_paramlist_in_params288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_params291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_paramlist320 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_param_in_paramlist323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_75_in_param348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_param352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_block_instructions412 = new BitSet(new long[]{0xBF60109304030400L,0x00000000000081A9L});
    public static final BitSet FOLLOW_instruction_in_block_instructions414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_assign_in_instruction463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_instruction485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instruction625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_draw_in_instruction641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fill_in_instruction656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stroke_in_instruction668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transform_in_instruction680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_animation_in_instruction701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_macro761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loop774 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_animation_in_loop777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANS_in_transform786 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform789 = new BitSet(new long[]{0x000000050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_atom_in_transform791 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSREL_in_transform801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_transform806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_transform811 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform814 = new BitSet(new long[]{0x000000050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_atom_in_transform816 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALEREL_in_transform826 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_transform831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_transform837 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform840 = new BitSet(new long[]{0x000000050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_atom_in_transform842 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_FLOAT_in_transform845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATEREL_in_transform852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_transform855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_transform857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEMENT_in_animation868 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_animation871 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation875 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATION_in_animation882 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_animation885 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FLOAT_in_animation889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_in_assign904 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_assign906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicexpr_in_declare934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_draw945 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_draw948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILL_in_fill959 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_fill962 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLOR_in_fill964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STROKE_in_stroke977 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_stroke980 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLOR_in_stroke982 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_stroke984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt996 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_ite_stmt999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt1001 = new BitSet(new long[]{0xBF60109304030400L,0x00000000000081A9L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1004 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1007 = new BitSet(new long[]{0xBF60109304030400L,0x00000000000081A9L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1010 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1037 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_while_stmt1040 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1042 = new BitSet(new long[]{0xBF60109304030400L,0x00000000000081A9L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1045 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1070 = new BitSet(new long[]{0x000444050A000002L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_return_stmt1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1092 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_read1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1115 = new BitSet(new long[]{0x400444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_write1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_set1143 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_REL_in_set1146 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ABS_in_set1149 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_set1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_set1155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_time_in_set1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_time1170 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_time1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_78_in_time1175 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_time1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_time1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolexpr_in_expr1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphicconst_in_graphicexpr1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECT_in_graphicconst1237 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_graphicconst1249 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_graphicconst1261 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSE_in_graphicconst1273 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_graphicconst1285 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_graphicconst1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_arglist_in_graphicconst1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1313 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_OR_in_boolexpr1316 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_boolterm_in_boolexpr1319 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1339 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1342 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1345 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1365 = new BitSet(new long[]{0x00008108C0400002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1369 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1374 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_LT_in_boolfact1379 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_LE_in_boolfact1384 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_GT_in_boolfact1389 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_GE_in_boolfact1394 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1418 = new BitSet(new long[]{0x0004040000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1423 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1428 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_term_in_num_expr1432 = new BitSet(new long[]{0x0004040000000002L});
    public static final BitSet FOLLOW_factor_in_term1456 = new BitSet(new long[]{0x0000280000004002L});
    public static final BitSet FOLLOW_MUL_in_term1461 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_DIV_in_term1466 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_MOD_in_term1471 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_factor_in_term1475 = new BitSet(new long[]{0x0000280000004002L});
    public static final BitSet FOLLOW_NOT_in_factor1498 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_PLUS_in_factor1503 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_MINUS_in_factor1508 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_factor_in_factor1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factor1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_atom1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayacc_in_atom1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_atom1635 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_boolexpr_in_atom1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_atom1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_array1659 = new BitSet(new long[]{0x000000050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_atom_in_array1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_78_in_array1664 = new BitSet(new long[]{0x000000050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_atom_in_array1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_81_in_array1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayacc1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayacc1691 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_arrayacc1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_arrayacc1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_funcall1710 = new BitSet(new long[]{0x000444050A000000L,0x0000000000013040L});
    public static final BitSet FOLLOW_expr_list_in_funcall1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_funcall1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arglist1748 = new BitSet(new long[]{0x000444050A000000L,0x0000000000013040L});
    public static final BitSet FOLLOW_expr_list_in_arglist1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arglist1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expr_list1775 = new BitSet(new long[]{0x000444050A000000L,0x0000000000011040L});
    public static final BitSet FOLLOW_expr_in_expr_list1778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});

}