package nel.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMcoreLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=46;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T12=12;
    public static final int RULE_BINARY=5;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalMcoreLexer() {;} 
    public InternalMcoreLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:10:5: ( 'IM' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:10:7: 'IM'
            {
            match("IM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:11:5: ( 'NEXT' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:11:7: 'NEXT'
            {
            match("NEXT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:12:5: ( 'RD' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:12:7: 'RD'
            {
            match("RD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:13:5: ( 'RS' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:13:7: 'RS'
            {
            match("RS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:14:5: ( 'RT' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:14:7: 'RT'
            {
            match("RT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:15:5: ( 'addr' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:15:7: 'addr'
            {
            match("addr"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:16:5: ( '+' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:16:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:17:5: ( '-' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:17:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:18:5: ( '*' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:18:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:19:5: ( '/' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:19:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:20:5: ( '==' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:20:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:21:5: ( '!=' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:21:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:22:5: ( '<' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:22:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:23:5: ( '>' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:23:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:24:5: ( '<=' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:24:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:25:5: ( '>=' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:25:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:26:5: ( 'r' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:26:7: 'r'
            {
            match('r'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:27:5: ( 'i' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:27:7: 'i'
            {
            match('i'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:28:5: ( 'j' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:28:7: 'j'
            {
            match('j'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:29:5: ( 'instruction' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:29:7: 'instruction'
            {
            match("instruction"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:30:5: ( '{' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:30:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:31:5: ( '}' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:31:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:32:5: ( 'type' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:32:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:33:5: ( ';' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:33:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:34:5: ( 'coding' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:34:7: 'coding'
            {
            match("coding"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:35:5: ( 'behavior' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:35:7: 'behavior'
            {
            match("behavior"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:36:5: ( '=' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:36:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:37:5: ( 'if' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:37:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:38:5: ( '(' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:38:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:39:5: ( ',' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:39:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:40:5: ( ')' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:40:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:41:5: ( 'regs' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:41:7: 'regs'
            {
            match("regs"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:42:5: ( '[' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:42:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:43:5: ( ']' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:43:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_BINARY
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1942:13: ( '0x' ( '0' .. '9' | 'A' .. 'F' )+ )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1942:15: '0x' ( '0' .. '9' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1942:20: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BINARY

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1944:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1944:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1944:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1944:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1944:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1946:10: ( ( '0' .. '9' )+ )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1946:12: ( '0' .. '9' )+
            {
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1946:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1946:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1948:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1948:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1950:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1950:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1950:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1950:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:41: ( '\\r' )? '\\n'
                    {
                    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1952:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1954:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1954:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1954:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1956:16: ( . )
            // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1956:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=42;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='I') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='M') ) {
                int LA13_35 = input.LA(3);

                if ( ((LA13_35>='0' && LA13_35<='9')||(LA13_35>='A' && LA13_35<='Z')||LA13_35=='_'||(LA13_35>='a' && LA13_35<='z')) ) {
                    alt13=36;
                }
                else {
                    alt13=1;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='N') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='E') ) {
                int LA13_37 = input.LA(3);

                if ( (LA13_37=='X') ) {
                    int LA13_77 = input.LA(4);

                    if ( (LA13_77=='T') ) {
                        int LA13_88 = input.LA(5);

                        if ( ((LA13_88>='0' && LA13_88<='9')||(LA13_88>='A' && LA13_88<='Z')||LA13_88=='_'||(LA13_88>='a' && LA13_88<='z')) ) {
                            alt13=36;
                        }
                        else {
                            alt13=2;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='R') ) {
            switch ( input.LA(2) ) {
            case 'T':
                {
                int LA13_38 = input.LA(3);

                if ( ((LA13_38>='0' && LA13_38<='9')||(LA13_38>='A' && LA13_38<='Z')||LA13_38=='_'||(LA13_38>='a' && LA13_38<='z')) ) {
                    alt13=36;
                }
                else {
                    alt13=5;}
                }
                break;
            case 'S':
                {
                int LA13_39 = input.LA(3);

                if ( ((LA13_39>='0' && LA13_39<='9')||(LA13_39>='A' && LA13_39<='Z')||LA13_39=='_'||(LA13_39>='a' && LA13_39<='z')) ) {
                    alt13=36;
                }
                else {
                    alt13=4;}
                }
                break;
            case 'D':
                {
                int LA13_40 = input.LA(3);

                if ( ((LA13_40>='0' && LA13_40<='9')||(LA13_40>='A' && LA13_40<='Z')||LA13_40=='_'||(LA13_40>='a' && LA13_40<='z')) ) {
                    alt13=36;
                }
                else {
                    alt13=3;}
                }
                break;
            default:
                alt13=36;}

        }
        else if ( (LA13_0=='a') ) {
            int LA13_4 = input.LA(2);

            if ( (LA13_4=='d') ) {
                int LA13_41 = input.LA(3);

                if ( (LA13_41=='d') ) {
                    int LA13_81 = input.LA(4);

                    if ( (LA13_81=='r') ) {
                        int LA13_89 = input.LA(5);

                        if ( ((LA13_89>='0' && LA13_89<='9')||(LA13_89>='A' && LA13_89<='Z')||LA13_89=='_'||(LA13_89>='a' && LA13_89<='z')) ) {
                            alt13=36;
                        }
                        else {
                            alt13=6;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='+') ) {
            alt13=7;
        }
        else if ( (LA13_0=='-') ) {
            alt13=8;
        }
        else if ( (LA13_0=='*') ) {
            alt13=9;
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=40;
                }
                break;
            case '*':
                {
                alt13=39;
                }
                break;
            default:
                alt13=10;}

        }
        else if ( (LA13_0=='=') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='=') ) {
                alt13=11;
            }
            else {
                alt13=27;}
        }
        else if ( (LA13_0=='!') ) {
            int LA13_10 = input.LA(2);

            if ( (LA13_10=='=') ) {
                alt13=12;
            }
            else {
                alt13=42;}
        }
        else if ( (LA13_0=='<') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='=') ) {
                alt13=15;
            }
            else {
                alt13=13;}
        }
        else if ( (LA13_0=='>') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='=') ) {
                alt13=16;
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA13_55 = input.LA(3);

                if ( (LA13_55=='g') ) {
                    int LA13_82 = input.LA(4);

                    if ( (LA13_82=='s') ) {
                        int LA13_90 = input.LA(5);

                        if ( ((LA13_90>='0' && LA13_90<='9')||(LA13_90>='A' && LA13_90<='Z')||LA13_90=='_'||(LA13_90>='a' && LA13_90<='z')) ) {
                            alt13=36;
                        }
                        else {
                            alt13=32;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt13=36;
                }
                break;
            default:
                alt13=17;}

        }
        else if ( (LA13_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA13_57 = input.LA(3);

                if ( (LA13_57=='s') ) {
                    int LA13_83 = input.LA(4);

                    if ( (LA13_83=='t') ) {
                        int LA13_91 = input.LA(5);

                        if ( (LA13_91=='r') ) {
                            int LA13_98 = input.LA(6);

                            if ( (LA13_98=='u') ) {
                                int LA13_102 = input.LA(7);

                                if ( (LA13_102=='c') ) {
                                    int LA13_105 = input.LA(8);

                                    if ( (LA13_105=='t') ) {
                                        int LA13_108 = input.LA(9);

                                        if ( (LA13_108=='i') ) {
                                            int LA13_110 = input.LA(10);

                                            if ( (LA13_110=='o') ) {
                                                int LA13_112 = input.LA(11);

                                                if ( (LA13_112=='n') ) {
                                                    int LA13_113 = input.LA(12);

                                                    if ( ((LA13_113>='0' && LA13_113<='9')||(LA13_113>='A' && LA13_113<='Z')||LA13_113=='_'||(LA13_113>='a' && LA13_113<='z')) ) {
                                                        alt13=36;
                                                    }
                                                    else {
                                                        alt13=20;}
                                                }
                                                else {
                                                    alt13=36;}
                                            }
                                            else {
                                                alt13=36;}
                                        }
                                        else {
                                            alt13=36;}
                                    }
                                    else {
                                        alt13=36;}
                                }
                                else {
                                    alt13=36;}
                            }
                            else {
                                alt13=36;}
                        }
                        else {
                            alt13=36;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
                }
                break;
            case 'f':
                {
                int LA13_58 = input.LA(3);

                if ( ((LA13_58>='0' && LA13_58<='9')||(LA13_58>='A' && LA13_58<='Z')||LA13_58=='_'||(LA13_58>='a' && LA13_58<='z')) ) {
                    alt13=36;
                }
                else {
                    alt13=28;}
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt13=36;
                }
                break;
            default:
                alt13=18;}

        }
        else if ( (LA13_0=='j') ) {
            int LA13_15 = input.LA(2);

            if ( ((LA13_15>='0' && LA13_15<='9')||(LA13_15>='A' && LA13_15<='Z')||LA13_15=='_'||(LA13_15>='a' && LA13_15<='z')) ) {
                alt13=36;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='{') ) {
            alt13=21;
        }
        else if ( (LA13_0=='}') ) {
            alt13=22;
        }
        else if ( (LA13_0=='t') ) {
            int LA13_18 = input.LA(2);

            if ( (LA13_18=='y') ) {
                int LA13_63 = input.LA(3);

                if ( (LA13_63=='p') ) {
                    int LA13_85 = input.LA(4);

                    if ( (LA13_85=='e') ) {
                        int LA13_92 = input.LA(5);

                        if ( ((LA13_92>='0' && LA13_92<='9')||(LA13_92>='A' && LA13_92<='Z')||LA13_92=='_'||(LA13_92>='a' && LA13_92<='z')) ) {
                            alt13=36;
                        }
                        else {
                            alt13=23;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0==';') ) {
            alt13=24;
        }
        else if ( (LA13_0=='c') ) {
            int LA13_20 = input.LA(2);

            if ( (LA13_20=='o') ) {
                int LA13_65 = input.LA(3);

                if ( (LA13_65=='d') ) {
                    int LA13_86 = input.LA(4);

                    if ( (LA13_86=='i') ) {
                        int LA13_93 = input.LA(5);

                        if ( (LA13_93=='n') ) {
                            int LA13_100 = input.LA(6);

                            if ( (LA13_100=='g') ) {
                                int LA13_103 = input.LA(7);

                                if ( ((LA13_103>='0' && LA13_103<='9')||(LA13_103>='A' && LA13_103<='Z')||LA13_103=='_'||(LA13_103>='a' && LA13_103<='z')) ) {
                                    alt13=36;
                                }
                                else {
                                    alt13=25;}
                            }
                            else {
                                alt13=36;}
                        }
                        else {
                            alt13=36;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='b') ) {
            int LA13_21 = input.LA(2);

            if ( (LA13_21=='e') ) {
                int LA13_66 = input.LA(3);

                if ( (LA13_66=='h') ) {
                    int LA13_87 = input.LA(4);

                    if ( (LA13_87=='a') ) {
                        int LA13_94 = input.LA(5);

                        if ( (LA13_94=='v') ) {
                            int LA13_101 = input.LA(6);

                            if ( (LA13_101=='i') ) {
                                int LA13_104 = input.LA(7);

                                if ( (LA13_104=='o') ) {
                                    int LA13_107 = input.LA(8);

                                    if ( (LA13_107=='r') ) {
                                        int LA13_109 = input.LA(9);

                                        if ( ((LA13_109>='0' && LA13_109<='9')||(LA13_109>='A' && LA13_109<='Z')||LA13_109=='_'||(LA13_109>='a' && LA13_109<='z')) ) {
                                            alt13=36;
                                        }
                                        else {
                                            alt13=26;}
                                    }
                                    else {
                                        alt13=36;}
                                }
                                else {
                                    alt13=36;}
                            }
                            else {
                                alt13=36;}
                        }
                        else {
                            alt13=36;}
                    }
                    else {
                        alt13=36;}
                }
                else {
                    alt13=36;}
            }
            else {
                alt13=36;}
        }
        else if ( (LA13_0=='(') ) {
            alt13=29;
        }
        else if ( (LA13_0==',') ) {
            alt13=30;
        }
        else if ( (LA13_0==')') ) {
            alt13=31;
        }
        else if ( (LA13_0=='[') ) {
            alt13=33;
        }
        else if ( (LA13_0==']') ) {
            alt13=34;
        }
        else if ( (LA13_0=='0') ) {
            int LA13_27 = input.LA(2);

            if ( (LA13_27=='x') ) {
                alt13=35;
            }
            else {
                alt13=37;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_28 = input.LA(2);

            if ( ((LA13_28>='A' && LA13_28<='Z')||LA13_28=='_'||(LA13_28>='a' && LA13_28<='z')) ) {
                alt13=36;
            }
            else {
                alt13=42;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='Q')||(LA13_0>='S' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='d' && LA13_0<='h')||(LA13_0>='k' && LA13_0<='q')||LA13_0=='s'||(LA13_0>='u' && LA13_0<='z')) ) {
            alt13=36;
        }
        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
            alt13=37;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_31 = input.LA(2);

            if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFE')) ) {
                alt13=38;
            }
            else {
                alt13=42;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_32 = input.LA(2);

            if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFE')) ) {
                alt13=38;
            }
            else {
                alt13=42;}
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=41;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='.'||LA13_0==':'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=42;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:146: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 36 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}