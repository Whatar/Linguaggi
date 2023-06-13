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
    | ARNC_INIT arnc ARNC_END SEMICOLON com                                       # arnoldC
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

arnc : ARNC_SHOWTIME (stat)* ARNC_TERM;

stat : ARNC_PRINT arnc_exp                                                  # arnc_print
     | ARNC_DECL ID ARNC_VARSET arnc_exp                                    # arnc_declaration
     | ARNC_DECL GLOBAL ID ARNC_VARSET arnc_exp                             # arnc_globalDeclaration
     | ARNC_ASSIGN ID ARNC_OP_BASE arnc_exp arnc_op ARNC_OP_END             # arnc_assign
     | ARNC_ASSIGN GL ID ARNC_OP_BASE arnc_exp arnc_op ARNC_OP_END          # arnc_globalAssign
     | ARNC_IF arnc_exp (stat)* ((ARNC_ELSE arnc_exp)*)? ARNC_ENDIF         # arnc_if
     | ARNC_WHILE arnc_exp (stat)* ARNC_WHEND                               # arnc_while
     ;

arnc_exp : NAT                                          # arnc_nat
         | BOOL                                         # arnc_bool
         | LPAR arnc_exp RPAR                           # arnc_parExp
         | <assoc=right> arnc_exp POW arnc_exp          # arnc_pow
         | NOT arnc_exp                                 # arnc_not
         | arnc_exp op=(DIV | MUL | MOD) arnc_exp       # arnc_divMulMod
         | arnc_exp op=(PLUS | MINUS) arnc_exp          # arnc_plusMinus
         | arnc_exp op=(LT | LEQ | GEQ | GT) arnc_exp   # arnc_cmpExp
         | arnc_exp op=(EQQ | NEQ) arnc_exp             # arnc_eqExp
         | arnc_exp op=(AND | OR) arnc_exp              # arnc_logicExp
         | ID                                           # arnc_id
         | ID GL                                        # arnc_globalId
         | ID LPAR exp* RPAR                            # arnc_funCall
         | ARNC_VALONE                                  # arnc_valzero
         | ARNC_VALZERO                                 # arnc_valone
         ;
//TODO : per ora ho solo copiato per testare, probabilmente va bene ma devo controllare se servono tutte le operazioni

arnc_op : ARNC_PLUS arnc_exp                            # arnc_plus
        | ARNC_MINUS arnc_exp                           # arnc_minus
        | ARNC_MUL arnc_exp                             # arnc_mul
        | ARNC_DIV arnc_exp                             # arnc_div
        | ARNC_EQUAL arnc_exp                           # arnc_equ
        | ARNC_GRATER arnc_exp                          # arnc_gt
        | ARNC_OR arnc_exp                              # arnc_or
        | ARNC_AND arnc_exp                             # arnc_and
        ;

//TODO : implementare @NO PROBLEMO e @I LIED come valori costanti

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
ARNC_PRINT : 'TALK TO THE HAND';                    //print string or var
ARNC_DECL : 'HEY CHRISTMAS TREE';                   //VAR DECLARATION --> HEY CHRISTMAS TREE variablename
ARNC_VARSET : 'YOU SET US UP';                      //VAR SETTING --> YOU SET US UP initialvalue

ARNC_ASSIGN : 'GET TO THE CHOPPER';                 //OP VAR ASSIGNMENT --> GET TO THE CHOPPER myvaR
ARNC_OP_BASE : 'HERE IS MY INVITATION';             //OP SET STACK TOP --> HERE IS MY INVITATION firstOperand
ARNC_PLUS : 'GET UP';
ARNC_MINUS : 'GET DOWN';
ARNC_MUL : 'YOU\'RE FIRED';
ARNC_DIV : 'HE HAD TO SPLIT';
ARNC_OP_END : 'ENOUGH TALK';

ARNC_EQUAL : 'YOU ARE NOT YOU YOU ARE ME';          //LOGICAL EQUAL TO --> YOU ARE NOT YOU YOU ARE ME operand
ARNC_GRATER : 'LET OFF SOME STEAM BENNET';          //LOGICAL GRATER THAN --> LET OFF SOME STEAM BENNET operand
ARNC_OR : 'CONSIDER THAT A DIVORCE';                //LOGICAL OR --> CONSIDER THAT A DIVORCE operand
ARNC_AND : 'KNOCK KNOCK';                           //LOGICAL AND --> KNOCK KNOCK operand

ARNC_IF : 'BECAUSE I\'M GOING TO SAY PLEASE';       //CONDITIONAL IF --> BECAUSE I'M GOING TO SAY PLEASE value
                                                    //[statements]
ARNC_ELSE : 'BULLSHIT';                             //ELSE
                                                    //[statements]
ARNC_ENDIF : 'YOU HAVE NO RESPECT FOR LOGIC';       //IF END

ARNC_WHILE : 'STICK AROUND';                        //WHILE LOOP --> STICK AROUND value
                                                    //[statements]
ARNC_WHEND : 'CHILL';                               //WHILE END

ARNC_VALZERO : '@I LIED';                           //
ARNC_VALONE : '@NO PROBLEMO';                       //

ID : [A-Za-z]+[A-Za-z0-9]* ;
//TODO : nomi variabili con cifre

WS : [ \t\r\n]+ -> skip ;
