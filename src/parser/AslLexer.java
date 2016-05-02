// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-05-02 08:34:33

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:7: ( '$SHOW' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:9: '$SHOW'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:7: ( '&' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:9: '&'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:7: ( '(' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:9: '('
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:7: ( ')' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:9: ')'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:7: ( ',' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:9: ','
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:11:7: ( ';' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:11:9: ';'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:12:7: ( '[' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:13:7: ( ']' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:14:7: ( '{' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:14:9: '{'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:15:7: ( '}' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:15:9: '}'
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
    // $ANTLR end "T__82"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:7: ( '=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:239:9: '='
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

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:5: ( '==' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:240:7: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:10: ( '!=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:241:12: '!='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:8: ( '<' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:242:10: '<'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:243:8: ( '<=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:243:10: '<='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:244:8: ( '>' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:244:10: '>'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:8: ( '>=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:245:10: '>='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:6: ( '+' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:246:8: '+'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:7: ( '-' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:247:9: '-'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:9: ( '*' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:248:11: '*'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:249:9: ( '/' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:249:11: '/'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:250:9: ( '%' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:250:11: '%'
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

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:6: ( '@' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:252:8: '@'
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
    // $ANTLR end "REL"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:253:6: ( '#' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:253:8: '#'
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
    // $ANTLR end "ABS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:9: ( 'not' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:255:11: 'not'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:9: ( 'and' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:256:11: 'and'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:8: ( 'or' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:257:10: 'or'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:6: ( 'if' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:258:8: 'if'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:259:6: ( 'then' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:259:8: 'then'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:260:6: ( 'else' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:260:8: 'else'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:261:7: ( 'endif' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:261:9: 'endif'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:7: ( 'while' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:262:9: 'while'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:8: ( 'do' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:263:10: 'do'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:264:9: ( 'endwhile' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:264:11: 'endwhile'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:6: ( 'func' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:265:8: 'func'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:266:9: ( 'endfunc' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:266:11: 'endfunc'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:8: ( 'return' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:267:10: 'return'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:268:6: ( 'read' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:268:8: 'read'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:7: ( 'write' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:269:9: 'write'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:271:9: ( 'Rectangle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:271:11: 'Rectangle'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:272:9: ( 'Circle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:272:11: 'Circle'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:273:9: ( 'Ellipse' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:273:11: 'Ellipse'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:6: ( 'Text' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:274:8: 'Text'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:276:7: ( 'Trans' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:276:9: 'Trans'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:277:10: ( 'TransRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:277:12: 'TransRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:278:7: ( 'Scale' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:278:9: 'Scale'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:279:10: ( 'ScaleRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:279:12: 'ScaleRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:280:8: ( 'Rotate' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:280:10: 'Rotate'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:281:11: ( 'RotateRel' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:281:13: 'RotateRel'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:283:10: ( 'Movement' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:283:12: 'Movement'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:284:10: ( 'Rotation' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:284:12: 'Rotation'
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

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:286:6: ( 'Loop' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:286:8: 'Loop'
            {
            match("Loop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "FILL"
    public final void mFILL() throws RecognitionException {
        try {
            int _type = FILL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:287:6: ( 'Fill' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:287:8: 'Fill'
            {
            match("Fill"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILL"

    // $ANTLR start "STROKE"
    public final void mSTROKE() throws RecognitionException {
        try {
            int _type = STROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:288:8: ( 'Stroke' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:288:10: 'Stroke'
            {
            match("Stroke"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STROKE"

    // $ANTLR start "DRAW"
    public final void mDRAW() throws RecognitionException {
        try {
            int _type = DRAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:289:6: ( 'Draw' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:289:8: 'Draw'
            {
            match("Draw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:291:9: ( 'true' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:291:11: 'true'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:292:9: ( 'false' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:292:11: 'false'
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

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:294:7: ( '#' ( 'a' .. 'f' | '0' .. '9' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:294:9: '#' ( 'a' .. 'f' | '0' .. '9' )*
            {
            match('#'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:294:13: ( 'a' .. 'f' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
            	    break loop1;
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
    // $ANTLR end "COLOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:296:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:296:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:296:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:297:6: ( ( '0' .. '9' )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:297:8: ( '0' .. '9' )+
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:297:8: ( '0' .. '9' )+
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:298:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:298:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:298:13: ( '0' .. '9' )+
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


            match('.'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:298:27: ( '0' .. '9' )*
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
            	    break loop5;
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
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:302:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:302:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:302:16: (~ ( '\\n' | '\\r' ) )*
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


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:302:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:302:30: '\\r'
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:303:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:303:13: ( options {greedy=false; } : . )*
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
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:303:41: .
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:307:9: ( '\"' ( '\\\\' ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:307:12: '\"' ( '\\\\' ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:307:16: ( '\\\\' ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:307:17: '\\\\' ESC_SEQ
            	    {
            	    match('\\'); 

            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:307:32: ~ ( '\\\\' | '\"' )
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:313:5: ( ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:
            {
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:316:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:316:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:8: ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | EQUAL | EQ | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | REL | ABS | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | LOOP | FILL | STROKE | DRAW | TRUE | FALSE | COLOR | ID | INT | FLOAT | COMMENT | STRING | WS )
        int alt11=64;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:10: T__73
                {
                mT__73(); 


                }
                break;
            case 2 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:16: T__74
                {
                mT__74(); 


                }
                break;
            case 3 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:22: T__75
                {
                mT__75(); 


                }
                break;
            case 4 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:28: T__76
                {
                mT__76(); 


                }
                break;
            case 5 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:34: T__77
                {
                mT__77(); 


                }
                break;
            case 6 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:40: T__78
                {
                mT__78(); 


                }
                break;
            case 7 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:46: T__79
                {
                mT__79(); 


                }
                break;
            case 8 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:52: T__80
                {
                mT__80(); 


                }
                break;
            case 9 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:58: T__81
                {
                mT__81(); 


                }
                break;
            case 10 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:64: T__82
                {
                mT__82(); 


                }
                break;
            case 11 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:70: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 12 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:76: EQ
                {
                mEQ(); 


                }
                break;
            case 13 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:79: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 14 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:89: LT
                {
                mLT(); 


                }
                break;
            case 15 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:92: LE
                {
                mLE(); 


                }
                break;
            case 16 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:95: GT
                {
                mGT(); 


                }
                break;
            case 17 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:98: GE
                {
                mGE(); 


                }
                break;
            case 18 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:101: PLUS
                {
                mPLUS(); 


                }
                break;
            case 19 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:106: MINUS
                {
                mMINUS(); 


                }
                break;
            case 20 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:112: MUL
                {
                mMUL(); 


                }
                break;
            case 21 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:116: DIV
                {
                mDIV(); 


                }
                break;
            case 22 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:120: MOD
                {
                mMOD(); 


                }
                break;
            case 23 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:124: REL
                {
                mREL(); 


                }
                break;
            case 24 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:128: ABS
                {
                mABS(); 


                }
                break;
            case 25 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:132: NOT
                {
                mNOT(); 


                }
                break;
            case 26 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:136: AND
                {
                mAND(); 


                }
                break;
            case 27 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:140: OR
                {
                mOR(); 


                }
                break;
            case 28 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:143: IF
                {
                mIF(); 


                }
                break;
            case 29 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:146: THEN
                {
                mTHEN(); 


                }
                break;
            case 30 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:151: ELSE
                {
                mELSE(); 


                }
                break;
            case 31 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:156: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 32 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:162: WHILE
                {
                mWHILE(); 


                }
                break;
            case 33 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:168: DO
                {
                mDO(); 


                }
                break;
            case 34 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:171: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 35 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:180: FUNC
                {
                mFUNC(); 


                }
                break;
            case 36 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:185: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 37 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:193: RETURN
                {
                mRETURN(); 


                }
                break;
            case 38 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:200: READ
                {
                mREAD(); 


                }
                break;
            case 39 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:205: WRITE
                {
                mWRITE(); 


                }
                break;
            case 40 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:211: RECT
                {
                mRECT(); 


                }
                break;
            case 41 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:216: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 42 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:223: ELLIPSE
                {
                mELLIPSE(); 


                }
                break;
            case 43 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:231: TEXT
                {
                mTEXT(); 


                }
                break;
            case 44 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:236: TRANS
                {
                mTRANS(); 


                }
                break;
            case 45 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:242: TRANSREL
                {
                mTRANSREL(); 


                }
                break;
            case 46 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:251: SCALE
                {
                mSCALE(); 


                }
                break;
            case 47 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:257: SCALEREL
                {
                mSCALEREL(); 


                }
                break;
            case 48 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:266: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 49 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:273: ROTATEREL
                {
                mROTATEREL(); 


                }
                break;
            case 50 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:283: MOVEMENT
                {
                mMOVEMENT(); 


                }
                break;
            case 51 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:292: ROTATION
                {
                mROTATION(); 


                }
                break;
            case 52 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:301: LOOP
                {
                mLOOP(); 


                }
                break;
            case 53 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:306: FILL
                {
                mFILL(); 


                }
                break;
            case 54 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:311: STROKE
                {
                mSTROKE(); 


                }
                break;
            case 55 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:318: DRAW
                {
                mDRAW(); 


                }
                break;
            case 56 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:323: TRUE
                {
                mTRUE(); 


                }
                break;
            case 57 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:328: FALSE
                {
                mFALSE(); 


                }
                break;
            case 58 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:334: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 59 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:340: ID
                {
                mID(); 


                }
                break;
            case 60 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:343: INT
                {
                mINT(); 


                }
                break;
            case 61 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:347: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 62 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:353: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 63 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:361: STRING
                {
                mSTRING(); 


                }
                break;
            case 64 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:368: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\13\uffff\1\56\1\uffff\1\60\1\62\3\uffff\1\64\2\uffff\1\65\23\51"+
        "\1\uffff\1\121\14\uffff\2\51\1\125\1\126\6\51\1\135\17\51\2\uffff"+
        "\1\156\1\157\2\uffff\6\51\1\uffff\20\51\2\uffff\1\u0088\1\u0089"+
        "\1\u008a\5\51\1\u0090\2\51\1\u0093\4\51\1\u0098\4\51\1\u009d\1\u009e"+
        "\1\u009f\3\uffff\1\u00a0\2\51\1\u00a3\1\u00a4\1\uffff\1\u00a5\1"+
        "\51\1\uffff\4\51\1\uffff\1\u00ad\1\u00af\2\51\4\uffff\2\51\3\uffff"+
        "\1\u00b4\1\51\1\u00b7\1\51\1\u00b9\2\51\1\uffff\1\51\1\uffff\1\u00bd"+
        "\2\51\1\u00c0\1\uffff\2\51\1\uffff\1\51\1\uffff\1\u00c4\2\51\1\uffff"+
        "\1\51\1\u00c8\1\uffff\2\51\1\u00cb\1\uffff\1\u00cc\1\u00cd\1\u00ce"+
        "\1\uffff\1\u00cf\1\u00d0\6\uffff";
    static final String DFA11_eofS =
        "\u00d1\uffff";
    static final String DFA11_minS =
        "\1\11\12\uffff\1\75\1\uffff\2\75\3\uffff\1\52\2\uffff\1\60\1\157"+
        "\1\156\1\162\1\146\1\150\1\154\1\150\1\157\1\141\2\145\1\151\1\154"+
        "\1\145\1\143\2\157\1\151\1\162\1\uffff\1\56\14\uffff\1\164\1\144"+
        "\2\60\1\145\1\165\1\163\1\144\2\151\1\60\1\156\1\154\1\141\1\143"+
        "\1\164\1\162\1\154\1\170\2\141\1\162\1\166\1\157\1\154\1\141\2\uffff"+
        "\2\60\2\uffff\1\156\2\145\1\146\1\154\1\164\1\uffff\1\143\1\163"+
        "\1\165\1\144\1\164\1\141\1\143\1\151\1\164\1\156\1\154\1\157\1\145"+
        "\1\160\1\154\1\167\2\uffff\3\60\1\146\1\150\1\165\2\145\1\60\1\145"+
        "\1\162\1\60\1\141\1\164\1\154\1\160\1\60\1\163\1\145\1\153\1\155"+
        "\3\60\3\uffff\1\60\1\151\1\156\2\60\1\uffff\1\60\1\156\1\uffff\1"+
        "\156\2\145\1\163\1\uffff\2\60\2\145\4\uffff\1\154\1\143\3\uffff"+
        "\1\60\1\147\1\60\1\157\1\60\2\145\1\uffff\1\145\1\uffff\1\60\1\156"+
        "\1\145\1\60\1\uffff\1\154\1\145\1\uffff\1\156\1\uffff\1\60\2\154"+
        "\1\uffff\1\164\1\60\1\uffff\1\145\1\154\1\60\1\uffff\3\60\1\uffff"+
        "\2\60\6\uffff";
    static final String DFA11_maxS =
        "\1\175\12\uffff\1\75\1\uffff\2\75\3\uffff\1\57\2\uffff\1\146\1\157"+
        "\1\156\1\162\1\146\1\162\1\156\1\162\1\157\1\165\1\145\1\157\1\151"+
        "\1\154\1\162\1\164\2\157\1\151\1\162\1\uffff\1\71\14\uffff\1\164"+
        "\1\144\2\172\1\145\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\164"+
        "\1\143\1\164\1\162\1\154\1\170\2\141\1\162\1\166\1\157\1\154\1\141"+
        "\2\uffff\2\172\2\uffff\1\156\2\145\1\167\1\154\1\164\1\uffff\1\143"+
        "\1\163\1\165\1\144\1\164\1\141\1\143\1\151\1\164\1\156\1\154\1\157"+
        "\1\145\1\160\1\154\1\167\2\uffff\3\172\1\146\1\150\1\165\2\145\1"+
        "\172\1\145\1\162\1\172\1\141\1\164\1\154\1\160\1\172\1\163\1\145"+
        "\1\153\1\155\3\172\3\uffff\1\172\1\151\1\156\2\172\1\uffff\1\172"+
        "\1\156\1\uffff\1\156\1\151\1\145\1\163\1\uffff\2\172\2\145\4\uffff"+
        "\1\154\1\143\3\uffff\1\172\1\147\1\172\1\157\1\172\2\145\1\uffff"+
        "\1\145\1\uffff\1\172\1\156\1\145\1\172\1\uffff\1\154\1\145\1\uffff"+
        "\1\156\1\uffff\1\172\2\154\1\uffff\1\164\1\172\1\uffff\1\145\1\154"+
        "\1\172\1\uffff\3\172\1\uffff\2\172\6\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\15"+
        "\2\uffff\1\22\1\23\1\24\1\uffff\1\26\1\27\24\uffff\1\73\1\uffff"+
        "\1\77\1\100\1\14\1\13\1\17\1\16\1\21\1\20\1\76\1\25\1\30\1\72\32"+
        "\uffff\1\74\1\75\2\uffff\1\33\1\34\6\uffff\1\41\20\uffff\1\31\1"+
        "\32\30\uffff\1\35\1\70\1\36\5\uffff\1\43\2\uffff\1\46\4\uffff\1"+
        "\53\4\uffff\1\64\1\65\1\67\1\37\2\uffff\1\40\1\47\1\71\7\uffff\1"+
        "\54\1\uffff\1\56\4\uffff\1\45\2\uffff\1\60\1\uffff\1\51\3\uffff"+
        "\1\66\2\uffff\1\44\3\uffff\1\52\3\uffff\1\42\2\uffff\1\63\1\55\1"+
        "\57\1\62\1\50\1\61";
    static final String DFA11_specialS =
        "\u00d1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\14\1\53\1\25\1\1\1\23\1\2"+
            "\1\uffff\1\3\1\4\1\21\1\17\1\5\1\20\1\uffff\1\22\12\52\1\uffff"+
            "\1\6\1\15\1\13\1\16\1\uffff\1\24\2\51\1\41\1\50\1\42\1\47\5"+
            "\51\1\46\1\45\4\51\1\40\1\44\1\43\6\51\1\7\1\uffff\1\10\1\uffff"+
            "\1\51\1\uffff\1\27\2\51\1\35\1\33\1\36\2\51\1\31\4\51\1\26\1"+
            "\30\2\51\1\37\1\51\1\32\2\51\1\34\3\51\1\11\1\uffff\1\12",
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
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "\1\63\4\uffff\1\63",
            "",
            "",
            "\12\66\47\uffff\6\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\11\uffff\1\74",
            "\1\75\1\uffff\1\76",
            "\1\77\11\uffff\1\100",
            "\1\101",
            "\1\103\23\uffff\1\102",
            "\1\104",
            "\1\105\11\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111\14\uffff\1\112",
            "\1\113\20\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\122\1\uffff\12\52",
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
            "\1\123",
            "\1\124",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\136",
            "\1\137",
            "\1\141\22\uffff\1\140",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\165\2\uffff\1\163\15\uffff\1\164",
            "\1\166",
            "\1\167",
            "",
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
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0091",
            "\1\u0092",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a1",
            "\1\u00a2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8\3\uffff\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\51\7\uffff\21\51\1\u00ac\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\12\51\7\uffff\21\51\1\u00ae\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b5",
            "\12\51\7\uffff\21\51\1\u00b6\10\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\1\u00b8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00be",
            "\1\u00bf",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
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
            return "1:1: Tokens : ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | EQUAL | EQ | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | REL | ABS | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | RECT | CIRCLE | ELLIPSE | TEXT | TRANS | TRANSREL | SCALE | SCALEREL | ROTATE | ROTATEREL | MOVEMENT | ROTATION | LOOP | FILL | STROKE | DRAW | TRUE | FALSE | COLOR | ID | INT | FLOAT | COMMENT | STRING | WS );";
        }
    }
 

}