grammar ex1;
exp : INTEGER # integer
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
INTEGER : NEG | NAT;
NEG: '-' [1-9][0-9]*;
NAT : '0' | [1-9][0-9]*;
WS : [ \t\r\n]+ -> skip;