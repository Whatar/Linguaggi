grammar IMP;

main : prog EOF ;

prog : com EOF ;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE #if
    | ID ASSIGN exp #assign
    | SKIPP #skip
    | com SEMICOLON com #seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE #while
    | OUT LPAR exp RPAR #out
    ;

exp : NAT                             # nat
    | BOOL                              # bool
    | NOT exp                           # not
    | ID                                # id
    | <assoc=right> exp POW exp         # pow
    | exp op=(TIMES | DIV | MOD) exp    # mulDivMod
    | exp op=(PLUS | MINUS) exp         # plusMinus
    | exp op=(EQQ | NEQ) exp            # qrExp
    | exp op=(LT | LEQ | GEQ | GT) exp  # cmpExp
    | exp op=(AND | OR) exp             # logicExp
    | LPAR exp RPAR                     # parExp
    ;

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

ID    : [a-z]+;

WS    : [ \t\n\r]+ -> skip ;