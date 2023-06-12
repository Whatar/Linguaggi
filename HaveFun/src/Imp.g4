grammar Imp;

prog : fun* com EOF ;

fun: INITFUN ID LPAR vars RPAR LBRACE com SEMICOLON RETURN exp RBRACE;

vars: ID | ID COMMA ID |;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | GLOBAL ID ASSIGN exp                                              # newGlobalAssign
    | ID GL ASSIGN exp                                                  # globalAssign
    | SKIPP                                                             # skip
    | com SEMICOLON com                                                 # seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | ARNC_INIT arn ARNC_END com                                        # arnoldC
    | OUT LPAR exp RPAR                                                 # out
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID                                  # id
    | ID GL                               # globalId
    | ID LPAR exp* RPAR                   # funCall
    ;

arn : ARNC_SHOWTIME stat ARNC_TERM;

stat :

INITFUN: 'fun';
RETURN: 'return';

GLOBAL: 'global';

GL: '.g';

NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;

AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;

LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;

ARNC_INIT : '${' ;
ARNC_END  : '}$' ;

ARNC_SHOWTIME : 'IT\'S SHOWTIME';                   //main begin
ARNC_TERM : 'YOU HAVE BEEN TERMINATED';             //main end
ARNC_HAND : 'TALK TO THE HAND';                     //print string or var
ARNC_DECL : 'HEY CHRISTMAS TREE';                   //VAR DECLARATION --> HEY CHRISTMAS TREE variablename
ARNC_VARSET : 'YOU SET US UP';                      //VAR SETTING --> YOU SET US UP initialvalue

ARNC_ASSIGN : 'GET TO THE CHOPPER';                 //OP VAR ASSIGNMENT --> GET TO THE CHOPPER myvaR
ARNC_OPBASE : 'HERE IS MY INVITATION';              //OP SET STACK TOP --> HERE IS MY INVITATION firstOperand
ARNC_PLUS : 'GET UP';
ARNC_MINUS : 'GET DOWN';
ARNC_MUL : 'YOU\'RE FIRED';
ARNC_DIV : 'HE HAD TO SPLIT';
ARNC_OPEND : 'ENOUGH TALK';

ARNC_VALZERO : '@I LIED';
ARNC_VALONE : '@NO PROBLEMO';

ID : [A-Za-z]+ ;

WS : [ \t\r\n]+ -> skip ;
