// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Example1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, INT=2, WS=3, C=4, CB=5, OB=6, LIST=7, WHILE=8, SPACE=9, UN=10, 
		UT=11, UR=12, CURLYOPEN=13, CURLYCLOSE=14, SUM=15, DIVID=16, MULTIPLY=17, 
		MINUS=18, OPENTEXT=19, CLOSETEXT=20, SUMS=21, MINUSS=22, OR=23, FOR=24, 
		AND=25, SUM_EQUAL=26, MINUS_EQUAL=27, EQUALEQUAL=28, DIVID_EQUAL=29, MULTIPLY_EQUAL=30, 
		NOT_EQUAL=31, STRING=32, VOID=33, DOUBLE=34, BOOL=35, IF=36, ELSE=37, 
		ELSE_IF=38, TRUE=39, FALSE=40, DOUBLE_QUOTE=41, COMMA=42, LENGTH=43, RETURN=44, 
		CLASS=45, ABSTRACT=46, COMMENT=47, TAG_OPEN=48, TAG_OPEN_EQUAL=49, BREAK=50, 
		DOT=51, PRINT=52, TAG_CLOSE=53, TAG_CLOSE_EQUAL=54, EQUAL=55, SINGLE_QUOTE=56, 
		SEMICOLON=57, COLUMN=58, E_BUTTON=59, ROW=60, CONTAINER=61, CHILDREN=62, 
		IMAGEASSETS=63, IMAGE=64, CHILD=65, TEXT=66, SCAFFOLD=67, BODY=68, COLOR=69, 
		HEIGHT=70, WIDTH=71, ON_PRESSED=72, CENTER=73, BACK_COLOR=74, MAINAXISALIGNMENT_KEY=75, 
		MAINAXISALIGNMENT_VALUE=76, MAINAXISSIZE_KEY=77, MAINAXISSIZE_VALUE=78, 
		MAINAXISALIGNMENT_VALUES=79, MAINAXISSIZE_VALUES=80, FONTSIZE=81, STYLE=82, 
		TEXTSTYLE=83, NUMBER=84, CHARS=85, STRING_EXP=86;
	public static final int
		RULE_program = 0, RULE_topLevel = 1, RULE_class_decl = 2, RULE_class_member = 3, 
		RULE_variables_decl = 4, RULE_list = 5, RULE_list_exp = 6, RULE_function = 7, 
		RULE_function_parameters = 8, RULE_function_type = 9, RULE_for_statement = 10, 
		RULE_for_first_part = 11, RULE_for_secomd_part = 12, RULE_block = 13, 
		RULE_for_statement_variable_number = 14, RULE_type = 15, RULE_expr = 16, 
		RULE_call_function = 17, RULE_adding_one = 18, RULE_minus_one = 19, RULE_fast_math = 20, 
		RULE_for_statement_adding_one = 21, RULE_for_statement_minuss_one = 22, 
		RULE_number_attribute = 23, RULE_code_attribute = 24, RULE_else_statment = 25, 
		RULE_operation_if = 26, RULE_while_statment = 27, RULE_if_statment = 28, 
		RULE_else_if_statements = 29, RULE_if_part = 30, RULE_assignment = 31, 
		RULE_print_statements = 32, RULE_widget = 33, RULE_scaffold = 34, RULE_scaffoldArgs = 35, 
		RULE_scaffoldProperty = 36, RULE_image = 37, RULE_imageProperties = 38, 
		RULE_imageProperty = 39, RULE_text = 40, RULE_textProperties = 41, RULE_textProperty = 42, 
		RULE_style = 43, RULE_textStyleProprties = 44, RULE_textStyleProprty = 45, 
		RULE_column = 46, RULE_row = 47, RULE_rowColumnArgs = 48, RULE_rowColumnArg = 49, 
		RULE_mainAxisAlignment = 50, RULE_mainAxisSize = 51, RULE_widgetList = 52, 
		RULE_container = 53, RULE_containerProperties = 54, RULE_containerProperty = 55, 
		RULE_color = 56, RULE_e_button = 57, RULE_e_buttonProperties = 58, RULE_e_ButtonProperty = 59, 
		RULE_voidFunction = 60, RULE_center = 61, RULE_centerWidgetArgs = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevel", "class_decl", "class_member", "variables_decl", 
			"list", "list_exp", "function", "function_parameters", "function_type", 
			"for_statement", "for_first_part", "for_secomd_part", "block", "for_statement_variable_number", 
			"type", "expr", "call_function", "adding_one", "minus_one", "fast_math", 
			"for_statement_adding_one", "for_statement_minuss_one", "number_attribute", 
			"code_attribute", "else_statment", "operation_if", "while_statment", 
			"if_statment", "else_if_statements", "if_part", "assignment", "print_statements", 
			"widget", "scaffold", "scaffoldArgs", "scaffoldProperty", "image", "imageProperties", 
			"imageProperty", "text", "textProperties", "textProperty", "style", "textStyleProprties", 
			"textStyleProprty", "column", "row", "rowColumnArgs", "rowColumnArg", 
			"mainAxisAlignment", "mainAxisSize", "widgetList", "container", "containerProperties", 
			"containerProperty", "color", "e_button", "e_buttonProperties", "e_ButtonProperty", 
			"voidFunction", "center", "centerWidgetArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'int'", null, "':'", "']'", "'['", "'list'", "'while'", 
			"' '", "'\\n'", "'\\t'", "'\\r'", "'{'", "'}'", "'+'", "'/'", "'*'", 
			"'-'", "'('", "')'", "'++'", "'--'", "'|'", "'for'", "'&'", "'+='", "'-='", 
			"'=='", "'/='", "'*='", "'!='", "'String'", "'void'", "'double'", "'bool'", 
			"'if'", "'else'", "'else if'", "'true'", "'false'", "'\"'", "','", "'length'", 
			"'return'", "'class'", "'abstract'", "'//'", "'<'", "'<='", "'break'", 
			"'.'", "'print'", "'>'", "'>='", "'='", "'''", "';'", "'Column'", "'ElevatedButton'", 
			"'Row'", "'Container'", "'children'", "'Image.assets'", "'Image'", "'child'", 
			"'Text'", "'Scaffold'", "'body'", "'color'", "'height'", "'width'", "'onPressed'", 
			"'Center'", "'backgroundColor'", "'mainAxisAlignment'", "'MainAxisAlignment'", 
			"'mainAxisSize'", "'MainAxisSize'", null, null, "'fontSize'", "'style'", 
			"'TextStyle'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "INT", "WS", "C", "CB", "OB", "LIST", "WHILE", "SPACE", 
			"UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", "MULTIPLY", 
			"MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "OR", "FOR", "AND", 
			"SUM_EQUAL", "MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", "MULTIPLY_EQUAL", 
			"NOT_EQUAL", "STRING", "VOID", "DOUBLE", "BOOL", "IF", "ELSE", "ELSE_IF", 
			"TRUE", "FALSE", "DOUBLE_QUOTE", "COMMA", "LENGTH", "RETURN", "CLASS", 
			"ABSTRACT", "COMMENT", "TAG_OPEN", "TAG_OPEN_EQUAL", "BREAK", "DOT", 
			"PRINT", "TAG_CLOSE", "TAG_CLOSE_EQUAL", "EQUAL", "SINGLE_QUOTE", "SEMICOLON", 
			"COLUMN", "E_BUTTON", "ROW", "CONTAINER", "CHILDREN", "IMAGEASSETS", 
			"IMAGE", "CHILD", "TEXT", "SCAFFOLD", "BODY", "COLOR", "HEIGHT", "WIDTH", 
			"ON_PRESSED", "CENTER", "BACK_COLOR", "MAINAXISALIGNMENT_KEY", "MAINAXISALIGNMENT_VALUE", 
			"MAINAXISSIZE_KEY", "MAINAXISSIZE_VALUE", "MAINAXISALIGNMENT_VALUES", 
			"MAINAXISSIZE_VALUES", "FONTSIZE", "STYLE", "TEXTSTYLE", "NUMBER", "CHARS", 
			"STRING_EXP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TopLevelContext> topLevel() {
			return getRuleContexts(TopLevelContext.class);
		}
		public TopLevelContext topLevel(int i) {
			return getRuleContext(TopLevelContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				topLevel();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -4899810794218192762L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 131L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelContext extends ParserRuleContext {
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
	 
		public TopLevelContext() { }
		public void copyFrom(TopLevelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationTopLevelContext extends TopLevelContext {
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public ClassDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterClassDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitClassDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitClassDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationTopLevelContext extends TopLevelContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariableDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariableDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariableDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WidgetDeclarationTopLevelContext extends TopLevelContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public WidgetDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWidgetDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWidgetDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWidgetDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationTopLevelContext extends TopLevelContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunctionDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunctionDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunctionDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevel);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new ClassDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				class_decl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				function();
				}
				break;
			case 4:
				_localctx = new WidgetDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				widget();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Example1Parser.CLASS, 0); }
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode CURLYOPEN() { return getToken(Example1Parser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(Example1Parser.CURLYCLOSE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Example1Parser.ABSTRACT, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitClass_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(137);
				match(ABSTRACT);
				}
			}

			setState(140);
			match(CLASS);
			setState(141);
			match(CHARS);
			setState(142);
			match(CURLYOPEN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 47244640390L) != 0) {
				{
				{
				setState(143);
				class_member();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_memberContext extends ParserRuleContext {
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
	 
		public Class_memberContext() { }
		public void copyFrom(Class_memberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationClassContext extends Class_memberContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationClassContext(Class_memberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariableDeclarationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariableDeclarationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariableDeclarationClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationClassContext extends Class_memberContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationClassContext(Class_memberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunctionDeclarationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunctionDeclarationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunctionDeclarationClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_member);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new FunctionDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variables_declContext extends ParserRuleContext {
		public Variables_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_decl; }
	 
		public Variables_declContext() { }
		public void copyFrom(Variables_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationTypeContext extends Variables_declContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public VariableDeclarationTypeContext(Variables_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariableDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariableDeclarationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariableDeclarationType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VaraibleListDeclarationContext extends Variables_declContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VaraibleListDeclarationContext(Variables_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVaraibleListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVaraibleListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVaraibleListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_declContext variables_decl() throws RecognitionException {
		Variables_declContext _localctx = new Variables_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables_decl);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				_localctx = new VariableDeclarationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				type();
				setState(156);
				match(CHARS);
				setState(157);
				match(EQUAL);
				setState(158);
				expr(0);
				setState(159);
				match(SEMICOLON);
				}
				break;
			case LIST:
				_localctx = new VaraibleListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(Example1Parser.LIST, 0); }
		public TerminalNode TAG_OPEN() { return getToken(Example1Parser.TAG_OPEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(Example1Parser.TAG_CLOSE, 0); }
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public TerminalNode OB() { return getToken(Example1Parser.OB, 0); }
		public TerminalNode CB() { return getToken(Example1Parser.CB, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public List_expContext list_exp() {
			return getRuleContext(List_expContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LIST);
			setState(165);
			match(TAG_OPEN);
			setState(166);
			type();
			setState(167);
			match(TAG_CLOSE);
			setState(168);
			match(CHARS);
			setState(169);
			match(EQUAL);
			setState(170);
			match(OB);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 246290604621827L) != 0) {
				{
				setState(171);
				list_exp();
				}
			}

			setState(174);
			match(CB);
			setState(175);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_expContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public List_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterList_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitList_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitList_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expContext list_exp() throws RecognitionException {
		List_expContext _localctx = new List_expContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expr(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				expr(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			function_type();
			setState(186);
			match(CHARS);
			setState(187);
			match(OPENTEXT);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 38654705670L) != 0) {
				{
				setState(188);
				function_parameters();
				}
			}

			setState(191);
			match(CLOSETEXT);
			setState(192);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> CHARS() { return getTokens(Example1Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Example1Parser.CHARS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			type();
			setState(195);
			match(CHARS);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				type();
				setState(198);
				match(CHARS);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	 
		public Function_typeContext() { }
		public void copyFrom(Function_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeFunctionContext extends Function_typeContext {
		public TerminalNode VOID() { return getToken(Example1Parser.VOID, 0); }
		public VoidTypeFunctionContext(Function_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVoidTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVoidTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVoidTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeFunctionContext extends Function_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeFunctionContext(Function_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_type);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				_localctx = new VoidTypeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(VOID);
				}
				break;
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				_localctx = new TypeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Example1Parser.FOR, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public For_first_partContext for_first_part() {
			return getRuleContext(For_first_partContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Example1Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Example1Parser.SEMICOLON, i);
		}
		public For_secomd_partContext for_secomd_part() {
			return getRuleContext(For_secomd_partContext.class,0);
		}
		public For_statement_variable_numberContext for_statement_variable_number() {
			return getRuleContext(For_statement_variable_numberContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(FOR);
			setState(210);
			match(OPENTEXT);
			setState(211);
			for_first_part();
			setState(212);
			match(SEMICOLON);
			setState(213);
			for_secomd_part();
			setState(214);
			match(SEMICOLON);
			setState(215);
			for_statement_variable_number();
			setState(216);
			match(CLOSETEXT);
			setState(217);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_first_partContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public For_first_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_first_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFor_first_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFor_first_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFor_first_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_first_partContext for_first_part() throws RecognitionException {
		For_first_partContext _localctx = new For_first_partContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_first_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(CHARS);
			setState(220);
			match(EQUAL);
			setState(221);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_secomd_partContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(Example1Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Example1Parser.CHARS, i);
		}
		public Operation_ifContext operation_if() {
			return getRuleContext(Operation_ifContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Example1Parser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(Example1Parser.LENGTH, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public For_secomd_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_secomd_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFor_secomd_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFor_secomd_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFor_secomd_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_secomd_partContext for_secomd_part() throws RecognitionException {
		For_secomd_partContext _localctx = new For_secomd_partContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_secomd_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CHARS);
			setState(224);
			operation_if();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(225);
				match(CHARS);
				}
				break;
			case 2:
				{
				setState(226);
				match(CHARS);
				setState(227);
				match(DOT);
				setState(228);
				match(LENGTH);
				}
				break;
			case 3:
				{
				setState(229);
				match(NUMBER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(Example1Parser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(Example1Parser.CURLYCLOSE, 0); }
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CURLYOPEN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5647336550171014L) != 0 || _la==CHARS) {
				{
				{
				setState(233);
				code_attribute();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statement_variable_numberContext extends ParserRuleContext {
		public For_statement_variable_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_variable_number; }
	 
		public For_statement_variable_numberContext() { }
		public void copyFrom(For_statement_variable_numberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementFastMatchContext extends For_statement_variable_numberContext {
		public Fast_mathContext fast_math() {
			return getRuleContext(Fast_mathContext.class,0);
		}
		public ForStatementFastMatchContext(For_statement_variable_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterForStatementFastMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitForStatementFastMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitForStatementFastMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementPlusContext extends For_statement_variable_numberContext {
		public For_statement_adding_oneContext for_statement_adding_one() {
			return getRuleContext(For_statement_adding_oneContext.class,0);
		}
		public ForStatementPlusContext(For_statement_variable_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterForStatementPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitForStatementPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitForStatementPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementNumberContext extends For_statement_variable_numberContext {
		public List<TerminalNode> CHARS() { return getTokens(Example1Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Example1Parser.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public Number_attributeContext number_attribute() {
			return getRuleContext(Number_attributeContext.class,0);
		}
		public ForStatementNumberContext(For_statement_variable_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterForStatementNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitForStatementNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitForStatementNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementMinusContext extends For_statement_variable_numberContext {
		public For_statement_minuss_oneContext for_statement_minuss_one() {
			return getRuleContext(For_statement_minuss_oneContext.class,0);
		}
		public ForStatementMinusContext(For_statement_variable_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterForStatementMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitForStatementMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitForStatementMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_variable_numberContext for_statement_variable_number() throws RecognitionException {
		For_statement_variable_numberContext _localctx = new For_statement_variable_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement_variable_number);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ForStatementNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(CHARS);
				setState(242);
				match(EQUAL);
				{
				setState(243);
				number_attribute();
				setState(244);
				match(CHARS);
				}
				}
				break;
			case 2:
				_localctx = new ForStatementPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				for_statement_adding_one();
				}
				break;
			case 3:
				_localctx = new ForStatementMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				for_statement_minuss_one();
				}
				break;
			case 4:
				_localctx = new ForStatementFastMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				fast_math();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Example1Parser.INT, 0); }
		public TerminalNode VAR() { return getToken(Example1Parser.VAR, 0); }
		public TerminalNode STRING() { return getToken(Example1Parser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(Example1Parser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 38654705670L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(Example1Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Example1Parser.FALSE, 0); }
		public BoolExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOneContext extends ExprContext {
		public Minus_oneContext minus_one() {
			return getRuleContext(Minus_oneContext.class,0);
		}
		public MinusOneContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMinusOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMinusOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMinusOne(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpContext extends ExprContext {
		public TerminalNode STRING_EXP() { return getToken(Example1Parser.STRING_EXP, 0); }
		public StringExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterStringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitStringExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitStringExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Example1Parser.MULTIPLY, 0); }
		public TerminalNode SUM() { return getToken(Example1Parser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(Example1Parser.MINUS, 0); }
		public TerminalNode DIVID() { return getToken(Example1Parser.DIVID, 0); }
		public TerminalNode OR() { return getToken(Example1Parser.OR, 0); }
		public TerminalNode AND() { return getToken(Example1Parser.AND, 0); }
		public OperationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddingOneContext extends ExprContext {
		public Adding_oneContext adding_one() {
			return getRuleContext(Adding_oneContext.class,0);
		}
		public AddingOneContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAddingOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAddingOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAddingOne(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FastMatchContext extends ExprContext {
		public Fast_mathContext fast_math() {
			return getRuleContext(Fast_mathContext.class,0);
		}
		public FastMatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFastMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFastMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFastMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(254);
				match(CHARS);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(STRING_EXP);
				}
				break;
			case 4:
				{
				_localctx = new AddingOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				adding_one();
				}
				break;
			case 5:
				{
				_localctx = new MinusOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				minus_one();
				}
				break;
			case 6:
				{
				_localctx = new FastMatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				fast_math();
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				call_function();
				}
				break;
			case 8:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(266);
						match(MULTIPLY);
						setState(267);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(269);
						match(SUM);
						setState(270);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(272);
						match(MINUS);
						setState(273);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(275);
						match(DIVID);
						setState(276);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(278);
						match(OR);
						setState(279);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281);
						match(AND);
						setState(282);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(CHARS);
			setState(289);
			match(OPENTEXT);
			setState(290);
			match(CLOSETEXT);
			setState(291);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Adding_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode SUMS() { return getToken(Example1Parser.SUMS, 0); }
		public Adding_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAdding_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAdding_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAdding_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adding_oneContext adding_one() throws RecognitionException {
		Adding_oneContext _localctx = new Adding_oneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(CHARS);
			setState(294);
			match(SUMS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Minus_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode MINUSS() { return getToken(Example1Parser.MINUSS, 0); }
		public Minus_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMinus_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMinus_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMinus_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_oneContext minus_one() throws RecognitionException {
		Minus_oneContext _localctx = new Minus_oneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_minus_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(CHARS);
			setState(297);
			match(MINUSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fast_mathContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode SUM_EQUAL() { return getToken(Example1Parser.SUM_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(Example1Parser.MINUS_EQUAL, 0); }
		public TerminalNode DIVID_EQUAL() { return getToken(Example1Parser.DIVID_EQUAL, 0); }
		public TerminalNode MULTIPLY_EQUAL() { return getToken(Example1Parser.MULTIPLY_EQUAL, 0); }
		public Fast_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fast_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFast_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFast_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFast_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fast_mathContext fast_math() throws RecognitionException {
		Fast_mathContext _localctx = new Fast_mathContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CHARS);
			setState(300);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1811939328L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statement_adding_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode SUMS() { return getToken(Example1Parser.SUMS, 0); }
		public For_statement_adding_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_adding_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFor_statement_adding_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFor_statement_adding_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFor_statement_adding_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_adding_oneContext for_statement_adding_one() throws RecognitionException {
		For_statement_adding_oneContext _localctx = new For_statement_adding_oneContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_statement_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(CHARS);
			setState(304);
			match(SUMS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statement_minuss_oneContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode MINUSS() { return getToken(Example1Parser.MINUSS, 0); }
		public For_statement_minuss_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement_minuss_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFor_statement_minuss_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFor_statement_minuss_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFor_statement_minuss_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statement_minuss_oneContext for_statement_minuss_one() throws RecognitionException {
		For_statement_minuss_oneContext _localctx = new For_statement_minuss_oneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_statement_minuss_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(CHARS);
			setState(307);
			match(MINUSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Number_attributeContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(Example1Parser.SUM, 0); }
		public TerminalNode DIVID() { return getToken(Example1Parser.DIVID, 0); }
		public TerminalNode MULTIPLY() { return getToken(Example1Parser.MULTIPLY, 0); }
		public TerminalNode MINUS() { return getToken(Example1Parser.MINUS, 0); }
		public Number_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterNumber_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitNumber_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitNumber_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_attributeContext number_attribute() throws RecognitionException {
		Number_attributeContext _localctx = new Number_attributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Code_attributeContext extends ParserRuleContext {
		public Code_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_attribute; }
	 
		public Code_attributeContext() { }
		public void copyFrom(Code_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseCodeAttributesContext extends Code_attributeContext {
		public Else_statmentContext else_statment() {
			return getRuleContext(Else_statmentContext.class,0);
		}
		public ElseCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElseCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElseCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElseCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementsContext extends Code_attributeContext {
		public While_statmentContext while_statment() {
			return getRuleContext(While_statmentContext.class,0);
		}
		public WhileStatementsContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWhileStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWhileStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWhileStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintCodeAttributesContext extends Code_attributeContext {
		public Print_statementsContext print_statements() {
			return getRuleContext(Print_statementsContext.class,0);
		}
		public PrintCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPrintCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPrintCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPrintCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentCodeAttributesContext extends Code_attributeContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAssignmentCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAssignmentCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAssignmentCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnCodeAttributesContext extends Code_attributeContext {
		public TerminalNode RETURN() { return getToken(Example1Parser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterReturnCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitReturnCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitReturnCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends Code_attributeContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCodeAttributesContext extends Code_attributeContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterForCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitForCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitForCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallCodeAttributesContext extends Code_attributeContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public CallCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCallCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCallCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCallCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakCodeAttributesContext extends Code_attributeContext {
		public TerminalNode BREAK() { return getToken(Example1Parser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public BreakCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBreakCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBreakCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBreakCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeAttributesContext extends Code_attributeContext {
		public List<TerminalNode> CHARS() { return getTokens(Example1Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Example1Parser.CHARS, i);
		}
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public Number_attributeContext number_attribute() {
			return getRuleContext(Number_attributeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public CodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfCodeAttributesContext extends Code_attributeContext {
		public If_statmentContext if_statment() {
			return getRuleContext(If_statmentContext.class,0);
		}
		public IfCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIfCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIfCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIfCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_attributeContext code_attribute() throws RecognitionException {
		Code_attributeContext _localctx = new Code_attributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_code_attribute);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new PrintCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				print_statements();
				}
				break;
			case 3:
				_localctx = new IfCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				if_statment();
				}
				break;
			case 4:
				_localctx = new ElseCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				else_statment();
				}
				break;
			case 5:
				_localctx = new ForCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				for_statement();
				}
				break;
			case 6:
				_localctx = new WhileStatementsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				while_statment();
				}
				break;
			case 7:
				_localctx = new AssignmentCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				assignment();
				}
				break;
			case 8:
				_localctx = new CallCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				call_function();
				}
				break;
			case 9:
				_localctx = new BreakCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				match(BREAK);
				setState(320);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ReturnCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(RETURN);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 246290604621827L) != 0) {
					{
					setState(322);
					expr(0);
					}
				}

				setState(325);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new CodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(326);
				match(CHARS);
				setState(327);
				match(EQUAL);
				setState(328);
				match(CHARS);
				setState(329);
				number_attribute();
				setState(330);
				match(NUMBER);
				setState(331);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Example1Parser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElse_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElse_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElse_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statmentContext else_statment() throws RecognitionException {
		Else_statmentContext _localctx = new Else_statmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ELSE);
			setState(336);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operation_ifContext extends ParserRuleContext {
		public TerminalNode EQUALEQUAL() { return getToken(Example1Parser.EQUALEQUAL, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(Example1Parser.TAG_CLOSE, 0); }
		public TerminalNode TAG_OPEN() { return getToken(Example1Parser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE_EQUAL() { return getToken(Example1Parser.TAG_CLOSE_EQUAL, 0); }
		public TerminalNode TAG_OPEN_EQUAL() { return getToken(Example1Parser.TAG_OPEN_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Example1Parser.NOT_EQUAL, 0); }
		public Operation_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterOperation_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitOperation_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitOperation_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_ifContext operation_if() throws RecognitionException {
		Operation_ifContext _localctx = new Operation_ifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operation_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 27866025110274048L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statmentContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Example1Parser.WHILE, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWhile_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWhile_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWhile_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statmentContext while_statment() throws RecognitionException {
		While_statmentContext _localctx = new While_statmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WHILE);
			setState(341);
			match(OPENTEXT);
			setState(342);
			if_part();
			setState(343);
			match(CLOSETEXT);
			setState(344);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example1Parser.IF, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_statementsContext> else_if_statements() {
			return getRuleContexts(Else_if_statementsContext.class);
		}
		public Else_if_statementsContext else_if_statements(int i) {
			return getRuleContext(Else_if_statementsContext.class,i);
		}
		public Else_statmentContext else_statment() {
			return getRuleContext(Else_statmentContext.class,0);
		}
		public If_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIf_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIf_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIf_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statmentContext if_statment() throws RecognitionException {
		If_statmentContext _localctx = new If_statmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(IF);
			setState(347);
			match(OPENTEXT);
			setState(348);
			if_part();
			setState(349);
			match(CLOSETEXT);
			setState(350);
			block();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					else_if_statements();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(357);
				else_statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_statementsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Example1Parser.ELSE, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElse_if_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElse_if_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElse_if_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementsContext else_if_statements() throws RecognitionException {
		Else_if_statementsContext _localctx = new Else_if_statementsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_if_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ELSE);
			setState(361);
			match(OPENTEXT);
			setState(362);
			if_part();
			setState(363);
			match(CLOSETEXT);
			setState(364);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_partContext extends ParserRuleContext {
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
	 
		public If_partContext() { }
		public void copyFrom(If_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharsExpressionContext extends If_partContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public CharsExpressionContext(If_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCharsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCharsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCharsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends If_partContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleExpressionContext(If_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfPartOperationContext extends If_partContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public Operation_ifContext operation_if() {
			return getRuleContext(Operation_ifContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfPartOperationContext(If_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIfPartOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIfPartOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIfPartOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_part);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new IfPartOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(CHARS);
				setState(367);
				operation_if();
				setState(368);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CharsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(CHARS);
				}
				break;
			case 3:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CHARS);
			setState(375);
			match(EQUAL);
			setState(376);
			expr(0);
			setState(377);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementsContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Example1Parser.PRINT, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public Print_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPrint_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPrint_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPrint_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementsContext print_statements() throws RecognitionException {
		Print_statementsContext _localctx = new Print_statementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_print_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PRINT);
			setState(380);
			match(OPENTEXT);
			setState(381);
			expr(0);
			setState(382);
			match(CLOSETEXT);
			setState(383);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
	 
		public WidgetContext() { }
		public void copyFrom(WidgetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowWidgetContext extends WidgetContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRowWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRowWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRowWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElevatedButtonWidgetContext extends WidgetContext {
		public E_buttonContext e_button() {
			return getRuleContext(E_buttonContext.class,0);
		}
		public ElevatedButtonWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElevatedButtonWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElevatedButtonWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElevatedButtonWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextWidgetContext extends WidgetContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTextWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTextWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTextWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldWidgetContext extends WidgetContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ScaffoldWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterScaffoldWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitScaffoldWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitScaffoldWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CenterWidgetContext extends WidgetContext {
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public CenterWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCenterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCenterWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCenterWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidgetContext extends WidgetContext {
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImageWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImageWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImageWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImageWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidgetContext extends WidgetContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ContainerWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainerWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainerWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainerWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWidgetContext extends WidgetContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColumnWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColumnWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColumnWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_widget);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				_localctx = new ScaffoldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				scaffold();
				}
				break;
			case IMAGEASSETS:
				_localctx = new ImageWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				image();
				}
				break;
			case TEXT:
				_localctx = new TextWidgetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				text();
				}
				break;
			case CONTAINER:
				_localctx = new ContainerWidgetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				container();
				}
				break;
			case COLUMN:
				_localctx = new ColumnWidgetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				column();
				}
				break;
			case ROW:
				_localctx = new RowWidgetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				row();
				}
				break;
			case CENTER:
				_localctx = new CenterWidgetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				center();
				}
				break;
			case E_BUTTON:
				_localctx = new ElevatedButtonWidgetContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				e_button();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(Example1Parser.SCAFFOLD, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public ScaffoldArgsContext scaffoldArgs() {
			return getRuleContext(ScaffoldArgsContext.class,0);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(SCAFFOLD);
			setState(396);
			match(OPENTEXT);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==BACK_COLOR) {
				{
				setState(397);
				scaffoldArgs();
				}
			}

			setState(400);
			match(CLOSETEXT);
			setState(401);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldArgsContext extends ParserRuleContext {
		public List<ScaffoldPropertyContext> scaffoldProperty() {
			return getRuleContexts(ScaffoldPropertyContext.class);
		}
		public ScaffoldPropertyContext scaffoldProperty(int i) {
			return getRuleContext(ScaffoldPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ScaffoldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterScaffoldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitScaffoldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitScaffoldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldArgsContext scaffoldArgs() throws RecognitionException {
		ScaffoldArgsContext _localctx = new ScaffoldArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scaffoldArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			scaffoldProperty();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(COMMA);
					setState(405);
					scaffoldProperty();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(411);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldPropertyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(Example1Parser.BODY, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode BACK_COLOR() { return getToken(Example1Parser.BACK_COLOR, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ScaffoldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterScaffoldProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitScaffoldProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitScaffoldProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldPropertyContext scaffoldProperty() throws RecognitionException {
		ScaffoldPropertyContext _localctx = new ScaffoldPropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scaffoldProperty);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(BODY);
				setState(415);
				match(C);
				setState(416);
				widget();
				}
				break;
			case BACK_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(BACK_COLOR);
				setState(418);
				match(C);
				setState(419);
				color();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGEASSETS() { return getToken(Example1Parser.IMAGEASSETS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public ImagePropertiesContext imageProperties() {
			return getRuleContext(ImagePropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(IMAGEASSETS);
			setState(423);
			match(OPENTEXT);
			setState(424);
			imageProperties();
			setState(425);
			match(CLOSETEXT);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(426);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImagePropertiesContext extends ParserRuleContext {
		public TerminalNode STRING_EXP() { return getToken(Example1Parser.STRING_EXP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public List<ImagePropertyContext> imageProperty() {
			return getRuleContexts(ImagePropertyContext.class);
		}
		public ImagePropertyContext imageProperty(int i) {
			return getRuleContext(ImagePropertyContext.class,i);
		}
		public ImagePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImageProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImageProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImageProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertiesContext imageProperties() throws RecognitionException {
		ImagePropertiesContext _localctx = new ImagePropertiesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_imageProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(STRING_EXP);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					imageProperty();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(437);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImagePropertyContext extends ParserRuleContext {
		public ImagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperty; }
	 
		public ImagePropertyContext() { }
		public void copyFrom(ImagePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageColorContext extends ImagePropertyContext {
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ImageColorContext(ImagePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImageColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImageColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImageColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidthHeightContext extends ImagePropertyContext {
		public TerminalNode WIDTH() { return getToken(Example1Parser.WIDTH, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode HEIGHT() { return getToken(Example1Parser.HEIGHT, 0); }
		public ImageWidthHeightContext(ImagePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImageWidthHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImageWidthHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImageWidthHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertyContext imageProperty() throws RecognitionException {
		ImagePropertyContext _localctx = new ImagePropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_imageProperty);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ImageWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(WIDTH);
				setState(441);
				match(C);
				setState(442);
				match(NUMBER);
				}
				break;
			case HEIGHT:
				_localctx = new ImageWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(HEIGHT);
				setState(444);
				match(C);
				setState(445);
				match(NUMBER);
				}
				break;
			case COLOR:
				_localctx = new ImageColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(COLOR);
				setState(447);
				match(C);
				setState(448);
				color();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(Example1Parser.TEXT, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TextPropertiesContext textProperties() {
			return getRuleContext(TextPropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TEXT);
			setState(452);
			match(OPENTEXT);
			setState(453);
			textProperties();
			setState(454);
			match(CLOSETEXT);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(455);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextPropertiesContext extends ParserRuleContext {
		public TerminalNode STRING_EXP() { return getToken(Example1Parser.STRING_EXP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public TextPropertyContext textProperty() {
			return getRuleContext(TextPropertyContext.class,0);
		}
		public TextPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTextProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTextProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTextProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertiesContext textProperties() throws RecognitionException {
		TextPropertiesContext _localctx = new TextPropertiesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_textProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(STRING_EXP);
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(459);
				match(COMMA);
				setState(460);
				textProperty();
				}
				break;
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(463);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextPropertyContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(Example1Parser.STYLE, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertyContext textProperty() throws RecognitionException {
		TextPropertyContext _localctx = new TextPropertyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_textProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(STYLE);
			setState(467);
			match(C);
			setState(468);
			style();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode TEXTSTYLE() { return getToken(Example1Parser.TEXTSTYLE, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TextStyleProprtiesContext textStyleProprties() {
			return getRuleContext(TextStyleProprtiesContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(TEXTSTYLE);
			setState(471);
			match(OPENTEXT);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==FONTSIZE) {
				{
				setState(472);
				textStyleProprties();
				}
			}

			setState(475);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextStyleProprtiesContext extends ParserRuleContext {
		public List<TextStyleProprtyContext> textStyleProprty() {
			return getRuleContexts(TextStyleProprtyContext.class);
		}
		public TextStyleProprtyContext textStyleProprty(int i) {
			return getRuleContext(TextStyleProprtyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public TextStyleProprtiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleProprties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTextStyleProprties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTextStyleProprties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTextStyleProprties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleProprtiesContext textStyleProprties() throws RecognitionException {
		TextStyleProprtiesContext _localctx = new TextStyleProprtiesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_textStyleProprties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			textStyleProprty();
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(COMMA);
					setState(479);
					textStyleProprty();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(485);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextStyleProprtyContext extends ParserRuleContext {
		public TextStyleProprtyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleProprty; }
	 
		public TextStyleProprtyContext() { }
		public void copyFrom(TextStyleProprtyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorKeyValueContext extends TextStyleProprtyContext {
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ColorKeyValueContext(TextStyleProprtyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColorKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColorKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColorKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontSizeKeyValueContext extends TextStyleProprtyContext {
		public TerminalNode FONTSIZE() { return getToken(Example1Parser.FONTSIZE, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public FontSizeKeyValueContext(TextStyleProprtyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFontSizeKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFontSizeKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFontSizeKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleProprtyContext textStyleProprty() throws RecognitionException {
		TextStyleProprtyContext _localctx = new TextStyleProprtyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_textStyleProprty);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new ColorKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(COLOR);
				setState(489);
				match(C);
				setState(490);
				color();
				}
				break;
			case FONTSIZE:
				_localctx = new FontSizeKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(FONTSIZE);
				setState(492);
				match(C);
				setState(493);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(Example1Parser.COLUMN, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public RowColumnArgsContext rowColumnArgs() {
			return getRuleContext(RowColumnArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(COLUMN);
			setState(497);
			match(OPENTEXT);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 40961L) != 0) {
				{
				setState(498);
				rowColumnArgs();
				}
			}

			setState(501);
			match(CLOSETEXT);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(502);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(Example1Parser.ROW, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public RowColumnArgsContext rowColumnArgs() {
			return getRuleContext(RowColumnArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ROW);
			setState(506);
			match(OPENTEXT);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 40961L) != 0) {
				{
				setState(507);
				rowColumnArgs();
				}
			}

			setState(510);
			match(CLOSETEXT);
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(511);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowColumnArgsContext extends ParserRuleContext {
		public List<RowColumnArgContext> rowColumnArg() {
			return getRuleContexts(RowColumnArgContext.class);
		}
		public RowColumnArgContext rowColumnArg(int i) {
			return getRuleContext(RowColumnArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public RowColumnArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowColumnArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterRowColumnArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitRowColumnArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitRowColumnArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowColumnArgsContext rowColumnArgs() throws RecognitionException {
		RowColumnArgsContext _localctx = new RowColumnArgsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rowColumnArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			rowColumnArg();
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					match(COMMA);
					setState(516);
					rowColumnArg();
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(522);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowColumnArgContext extends ParserRuleContext {
		public RowColumnArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowColumnArg; }
	 
		public RowColumnArgContext() { }
		public void copyFrom(RowColumnArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWidgetListContext extends RowColumnArgContext {
		public TerminalNode CHILDREN() { return getToken(Example1Parser.CHILDREN, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public WidgetListContext widgetList() {
			return getRuleContext(WidgetListContext.class,0);
		}
		public ColumnWidgetListContext(RowColumnArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColumnWidgetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColumnWidgetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColumnWidgetList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnKeyValueContext extends RowColumnArgContext {
		public TerminalNode MAINAXISALIGNMENT_KEY() { return getToken(Example1Parser.MAINAXISALIGNMENT_KEY, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public MainAxisAlignmentContext mainAxisAlignment() {
			return getRuleContext(MainAxisAlignmentContext.class,0);
		}
		public TerminalNode MAINAXISSIZE_KEY() { return getToken(Example1Parser.MAINAXISSIZE_KEY, 0); }
		public MainAxisSizeContext mainAxisSize() {
			return getRuleContext(MainAxisSizeContext.class,0);
		}
		public ColumnKeyValueContext(RowColumnArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColumnKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColumnKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColumnKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowColumnArgContext rowColumnArg() throws RecognitionException {
		RowColumnArgContext _localctx = new RowColumnArgContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_rowColumnArg);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXISALIGNMENT_KEY:
				_localctx = new ColumnKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(MAINAXISALIGNMENT_KEY);
				setState(526);
				match(C);
				setState(527);
				mainAxisAlignment();
				}
				break;
			case MAINAXISSIZE_KEY:
				_localctx = new ColumnKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(MAINAXISSIZE_KEY);
				setState(529);
				match(C);
				setState(530);
				mainAxisSize();
				}
				break;
			case CHILDREN:
				_localctx = new ColumnWidgetListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(CHILDREN);
				setState(532);
				match(C);
				setState(533);
				widgetList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisAlignmentContext extends ParserRuleContext {
		public TerminalNode MAINAXISALIGNMENT_VALUE() { return getToken(Example1Parser.MAINAXISALIGNMENT_VALUE, 0); }
		public TerminalNode DOT() { return getToken(Example1Parser.DOT, 0); }
		public TerminalNode MAINAXISALIGNMENT_VALUES() { return getToken(Example1Parser.MAINAXISALIGNMENT_VALUES, 0); }
		public MainAxisAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisAlignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMainAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMainAxisAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMainAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisAlignmentContext mainAxisAlignment() throws RecognitionException {
		MainAxisAlignmentContext _localctx = new MainAxisAlignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mainAxisAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(MAINAXISALIGNMENT_VALUE);
			setState(537);
			match(DOT);
			setState(538);
			match(MAINAXISALIGNMENT_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisSizeContext extends ParserRuleContext {
		public TerminalNode MAINAXISSIZE_VALUE() { return getToken(Example1Parser.MAINAXISSIZE_VALUE, 0); }
		public TerminalNode DOT() { return getToken(Example1Parser.DOT, 0); }
		public TerminalNode MAINAXISSIZE_VALUES() { return getToken(Example1Parser.MAINAXISSIZE_VALUES, 0); }
		public MainAxisSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMainAxisSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMainAxisSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMainAxisSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisSizeContext mainAxisSize() throws RecognitionException {
		MainAxisSizeContext _localctx = new MainAxisSizeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mainAxisSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(MAINAXISSIZE_VALUE);
			setState(541);
			match(DOT);
			setState(542);
			match(MAINAXISSIZE_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetListContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(Example1Parser.OB, 0); }
		public TerminalNode CB() { return getToken(Example1Parser.CB, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public WidgetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWidgetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWidgetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWidgetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetListContext widgetList() throws RecognitionException {
		WidgetListContext _localctx = new WidgetListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_widgetList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(OB);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 33583L) != 0) {
				{
				setState(545);
				widget();
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						match(COMMA);
						setState(547);
						widget();
						}
						} 
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
			}

			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(555);
				match(COMMA);
				}
			}

			setState(558);
			match(CB);
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(559);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(Example1Parser.CONTAINER, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public ContainerPropertiesContext containerProperties() {
			return getRuleContext(ContainerPropertiesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(CONTAINER);
			setState(563);
			match(OPENTEXT);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 113L) != 0) {
				{
				setState(564);
				containerProperties();
				}
			}

			setState(567);
			match(CLOSETEXT);
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(568);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerPropertiesContext extends ParserRuleContext {
		public List<ContainerPropertyContext> containerProperty() {
			return getRuleContexts(ContainerPropertyContext.class);
		}
		public ContainerPropertyContext containerProperty(int i) {
			return getRuleContext(ContainerPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ContainerPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainerProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainerProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainerProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertiesContext containerProperties() throws RecognitionException {
		ContainerPropertiesContext _localctx = new ContainerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_containerProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			containerProperty();
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					match(COMMA);
					setState(573);
					containerProperty();
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(579);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerPropertyContext extends ParserRuleContext {
		public ContainerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerProperty; }
	 
		public ContainerPropertyContext() { }
		public void copyFrom(ContainerPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerKeyValueContext extends ContainerPropertyContext {
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode CHILD() { return getToken(Example1Parser.CHILD, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ContainerKeyValueContext(ContainerPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainerKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainerKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainerKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidthHeightContext extends ContainerPropertyContext {
		public TerminalNode WIDTH() { return getToken(Example1Parser.WIDTH, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode HEIGHT() { return getToken(Example1Parser.HEIGHT, 0); }
		public ContainerWidthHeightContext(ContainerPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainerWidthHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainerWidthHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainerWidthHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertyContext containerProperty() throws RecognitionException {
		ContainerPropertyContext _localctx = new ContainerPropertyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_containerProperty);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new ContainerKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(COLOR);
				setState(583);
				match(C);
				setState(584);
				color();
				}
				break;
			case WIDTH:
				_localctx = new ContainerWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(WIDTH);
				setState(586);
				match(C);
				setState(587);
				match(NUMBER);
				}
				break;
			case HEIGHT:
				_localctx = new ContainerWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(HEIGHT);
				setState(589);
				match(C);
				setState(590);
				match(NUMBER);
				}
				break;
			case CHILD:
				_localctx = new ContainerKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(CHILD);
				setState(592);
				match(C);
				setState(593);
				widget();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(CHARS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E_buttonContext extends ParserRuleContext {
		public TerminalNode E_BUTTON() { return getToken(Example1Parser.E_BUTTON, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public E_buttonPropertiesContext e_buttonProperties() {
			return getRuleContext(E_buttonPropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public E_buttonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterE_button(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitE_button(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitE_button(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_buttonContext e_button() throws RecognitionException {
		E_buttonContext _localctx = new E_buttonContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_e_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(E_BUTTON);
			setState(599);
			match(OPENTEXT);
			setState(600);
			e_buttonProperties();
			setState(601);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E_buttonPropertiesContext extends ParserRuleContext {
		public List<E_ButtonPropertyContext> e_ButtonProperty() {
			return getRuleContexts(E_ButtonPropertyContext.class);
		}
		public E_ButtonPropertyContext e_ButtonProperty(int i) {
			return getRuleContext(E_ButtonPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public E_buttonPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_buttonProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterE_buttonProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitE_buttonProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitE_buttonProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_buttonPropertiesContext e_buttonProperties() throws RecognitionException {
		E_buttonPropertiesContext _localctx = new E_buttonPropertiesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_e_buttonProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			e_ButtonProperty();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(604);
				match(COMMA);
				setState(605);
				e_ButtonProperty();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E_ButtonPropertyContext extends ParserRuleContext {
		public TerminalNode ON_PRESSED() { return getToken(Example1Parser.ON_PRESSED, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public VoidFunctionContext voidFunction() {
			return getRuleContext(VoidFunctionContext.class,0);
		}
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode CHILD() { return getToken(Example1Parser.CHILD, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public E_ButtonPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_ButtonProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterE_ButtonProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitE_ButtonProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitE_ButtonProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_ButtonPropertyContext e_ButtonProperty() throws RecognitionException {
		E_ButtonPropertyContext _localctx = new E_ButtonPropertyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_e_ButtonProperty);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_PRESSED:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(ON_PRESSED);
				setState(612);
				match(C);
				setState(613);
				voidFunction();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(COLOR);
				setState(615);
				match(C);
				setState(616);
				color();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				match(CHILD);
				setState(618);
				match(C);
				setState(619);
				widget();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunctionContext extends ParserRuleContext {
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
	 
		public VoidFunctionContext() { }
		public void copyFrom(VoidFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends VoidFunctionContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public CallFunctionContext(VoidFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBlockContext extends VoidFunctionContext {
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBlockContext(VoidFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_voidFunction);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(CHARS);
				setState(623);
				match(OPENTEXT);
				setState(624);
				match(CLOSETEXT);
				}
				break;
			case OPENTEXT:
				_localctx = new FunctionBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(OPENTEXT);
				setState(626);
				match(CLOSETEXT);
				setState(627);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER() { return getToken(Example1Parser.CENTER, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public CenterWidgetArgsContext centerWidgetArgs() {
			return getRuleContext(CenterWidgetArgsContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(CENTER);
			setState(631);
			match(OPENTEXT);
			setState(632);
			centerWidgetArgs();
			setState(633);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterWidgetArgsContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(Example1Parser.CHILD, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public CenterWidgetArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centerWidgetArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterCenterWidgetArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitCenterWidgetArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitCenterWidgetArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterWidgetArgsContext centerWidgetArgs() throws RecognitionException {
		CenterWidgetArgsContext _localctx = new CenterWidgetArgsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_centerWidgetArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CHILD);
			setState(636);
			match(C);
			setState(637);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u0280\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0004\u0000\u0080\b\u0000"+
		"\u000b\u0000\f\u0000\u0081\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0088\b\u0001\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0091\b\u0002\n"+
		"\u0002\f\u0002\u0094\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u009a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a3\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00ad\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b5\b\u0006\n"+
		"\u0006\f\u0006\u00b8\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00be\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c9\b\b\n\b\f\b\u00cc"+
		"\t\b\u0001\t\u0001\t\u0003\t\u00d0\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00e7\b\f\u0001\r\u0001\r\u0005\r\u00eb\b\r\n\r\f\r"+
		"\u00ee\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0108\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u011c\b\u0010\n\u0010\f\u0010\u011f"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0144\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014e\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0161"+
		"\b\u001c\n\u001c\f\u001c\u0164\t\u001c\u0001\u001c\u0003\u001c\u0167\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0175\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u018a\b!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u018f\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0005#\u0197\b#\n#\f#\u019a\t#\u0001#\u0003#\u019d\b#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0003$\u01a5\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01ac\b%\u0001&\u0001&\u0001&\u0005&\u01b1\b&\n&\f&\u01b4"+
		"\t&\u0001&\u0003&\u01b7\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u01c2\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01c9\b(\u0001)\u0001)\u0001)\u0003)\u01ce\b)\u0001)\u0003"+
		")\u01d1\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u01da"+
		"\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005,\u01e1\b,\n,\f,\u01e4\t,"+
		"\u0001,\u0003,\u01e7\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01ef\b-\u0001.\u0001.\u0001.\u0003.\u01f4\b.\u0001.\u0001.\u0003.\u01f8"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u01fd\b/\u0001/\u0001/\u0003/\u0201\b"+
		"/\u00010\u00010\u00010\u00050\u0206\b0\n0\f0\u0209\t0\u00010\u00030\u020c"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u0217\b1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00054\u0225\b4\n4\f4\u0228\t4\u00034\u022a\b4"+
		"\u00014\u00034\u022d\b4\u00014\u00014\u00034\u0231\b4\u00015\u00015\u0001"+
		"5\u00035\u0236\b5\u00015\u00015\u00035\u023a\b5\u00016\u00016\u00016\u0005"+
		"6\u023f\b6\n6\f6\u0242\t6\u00016\u00036\u0245\b6\u00017\u00017\u00017"+
		"\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u0253\b7\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0005:\u025f\b:\n:\f:\u0262\t:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u026d\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0275\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0000\u0001 ?\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\u0000\u0004\u0003\u0000\u0001\u0002"+
		"  ##\u0002\u0000\u001a\u001b\u001d\u001e\u0001\u0000\u000f\u0012\u0004"+
		"\u0000\u001c\u001c\u001f\u001f0156\u029e\u0000\u007f\u0001\u0000\u0000"+
		"\u0000\u0002\u0087\u0001\u0000\u0000\u0000\u0004\u008a\u0001\u0000\u0000"+
		"\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b\u00a2\u0001\u0000\u0000\u0000"+
		"\n\u00a4\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e"+
		"\u00b9\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012"+
		"\u00cf\u0001\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000\u0000\u0016"+
		"\u00db\u0001\u0000\u0000\u0000\u0018\u00df\u0001\u0000\u0000\u0000\u001a"+
		"\u00e8\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e"+
		"\u00fb\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\"\u0120"+
		"\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000&\u0128\u0001\u0000"+
		"\u0000\u0000(\u012b\u0001\u0000\u0000\u0000*\u012f\u0001\u0000\u0000\u0000"+
		",\u0132\u0001\u0000\u0000\u0000.\u0135\u0001\u0000\u0000\u00000\u014d"+
		"\u0001\u0000\u0000\u00002\u014f\u0001\u0000\u0000\u00004\u0152\u0001\u0000"+
		"\u0000\u00006\u0154\u0001\u0000\u0000\u00008\u015a\u0001\u0000\u0000\u0000"+
		":\u0168\u0001\u0000\u0000\u0000<\u0174\u0001\u0000\u0000\u0000>\u0176"+
		"\u0001\u0000\u0000\u0000@\u017b\u0001\u0000\u0000\u0000B\u0189\u0001\u0000"+
		"\u0000\u0000D\u018b\u0001\u0000\u0000\u0000F\u0193\u0001\u0000\u0000\u0000"+
		"H\u01a4\u0001\u0000\u0000\u0000J\u01a6\u0001\u0000\u0000\u0000L\u01ad"+
		"\u0001\u0000\u0000\u0000N\u01c1\u0001\u0000\u0000\u0000P\u01c3\u0001\u0000"+
		"\u0000\u0000R\u01ca\u0001\u0000\u0000\u0000T\u01d2\u0001\u0000\u0000\u0000"+
		"V\u01d6\u0001\u0000\u0000\u0000X\u01dd\u0001\u0000\u0000\u0000Z\u01ee"+
		"\u0001\u0000\u0000\u0000\\\u01f0\u0001\u0000\u0000\u0000^\u01f9\u0001"+
		"\u0000\u0000\u0000`\u0202\u0001\u0000\u0000\u0000b\u0216\u0001\u0000\u0000"+
		"\u0000d\u0218\u0001\u0000\u0000\u0000f\u021c\u0001\u0000\u0000\u0000h"+
		"\u0220\u0001\u0000\u0000\u0000j\u0232\u0001\u0000\u0000\u0000l\u023b\u0001"+
		"\u0000\u0000\u0000n\u0252\u0001\u0000\u0000\u0000p\u0254\u0001\u0000\u0000"+
		"\u0000r\u0256\u0001\u0000\u0000\u0000t\u025b\u0001\u0000\u0000\u0000v"+
		"\u026c\u0001\u0000\u0000\u0000x\u0274\u0001\u0000\u0000\u0000z\u0276\u0001"+
		"\u0000\u0000\u0000|\u027b\u0001\u0000\u0000\u0000~\u0080\u0003\u0002\u0001"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0088\u0003\b\u0004\u0000\u0084"+
		"\u0088\u0003\u0004\u0002\u0000\u0085\u0088\u0003\u000e\u0007\u0000\u0086"+
		"\u0088\u0003B!\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0003\u0001\u0000\u0000\u0000\u0089\u008b\u0005"+
		".\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000"+
		"\u0000\u008d\u008e\u0005U\u0000\u0000\u008e\u0092\u0005\r\u0000\u0000"+
		"\u008f\u0091\u0003\u0006\u0003\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000e\u0000\u0000"+
		"\u0096\u0005\u0001\u0000\u0000\u0000\u0097\u009a\u0003\b\u0004\u0000\u0098"+
		"\u009a\u0003\u000e\u0007\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003\u001e\u000f\u0000\u009c\u009d\u0005U\u0000\u0000\u009d\u009e"+
		"\u00057\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f\u00a0\u00059"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\n\u0005"+
		"\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\t\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0007\u0000\u0000"+
		"\u00a5\u00a6\u00050\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7"+
		"\u00a8\u00055\u0000\u0000\u00a8\u00a9\u0005U\u0000\u0000\u00a9\u00aa\u0005"+
		"7\u0000\u0000\u00aa\u00ac\u0005\u0006\u0000\u0000\u00ab\u00ad\u0003\f"+
		"\u0006\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0005"+
		"\u0000\u0000\u00af\u00b0\u00059\u0000\u0000\u00b0\u000b\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b6\u0003 \u0010\u0000\u00b2\u00b3\u0005*\u0000\u0000\u00b3"+
		"\u00b5\u0003 \u0010\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\r\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\u0012\t\u0000\u00ba\u00bb\u0005U"+
		"\u0000\u0000\u00bb\u00bd\u0005\u0013\u0000\u0000\u00bc\u00be\u0003\u0010"+
		"\b\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0014\u0000"+
		"\u0000\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u000f\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003\u001e\u000f\u0000\u00c3\u00ca\u0005U\u0000\u0000\u00c4"+
		"\u00c5\u0005*\u0000\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000\u00c6\u00c7"+
		"\u0005U\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0011\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0005"+
		"!\u0000\u0000\u00ce\u00d0\u0003\u001e\u000f\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u0013\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000\u0000\u00d2\u00d3\u0005\u0013"+
		"\u0000\u0000\u00d3\u00d4\u0003\u0016\u000b\u0000\u00d4\u00d5\u00059\u0000"+
		"\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7\u00059\u0000\u0000"+
		"\u00d7\u00d8\u0003\u001c\u000e\u0000\u00d8\u00d9\u0005\u0014\u0000\u0000"+
		"\u00d9\u00da\u0003\u001a\r\u0000\u00da\u0015\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005U\u0000\u0000\u00dc\u00dd\u00057\u0000\u0000\u00dd\u00de\u0005"+
		"T\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df\u00e0\u0005U\u0000"+
		"\u0000\u00e0\u00e6\u00034\u001a\u0000\u00e1\u00e7\u0005U\u0000\u0000\u00e2"+
		"\u00e3\u0005U\u0000\u0000\u00e3\u00e4\u00053\u0000\u0000\u00e4\u00e7\u0005"+
		"+\u0000\u0000\u00e5\u00e7\u0005T\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u0019\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005\r\u0000\u0000"+
		"\u00e9\u00eb\u00030\u0018\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000e\u0000\u0000\u00f0"+
		"\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005U\u0000\u0000\u00f2\u00f3"+
		"\u00057\u0000\u0000\u00f3\u00f4\u0003.\u0017\u0000\u00f4\u00f5\u0005U"+
		"\u0000\u0000\u00f5\u00fa\u0001\u0000\u0000\u0000\u00f6\u00fa\u0003*\u0015"+
		"\u0000\u00f7\u00fa\u0003,\u0016\u0000\u00f8\u00fa\u0003(\u0014\u0000\u00f9"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0000\u0000\u0000\u00fc"+
		"\u001f\u0001\u0000\u0000\u0000\u00fd\u00fe\u0006\u0010\uffff\uffff\u0000"+
		"\u00fe\u0108\u0005U\u0000\u0000\u00ff\u0108\u0005T\u0000\u0000\u0100\u0108"+
		"\u0005V\u0000\u0000\u0101\u0108\u0003$\u0012\u0000\u0102\u0108\u0003&"+
		"\u0013\u0000\u0103\u0108\u0003(\u0014\u0000\u0104\u0108\u0003\"\u0011"+
		"\u0000\u0105\u0108\u0005\'\u0000\u0000\u0106\u0108\u0005(\u0000\u0000"+
		"\u0107\u00fd\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000"+
		"\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000\u0000"+
		"\u0107\u0102\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000"+
		"\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u011d\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\n\u000f\u0000\u0000\u010a\u010b\u0005\u0011\u0000\u0000\u010b"+
		"\u011c\u0003 \u0010\u0010\u010c\u010d\n\u000e\u0000\u0000\u010d\u010e"+
		"\u0005\u000f\u0000\u0000\u010e\u011c\u0003 \u0010\u000f\u010f\u0110\n"+
		"\r\u0000\u0000\u0110\u0111\u0005\u0012\u0000\u0000\u0111\u011c\u0003 "+
		"\u0010\u000e\u0112\u0113\n\f\u0000\u0000\u0113\u0114\u0005\u0010\u0000"+
		"\u0000\u0114\u011c\u0003 \u0010\r\u0115\u0116\n\u000b\u0000\u0000\u0116"+
		"\u0117\u0005\u0017\u0000\u0000\u0117\u011c\u0003 \u0010\f\u0118\u0119"+
		"\n\n\u0000\u0000\u0119\u011a\u0005\u0019\u0000\u0000\u011a\u011c\u0003"+
		" \u0010\u000b\u011b\u0109\u0001\u0000\u0000\u0000\u011b\u010c\u0001\u0000"+
		"\u0000\u0000\u011b\u010f\u0001\u0000\u0000\u0000\u011b\u0112\u0001\u0000"+
		"\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e!\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005U\u0000\u0000"+
		"\u0121\u0122\u0005\u0013\u0000\u0000\u0122\u0123\u0005\u0014\u0000\u0000"+
		"\u0123\u0124\u00059\u0000\u0000\u0124#\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005U\u0000\u0000\u0126\u0127\u0005\u0015\u0000\u0000\u0127%\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005U\u0000\u0000\u0129\u012a\u0005\u0016\u0000"+
		"\u0000\u012a\'\u0001\u0000\u0000\u0000\u012b\u012c\u0005U\u0000\u0000"+
		"\u012c\u012d\u0007\u0001\u0000\u0000\u012d\u012e\u0005T\u0000\u0000\u012e"+
		")\u0001\u0000\u0000\u0000\u012f\u0130\u0005U\u0000\u0000\u0130\u0131\u0005"+
		"\u0015\u0000\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0133\u0005U\u0000"+
		"\u0000\u0133\u0134\u0005\u0016\u0000\u0000\u0134-\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0007\u0002\u0000\u0000\u0136/\u0001\u0000\u0000\u0000\u0137"+
		"\u014e\u0003\b\u0004\u0000\u0138\u014e\u0003@ \u0000\u0139\u014e\u0003"+
		"8\u001c\u0000\u013a\u014e\u00032\u0019\u0000\u013b\u014e\u0003\u0014\n"+
		"\u0000\u013c\u014e\u00036\u001b\u0000\u013d\u014e\u0003>\u001f\u0000\u013e"+
		"\u014e\u0003\"\u0011\u0000\u013f\u0140\u00052\u0000\u0000\u0140\u014e"+
		"\u00059\u0000\u0000\u0141\u0143\u0005,\u0000\u0000\u0142\u0144\u0003 "+
		"\u0010\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u014e\u00059\u0000"+
		"\u0000\u0146\u0147\u0005U\u0000\u0000\u0147\u0148\u00057\u0000\u0000\u0148"+
		"\u0149\u0005U\u0000\u0000\u0149\u014a\u0003.\u0017\u0000\u014a\u014b\u0005"+
		"T\u0000\u0000\u014b\u014c\u00059\u0000\u0000\u014c\u014e\u0001\u0000\u0000"+
		"\u0000\u014d\u0137\u0001\u0000\u0000\u0000\u014d\u0138\u0001\u0000\u0000"+
		"\u0000\u014d\u0139\u0001\u0000\u0000\u0000\u014d\u013a\u0001\u0000\u0000"+
		"\u0000\u014d\u013b\u0001\u0000\u0000\u0000\u014d\u013c\u0001\u0000\u0000"+
		"\u0000\u014d\u013d\u0001\u0000\u0000\u0000\u014d\u013e\u0001\u0000\u0000"+
		"\u0000\u014d\u013f\u0001\u0000\u0000\u0000\u014d\u0141\u0001\u0000\u0000"+
		"\u0000\u014d\u0146\u0001\u0000\u0000\u0000\u014e1\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005%\u0000\u0000\u0150\u0151\u0003\u001a\r\u0000\u0151"+
		"3\u0001\u0000\u0000\u0000\u0152\u0153\u0007\u0003\u0000\u0000\u01535\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005\b\u0000\u0000\u0155\u0156\u0005\u0013"+
		"\u0000\u0000\u0156\u0157\u0003<\u001e\u0000\u0157\u0158\u0005\u0014\u0000"+
		"\u0000\u0158\u0159\u0003\u001a\r\u0000\u01597\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005$\u0000\u0000\u015b\u015c\u0005\u0013\u0000\u0000\u015c"+
		"\u015d\u0003<\u001e\u0000\u015d\u015e\u0005\u0014\u0000\u0000\u015e\u0162"+
		"\u0003\u001a\r\u0000\u015f\u0161\u0003:\u001d\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0167\u0003"+
		"2\u0019\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u01679\u0001\u0000\u0000\u0000\u0168\u0169\u0005%\u0000\u0000"+
		"\u0169\u016a\u0005\u0013\u0000\u0000\u016a\u016b\u0003<\u001e\u0000\u016b"+
		"\u016c\u0005\u0014\u0000\u0000\u016c\u016d\u0003\u001a\r\u0000\u016d;"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0005U\u0000\u0000\u016f\u0170\u0003"+
		"4\u001a\u0000\u0170\u0171\u0003 \u0010\u0000\u0171\u0175\u0001\u0000\u0000"+
		"\u0000\u0172\u0175\u0005U\u0000\u0000\u0173\u0175\u0003 \u0010\u0000\u0174"+
		"\u016e\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0175=\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005U\u0000\u0000\u0177\u0178\u00057\u0000\u0000\u0178\u0179\u0003 "+
		"\u0010\u0000\u0179\u017a\u00059\u0000\u0000\u017a?\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u00054\u0000\u0000\u017c\u017d\u0005\u0013\u0000\u0000\u017d"+
		"\u017e\u0003 \u0010\u0000\u017e\u017f\u0005\u0014\u0000\u0000\u017f\u0180"+
		"\u00059\u0000\u0000\u0180A\u0001\u0000\u0000\u0000\u0181\u018a\u0003D"+
		"\"\u0000\u0182\u018a\u0003J%\u0000\u0183\u018a\u0003P(\u0000\u0184\u018a"+
		"\u0003j5\u0000\u0185\u018a\u0003\\.\u0000\u0186\u018a\u0003^/\u0000\u0187"+
		"\u018a\u0003z=\u0000\u0188\u018a\u0003r9\u0000\u0189\u0181\u0001\u0000"+
		"\u0000\u0000\u0189\u0182\u0001\u0000\u0000\u0000\u0189\u0183\u0001\u0000"+
		"\u0000\u0000\u0189\u0184\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000"+
		"\u0000\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018aC\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0005C\u0000\u0000\u018c\u018e\u0005\u0013\u0000\u0000"+
		"\u018d\u018f\u0003F#\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0005\u0014\u0000\u0000\u0191\u0192\u00059\u0000\u0000\u0192E\u0001\u0000"+
		"\u0000\u0000\u0193\u0198\u0003H$\u0000\u0194\u0195\u0005*\u0000\u0000"+
		"\u0195\u0197\u0003H$\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019b\u019d\u0005*\u0000\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019dG\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005D\u0000\u0000\u019f\u01a0\u0005\u0004\u0000"+
		"\u0000\u01a0\u01a5\u0003B!\u0000\u01a1\u01a2\u0005J\u0000\u0000\u01a2"+
		"\u01a3\u0005\u0004\u0000\u0000\u01a3\u01a5\u0003p8\u0000\u01a4\u019e\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a5I\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0005?\u0000\u0000\u01a7\u01a8\u0005\u0013\u0000"+
		"\u0000\u01a8\u01a9\u0003L&\u0000\u01a9\u01ab\u0005\u0014\u0000\u0000\u01aa"+
		"\u01ac\u0005*\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01acK\u0001\u0000\u0000\u0000\u01ad\u01b2\u0005"+
		"V\u0000\u0000\u01ae\u01af\u0005*\u0000\u0000\u01af\u01b1\u0003N\'\u0000"+
		"\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0005*\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7M\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0005G\u0000\u0000\u01b9\u01ba\u0005\u0004\u0000\u0000\u01ba\u01c2\u0005"+
		"T\u0000\u0000\u01bb\u01bc\u0005F\u0000\u0000\u01bc\u01bd\u0005\u0004\u0000"+
		"\u0000\u01bd\u01c2\u0005T\u0000\u0000\u01be\u01bf\u0005E\u0000\u0000\u01bf"+
		"\u01c0\u0005\u0004\u0000\u0000\u01c0\u01c2\u0003p8\u0000\u01c1\u01b8\u0001"+
		"\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c1\u01be\u0001"+
		"\u0000\u0000\u0000\u01c2O\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005B\u0000"+
		"\u0000\u01c4\u01c5\u0005\u0013\u0000\u0000\u01c5\u01c6\u0003R)\u0000\u01c6"+
		"\u01c8\u0005\u0014\u0000\u0000\u01c7\u01c9\u0005*\u0000\u0000\u01c8\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9Q\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cd\u0005V\u0000\u0000\u01cb\u01cc\u0005*\u0000"+
		"\u0000\u01cc\u01ce\u0003T*\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0005*\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1S\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005"+
		"R\u0000\u0000\u01d3\u01d4\u0005\u0004\u0000\u0000\u01d4\u01d5\u0003V+"+
		"\u0000\u01d5U\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005S\u0000\u0000\u01d7"+
		"\u01d9\u0005\u0013\u0000\u0000\u01d8\u01da\u0003X,\u0000\u01d9\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0005\u0014\u0000\u0000\u01dcW\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e2\u0003Z-\u0000\u01de\u01df\u0005*\u0000\u0000"+
		"\u01df\u01e1\u0003Z-\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005*\u0000\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7Y\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0005E\u0000\u0000\u01e9\u01ea\u0005\u0004\u0000"+
		"\u0000\u01ea\u01ef\u0003p8\u0000\u01eb\u01ec\u0005Q\u0000\u0000\u01ec"+
		"\u01ed\u0005\u0004\u0000\u0000\u01ed\u01ef\u0005T\u0000\u0000\u01ee\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ef[\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005:\u0000\u0000\u01f1\u01f3\u0005\u0013"+
		"\u0000\u0000\u01f2\u01f4\u0003`0\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f7\u0005\u0014\u0000\u0000\u01f6\u01f8\u0005*\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"]\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005<\u0000\u0000\u01fa\u01fc\u0005"+
		"\u0013\u0000\u0000\u01fb\u01fd\u0003`0\u0000\u01fc\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0200\u0005\u0014\u0000\u0000\u01ff\u0201\u0005*\u0000\u0000"+
		"\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201_\u0001\u0000\u0000\u0000\u0202\u0207\u0003b1\u0000\u0203\u0204"+
		"\u0005*\u0000\u0000\u0204\u0206\u0003b1\u0000\u0205\u0203\u0001\u0000"+
		"\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020c\u0005*\u0000"+
		"\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020ca\u0001\u0000\u0000\u0000\u020d\u020e\u0005K\u0000\u0000\u020e"+
		"\u020f\u0005\u0004\u0000\u0000\u020f\u0217\u0003d2\u0000\u0210\u0211\u0005"+
		"M\u0000\u0000\u0211\u0212\u0005\u0004\u0000\u0000\u0212\u0217\u0003f3"+
		"\u0000\u0213\u0214\u0005>\u0000\u0000\u0214\u0215\u0005\u0004\u0000\u0000"+
		"\u0215\u0217\u0003h4\u0000\u0216\u020d\u0001\u0000\u0000\u0000\u0216\u0210"+
		"\u0001\u0000\u0000\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0217c\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0005L\u0000\u0000\u0219\u021a\u00053\u0000"+
		"\u0000\u021a\u021b\u0005O\u0000\u0000\u021be\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0005N\u0000\u0000\u021d\u021e\u00053\u0000\u0000\u021e\u021f\u0005"+
		"P\u0000\u0000\u021fg\u0001\u0000\u0000\u0000\u0220\u0229\u0005\u0006\u0000"+
		"\u0000\u0221\u0226\u0003B!\u0000\u0222\u0223\u0005*\u0000\u0000\u0223"+
		"\u0225\u0003B!\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0229\u0221\u0001\u0000\u0000\u0000\u0229\u022a\u0001"+
		"\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u022d\u0005"+
		"*\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0005\u0005"+
		"\u0000\u0000\u022f\u0231\u0005*\u0000\u0000\u0230\u022f\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231i\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005=\u0000\u0000\u0233\u0235\u0005\u0013\u0000\u0000\u0234"+
		"\u0236\u0003l6\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0005"+
		"\u0014\u0000\u0000\u0238\u023a\u0005*\u0000\u0000\u0239\u0238\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023ak\u0001\u0000\u0000"+
		"\u0000\u023b\u0240\u0003n7\u0000\u023c\u023d\u0005*\u0000\u0000\u023d"+
		"\u023f\u0003n7\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0242\u0001"+
		"\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001"+
		"\u0000\u0000\u0000\u0243\u0245\u0005*\u0000\u0000\u0244\u0243\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245m\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0005E\u0000\u0000\u0247\u0248\u0005\u0004\u0000\u0000"+
		"\u0248\u0253\u0003p8\u0000\u0249\u024a\u0005G\u0000\u0000\u024a\u024b"+
		"\u0005\u0004\u0000\u0000\u024b\u0253\u0005T\u0000\u0000\u024c\u024d\u0005"+
		"F\u0000\u0000\u024d\u024e\u0005\u0004\u0000\u0000\u024e\u0253\u0005T\u0000"+
		"\u0000\u024f\u0250\u0005A\u0000\u0000\u0250\u0251\u0005\u0004\u0000\u0000"+
		"\u0251\u0253\u0003B!\u0000\u0252\u0246\u0001\u0000\u0000\u0000\u0252\u0249"+
		"\u0001\u0000\u0000\u0000\u0252\u024c\u0001\u0000\u0000\u0000\u0252\u024f"+
		"\u0001\u0000\u0000\u0000\u0253o\u0001\u0000\u0000\u0000\u0254\u0255\u0005"+
		"U\u0000\u0000\u0255q\u0001\u0000\u0000\u0000\u0256\u0257\u0005;\u0000"+
		"\u0000\u0257\u0258\u0005\u0013\u0000\u0000\u0258\u0259\u0003t:\u0000\u0259"+
		"\u025a\u0005\u0014\u0000\u0000\u025as\u0001\u0000\u0000\u0000\u025b\u0260"+
		"\u0003v;\u0000\u025c\u025d\u0005*\u0000\u0000\u025d\u025f\u0003v;\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000"+
		"\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261u\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0005H\u0000\u0000\u0264\u0265\u0005\u0004\u0000\u0000\u0265\u026d"+
		"\u0003x<\u0000\u0266\u0267\u0005E\u0000\u0000\u0267\u0268\u0005\u0004"+
		"\u0000\u0000\u0268\u026d\u0003p8\u0000\u0269\u026a\u0005A\u0000\u0000"+
		"\u026a\u026b\u0005\u0004\u0000\u0000\u026b\u026d\u0003B!\u0000\u026c\u0263"+
		"\u0001\u0000\u0000\u0000\u026c\u0266\u0001\u0000\u0000\u0000\u026c\u0269"+
		"\u0001\u0000\u0000\u0000\u026dw\u0001\u0000\u0000\u0000\u026e\u026f\u0005"+
		"U\u0000\u0000\u026f\u0270\u0005\u0013\u0000\u0000\u0270\u0275\u0005\u0014"+
		"\u0000\u0000\u0271\u0272\u0005\u0013\u0000\u0000\u0272\u0273\u0005\u0014"+
		"\u0000\u0000\u0273\u0275\u0003\u001a\r\u0000\u0274\u026e\u0001\u0000\u0000"+
		"\u0000\u0274\u0271\u0001\u0000\u0000\u0000\u0275y\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0005I\u0000\u0000\u0277\u0278\u0005\u0013\u0000\u0000\u0278"+
		"\u0279\u0003|>\u0000\u0279\u027a\u0005\u0014\u0000\u0000\u027a{\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0005A\u0000\u0000\u027c\u027d\u0005\u0004"+
		"\u0000\u0000\u027d\u027e\u0003B!\u0000\u027e}\u0001\u0000\u0000\u0000"+
		"9\u0081\u0087\u008a\u0092\u0099\u00a2\u00ac\u00b6\u00bd\u00ca\u00cf\u00e6"+
		"\u00ec\u00f9\u0107\u011b\u011d\u0143\u014d\u0162\u0166\u0174\u0189\u018e"+
		"\u0198\u019c\u01a4\u01ab\u01b2\u01b6\u01c1\u01c8\u01cd\u01d0\u01d9\u01e2"+
		"\u01e6\u01ee\u01f3\u01f7\u01fc\u0200\u0207\u020b\u0216\u0226\u0229\u022c"+
		"\u0230\u0235\u0239\u0240\u0244\u0252\u0260\u026c\u0274";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}