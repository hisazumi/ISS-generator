lexer grammar InternalMcore;
@header {
package nel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'instruction' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'type' ;
T16 : ';' ;
T17 : 'coding' ;
T18 : 'behavior' ;
T19 : '=' ;
T20 : 'if' ;
T21 : '(' ;
T22 : ',' ;
T23 : ')' ;
T24 : 'IM' ;
T25 : 'NEXT' ;
T26 : 'regs' ;
T27 : '[' ;
T28 : ']' ;
T29 : 'RD' ;
T30 : 'RS' ;
T31 : 'RT' ;
T32 : 'addr' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : '/' ;
T37 : '==' ;
T38 : '!=' ;
T39 : '<' ;
T40 : '>' ;
T41 : '<=' ;
T42 : '>=' ;
T43 : 'r' ;
T44 : 'i' ;
T45 : 'j' ;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1137
RULE_BINARY : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1139
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1141
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1143
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1145
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1147
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1149
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g" 1151
RULE_ANY_OTHER : .;


