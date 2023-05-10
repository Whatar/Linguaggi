grammar floatExp;

main : prog EOF ;

prog : init exp ;

init : ID EQUAL exp SEMICOLON init    # idinit
     |                                # nilinit
     ;

exp : LPAR exp TIMES exp RPAR       # bmul
    | LPAR exp DIV exp RPAR         # bdiv
    | LPAR exp MOD exp RPAR         # bmod
    | LPAR exp EXPONENT exp RPAR    # bexponent
    | LPAR exp PLUS exp RPAR        # bplus
    | LPAR exp MINUS exp RPAR       # bminus
    | exp TIMES exp # mul
    | exp DIV exp   # div
    | exp MOD exp   # mod
    | <assoc=right> exp EXPONENT exp # exponent
    | exp PLUS exp  # plus
    | exp MINUS exp # minus
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