grammar ex2;

prog: init prog | calc prog;

init: ID '=' exp ';' | EOF;
calc: exp ';' | EOF;
exp : INTEGER # integer
| ID # identifier
| LPAR exp PLUS exp RPAR # plus
| LPAR exp MUL exp RPAR # mul
| LPAR exp MINUS exp RPAR # minus
| LPAR exp DIV exp RPAR # mul
| LPAR exp MOD exp RPAR # mod
;

LPAR : '(';
RPAR : ')';

PLUS : '+';
MUL : '*';
MINUS : '-';
DIV : '/';
MOD : 'mod';


NAT : '0' | [1-9][0-9]*;
NEG : '-' [1-9][0-9]*;
ID: [a-z]+;

WS : [ \n\t\r]+ -> skip;