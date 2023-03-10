lexer grammar Example1Lexer;
VAR:'var';
INT: 'int';
WS: [ \t\n]+ -> skip;
C: ':';
CB: ']';
OB:'[';
LIST:'list';
WHILE:'while';
SPACE : ' ' -> skip;
UN:'\n' ->skip;
UT:'\t' ->skip;
UR:'\r' ->skip;
CURLYOPEN  : '{' ;
CURLYCLOSE : '}' ;
SUM: '+';
DIVID: '/';
MULTIPLY : '*';
MINUS : '-';
OPENTEXT: '(';
CLOSETEXT: ')';
SUMS : '++';
MINUSS : '--';
OR:'|';
FOR : 'for';
AND : '&';
SUM_EQUAL:'+=';
MINUS_EQUAL:'-=';
EQUALEQUAL : '==';
DIVID_EQUAL : '/=';
MULTIPLY_EQUAL : '*=';
NOT_EQUAL : '!=';
STRING: 'String';
VOID: 'void';
DOUBLE: 'double';
BOOL: 'bool';
IF : 'if';
ELSE : 'else';
ELSE_IF : 'else if';
TRUE:'true';
FALSE:'false';
DOUBLE_QUOTE : '"';
COMMA : ',' ;
LENGTH: 'length';
RETURN: 'return';
CLASS:'class';
ABSTRACT:'abstract';
COMMENT: '//';
TAG_OPEN : '<';
TAG_OPEN_EQUAL : '<=';
BREAK : 'break';
DOT: '.' ;
PRINT :'print';
TAG_CLOSE : '>';
TAG_CLOSE_EQUAL:'>=';
EQUAL: '=' ;
SINGLE_QUOTE : '\'';
SEMICOLON : ';';

//Flutter
COLUMN:'Column';
E_BUTTON : 'ElevatedButton';
ROW: 'Row';
CONTAINER:'Container';
CHILDREN:'children';
IMAGEASSETS:'Image.assets';
IMAGE: 'Image';
CHILD: 'child';
TEXT:'Text';
SCAFFOLD: 'Scaffold';
BODY: 'body';
COLOR: 'color';
HEIGHT: 'height';
WIDTH: 'width';
ON_PRESSED:'onPressed';
CENTER: 'Center';
BACK_COLOR : 'backgroundColor';
MAINAXISALIGNMENT_KEY : 'mainAxisAlignment';
MAINAXISALIGNMENT_VALUE : 'MainAxisAlignment';

MAINAXISSIZE_KEY : 'mainAxisSize';
MAINAXISSIZE_VALUE : 'MainAxisSize';
MAINAXISALIGNMENT_VALUES : ('center' | 'start' | 'end' | 'spaceBetween' | 'spaceAround' | 'spaceEvenly');
MAINAXISSIZE_VALUES : ('min' | 'max');
FONTSIZE : 'fontSize';
STYLE : 'style';
TEXTSTYLE : 'TextStyle';

NUMBER: [0-9]+;
CHARS: [a-z][a-zA-Z0-9_]*;
STRING_EXP: DOUBLE_QUOTE (~[\n\r])*? DOUBLE_QUOTE;
//CHARS : [a-zA-Z0-9]+([a-zA-Z0-9]+'['[a-zA-Z0-9]+']')*(' '[a-zA-Z0-9]+)* ;
//INT_TYPE : ('INT' | 'int');




//mode header;
//mode body;
//mode title;
//mode button;
//mode text;

