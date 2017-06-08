lexer grammar InternalMcore;
@header {
package nel.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'IM' ;
T13 : 'NEXT' ;
T14 : 'RD' ;
T15 : 'RS' ;
T16 : 'RT' ;
T17 : 'addr' ;
T18 : '+' ;
T19 : '-' ;
T20 : '*' ;
T21 : '/' ;
T22 : '==' ;
T23 : '!=' ;
T24 : '<' ;
T25 : '>' ;
T26 : '<=' ;
T27 : '>=' ;
T28 : 'r' ;
T29 : 'i' ;
T30 : 'j' ;
T31 : 'instruction' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'type' ;
T35 : ';' ;
T36 : 'coding' ;
T37 : 'behavior' ;
T38 : '=' ;
T39 : 'if' ;
T40 : '(' ;
T41 : ',' ;
T42 : ')' ;
T43 : 'regs' ;
T44 : '[' ;
T45 : ']' ;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1942
RULE_BINARY : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1944
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1946
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1948
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1950
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1952
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1954
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nel.Mcore.ui/src-gen/nel/contentassist/antlr/internal/InternalMcore.g" 1956
RULE_ANY_OTHER : .;


