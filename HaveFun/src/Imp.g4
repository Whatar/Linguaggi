grammar Imp;

prog : fun* newGlobalAssign* com EOF ;

fun: INITFUN ID LPAR vars RPAR LBRACE (com SEMICOLON)? RETURN exp RBRACE;

vars: ID* (COMMA ID)* |;

newGlobalAssign: GLOBAL ID ASSIGN exp SEMICOLON;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE                # if
    | ID ASSIGN exp                                                                 # assign
    | ID GL ASSIGN exp                                                              # globalAssign
    | SKIPP                                                                         # skip
    | com SEMICOLON com                                                             # seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE                                         # while
    | ARNC_INIT (arncMet)* ARNC_SHOWTIME arncCom ARNC_TERM (arncMet)* ARNC_END      # arnoldC
    | OUT LPAR exp RPAR                                                             # out
    | LBRACE com RBRACE ND LBRACE com RBRACE                                        # nonDet
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
    | ID LPAR exp* (COMMA exp)* RPAR      # funCall
    | ID                                  # id
    | ID GL                               # globalId
    ;

arncCom : ARNC_PRINT arncExp                                        # arncPrint
     | ARNC_DECL ID arncVarAss                                      # arncDeclaration
     | ARNC_OP_ASSIGN ID ARNC_OP_BASE arncExp (arncOp)* ARNC_OP_END # arncOpResAssign
     | ARNC_IF arncExp arncCom (ARNC_ELSE arncCom)* ARNC_ENDIF      # arncIf
     | ARNC_WHILE arncExp arncCom ARNC_WHEND                        # arncWhile
     | ARNC_METASSIGN ID arncCom                                    # arncMetAss
     | ARNC_CALLMET ID (arncExp)*                                   # arncMetCall
     | arncCom arncCom                                              # arncSeq
     ;

arncVarAss : ARNC_VARSET arncExp                                          # arncAssign
           | ARNC_SLY ID GL arncExp                                       # arncGlobalAssign
           ;

arncMet : ARNC_METHOD ID (ARNC_METARGS ID)* arncMetBody ARNC_METCLOSE   # arncMethod
        ;

arncMetBody : ARNC_METNONVOID arncCom ARNC_RET arncExp              # arncMetNonVoid
            | arncCom                                               # arncMetVoid
            ;

arncExp : NAT                                                       # arncNat
         | FLOAT                                                    # arncFloat
         | BOOL                                                     # arncBool
         | STRING                                                   # arncString
         | LPAR arncExp RPAR                                        # arncParExp
         | ARNC_VALONE                                              # arncValzero
         | ARNC_VALZERO                                             # arncValone
         | ID                                                       # arncId
         | ID GL                                                    # arncGlobalId
         | ID LPAR arncExp* RPAR                                    # arncFunCall   //check if needed
         ;

arncOp : aop = (ARNC_DIV | ARNC_MUL) arncExp                            # arncDivMul
        | aop = (ARNC_PLUS | ARNC_MINUS) arncExp                        # arncPlusMinus
        | aop = (ARNC_EQUAL | ARNC_GRATER) arncExp                      # arncCmpOp
        | aop = (ARNC_OR | ARNC_AND) arncExp                            # arncLogOp
        ;

INITFUN: 'fun';
RETURN: 'return';

GLOBAL: 'global';

GL: '.g';
ND: 'nd';

NAT : '0' | [1-9][0-9]* ;
INT    : NAT | '-' POS;
FLOAT   : INT | (INT | '-' '0') '.' DIGIT+;
fragment POS    : POSDIGIT DIGIT*;
fragment DIGIT  : '0' | POSDIGIT;
fragment POSDIGIT   : [1-9];
STRING : '"' STRCHR* '"' ;
fragment STRCHR : ~["\\\r\n] | ESC ;
fragment ESC    : '\\' [btnfr"'\\] ;
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

COMMA : ',' ;

ARNC_INIT : '${' ;
ARNC_END  : '}$' ;

ARNC_SHOWTIME : 'IT\'S SHOWTIME';                   //main begin
ARNC_TERM : 'YOU HAVE BEEN TERMINATED';             //main end
ARNC_PRINT : 'TALK TO THE HAND';                    //print string or var
ARNC_DECL : 'HEY CHRISTMAS TREE';                   //VAR DECLARATION --> HEY CHRISTMAS TREE variablename
ARNC_VARSET : 'YOU SET US UP';                      //VAR SETTING --> YOU SET US UP initialvalue
ARNC_SLY: 'ARNOLD OR SLY';                          //GLOBAL VAR ASSIGNMENT --> ARNOLD OR SLY globalvar var

ARNC_OP_ASSIGN : 'GET TO THE CHOPPER';              //OP VAR ASSIGNMENT --> GET TO THE CHOPPER myvaR
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

ARNC_VALZERO : '@I LIED';                           //VALUE 0
ARNC_VALONE : '@NO PROBLEMO';                       //VALUE 1

ARNC_METHOD : 'LISTEN TO ME VERY CAREFULLY';
ARNC_METCLOSE : 'HASTA LA VISTA, BABY';
ARNC_METARGS : 'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';
ARNC_METNONVOID : 'GIVE THESE PEOPLE AIR';
ARNC_RET : 'I\'LL BE BACK';
ARNC_METASSIGN : 'GET YOUR ASS TO MARS';            //ASSIGN VAR FROM METHOD CALL --> GET YOUR ASS TO MARS result4
ARNC_CALLMET : 'DO IT NOW';                         //CAL METHOD --> DO IT NOW modulo 5559 345


ID : [A-Za-z]+[A-Za-z0-9]* ;

WS : [ \t\r\n]+ -> skip ;
