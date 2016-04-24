// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-25 00:00:00

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/falc/FIB/cl/svglang/src/parser/Asl.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:7: ( '#' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:9: '$SHOW'
            {
            match("$SHOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:7: ( '&' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:7: ( '(' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:7: ( ')' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:11:7: ( ',' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:12:7: ( '.' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:13:7: ( ';' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:14:7: ( '@' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:14:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:15:7: ( '{' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:16:7: ( '}' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:7: ( '=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:219:10: ( '!=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:219:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:8: ( '<' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:8: ( '<=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:8: ( '>' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:223:8: ( '>=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:223:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:6: ( '+' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:7: ( '-' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:226:9: ( '*' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:226:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:227:9: ( '/' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:227:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:9: ( '%' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:9: ( 'not' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:230:9: ( 'and' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:230:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:8: ( 'or' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:232:6: ( 'if' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:232:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:6: ( 'then' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:234:6: ( 'else' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:234:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:235:7: ( 'endif' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:235:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:7: ( 'while' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:237:8: ( 'do' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:237:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:238:9: ( 'endwhile' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:238:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:6: ( 'func' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:9: ( 'endfunc' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:8: ( 'return' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:6: ( 'read' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:243:7: ( 'write' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:243:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "RECT"
    public final void mRECT() throws RecognitionException {
        try {
            int _type = RECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:9: ( 'Rectangle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:11: 'Rectangle'
            {
            match("Rectangle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECT"

    // $ANTLR start "CIRCLE"
    public final void mCIRCLE() throws RecognitionException {
        try {
            int _type = CIRCLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:9: ( 'Circle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:11: 'Circle'
            {
            match("Circle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCLE"

    // $ANTLR start "ELLIPSE"
    public final void mELLIPSE() throws RecognitionException {
        try {
            int _type = ELLIPSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:9: ( 'Ellipse' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:11: 'Ellipse'
            {
            match("Ellipse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELLIPSE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:6: ( 'Text' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:8: 'Text'
            {
            match("Text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "TRANS"
    public final void mTRANS() throws RecognitionException {
        try {
            int _type = TRANS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:250:7: ( 'Trans' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:250:9: 'Trans'
            {
            match("Trans"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANS"

    // $ANTLR start "TRANSREL"
    public final void mTRANSREL() throws RecognitionException {
        try {
            int _type = TRANSREL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:251:10: ( 'TransRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:251:12: 'TransRel'
            {
            match("TransRel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSREL"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:7: ( 'Scale' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:9: 'Scale'
            {
            match("Scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "SCALEREL"
    public final void mSCALEREL() throws RecognitionException {
        try {
            int _type = SCALEREL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:253:10: ( 'ScaleRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:253:12: 'ScaleRel'
            {
            match("ScaleRel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALEREL"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:254:8: ( 'Rotate' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:254:10: 'Rotate'
            {
            match("Rotate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "ROTATEREL"
    public final void mROTATEREL() throws RecognitionException {
        try {
            int _type = ROTATEREL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:11: ( 'RotateRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:13: 'RotateRel'
            {
            match("RotateRel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATEREL"

    // $ANTLR start "MOVEMENT"
    public final void mMOVEMENT() throws RecognitionException {
        try {
            int _type = MOVEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:10: ( 'Movement' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:12: 'Movement'
            {
            match("Movement"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVEMENT"

    // $ANTLR start "ROTATION"
    public final void mROTATION() throws RecognitionException {
        try {
            int _type = ROTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:10: ( 'Rotation' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:12: 'Rotation'
            {
            match("Rotation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATION"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:260:9: ( 'true' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:260:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:261:9: ( 'false' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:261:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "PAIR_INDEX"
    public final void mPAIR_INDEX() throws RecognitionException {
        try {
            int _type = PAIR_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:12: ( ( 'first' | 'second' | 'x' | 'y' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:14: ( 'first' | 'second' | 'x' | 'y' )
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:14: ( 'first' | 'second' | 'x' | 'y' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'f':
                {
                alt1=1;
                }
                break;
            case 's':
                {
                alt1=2;
                }
                break;
            case 'x':
                {
                alt1=3;
                }
                break;
            case 'y':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:15: 'first'
                    {
                    match("first"); 



                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:23: 'second'
                    {
                    match("second"); 



                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:32: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:36: 'y'
                    {
                    match('y'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PAIR_INDEX"

    // $ANTLR start "PAIR_ASSIGN"
    public final void mPAIR_ASSIGN() throws RecognitionException {
        try {
            int _type = PAIR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:13: ( ( 'scale' | 'rotation' | 'position' | 'anchor' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:15: ( 'scale' | 'rotation' | 'position' | 'anchor' )
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:15: ( 'scale' | 'rotation' | 'position' | 'anchor' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt2=1;
                }
                break;
            case 'r':
                {
                alt2=2;
                }
                break;
            case 'p':
                {
                alt2=3;
                }
                break;
            case 'a':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:16: 'scale'
                    {
                    match("scale"); 



                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:24: 'rotation'
                    {
                    match("rotation"); 



                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:35: 'position'
                    {
                    match("position"); 



                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:46: 'anchor'
                    {
                    match("anchor"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PAIR_ASSIGN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:264:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:264:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:264:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:9: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:13: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:13: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:23: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:24: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:28: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='/') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='*') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:16: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:30: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:270:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:270:13: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:270:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:280:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:280:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:283:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:283:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | TRUE | FALSE | PAIR_INDEX | PAIR_ASSIGN | ID | FLOAT | COMMENT | STRING | WS )
        int alt12=58;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:10: T__65
                {
                mT__65(); 


                }
                break;
            case 2 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:16: T__66
                {
                mT__66(); 


                }
                break;
            case 3 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:22: T__67
                {
                mT__67(); 


                }
                break;
            case 4 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:28: T__68
                {
                mT__68(); 


                }
                break;
            case 5 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:34: T__69
                {
                mT__69(); 


                }
                break;
            case 6 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:40: T__70
                {
                mT__70(); 


                }
                break;
            case 7 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:46: T__71
                {
                mT__71(); 


                }
                break;
            case 8 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:52: T__72
                {
                mT__72(); 


                }
                break;
            case 9 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:58: T__73
                {
                mT__73(); 


                }
                break;
            case 10 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:64: T__74
                {
                mT__74(); 


                }
                break;
            case 11 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:70: T__75
                {
                mT__75(); 


                }
                break;
            case 12 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:76: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 13 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:82: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 14 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:92: LT
                {
                mLT(); 


                }
                break;
            case 15 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:95: LE
                {
                mLE(); 


                }
                break;
            case 16 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:98: GT
                {
                mGT(); 


                }
                break;
            case 17 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:101: GE
                {
                mGE(); 


                }
                break;
            case 18 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:104: PLUS
                {
                mPLUS(); 


                }
                break;
            case 19 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:109: MINUS
                {
                mMINUS(); 


                }
                break;
            case 20 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:115: MUL
                {
                mMUL(); 


                }
                break;
            case 21 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:119: DIV
                {
                mDIV(); 


                }
                break;
            case 22 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:123: MOD
                {
                mMOD(); 


                }
                break;
            case 23 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:127: NOT
                {
                mNOT(); 


                }
                break;
            case 24 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:131: AND
                {
                mAND(); 


                }
                break;
            case 25 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:135: OR
                {
                mOR(); 


                }
                break;
            case 26 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:138: IF
                {
                mIF(); 


                }
                break;
            case 27 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:141: THEN
                {
                mTHEN(); 


                }
                break;
            case 28 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:146: ELSE
                {
                mELSE(); 


                }
                break;
            case 29 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:151: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 30 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:157: WHILE
                {
                mWHILE(); 


                }
                break;
            case 31 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:163: DO
                {
                mDO(); 


                }
                break;
            case 32 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:166: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 33 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:175: FUNC
                {
                mFUNC(); 


                }
                break;
            case 34 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:180: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 35 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:188: RETURN
                {
                mRETURN(); 


                }
                break;
            case 36 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:195: READ
                {
                mREAD(); 


                }
                break;
            case 37 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:200: WRITE
                {
                mWRITE(); 


                }
                break;
            case 38 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:206: RECT
                {
                mRECT(); 


                }
                break;
            case 39 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:211: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 40 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:218: ELLIPSE
                {
                mELLIPSE(); 


                }
                break;
            case 41 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:226: TEXT
                {
                mTEXT(); 


                }
                break;
            case 42 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:231: TRANS
                {
                mTRANS(); 


                }
                break;
            case 43 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:237: TRANSREL
                {
                mTRANSREL(); 


                }
                break;
            case 44 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:246: SCALE
                {
                mSCALE(); 


                }
                break;
            case 45 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:252: SCALEREL
                {
                mSCALEREL(); 


                }
                break;
            case 46 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:261: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 47 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:268: ROTATEREL
                {
                mROTATEREL(); 


                }
                break;
            case 48 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:278: MOVEMENT
                {
                mMOVEMENT(); 


                }
                break;
            case 49 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:287: ROTATION
                {
                mROTATION(); 


                }
                break;
            case 50 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:296: TRUE
                {
                mTRUE(); 


                }
                break;
            case 51 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:301: FALSE
                {
                mFALSE(); 


                }
                break;
            case 52 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:307: PAIR_INDEX
                {
                mPAIR_INDEX(); 


                }
                break;
            case 53 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:318: PAIR_ASSIGN
                {
                mPAIR_ASSIGN(); 


                }
                break;
            case 54 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:330: ID
                {
                mID(); 


                }
                break;
            case 55 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:333: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 56 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:339: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 57 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:347: STRING
                {
                mSTRING(); 


                }
                break;
            case 58 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:354: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\16\uffff\1\56\1\60\3\uffff\1\62\1\uffff\21\51\2\115\1\51\12\uffff"+
        "\2\51\1\122\1\123\6\51\1\132\17\51\1\uffff\1\51\1\154\1\155\1\51"+
        "\2\uffff\6\51\1\uffff\21\51\2\uffff\1\51\1\u0089\1\u008a\1\u008b"+
        "\5\51\1\u0091\3\51\1\u0095\5\51\1\u009b\7\51\3\uffff\1\u00a3\2\51"+
        "\1\u00a6\1\u00a7\1\uffff\1\u00a8\1\115\1\51\1\uffff\5\51\1\uffff"+
        "\1\u00b1\1\u00b3\2\51\1\u00b6\1\51\1\u00b6\1\uffff\2\51\3\uffff"+
        "\1\u00ba\2\51\1\u00be\1\51\1\u00c0\2\51\1\uffff\1\51\1\uffff\1\51"+
        "\1\115\1\uffff\2\51\1\u00c7\1\uffff\3\51\1\uffff\1\51\1\uffff\1"+
        "\u00cc\4\51\1\u00d1\1\uffff\1\u00b6\2\51\1\u00d4\1\uffff\1\u00d5"+
        "\1\u00d6\1\u00d7\1\u00b6\1\uffff\1\u00d8\1\u00d9\6\uffff";
    static final String DFA12_eofS =
        "\u00da\uffff";
    static final String DFA12_minS =
        "\1\11\15\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\2\145\1\151\1\154\1\145\1\143\1\157"+
        "\1\143\2\60\1\157\12\uffff\1\164\1\143\2\60\1\145\1\165\1\163\1"+
        "\144\2\151\1\60\1\156\1\154\1\162\1\141\1\164\1\143\1\164\1\162"+
        "\1\154\1\170\2\141\1\166\1\143\1\141\1\uffff\1\163\2\60\1\150\2"+
        "\uffff\1\156\2\145\1\146\1\154\1\164\1\uffff\1\143\2\163\1\165\1"+
        "\144\1\141\1\164\1\141\1\143\1\151\1\164\1\156\1\154\1\145\1\157"+
        "\1\154\1\151\2\uffff\1\157\3\60\1\146\1\150\1\165\2\145\1\60\1\145"+
        "\1\164\1\162\1\60\1\164\1\141\1\164\1\154\1\160\1\60\1\163\1\145"+
        "\1\155\1\156\1\145\1\164\1\162\3\uffff\1\60\1\151\1\156\2\60\1\uffff"+
        "\2\60\1\156\1\uffff\1\151\1\156\2\145\1\163\1\uffff\2\60\1\145\1"+
        "\144\1\60\1\151\1\60\1\uffff\1\154\1\143\3\uffff\1\60\1\157\1\147"+
        "\1\60\1\157\1\60\2\145\1\uffff\1\145\1\uffff\1\156\1\60\1\uffff"+
        "\1\157\1\145\1\60\1\uffff\1\156\1\154\1\145\1\uffff\1\156\1\uffff"+
        "\1\60\2\154\1\164\1\156\1\60\1\uffff\1\60\1\145\1\154\1\60\1\uffff"+
        "\4\60\1\uffff\2\60\6\uffff";
    static final String DFA12_maxS =
        "\1\175\15\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\2\157\1\151\1\154\1\162\1\143\1\157"+
        "\1\145\2\172\1\157\12\uffff\1\164\1\144\2\172\1\145\1\165\1\163"+
        "\1\144\2\151\1\172\1\156\1\154\1\162\2\164\1\143\1\164\1\162\1\154"+
        "\1\170\2\141\1\166\1\143\1\141\1\uffff\1\163\2\172\1\150\2\uffff"+
        "\1\156\2\145\1\167\1\154\1\164\1\uffff\1\143\2\163\1\165\1\144\1"+
        "\141\1\164\1\141\1\143\1\151\1\164\1\156\1\154\1\145\1\157\1\154"+
        "\1\151\2\uffff\1\157\3\172\1\146\1\150\1\165\2\145\1\172\1\145\1"+
        "\164\1\162\1\172\1\164\1\141\1\164\1\154\1\160\1\172\1\163\1\145"+
        "\1\155\1\156\1\145\1\164\1\162\3\uffff\1\172\1\151\1\156\2\172\1"+
        "\uffff\2\172\1\156\1\uffff\1\151\1\156\1\151\1\145\1\163\1\uffff"+
        "\2\172\1\145\1\144\1\172\1\151\1\172\1\uffff\1\154\1\143\3\uffff"+
        "\1\172\1\157\1\147\1\172\1\157\1\172\2\145\1\uffff\1\145\1\uffff"+
        "\1\156\1\172\1\uffff\1\157\1\145\1\172\1\uffff\1\156\1\154\1\145"+
        "\1\uffff\1\156\1\uffff\1\172\2\154\1\164\1\156\1\172\1\uffff\1\172"+
        "\1\145\1\154\1\172\1\uffff\4\172\1\uffff\2\172\6\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\2\uffff\1\22\1\23\1\24\1\uffff\1\26\24\uffff\1\66\1\67\1\71"+
        "\1\72\1\17\1\16\1\21\1\20\1\70\1\25\32\uffff\1\64\4\uffff\1\31\1"+
        "\32\6\uffff\1\37\21\uffff\1\27\1\30\33\uffff\1\33\1\62\1\34\5\uffff"+
        "\1\41\3\uffff\1\44\5\uffff\1\51\7\uffff\1\35\2\uffff\1\36\1\45\1"+
        "\63\10\uffff\1\52\1\uffff\1\54\2\uffff\1\65\3\uffff\1\43\3\uffff"+
        "\1\56\1\uffff\1\47\6\uffff\1\42\4\uffff\1\50\4\uffff\1\40\2\uffff"+
        "\1\61\1\53\1\55\1\60\1\46\1\57";
    static final String DFA12_specialS =
        "\u00da\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\15\1\53\1\1\1\2\1\24\1\3"+
            "\1\uffff\1\4\1\5\1\22\1\20\1\6\1\21\1\7\1\23\12\52\1\uffff\1"+
            "\10\1\16\1\14\1\17\1\uffff\1\11\2\51\1\40\1\51\1\41\7\51\1\44"+
            "\4\51\1\37\1\43\1\42\6\51\4\uffff\1\51\1\uffff\1\26\2\51\1\34"+
            "\1\32\1\35\2\51\1\30\4\51\1\25\1\27\1\50\1\51\1\36\1\45\1\31"+
            "\2\51\1\33\1\46\1\47\1\51\1\12\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57",
            "",
            "",
            "",
            "\1\61\4\uffff\1\61",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\11\uffff\1\70",
            "\1\71\1\uffff\1\72",
            "\1\73\11\uffff\1\74",
            "\1\75",
            "\1\77\7\uffff\1\100\13\uffff\1\76",
            "\1\101\11\uffff\1\102",
            "\1\103\11\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107\14\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\114\1\uffff\1\113",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\121\1\120",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\22\uffff\1\136",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\164\2\uffff\1\162\15\uffff\1\163",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a4",
            "\1\u00a5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\3\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\12\51\7\uffff\21\51\1\u00b0\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\12\51\7\uffff\21\51\1\u00b2\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00b4",
            "\1\u00b5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bb",
            "\1\u00bc",
            "\12\51\7\uffff\21\51\1\u00bd\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00bf",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d2",
            "\1\u00d3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | TRUE | FALSE | PAIR_INDEX | PAIR_ASSIGN | ID | FLOAT | COMMENT | STRING | WS );";
        }
    }
 

}