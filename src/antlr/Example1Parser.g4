parser grammar Example1Parser;

options {tokenVocab=Example1Lexer;}
program
    : topLevel*
    ;
topLevel
    : variables_decl
    | class_decl
    | function
    | widget
    ;
class_decl
    : ABSTRACT? CLASS CHARS CURLYOPEN class_member* CURLYCLOSE
    ;
class_member
    : variables_decl
    | function
    ;
variables_decl
    : type CHARS EQUAL expr SEMICOLON
    | list
    ;
function
    : (VOID| type) CHARS
       OPENTEXT function_parameters? CLOSETEXT
       block
    ;
function_parameters
    : type CHARS (COMMA type CHARS)*
    ;
call_function
    : CHARS OPENTEXT CLOSETEXT SEMICOLON
    ;
for_statement
    : FOR OPENTEXT for_first_part SEMICOLON
    for_secomd_part SEMICOLON
    for_statement_variable_number CLOSETEXT  block
    ;
for_first_part
    :   CHARS  EQUAL  NUMBER
    ;
for_secomd_part
    : CHARS operation_if (CHARS | CHARS DOT LENGTH| NUMBER)
    ;
block
    : CURLYOPEN code_attribute* CURLYCLOSE
    ;
for_statement_variable_number
    : CHARS EQUAL (number_attribute CHARS)     #ForStatementNumber
    | for_statement_adding_one                 #ForStatementPlus
    | for_statement_minuss_one                 #ForStatementMinus
    | fast_math                                #ForStatementFastMatch
    ;
type
    : INT
    | VAR
    | STRING
    | BOOL
    ;
expr: expr MULTIPLY expr            #Multiplication
    | expr SUM expr                 #Addition
    | expr MINUS expr               #Minus
    | expr DIVID expr               #Division
    | CHARS                         #Variable
    | NUMBER                        #Number
    | STRING_EXP                    #StringExp
    | adding_one                    #AddingOne
    | minus_one                     #MinusOne
    | fast_math                     #FastMatch
    | call_function                 #FunctionCall
    | TRUE                          #BoolExp
    | FALSE                         #BoolExp
    ;

fast_math
    :  CHARS (SUM_EQUAL|MINUS_EQUAL|DIVID_EQUAL|MULTIPLY_EQUAL)
       (CHARS  | NUMBER)
    ;
for_statement_adding_one
    :  CHARS SUMS
    ;
for_statement_minuss_one
    : CHARS MINUSS
    ;
adding_one
    : CHARS SUMS
    ;
minus_one
    : CHARS MINUSS
    ;
number_attribute
    : SUM
    | DIVID
    | MULTIPLY
    | MINUS
    ;

code_attribute
    : variables_decl            #VariableDeclaration
    | print_statements          #PrintCodeAttributes
    | if_statment               #IfCodeAttributes
    | else_statment             #ElseCodeAttributes
    | for_statement             #ForCodeAttributes
    | while_statment            #WhileStatements
    | assignment                #AssignmentCodeAttributes
    | call_function             #CallCodeAttributes
    | BREAK SEMICOLON           #BreakCodeAttributes
    | RETURN expr? SEMICOLON    #ReturnCodeAttributes
    | CHARS EQUAL CHARS number_attribute NUMBER SEMICOLON #CodeAttributes
    ;

else_statment
    : ELSE block ;

operation_if
    : EQUALEQUAL
    | TAG_CLOSE
    | TAG_OPEN
    | TAG_CLOSE_EQUAL
    | TAG_OPEN_EQUAL
    | NOT_EQUAL
    ;

while_statment
    : WHILE OPENTEXT if_part CLOSETEXT block
    ;
if_statment
    : IF OPENTEXT if_part CLOSETEXT block else_if_statements* else_statment?
    ;
else_if_statements
    : ELSE OPENTEXT if_part CLOSETEXT block
    ;
if_part
    : CHARS operation_if expr
    | CHARS
    | expr
    ;
//logical_sympol : OR | AND;
assignment
    : CHARS EQUAL expr SEMICOLON
    ;
print_statements
    : PRINT OPENTEXT expr CLOSETEXT SEMICOLON
    ;


//List<int> X1 = [1,2,3,4];
list
    : LIST TAG_OPEN type TAG_CLOSE
        CHARS EQUAL OB list_exp? CB SEMICOLON
    ;
list_exp
    : expr (COMMA expr)*
    ;

//Flutter
widget
    : scaffold
    | image
    | text
    | container
    | column
    | row
    ;
image
    : IMAGE OPENTEXT image_assets CLOSETEXT
    ;
image_assets
    : IMAGEASSETS OPENTEXT SINGLE_QUOTE CHARS SINGLE_QUOTE CLOSETEXT COMMA
    ;
text
    : TEXT OPENTEXT SINGLE_QUOTE (CHARS|NUMBER) SINGLE_QUOTE CLOSETEXT COMMA
    ;
column: COLUMN OPENTEXT CHILDREN C OB (image text+)* CB CLOSETEXT COMMA;//
row: ROW OPENTEXT CHILDREN C OB column+ CB  CLOSETEXT COMMA;//
container : CONTAINER OPENTEXT (color width height) CHILD C (row|column) CLOSETEXT COMMA;//
scaffold: SCAFFOLD OPENTEXT BODY C (container|column|row) CLOSETEXT SEMICOLON;//
color: COLOR C CHARS COMMA;//
width: WIDTH C NUMBER COMMA;//
height: HEIGHT C NUMBER COMMA;//
e_button
  : E_BUTTON OPENTEXT elevatedButtonWidgetArgs CLOSETEXT
  ;

elevatedButtonWidgetArgs
  : elevatedButtonWidgetArg (COMMA elevatedButtonWidgetArg)*
  ;

elevatedButtonWidgetArg
  : ON_PRESSED C voidFunction
  | COLOR C color
  | CHILD C widget
  ;

voidFunction
  : ID OPENTEXT CLOSETEXT
  | (){}
  ;
 center
   : CENTER OPENTEXT centerWidgetArgs CLOSETEXT
   ;
 centerWidgetArgs
   : CHILD C widget
   ;