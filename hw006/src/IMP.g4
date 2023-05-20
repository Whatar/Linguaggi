grammar IMP;

main : prog EOF ;

prog : com EOF ;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE #if
    | ID ASSIGN exp #assign
    | ID LSQUARE exp RSQUARE ASSIGN exp #arrayAssign
    | SKIPP #skip
    | com SEMICOLON com #seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE #while
    | OUT LPAR str (CONCAT str)* RPAR #out
    ;

exp : NAT                             # nat
    | BOOL                              # bool
    | NOT exp                           # not
    | ID                                # id
    | ID LSQUARE exp RSQUARE            # arrayElem
    | <assoc=right> exp POW exp         # pow
    | exp op=(TIMES | DIV | MOD) exp    # mulDivMod
    | exp op=(PLUS | MINUS) exp         # plusMinus
    | exp op=(EQQ | NEQ) exp            # eqExp
    | exp op=(LT | LEQ | GEQ | GT) exp  # cmpExp
    | exp op=(AND | OR) exp             # logicExp
    | LPAR exp RPAR                     # parExp
    ;

str : STRING | TOSTRING LPAR exp RPAR;

TOSTRING : 'tostr' ;

CONCAT : '.' ;

BOOL : 'true' | 'false' ;
NOT : '!' ;
AND : '&' ;
OR : '|' ;
EQQ : '==' ;
NEQ : '!=' ;
LT : '<' ;
LEQ : '<=' ;
GEQ : '>=' ;
GT : '>' ;

WHILE : 'while' ;
OUT : 'out' ;
SKIPP : 'skip' ;

IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;

LPAR      : '(' ;
RPAR      : ')' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
LSQUARE   : '[' ;
RSQUARE   : ']' ;

PLUS      : '+' ;
TIMES     : '*' ;
MINUS     : '-' ;
DIV       : '/' ;
MOD       : 'mod' ;
POW       : '^' ;
ASSIGN     : '=' ;

SEMICOLON : ';' ;

NAT : '0' | POS ;
fragment POS : POSDIGIT DIGIT * ;
fragment DIGIT : '0' | POSDIGIT ;
fragment POSDIGIT : [1-9] ;

// https://www.antlr3.org/pipermail/antlr-interest/2011-September/042650.html
STRING : '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;
fragment ESC_SEQ : '\\' ('b'|'t'|'n'|'f'|'r'|'/"'|'\''|'\\') ;
fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
fragment UNICODE_ESC : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

ID    : [a-z]+;

WS    : [ \t\n\r]+ -> skip ;