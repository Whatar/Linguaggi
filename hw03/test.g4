grammar test;

start : ID | ID INT ID;
ID : [a-z]+;
INT : [0-9]+;
WS : [ \t]+ -> skip;