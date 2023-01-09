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

scaffold
    : SCAFFOLD OPENTEXT scaffoldArgs? CLOSETEXT SEMICOLON;
scaffoldArgs
    : scaffoldProperty (COMMA scaffoldProperty)* COMMA?
    ;
scaffoldProperty
    : BODY C widget
    | BACK_COLOR C color
    ;

image
    : IMAGEASSETS OPENTEXT imageProperties CLOSETEXT COMMA?
    ;
imageProperties
    : STRING_EXP (COMMA imageProperty)* COMMA?
    ;
imageProperty
    : WIDTH C NUMBER
    | HEIGHT C NUMBER
    | COLOR C color
    ;

text
    : TEXT OPENTEXT textProperties CLOSETEXT COMMA?
    ;
textProperties
    : STRING_EXP (COMMA textProperty)? COMMA?
    ;
textProperty
    : STYLE C style
    ;
style
    : TEXTSTYLE OPENTEXT textStyleProprties? CLOSETEXT
    ;
textStyleProprties
    : textStyleProprty (COMMA textStyleProprty)* COMMA?
    ;
textStyleProprty
    : COLOR C color         #ColorKeyValue
    | FONTSIZE C NUMBER     #FontSizeKeyValue
    ;

column
    : COLUMN OPENTEXT rowColumnArgs? CLOSETEXT COMMA?
    ;
row
    : ROW OPENTEXT rowColumnArgs? CLOSETEXT COMMA?
    ;
rowColumnArgs
    : rowColumnArg (COMMA rowColumnArg)* COMMA?
    ;
rowColumnArg
    : MAINAXISALIGNMENT_KEY C mainAxisAlignment         #ColumnKeyValue
    | MAINAXISSIZE_KEY C mainAxisSize                   #ColumnKeyValue
    | CHILDREN C widgetList                             #ColumnWidgetList
    ;
mainAxisAlignment
    : MAINAXISALIGNMENT_VALUE DOT MAINAXISALIGNMENT_VALUES
    ;
mainAxisSize
    : MAINAXISSIZE_VALUE DOT MAINAXISSIZE_VALUES
    ;
widgetList
    : OB (widget (COMMA widget)*)? COMMA? CB COMMA?
    ;

container
    : CONTAINER OPENTEXT containerProperties? CLOSETEXT COMMA?
    ;
containerProperties
    : containerProperty (COMMA containerProperty)* COMMA?
    ;
containerProperty
    : COLOR C color         #ContainerKeyValue
    | WIDTH C NUMBER            #ContainerWidthHeight
    | HEIGHT C NUMBER           #ContainerWidthHeight
    | CHILD C widget            #ContainerKeyValue
    ;

color
    : CHARS
    ;

e_button
    : E_BUTTON OPENTEXT e_buttonProperties CLOSETEXT
    ;
e_buttonProperties
    : e_ButtonProperty (COMMA e_ButtonProperty)*
    ;
e_ButtonProperty
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