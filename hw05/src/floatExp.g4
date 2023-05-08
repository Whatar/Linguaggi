grammar floatExp;

main : prog EOF ;

prog : init exp ;

init : ID EQUAL exp SEMICOLON init    # idinit
     |                                # nilinit
     ;

exp : LPAR exp TIMES exp RPAR       # mul
    | LPAR exp DIV exp RPAR         # div
    | LPAR exp MOD exp RPAR         # mod
    | LPAR exp EXPONENT exp RPAR    # exponent
    | LPAR exp PLUS exp RPAR        # plus
    | LPAR exp MINUS exp RPAR       # minus
    | exp op =( EXPONENT | MOD | TIMES | DIV | PLUS | MINUS) exp # expression
    | NUM # num
    | ID  # id
    ;

LPAR      : '(' ;
RPAR      : ')' ;
PLUS      : '+' ;
TIMES     : '*' ;
MINUS     : '-' ;
DIV       : '/' ;
MOD       : 'mod' ;
EXPONENT  : '^' ;
EQUAL     : '=' ;
SEMICOLON : ';' ;

NUM : FLOAT;
FLOAT : INT | (INT | '-' '0') '.' DIGIT + ;
fragment INT : NAT | '-' POS ;
fragment NAT : '0' | POS ;
fragment POS : POSDIGIT DIGIT * ;
fragment DIGIT : '0' | POSDIGIT ;
fragment POSDIGIT : [1-9] ;

ID    : [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;