grammar ex2;

main: start EOF;

start: init ';' start # initialization
| exp ';' start # expression
| exp # last;

init: ID '=' exp;
exp : INTEGER # integer
    | ID # identifier
    | LPAR exp PLUS exp RPAR # plus
    | LPAR exp MUL exp RPAR # mul
    | LPAR exp MINUS exp RPAR # minus
    | LPAR exp DIV exp RPAR # div
    | LPAR exp MOD exp RPAR # mod;

LPAR : '(';
RPAR : ')';

PLUS : '+';
MUL : '*';
MINUS : '-';
DIV : '/';
MOD : 'mod';

INTEGER : NEG | NAT;
NEG: '-' [1-9][0-9]*;
NAT : '0' | [1-9][0-9]*;

ID: [a-z]+;

WS : [ \n\t\r]+ -> skip;