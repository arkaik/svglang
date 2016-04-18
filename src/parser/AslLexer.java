// $ANTLR 3.4 /home/falc/FIB/cl/svglang/src/parser/Asl.g 2016-04-15 09:19:05

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:7: ( '&' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:6:9: '&'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:7: ( '(' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:7: ( ')' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:7: ( ',' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:7: ( ';' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:10:9: ';'
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
    // $ANTLR end "T__54"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:7: ( '=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:170:9: '='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:10: ( '!=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:171:12: '!='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:8: ( '<' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:172:10: '<'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:8: ( '<=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:173:10: '<='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:8: ( '>' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:174:10: '>'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:8: ( '>=' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:175:10: '>='
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:6: ( '+' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:176:8: '+'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:177:7: ( '-' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:177:9: '-'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:9: ( '*' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:178:11: '*'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:9: ( '/' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:179:11: '/'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:180:9: ( '%' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:180:11: '%'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:9: ( 'not' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:181:11: 'not'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:9: ( 'and' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:182:11: 'and'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:183:8: ( 'or' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:183:10: 'or'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:6: ( 'if' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:184:8: 'if'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:6: ( 'then' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:185:8: 'then'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:186:6: ( 'else' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:186:8: 'else'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:7: ( 'endif' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:187:9: 'endif'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:7: ( 'while' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:188:9: 'while'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:8: ( 'do' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:189:10: 'do'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:9: ( 'endwhile' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:190:11: 'endwhile'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:191:6: ( 'func' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:191:8: 'func'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:9: ( 'endfunc' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:192:11: 'endfunc'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:8: ( 'return' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:193:10: 'return'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:6: ( 'read' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:194:8: 'read'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:7: ( 'write' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:195:9: 'write'
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

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:9: ( 'create' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:197:11: 'create'
            {
            match("create"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "RECT"
    public final void mRECT() throws RecognitionException {
        try {
            int _type = RECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:9: ( 'rect' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:198:11: 'rect'
            {
            match("rect"); 



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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:9: ( 'circle' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:199:11: 'circle'
            {
            match("circle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCLE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:9: ( 'true' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:201:11: 'true'
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:202:9: ( 'false' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:202:11: 'false'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:203:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:6: ( ( '0' .. '9' )+ )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:8: ( '0' .. '9' )+
            {
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:204:8: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:207:30: '\\r'
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
                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:13: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:208:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/falc/FIB/cl/svglang/src/parser/Asl.g:212:28: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:218:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/falc/FIB/cl/svglang/src/parser/Asl.g:221:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:8: ( T__50 | T__51 | T__52 | T__53 | T__54 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | CREATE | RECT | CIRCLE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt8=41;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:10: T__50
                {
                mT__50(); 


                }
                break;
            case 2 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:16: T__51
                {
                mT__51(); 


                }
                break;
            case 3 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:22: T__52
                {
                mT__52(); 


                }
                break;
            case 4 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:28: T__53
                {
                mT__53(); 


                }
                break;
            case 5 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:34: T__54
                {
                mT__54(); 


                }
                break;
            case 6 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:91: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:95: AND
                {
                mAND(); 


                }
                break;
            case 19 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:99: OR
                {
                mOR(); 


                }
                break;
            case 20 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:102: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:105: THEN
                {
                mTHEN(); 


                }
                break;
            case 22 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:110: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:115: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 24 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:121: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:127: DO
                {
                mDO(); 


                }
                break;
            case 26 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:130: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:139: FUNC
                {
                mFUNC(); 


                }
                break;
            case 28 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:144: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 29 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:152: RETURN
                {
                mRETURN(); 


                }
                break;
            case 30 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:159: READ
                {
                mREAD(); 


                }
                break;
            case 31 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:164: WRITE
                {
                mWRITE(); 


                }
                break;
            case 32 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:170: CREATE
                {
                mCREATE(); 


                }
                break;
            case 33 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:177: RECT
                {
                mRECT(); 


                }
                break;
            case 34 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:182: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 35 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:189: TRUE
                {
                mTRUE(); 


                }
                break;
            case 36 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:194: FALSE
                {
                mFALSE(); 


                }
                break;
            case 37 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:200: ID
                {
                mID(); 


                }
                break;
            case 38 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:203: INT
                {
                mINT(); 


                }
                break;
            case 39 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:207: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 40 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:215: STRING
                {
                mSTRING(); 


                }
                break;
            case 41 :
                // /home/falc/FIB/cl/svglang/src/parser/Asl.g:1:222: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff\1\37\1\41\3\uffff\1\43\1\uffff\13\32\12\uffff\2\32\1\66"+
        "\1\67\6\32\1\76\5\32\1\106\1\107\2\uffff\6\32\1\uffff\7\32\2\uffff"+
        "\1\127\1\130\1\131\5\32\1\137\2\32\1\142\1\143\2\32\3\uffff\1\146"+
        "\2\32\1\151\1\152\1\uffff\1\153\1\32\2\uffff\2\32\1\uffff\2\32\3"+
        "\uffff\1\161\1\162\1\163\1\32\1\165\3\uffff\1\166\2\uffff";
    static final String DFA8_eofS =
        "\167\uffff";
    static final String DFA8_minS =
        "\1\11\7\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\1\145\1\151\12\uffff\1\164\1\144"+
        "\2\60\1\145\1\165\1\163\1\144\2\151\1\60\1\156\1\154\1\141\1\145"+
        "\1\162\2\60\2\uffff\1\156\2\145\1\146\1\154\1\164\1\uffff\1\143"+
        "\1\163\1\165\1\144\1\164\1\141\1\143\2\uffff\3\60\1\146\1\150\1"+
        "\165\2\145\1\60\1\145\1\162\2\60\1\164\1\154\3\uffff\1\60\1\151"+
        "\1\156\2\60\1\uffff\1\60\1\156\2\uffff\2\145\1\uffff\1\154\1\143"+
        "\3\uffff\3\60\1\145\1\60\3\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\172\7\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\1\162\12\uffff\1\164\1\144"+
        "\2\172\1\145\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\164\1\145"+
        "\1\162\2\172\2\uffff\1\156\2\145\1\167\1\154\1\164\1\uffff\1\143"+
        "\1\163\1\165\1\144\1\164\1\141\1\143\2\uffff\3\172\1\146\1\150\1"+
        "\165\2\145\1\172\1\145\1\162\2\172\1\164\1\154\3\uffff\1\172\1\151"+
        "\1\156\2\172\1\uffff\1\172\1\156\2\uffff\2\145\1\uffff\1\154\1\143"+
        "\3\uffff\3\172\1\145\1\172\3\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\15\1\16\1\uffff"+
        "\1\20\13\uffff\1\45\1\46\1\50\1\51\1\11\1\10\1\13\1\12\1\47\1\17"+
        "\22\uffff\1\23\1\24\6\uffff\1\31\7\uffff\1\21\1\22\17\uffff\1\25"+
        "\1\43\1\26\5\uffff\1\33\2\uffff\1\36\1\41\2\uffff\1\27\2\uffff\1"+
        "\30\1\37\1\44\5\uffff\1\35\1\40\1\42\1\uffff\1\34\1\32";
    static final String DFA8_specialS =
        "\167\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\7\1\34\2\uffff\1\16\1\1\1"+
            "\uffff\1\2\1\3\1\14\1\12\1\4\1\13\1\uffff\1\15\12\33\1\uffff"+
            "\1\5\1\10\1\6\1\11\2\uffff\32\32\4\uffff\1\32\1\uffff\1\20\1"+
            "\32\1\31\1\26\1\24\1\27\2\32\1\22\4\32\1\17\1\21\2\32\1\30\1"+
            "\32\1\23\2\32\1\25\3\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "\1\42\4\uffff\1\42",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\11\uffff\1\51",
            "\1\52\1\uffff\1\53",
            "\1\54\11\uffff\1\55",
            "\1\56",
            "\1\60\23\uffff\1\57",
            "\1\61",
            "\1\63\10\uffff\1\62",
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
            "\1\64",
            "\1\65",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\77",
            "\1\100",
            "\1\102\1\uffff\1\103\20\uffff\1\101",
            "\1\104",
            "\1\105",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\115\2\uffff\1\113\15\uffff\1\114",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\140",
            "\1\141",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\147",
            "\1\150",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\164",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__50 | T__51 | T__52 | T__53 | T__54 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | CREATE | RECT | CIRCLE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}