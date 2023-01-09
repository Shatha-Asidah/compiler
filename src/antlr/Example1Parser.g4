parser grammar Example1Parser;
options {tokenVocab=Example1Lexer;}

program
    : topLevel+
    ;
topLevel
    : variables_decl        #VariableDeclarationTopLevel
    | class_decl            #ClassDeclarationTopLevel
    | function              #FunctionDeclarationTopLevel
    | widget                #WidgetDeclarationTopLevel
    ;
class_decl
    : ABSTRACT? CLASS CHARS CURLYOPEN class_member* CURLYCLOSE
    ;
class_member
    : variables_decl        #VariableDeclarationClass
    | function              #FunctionDeclarationClass
    ;
variables_decl
    : type CHARS EQUAL expr SEMICOLON       #VariableDeclarationType
    | list                                  #VaraibleListDeclaration
    ;
list
    : LIST TAG_OPEN type TAG_CLOSE
        CHARS EQUAL OB list_exp? CB SEMICOLON
    ;
list_exp
    : expr (COMMA expr)*
    ;
function
    : (VOID| type) CHARS
       OPENTEXT function_parameters? CLOSETEXT
       block
    ;
function_parameters
    : type CHARS (COMMA type CHARS)*
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
expr: expr MULTIPLY expr            #OperationExpression
    | expr SUM expr                 #OperationExpression
    | expr MINUS expr               #OperationExpression
    | expr DIVID expr               #OperationExpression
    | expr OR expr                  #OperationExpression
    | expr AND expr                 #OperationExpression
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
call_function
    : CHARS OPENTEXT CLOSETEXT SEMICOLON
    ;
adding_one
    : CHARS SUMS
    ;
minus_one
    : CHARS MINUSS
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
number_attribute
    : SUM
    | DIVID
    | MULTIPLY
    | MINUS
    ;

code_attribute
    : variables_decl                                            #VariableDeclaration
    | print_statements                                          #PrintCodeAttributes
    | if_statment                                               #IfCodeAttributes
    | else_statment                                             #ElseCodeAttributes
    | for_statement                                             #ForCodeAttributes
    | while_statment                                            #WhileStatements
    | assignment                                                #AssignmentCodeAttributes
    | call_function                                             #CallCodeAttributes
    | BREAK SEMICOLON                                           #BreakCodeAttributes
    | RETURN expr? SEMICOLON                                    #ReturnCodeAttributes
    | CHARS EQUAL CHARS number_attribute NUMBER SEMICOLON       #CodeAttributes
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
    : CHARS operation_if expr       #IfPartOperation
    | CHARS                         #CharsExpression
    | expr                          #SingleExpression
    ;
//logical_sympol : OR | AND;
assignment
    : CHARS EQUAL expr SEMICOLON
    ;
print_statements
    : PRINT OPENTEXT expr CLOSETEXT SEMICOLON
    ;

//Flutter
widget
    : scaffold                  #ScaffoldWidget
    | image                     #ImageWidget
    | text                      #TextWidget
    | container                 #ContainerWidget
    | column                    #ColumnWidget
    | row                       #RowWidget
    | center                    #CenterWidget
    | e_button                  #ElevatedButtonWidget
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
column
    : COLUMN OPENTEXT CHILDREN C OB (image text+)* CB CLOSETEXT COMMA
    ;
row
    : ROW OPENTEXT CHILDREN C OB column+ CB  CLOSETEXT COMMA
    ;
container : CONTAINER OPENTEXT container_att* CHILD C widget CLOSETEXT COMMA;//
container_att:COLOR C color
             |WIDTH C width
             |HEIGHT C height;
scaffold: SCAFFOLD OPENTEXT body CLOSETEXT SEMICOLON;
body: BODY C (container| column | row) COMMA;
color: CHARS COMMA;
width: NUMBER COMMA;
height: NUMBER COMMA;
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
  : CHARS OPENTEXT CLOSETEXT
  | OPENTEXT CLOSETEXT block
  ;
 center
   : CENTER OPENTEXT centerWidgetArgs CLOSETEXT
   ;
 centerWidgetArgs
   : CHILD C widget
   ;