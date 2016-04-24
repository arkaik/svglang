// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-24 22:09:35

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:7: ( '=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:9: '='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:213:10: ( '!=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:213:12: '!='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:214:8: ( '<' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:214:10: '<'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:8: ( '<=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:215:10: '<='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:8: ( '>' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:216:10: '>'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:8: ( '>=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:217:10: '>='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:6: ( '+' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:8: '+'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:219:7: ( '-' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:219:9: '-'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:9: ( '*' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:220:11: '*'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:9: ( '/' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:11: '/'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:9: ( '%' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:222:11: '%'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:223:9: ( 'not' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:223:11: 'not'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:9: ( 'and' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:224:11: 'and'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:8: ( 'or' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:225:10: 'or'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:226:6: ( 'if' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:226:8: 'if'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:227:6: ( 'then' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:227:8: 'then'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:6: ( 'else' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:228:8: 'else'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:7: ( 'endif' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:229:9: 'endif'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:230:7: ( 'while' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:230:9: 'while'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:8: ( 'do' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:231:10: 'do'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:232:9: ( 'endwhile' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:232:11: 'endwhile'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:6: ( 'func' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:233:8: 'func'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:234:9: ( 'endfunc' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:234:11: 'endfunc'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:235:8: ( 'return' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:235:10: 'return'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:6: ( 'read' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:236:8: 'read'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:237:7: ( 'write' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:237:9: 'write'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:9: ( 'Rectangle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:11: 'Rectangle'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:9: ( 'Circle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:11: 'Circle'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:9: ( 'Ellipse' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:11: 'Ellipse'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:6: ( 'Text' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:8: 'Text'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:244:7: ( 'Trans' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:244:9: 'Trans'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:10: ( 'TransRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:12: 'TransRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:7: ( 'Scale' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:9: 'Scale'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:10: ( 'ScaleRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:12: 'ScaleRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:8: ( 'Rotate' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:10: 'Rotate'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:249:11: ( 'RotateRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:249:13: 'RotateRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:251:10: ( 'Movement' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:251:12: 'Movement'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:10: ( 'Rotation' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:12: 'Rotation'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:254:9: ( 'true' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:254:11: 'true'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:9: ( 'false' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:11: 'false'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:12: ( ( 'first' | 'second' | 'x' | 'y' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:14: ( 'first' | 'second' | 'x' | 'y' )
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:14: ( 'first' | 'second' | 'x' | 'y' )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:15: 'first'
                    {
                    match("first"); 



                    }
                    break;
                case 2 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:23: 'second'
                    {
                    match("second"); 



                    }
                    break;
                case 3 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:32: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 4 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:36: 'y'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:13: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:27: ( '0' .. '9' )+
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:259:6: ( ( '0' .. '9' )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:259:8: ( '0' .. '9' )+
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:259:8: ( '0' .. '9' )+
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:16: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
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
                    	    break loop6;
                        }
                    } while (true);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:30: '\\r'
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:13: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:28: ~ ( '\\\\' | '\"' )
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
            	    break loop10;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:273:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:273:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:276:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:276:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | TRUE | FALSE | PAIR_INDEX | ID | FLOAT | INT | COMMENT | STRING | WS )
        int alt11=56;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:10: T__64
                {
                mT__64(); 


                }
                break;
            case 2 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:16: T__65
                {
                mT__65(); 


                }
                break;
            case 3 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:22: T__66
                {
                mT__66(); 


                }
                break;
            case 4 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:28: T__67
                {
                mT__67(); 


                }
                break;
            case 5 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:34: T__68
                {
                mT__68(); 


                }
                break;
            case 6 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:40: T__69
                {
                mT__69(); 


                }
                break;
            case 7 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:46: T__70
                {
                mT__70(); 


                }
                break;
            case 8 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:52: T__71
                {
                mT__71(); 


                }
                break;
            case 9 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:58: T__72
                {
                mT__72(); 


                }
                break;
            case 10 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:64: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:70: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 12 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:80: LT
                {
                mLT(); 


                }
                break;
            case 13 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:83: LE
                {
                mLE(); 


                }
                break;
            case 14 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:86: GT
                {
                mGT(); 


                }
                break;
            case 15 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:89: GE
                {
                mGE(); 


                }
                break;
            case 16 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:92: PLUS
                {
                mPLUS(); 


                }
                break;
            case 17 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:97: MINUS
                {
                mMINUS(); 


                }
                break;
            case 18 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:103: MUL
                {
                mMUL(); 


                }
                break;
            case 19 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:107: DIV
                {
                mDIV(); 


                }
                break;
            case 20 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:111: MOD
                {
                mMOD(); 


                }
                break;
            case 21 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:115: NOT
                {
                mNOT(); 


                }
                break;
            case 22 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:119: AND
                {
                mAND(); 


                }
                break;
            case 23 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:123: OR
                {
                mOR(); 


                }
                break;
            case 24 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:126: IF
                {
                mIF(); 


                }
                break;
            case 25 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:129: THEN
                {
                mTHEN(); 


                }
                break;
            case 26 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:134: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:139: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 28 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:145: WHILE
                {
                mWHILE(); 


                }
                break;
            case 29 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:151: DO
                {
                mDO(); 


                }
                break;
            case 30 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:154: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 31 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:163: FUNC
                {
                mFUNC(); 


                }
                break;
            case 32 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:168: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 33 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:176: RETURN
                {
                mRETURN(); 


                }
                break;
            case 34 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:183: READ
                {
                mREAD(); 


                }
                break;
            case 35 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:188: WRITE
                {
                mWRITE(); 


                }
                break;
            case 36 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:194: RECT
                {
                mRECT(); 


                }
                break;
            case 37 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:199: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 38 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:206: ELLIPSE
                {
                mELLIPSE(); 


                }
                break;
            case 39 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:214: TEXT
                {
                mTEXT(); 


                }
                break;
            case 40 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:219: TRANS
                {
                mTRANS(); 


                }
                break;
            case 41 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:225: TRANSREL
                {
                mTRANSREL(); 


                }
                break;
            case 42 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:234: SCALE
                {
                mSCALE(); 


                }
                break;
            case 43 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:240: SCALEREL
                {
                mSCALEREL(); 


                }
                break;
            case 44 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:249: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 45 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:256: ROTATEREL
                {
                mROTATEREL(); 


                }
                break;
            case 46 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:266: MOVEMENT
                {
                mMOVEMENT(); 


                }
                break;
            case 47 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:275: ROTATION
                {
                mROTATION(); 


                }
                break;
            case 48 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:284: TRUE
                {
                mTRUE(); 


                }
                break;
            case 49 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:289: FALSE
                {
                mFALSE(); 


                }
                break;
            case 50 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:295: PAIR_INDEX
                {
                mPAIR_INDEX(); 


                }
                break;
            case 51 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:306: ID
                {
                mID(); 


                }
                break;
            case 52 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:309: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 53 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:315: INT
                {
                mINT(); 


                }
                break;
            case 54 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:319: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 55 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:327: STRING
                {
                mSTRING(); 


                }
                break;
            case 56 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:334: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\14\uffff\1\53\1\55\3\uffff\1\57\1\uffff\21\46\2\110\1\uffff\1\112"+
        "\10\uffff\2\46\1\115\1\116\6\46\1\125\15\46\3\uffff\1\144\1\145"+
        "\2\uffff\6\46\1\uffff\16\46\2\uffff\1\174\1\175\1\176\5\46\1\u0084"+
        "\3\46\1\u0088\4\46\1\u008d\4\46\3\uffff\1\u0092\2\46\1\u0095\1\u0096"+
        "\1\uffff\1\u0097\1\110\1\46\1\uffff\4\46\1\uffff\1\u009f\1\u00a1"+
        "\2\46\1\uffff\2\46\3\uffff\1\u00a6\1\46\1\u00a9\1\46\1\u00ab\2\46"+
        "\1\uffff\1\46\1\uffff\1\46\1\110\1\46\1\u00b1\1\uffff\2\46\1\uffff"+
        "\1\46\1\uffff\1\u00b5\3\46\1\u00b9\1\uffff\2\46\1\u00bc\1\uffff"+
        "\1\u00bd\1\u00be\1\u00bf\1\uffff\1\u00c0\1\u00c1\6\uffff";
    static final String DFA11_eofS =
        "\u00c2\uffff";
    static final String DFA11_minS =
        "\1\11\13\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\2\145\1\151\1\154\1\145\1\143\1\157"+
        "\1\145\2\60\1\uffff\1\56\10\uffff\1\164\1\144\2\60\1\145\1\165\1"+
        "\163\1\144\2\151\1\60\1\156\1\154\1\162\1\141\1\143\1\164\1\162"+
        "\1\154\1\170\2\141\1\166\1\143\3\uffff\2\60\2\uffff\1\156\2\145"+
        "\1\146\1\154\1\164\1\uffff\1\143\2\163\1\165\1\144\1\164\1\141\1"+
        "\143\1\151\1\164\1\156\1\154\1\145\1\157\2\uffff\3\60\1\146\1\150"+
        "\1\165\2\145\1\60\1\145\1\164\1\162\1\60\1\141\1\164\1\154\1\160"+
        "\1\60\1\163\1\145\1\155\1\156\3\uffff\1\60\1\151\1\156\2\60\1\uffff"+
        "\2\60\1\156\1\uffff\1\156\2\145\1\163\1\uffff\2\60\1\145\1\144\1"+
        "\uffff\1\154\1\143\3\uffff\1\60\1\147\1\60\1\157\1\60\2\145\1\uffff"+
        "\1\145\1\uffff\1\156\1\60\1\145\1\60\1\uffff\1\154\1\145\1\uffff"+
        "\1\156\1\uffff\1\60\2\154\1\164\1\60\1\uffff\1\145\1\154\1\60\1"+
        "\uffff\3\60\1\uffff\2\60\6\uffff";
    static final String DFA11_maxS =
        "\1\172\13\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\1\157\1\151\1\154\1\162\1\143"+
        "\1\157\1\145\2\172\1\uffff\1\71\10\uffff\1\164\1\144\2\172\1\145"+
        "\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\162\1\164\1\143\1\164"+
        "\1\162\1\154\1\170\2\141\1\166\1\143\3\uffff\2\172\2\uffff\1\156"+
        "\2\145\1\167\1\154\1\164\1\uffff\1\143\2\163\1\165\1\144\1\164\1"+
        "\141\1\143\1\151\1\164\1\156\1\154\1\145\1\157\2\uffff\3\172\1\146"+
        "\1\150\1\165\2\145\1\172\1\145\1\164\1\162\1\172\1\141\1\164\1\154"+
        "\1\160\1\172\1\163\1\145\1\155\1\156\3\uffff\1\172\1\151\1\156\2"+
        "\172\1\uffff\2\172\1\156\1\uffff\1\156\1\151\1\145\1\163\1\uffff"+
        "\2\172\1\145\1\144\1\uffff\1\154\1\143\3\uffff\1\172\1\147\1\172"+
        "\1\157\1\172\2\145\1\uffff\1\145\1\uffff\1\156\1\172\1\145\1\172"+
        "\1\uffff\1\154\1\145\1\uffff\1\156\1\uffff\1\172\2\154\1\164\1\172"+
        "\1\uffff\1\145\1\154\1\172\1\uffff\3\172\1\uffff\2\172\6\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff"+
        "\1\20\1\21\1\22\1\uffff\1\24\23\uffff\1\63\1\uffff\1\67\1\70\1\15"+
        "\1\14\1\17\1\16\1\66\1\23\30\uffff\1\62\1\64\1\65\2\uffff\1\27\1"+
        "\30\6\uffff\1\35\16\uffff\1\25\1\26\26\uffff\1\31\1\60\1\32\5\uffff"+
        "\1\37\3\uffff\1\42\4\uffff\1\47\4\uffff\1\33\2\uffff\1\34\1\43\1"+
        "\61\7\uffff\1\50\1\uffff\1\52\4\uffff\1\41\2\uffff\1\54\1\uffff"+
        "\1\45\5\uffff\1\40\3\uffff\1\46\3\uffff\1\36\2\uffff\1\57\1\51\1"+
        "\53\1\56\1\44\1\55";
    static final String DFA11_specialS =
        "\u00c2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\13\1\50\1\1\1\2\1\22\1\3"+
            "\1\uffff\1\4\1\5\1\20\1\16\1\6\1\17\1\7\1\21\12\47\1\uffff\1"+
            "\10\1\14\1\12\1\15\1\uffff\1\11\2\46\1\36\1\46\1\37\7\46\1\42"+
            "\4\46\1\35\1\41\1\40\6\46\4\uffff\1\46\1\uffff\1\24\2\46\1\32"+
            "\1\30\1\33\2\46\1\26\4\46\1\23\1\25\2\46\1\34\1\43\1\27\2\46"+
            "\1\31\1\44\1\45\1\46",
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
            "\1\52",
            "\1\54",
            "",
            "",
            "",
            "\1\56\4\uffff\1\56",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\11\uffff\1\65",
            "\1\66\1\uffff\1\67",
            "\1\70\11\uffff\1\71",
            "\1\72",
            "\1\74\7\uffff\1\75\13\uffff\1\73",
            "\1\76",
            "\1\77\11\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103\14\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\111\1\uffff\12\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132\22\uffff\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\153\2\uffff\1\151\15\uffff\1\152",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0093",
            "\1\u0094",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a\3\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\12\46\7\uffff\21\46\1\u009e\10\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\12\46\7\uffff\21\46\1\u00a0\10\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a7",
            "\12\46\7\uffff\21\46\1\u00a8\10\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00aa",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | TRUE | FALSE | PAIR_INDEX | ID | FLOAT | INT | COMMENT | STRING | WS );";
        }
    }
 

}