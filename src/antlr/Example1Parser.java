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
		HEIGHT=70, WIDTH=71, ON_PRESSED=72, CENTER=73, NUMBER=74, CHARS=75, STRING_EXP=76, 
		ID=77;
	public static final int
		RULE_program = 0, RULE_topLevel = 1, RULE_class_decl = 2, RULE_class_member = 3, 
		RULE_variables_decl = 4, RULE_function = 5, RULE_function_parameters = 6, 
		RULE_call_function = 7, RULE_for_statement = 8, RULE_for_first_part = 9, 
		RULE_for_secomd_part = 10, RULE_block = 11, RULE_for_statement_variable_number = 12, 
		RULE_type = 13, RULE_expr = 14, RULE_fast_math = 15, RULE_for_statement_adding_one = 16, 
		RULE_for_statement_minuss_one = 17, RULE_adding_one = 18, RULE_minus_one = 19, 
		RULE_number_attribute = 20, RULE_code_attribute = 21, RULE_else_statment = 22, 
		RULE_operation_if = 23, RULE_while_statment = 24, RULE_if_statment = 25, 
		RULE_else_if_statements = 26, RULE_if_part = 27, RULE_assignment = 28, 
		RULE_print_statements = 29, RULE_list = 30, RULE_list_exp = 31, RULE_widget = 32, 
		RULE_image = 33, RULE_image_assets = 34, RULE_text = 35, RULE_column = 36, 
		RULE_row = 37, RULE_container = 38, RULE_scaffold = 39, RULE_color = 40, 
		RULE_width = 41, RULE_height = 42, RULE_e_button = 43, RULE_elevatedButtonWidgetArgs = 44, 
		RULE_elevatedButtonWidgetArg = 45, RULE_voidFunction = 46, RULE_center = 47, 
		RULE_centerWidgetArgs = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevel", "class_decl", "class_member", "variables_decl", 
			"function", "function_parameters", "call_function", "for_statement", 
			"for_first_part", "for_secomd_part", "block", "for_statement_variable_number", 
			"type", "expr", "fast_math", "for_statement_adding_one", "for_statement_minuss_one", 
			"adding_one", "minus_one", "number_attribute", "code_attribute", "else_statment", 
			"operation_if", "while_statment", "if_statment", "else_if_statements", 
			"if_part", "assignment", "print_statements", "list", "list_exp", "widget", 
			"image", "image_assets", "text", "column", "row", "container", "scaffold", 
			"color", "width", "height", "e_button", "elevatedButtonWidgetArgs", "elevatedButtonWidgetArg", 
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
			"'Row'", "'Container'", "'Children'", "'Image.assets'", "'Image'", "'child'", 
			"'Text'", "'Scaffold'", "'body'", "'color'", "'height'", "'width'", "'onPressed'", 
			"'Center'"
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
			"ON_PRESSED", "CENTER", "NUMBER", "CHARS", "STRING_EXP", "ID"
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3747100490333159558L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 13L) != 0) {
				{
				{
				setState(98);
				topLevel();
				}
				}
				setState(103);
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
	public static class TopLevelContext extends ParserRuleContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevel);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				variables_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				class_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(110);
				match(ABSTRACT);
				}
			}

			setState(113);
			match(CLASS);
			setState(114);
			match(CHARS);
			setState(115);
			match(CURLYOPEN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 47244640390L) != 0) {
				{
				{
				setState(116);
				class_member();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_member);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variables_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(Example1Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Variables_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVariables_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVariables_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVariables_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_declContext variables_decl() throws RecognitionException {
		Variables_declContext _localctx = new Variables_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables_decl);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				type();
				setState(129);
				match(CHARS);
				setState(130);
				match(EQUAL);
				setState(131);
				expr(0);
				setState(132);
				match(SEMICOLON);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Example1Parser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(137);
				match(VOID);
				}
				break;
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(138);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			match(CHARS);
			setState(142);
			match(OPENTEXT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 38654705670L) != 0) {
				{
				setState(143);
				function_parameters();
				}
			}

			setState(146);
			match(CLOSETEXT);
			setState(147);
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
		enterRule(_localctx, 12, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			type();
			setState(150);
			match(CHARS);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				type();
				setState(153);
				match(CHARS);
				}
				}
				setState(159);
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
		enterRule(_localctx, 14, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CHARS);
			setState(161);
			match(OPENTEXT);
			setState(162);
			match(CLOSETEXT);
			setState(163);
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
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FOR);
			setState(166);
			match(OPENTEXT);
			setState(167);
			for_first_part();
			setState(168);
			match(SEMICOLON);
			setState(169);
			for_secomd_part();
			setState(170);
			match(SEMICOLON);
			setState(171);
			for_statement_variable_number();
			setState(172);
			match(CLOSETEXT);
			setState(173);
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
		enterRule(_localctx, 18, RULE_for_first_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(CHARS);
			setState(176);
			match(EQUAL);
			setState(177);
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
		enterRule(_localctx, 20, RULE_for_secomd_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CHARS);
			setState(180);
			operation_if();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(181);
				match(CHARS);
				}
				break;
			case 2:
				{
				setState(182);
				match(CHARS);
				setState(183);
				match(DOT);
				setState(184);
				match(LENGTH);
				}
				break;
			case 3:
				{
				setState(185);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CURLYOPEN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5647336550171014L) != 0 || _la==CHARS) {
				{
				{
				setState(189);
				code_attribute();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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
		enterRule(_localctx, 24, RULE_for_statement_variable_number);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ForStatementNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(CHARS);
				setState(198);
				match(EQUAL);
				{
				setState(199);
				number_attribute();
				setState(200);
				match(CHARS);
				}
				}
				break;
			case 2:
				_localctx = new ForStatementPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				for_statement_adding_one();
				}
				break;
			case 3:
				_localctx = new ForStatementMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				for_statement_minuss_one();
				}
				break;
			case 4:
				_localctx = new ForStatementFastMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Example1Parser.MULTIPLY, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(Example1Parser.SUM, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitAddition(this);
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
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVID() { return getToken(Example1Parser.DIVID, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitDivision(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Example1Parser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitMinus(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				match(CHARS);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(STRING_EXP);
				}
				break;
			case 4:
				{
				_localctx = new AddingOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				adding_one();
				}
				break;
			case 5:
				{
				_localctx = new MinusOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				minus_one();
				}
				break;
			case 6:
				{
				_localctx = new FastMatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				fast_math();
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				call_function();
				}
				break;
			case 8:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(222);
						match(MULTIPLY);
						setState(223);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(225);
						match(SUM);
						setState(226);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						match(MINUS);
						setState(229);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(231);
						match(DIVID);
						setState(232);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class Fast_mathContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(Example1Parser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(Example1Parser.CHARS, i);
		}
		public TerminalNode SUM_EQUAL() { return getToken(Example1Parser.SUM_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(Example1Parser.MINUS_EQUAL, 0); }
		public TerminalNode DIVID_EQUAL() { return getToken(Example1Parser.DIVID_EQUAL, 0); }
		public TerminalNode MULTIPLY_EQUAL() { return getToken(Example1Parser.MULTIPLY_EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
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
		enterRule(_localctx, 30, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(CHARS);
			setState(239);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1811939328L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==CHARS) ) {
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
		enterRule(_localctx, 32, RULE_for_statement_adding_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CHARS);
			setState(243);
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
		enterRule(_localctx, 34, RULE_for_statement_minuss_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(CHARS);
			setState(246);
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
			setState(248);
			match(CHARS);
			setState(249);
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
			setState(251);
			match(CHARS);
			setState(252);
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
		enterRule(_localctx, 40, RULE_number_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 42, RULE_code_attribute);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new PrintCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				print_statements();
				}
				break;
			case 3:
				_localctx = new IfCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				if_statment();
				}
				break;
			case 4:
				_localctx = new ElseCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				else_statment();
				}
				break;
			case 5:
				_localctx = new ForCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				for_statement();
				}
				break;
			case 6:
				_localctx = new WhileStatementsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				while_statment();
				}
				break;
			case 7:
				_localctx = new AssignmentCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				assignment();
				}
				break;
			case 8:
				_localctx = new CallCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				call_function();
				}
				break;
			case 9:
				_localctx = new BreakCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(264);
				match(BREAK);
				setState(265);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ReturnCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				match(RETURN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 240518168579L) != 0) {
					{
					setState(267);
					expr(0);
					}
				}

				setState(270);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new CodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				match(CHARS);
				setState(272);
				match(EQUAL);
				setState(273);
				match(CHARS);
				setState(274);
				number_attribute();
				setState(275);
				match(NUMBER);
				setState(276);
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
		enterRule(_localctx, 44, RULE_else_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ELSE);
			setState(281);
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
		enterRule(_localctx, 46, RULE_operation_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 48, RULE_while_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(WHILE);
			setState(286);
			match(OPENTEXT);
			setState(287);
			if_part();
			setState(288);
			match(CLOSETEXT);
			setState(289);
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
		enterRule(_localctx, 50, RULE_if_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IF);
			setState(292);
			match(OPENTEXT);
			setState(293);
			if_part();
			setState(294);
			match(CLOSETEXT);
			setState(295);
			block();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					else_if_statements();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(302);
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
		enterRule(_localctx, 52, RULE_else_if_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ELSE);
			setState(306);
			match(OPENTEXT);
			setState(307);
			if_part();
			setState(308);
			match(CLOSETEXT);
			setState(309);
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
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public Operation_ifContext operation_if() {
			return getRuleContext(Operation_ifContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterIf_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitIf_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitIf_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_part);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(CHARS);
				setState(312);
				operation_if();
				setState(313);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(CHARS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
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
		enterRule(_localctx, 56, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CHARS);
			setState(320);
			match(EQUAL);
			setState(321);
			expr(0);
			setState(322);
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
		enterRule(_localctx, 58, RULE_print_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(PRINT);
			setState(325);
			match(OPENTEXT);
			setState(326);
			expr(0);
			setState(327);
			match(CLOSETEXT);
			setState(328);
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
		enterRule(_localctx, 60, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LIST);
			setState(331);
			match(TAG_OPEN);
			setState(332);
			type();
			setState(333);
			match(TAG_CLOSE);
			setState(334);
			match(CHARS);
			setState(335);
			match(EQUAL);
			setState(336);
			match(OB);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 240518168579L) != 0) {
				{
				setState(337);
				list_exp();
				}
			}

			setState(340);
			match(CB);
			setState(341);
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
		enterRule(_localctx, 62, RULE_list_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			expr(0);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				expr(0);
				}
				}
				setState(350);
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
	public static class WidgetContext extends ParserRuleContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_widget);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				scaffold();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				image();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				text();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				container();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				row();
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
		public TerminalNode IMAGE() { return getToken(Example1Parser.IMAGE, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public Image_assetsContext image_assets() {
			return getRuleContext(Image_assetsContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
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
		enterRule(_localctx, 66, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IMAGE);
			setState(360);
			match(OPENTEXT);
			setState(361);
			image_assets();
			setState(362);
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
	public static class Image_assetsContext extends ParserRuleContext {
		public TerminalNode IMAGEASSETS() { return getToken(Example1Parser.IMAGEASSETS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(Example1Parser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(Example1Parser.SINGLE_QUOTE, i);
		}
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public Image_assetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_assets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterImage_assets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitImage_assets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitImage_assets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_assetsContext image_assets() throws RecognitionException {
		Image_assetsContext _localctx = new Image_assetsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_image_assets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IMAGEASSETS);
			setState(365);
			match(OPENTEXT);
			setState(366);
			match(SINGLE_QUOTE);
			setState(367);
			match(CHARS);
			setState(368);
			match(SINGLE_QUOTE);
			setState(369);
			match(CLOSETEXT);
			setState(370);
			match(COMMA);
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
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(Example1Parser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(Example1Parser.SINGLE_QUOTE, i);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
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
		enterRule(_localctx, 70, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TEXT);
			setState(373);
			match(OPENTEXT);
			setState(374);
			match(SINGLE_QUOTE);
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==CHARS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			match(SINGLE_QUOTE);
			setState(377);
			match(CLOSETEXT);
			setState(378);
			match(COMMA);
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
		public TerminalNode CHILDREN() { return getToken(Example1Parser.CHILDREN, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode OB() { return getToken(Example1Parser.OB, 0); }
		public TerminalNode CB() { return getToken(Example1Parser.CB, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
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
		enterRule(_localctx, 72, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(COLUMN);
			setState(381);
			match(OPENTEXT);
			setState(382);
			match(CHILDREN);
			setState(383);
			match(C);
			setState(384);
			match(OB);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMAGE) {
				{
				{
				setState(385);
				image();
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(386);
					text();
					}
					}
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(CB);
			setState(397);
			match(CLOSETEXT);
			setState(398);
			match(COMMA);
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
		public TerminalNode CHILDREN() { return getToken(Example1Parser.CHILDREN, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode OB() { return getToken(Example1Parser.OB, 0); }
		public TerminalNode CB() { return getToken(Example1Parser.CB, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
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
		enterRule(_localctx, 74, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ROW);
			setState(401);
			match(OPENTEXT);
			setState(402);
			match(CHILDREN);
			setState(403);
			match(C);
			setState(404);
			match(OB);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				column();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			setState(410);
			match(CB);
			setState(411);
			match(CLOSETEXT);
			setState(412);
			match(COMMA);
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
		public TerminalNode CHILD() { return getToken(Example1Parser.CHILD, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CONTAINER);
			setState(415);
			match(OPENTEXT);
			{
			setState(416);
			color();
			setState(417);
			width();
			setState(418);
			height();
			}
			setState(420);
			match(CHILD);
			setState(421);
			match(C);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				{
				setState(422);
				row();
				}
				break;
			case COLUMN:
				{
				setState(423);
				column();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(426);
			match(CLOSETEXT);
			setState(427);
			match(COMMA);
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
		public TerminalNode BODY() { return getToken(Example1Parser.BODY, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
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
		enterRule(_localctx, 78, RULE_scaffold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(SCAFFOLD);
			setState(430);
			match(OPENTEXT);
			setState(431);
			match(BODY);
			setState(432);
			match(C);
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				{
				setState(433);
				container();
				}
				break;
			case COLUMN:
				{
				setState(434);
				column();
				}
				break;
			case ROW:
				{
				setState(435);
				row();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(438);
			match(CLOSETEXT);
			setState(439);
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
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
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
		enterRule(_localctx, 80, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(COLOR);
			setState(442);
			match(C);
			setState(443);
			match(CHARS);
			setState(444);
			match(COMMA);
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
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(Example1Parser.WIDTH, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(WIDTH);
			setState(447);
			match(C);
			setState(448);
			match(NUMBER);
			setState(449);
			match(COMMA);
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
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(Example1Parser.HEIGHT, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode NUMBER() { return getToken(Example1Parser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(HEIGHT);
			setState(452);
			match(C);
			setState(453);
			match(NUMBER);
			setState(454);
			match(COMMA);
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
		public ElevatedButtonWidgetArgsContext elevatedButtonWidgetArgs() {
			return getRuleContext(ElevatedButtonWidgetArgsContext.class,0);
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
		enterRule(_localctx, 86, RULE_e_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(E_BUTTON);
			setState(457);
			match(OPENTEXT);
			setState(458);
			elevatedButtonWidgetArgs();
			setState(459);
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
	public static class ElevatedButtonWidgetArgsContext extends ParserRuleContext {
		public List<ElevatedButtonWidgetArgContext> elevatedButtonWidgetArg() {
			return getRuleContexts(ElevatedButtonWidgetArgContext.class);
		}
		public ElevatedButtonWidgetArgContext elevatedButtonWidgetArg(int i) {
			return getRuleContext(ElevatedButtonWidgetArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ElevatedButtonWidgetArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevatedButtonWidgetArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElevatedButtonWidgetArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElevatedButtonWidgetArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElevatedButtonWidgetArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevatedButtonWidgetArgsContext elevatedButtonWidgetArgs() throws RecognitionException {
		ElevatedButtonWidgetArgsContext _localctx = new ElevatedButtonWidgetArgsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elevatedButtonWidgetArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			elevatedButtonWidgetArg();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462);
				match(COMMA);
				setState(463);
				elevatedButtonWidgetArg();
				}
				}
				setState(468);
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
	public static class ElevatedButtonWidgetArgContext extends ParserRuleContext {
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
		public ElevatedButtonWidgetArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevatedButtonWidgetArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterElevatedButtonWidgetArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitElevatedButtonWidgetArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitElevatedButtonWidgetArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevatedButtonWidgetArgContext elevatedButtonWidgetArg() throws RecognitionException {
		ElevatedButtonWidgetArgContext _localctx = new ElevatedButtonWidgetArgContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elevatedButtonWidgetArg);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_PRESSED:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ON_PRESSED);
				setState(470);
				match(C);
				setState(471);
				voidFunction();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(COLOR);
				setState(473);
				match(C);
				setState(474);
				color();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(CHILD);
				setState(476);
				match(C);
				setState(477);
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
		public TerminalNode ID() { return getToken(Example1Parser.ID, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_voidFunction);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(ID);
				setState(481);
				match(OPENTEXT);
				setState(482);
				match(CLOSETEXT);
				}
				break;
			case CLOSETEXT:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				{
				}

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
		enterRule(_localctx, 94, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(CENTER);
			setState(488);
			match(OPENTEXT);
			setState(489);
			centerWidgetArgs();
			setState(490);
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
		enterRule(_localctx, 96, RULE_centerWidgetArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(CHILD);
			setState(493);
			match(C);
			setState(494);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u01f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0005\u0000"+
		"d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0002\u0003\u0002p\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002v\b\u0002\n\u0002"+
		"\f\u0002y\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u007f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0091\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009c"+
		"\b\u0006\n\u0006\f\u0006\u009f\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bb\b\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00bf\b\u000b\n\u000b\f\u000b\u00c2\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00ce\b\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00dc\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ea"+
		"\b\u000e\n\u000e\f\u000e\u00ed\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010d\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0117\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u012a\b\u0019\n\u0019\f\u0019\u012d"+
		"\t\u0019\u0001\u0019\u0003\u0019\u0130\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u013e\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0153\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u015b\b\u001f\n\u001f"+
		"\f\u001f\u015e\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0166\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0004$\u0184\b$\u000b$\f$\u0185\u0005$\u0188\b$\n$\f$\u018b\t$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004"+
		"%\u0197\b%\u000b%\f%\u0198\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01a9\b&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01b5\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005"+
		",\u01d1\b,\n,\f,\u01d4\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u01df\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u01e6\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u0000\u0001\u001c1\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`\u0000\u0005\u0003\u0000\u0001\u0002  ##\u0002\u0000\u001a\u001b"+
		"\u001d\u001e\u0001\u0000JK\u0001\u0000\u000f\u0012\u0004\u0000\u001c\u001c"+
		"\u001f\u001f0156\u01fc\u0000e\u0001\u0000\u0000\u0000\u0002l\u0001\u0000"+
		"\u0000\u0000\u0004o\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000\u0000"+
		"\b\u0087\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u0095"+
		"\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a5"+
		"\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000\u0000\u0014\u00b3"+
		"\u0001\u0000\u0000\u0000\u0016\u00bc\u0001\u0000\u0000\u0000\u0018\u00cd"+
		"\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c\u00db"+
		"\u0001\u0000\u0000\u0000\u001e\u00ee\u0001\u0000\u0000\u0000 \u00f2\u0001"+
		"\u0000\u0000\u0000\"\u00f5\u0001\u0000\u0000\u0000$\u00f8\u0001\u0000"+
		"\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000\u0000"+
		"*\u0116\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000.\u011b"+
		"\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u00002\u0123\u0001\u0000"+
		"\u0000\u00004\u0131\u0001\u0000\u0000\u00006\u013d\u0001\u0000\u0000\u0000"+
		"8\u013f\u0001\u0000\u0000\u0000:\u0144\u0001\u0000\u0000\u0000<\u014a"+
		"\u0001\u0000\u0000\u0000>\u0157\u0001\u0000\u0000\u0000@\u0165\u0001\u0000"+
		"\u0000\u0000B\u0167\u0001\u0000\u0000\u0000D\u016c\u0001\u0000\u0000\u0000"+
		"F\u0174\u0001\u0000\u0000\u0000H\u017c\u0001\u0000\u0000\u0000J\u0190"+
		"\u0001\u0000\u0000\u0000L\u019e\u0001\u0000\u0000\u0000N\u01ad\u0001\u0000"+
		"\u0000\u0000P\u01b9\u0001\u0000\u0000\u0000R\u01be\u0001\u0000\u0000\u0000"+
		"T\u01c3\u0001\u0000\u0000\u0000V\u01c8\u0001\u0000\u0000\u0000X\u01cd"+
		"\u0001\u0000\u0000\u0000Z\u01de\u0001\u0000\u0000\u0000\\\u01e5\u0001"+
		"\u0000\u0000\u0000^\u01e7\u0001\u0000\u0000\u0000`\u01ec\u0001\u0000\u0000"+
		"\u0000bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0001"+
		"\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hm\u0003\b\u0004\u0000"+
		"im\u0003\u0004\u0002\u0000jm\u0003\n\u0005\u0000km\u0003@ \u0000lh\u0001"+
		"\u0000\u0000\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000m\u0003\u0001\u0000\u0000\u0000np\u0005.\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005-\u0000\u0000rs\u0005K\u0000\u0000sw\u0005\r\u0000"+
		"\u0000tv\u0003\u0006\u0003\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u000e\u0000\u0000"+
		"{\u0005\u0001\u0000\u0000\u0000|\u007f\u0003\b\u0004\u0000}\u007f\u0003"+
		"\n\u0005\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0007\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082"+
		"\u0005K\u0000\u0000\u0082\u0083\u00057\u0000\u0000\u0083\u0084\u0003\u001c"+
		"\u000e\u0000\u0084\u0085\u00059\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0003<\u001e\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0005!\u0000\u0000\u008a\u008c\u0003\u001a\r\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005K\u0000\u0000\u008e\u0090\u0005"+
		"\u0013\u0000\u0000\u008f\u0091\u0003\f\u0006\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0014\u0000\u0000\u0093\u0094\u0003\u0016"+
		"\u000b\u0000\u0094\u000b\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u001a"+
		"\r\u0000\u0096\u009d\u0005K\u0000\u0000\u0097\u0098\u0005*\u0000\u0000"+
		"\u0098\u0099\u0003\u001a\r\u0000\u0099\u009a\u0005K\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\r\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005K\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0013\u0000\u0000\u00a2\u00a3\u0005\u0014\u0000\u0000\u00a3\u00a4\u0005"+
		"9\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0018"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7\u00a8\u0003\u0012"+
		"\t\u0000\u00a8\u00a9\u00059\u0000\u0000\u00a9\u00aa\u0003\u0014\n\u0000"+
		"\u00aa\u00ab\u00059\u0000\u0000\u00ab\u00ac\u0003\u0018\f\u0000\u00ac"+
		"\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\u0000\u00ae"+
		"\u0011\u0001\u0000\u0000\u0000\u00af\u00b0\u0005K\u0000\u0000\u00b0\u00b1"+
		"\u00057\u0000\u0000\u00b1\u00b2\u0005J\u0000\u0000\u00b2\u0013\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005K\u0000\u0000\u00b4\u00ba\u0003.\u0017\u0000"+
		"\u00b5\u00bb\u0005K\u0000\u0000\u00b6\u00b7\u0005K\u0000\u0000\u00b7\u00b8"+
		"\u00053\u0000\u0000\u00b8\u00bb\u0005+\u0000\u0000\u00b9\u00bb\u0005J"+
		"\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u0015\u0001\u0000"+
		"\u0000\u0000\u00bc\u00c0\u0005\r\u0000\u0000\u00bd\u00bf\u0003*\u0015"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4\u0017\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005K\u0000\u0000\u00c6\u00c7\u00057\u0000\u0000\u00c7"+
		"\u00c8\u0003(\u0014\u0000\u00c8\u00c9\u0005K\u0000\u0000\u00c9\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ca\u00ce\u0003 \u0010\u0000\u00cb\u00ce\u0003\""+
		"\u0011\u0000\u00cc\u00ce\u0003\u001e\u000f\u0000\u00cd\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u0019\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0007\u0000\u0000\u0000\u00d0\u001b\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0006\u000e\uffff\uffff\u0000\u00d2\u00dc\u0005"+
		"K\u0000\u0000\u00d3\u00dc\u0005J\u0000\u0000\u00d4\u00dc\u0005L\u0000"+
		"\u0000\u00d5\u00dc\u0003$\u0012\u0000\u00d6\u00dc\u0003&\u0013\u0000\u00d7"+
		"\u00dc\u0003\u001e\u000f\u0000\u00d8\u00dc\u0003\u000e\u0007\u0000\u00d9"+
		"\u00dc\u0005\'\u0000\u0000\u00da\u00dc\u0005(\u0000\u0000\u00db\u00d1"+
		"\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d4"+
		"\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00eb\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\n\r\u0000\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00ea\u0003"+
		"\u001c\u000e\u000e\u00e0\u00e1\n\f\u0000\u0000\u00e1\u00e2\u0005\u000f"+
		"\u0000\u0000\u00e2\u00ea\u0003\u001c\u000e\r\u00e3\u00e4\n\u000b\u0000"+
		"\u0000\u00e4\u00e5\u0005\u0012\u0000\u0000\u00e5\u00ea\u0003\u001c\u000e"+
		"\f\u00e6\u00e7\n\n\u0000\u0000\u00e7\u00e8\u0005\u0010\u0000\u0000\u00e8"+
		"\u00ea\u0003\u001c\u000e\u000b\u00e9\u00dd\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u001d\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005K\u0000\u0000\u00ef\u00f0\u0007\u0001\u0000\u0000\u00f0\u00f1"+
		"\u0007\u0002\u0000\u0000\u00f1\u001f\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005K\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4!\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005K\u0000\u0000\u00f6\u00f7\u0005\u0016\u0000"+
		"\u0000\u00f7#\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005K\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0015\u0000\u0000\u00fa%\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005K\u0000\u0000\u00fc\u00fd\u0005\u0016\u0000\u0000\u00fd\'\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0007\u0003\u0000\u0000\u00ff)\u0001\u0000"+
		"\u0000\u0000\u0100\u0117\u0003\b\u0004\u0000\u0101\u0117\u0003:\u001d"+
		"\u0000\u0102\u0117\u00032\u0019\u0000\u0103\u0117\u0003,\u0016\u0000\u0104"+
		"\u0117\u0003\u0010\b\u0000\u0105\u0117\u00030\u0018\u0000\u0106\u0117"+
		"\u00038\u001c\u0000\u0107\u0117\u0003\u000e\u0007\u0000\u0108\u0109\u0005"+
		"2\u0000\u0000\u0109\u0117\u00059\u0000\u0000\u010a\u010c\u0005,\u0000"+
		"\u0000\u010b\u010d\u0003\u001c\u000e\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0117\u00059\u0000\u0000\u010f\u0110\u0005K\u0000\u0000\u0110"+
		"\u0111\u00057\u0000\u0000\u0111\u0112\u0005K\u0000\u0000\u0112\u0113\u0003"+
		"(\u0014\u0000\u0113\u0114\u0005J\u0000\u0000\u0114\u0115\u00059\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0100\u0001\u0000\u0000"+
		"\u0000\u0116\u0101\u0001\u0000\u0000\u0000\u0116\u0102\u0001\u0000\u0000"+
		"\u0000\u0116\u0103\u0001\u0000\u0000\u0000\u0116\u0104\u0001\u0000\u0000"+
		"\u0000\u0116\u0105\u0001\u0000\u0000\u0000\u0116\u0106\u0001\u0000\u0000"+
		"\u0000\u0116\u0107\u0001\u0000\u0000\u0000\u0116\u0108\u0001\u0000\u0000"+
		"\u0000\u0116\u010a\u0001\u0000\u0000\u0000\u0116\u010f\u0001\u0000\u0000"+
		"\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u0119\u0005%\u0000\u0000\u0119"+
		"\u011a\u0003\u0016\u000b\u0000\u011a-\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0007\u0004\u0000\u0000\u011c/\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\b\u0000\u0000\u011e\u011f\u0005\u0013\u0000\u0000\u011f\u0120\u00036"+
		"\u001b\u0000\u0120\u0121\u0005\u0014\u0000\u0000\u0121\u0122\u0003\u0016"+
		"\u000b\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0124\u0005$\u0000\u0000"+
		"\u0124\u0125\u0005\u0013\u0000\u0000\u0125\u0126\u00036\u001b\u0000\u0126"+
		"\u0127\u0005\u0014\u0000\u0000\u0127\u012b\u0003\u0016\u000b\u0000\u0128"+
		"\u012a\u00034\u001a\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0003,\u0016\u0000\u012f\u012e\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u01303\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u0133\u0005\u0013\u0000"+
		"\u0000\u0133\u0134\u00036\u001b\u0000\u0134\u0135\u0005\u0014\u0000\u0000"+
		"\u0135\u0136\u0003\u0016\u000b\u0000\u01365\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005K\u0000\u0000\u0138\u0139\u0003.\u0017\u0000\u0139\u013a\u0003"+
		"\u001c\u000e\u0000\u013a\u013e\u0001\u0000\u0000\u0000\u013b\u013e\u0005"+
		"K\u0000\u0000\u013c\u013e\u0003\u001c\u000e\u0000\u013d\u0137\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013e7\u0001\u0000\u0000\u0000\u013f\u0140\u0005K\u0000\u0000"+
		"\u0140\u0141\u00057\u0000\u0000\u0141\u0142\u0003\u001c\u000e\u0000\u0142"+
		"\u0143\u00059\u0000\u0000\u01439\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"4\u0000\u0000\u0145\u0146\u0005\u0013\u0000\u0000\u0146\u0147\u0003\u001c"+
		"\u000e\u0000\u0147\u0148\u0005\u0014\u0000\u0000\u0148\u0149\u00059\u0000"+
		"\u0000\u0149;\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0007\u0000\u0000"+
		"\u014b\u014c\u00050\u0000\u0000\u014c\u014d\u0003\u001a\r\u0000\u014d"+
		"\u014e\u00055\u0000\u0000\u014e\u014f\u0005K\u0000\u0000\u014f\u0150\u0005"+
		"7\u0000\u0000\u0150\u0152\u0005\u0006\u0000\u0000\u0151\u0153\u0003>\u001f"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0005\u0000"+
		"\u0000\u0155\u0156\u00059\u0000\u0000\u0156=\u0001\u0000\u0000\u0000\u0157"+
		"\u015c\u0003\u001c\u000e\u0000\u0158\u0159\u0005*\u0000\u0000\u0159\u015b"+
		"\u0003\u001c\u000e\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d?\u0001\u0000\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0166\u0003N\'\u0000\u0160\u0166\u0003B!\u0000"+
		"\u0161\u0166\u0003F#\u0000\u0162\u0166\u0003L&\u0000\u0163\u0166\u0003"+
		"H$\u0000\u0164\u0166\u0003J%\u0000\u0165\u015f\u0001\u0000\u0000\u0000"+
		"\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000"+
		"\u0165\u0162\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0164\u0001\u0000\u0000\u0000\u0166A\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0005@\u0000\u0000\u0168\u0169\u0005\u0013\u0000\u0000\u0169\u016a"+
		"\u0003D\"\u0000\u016a\u016b\u0005\u0014\u0000\u0000\u016bC\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005?\u0000\u0000\u016d\u016e\u0005\u0013\u0000"+
		"\u0000\u016e\u016f\u00058\u0000\u0000\u016f\u0170\u0005K\u0000\u0000\u0170"+
		"\u0171\u00058\u0000\u0000\u0171\u0172\u0005\u0014\u0000\u0000\u0172\u0173"+
		"\u0005*\u0000\u0000\u0173E\u0001\u0000\u0000\u0000\u0174\u0175\u0005B"+
		"\u0000\u0000\u0175\u0176\u0005\u0013\u0000\u0000\u0176\u0177\u00058\u0000"+
		"\u0000\u0177\u0178\u0007\u0002\u0000\u0000\u0178\u0179\u00058\u0000\u0000"+
		"\u0179\u017a\u0005\u0014\u0000\u0000\u017a\u017b\u0005*\u0000\u0000\u017b"+
		"G\u0001\u0000\u0000\u0000\u017c\u017d\u0005:\u0000\u0000\u017d\u017e\u0005"+
		"\u0013\u0000\u0000\u017e\u017f\u0005>\u0000\u0000\u017f\u0180\u0005\u0004"+
		"\u0000\u0000\u0180\u0189\u0005\u0006\u0000\u0000\u0181\u0183\u0003B!\u0000"+
		"\u0182\u0184\u0003F#\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0181"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u0005\u0000\u0000\u018d\u018e\u0005\u0014\u0000\u0000\u018e\u018f"+
		"\u0005*\u0000\u0000\u018fI\u0001\u0000\u0000\u0000\u0190\u0191\u0005<"+
		"\u0000\u0000\u0191\u0192\u0005\u0013\u0000\u0000\u0192\u0193\u0005>\u0000"+
		"\u0000\u0193\u0194\u0005\u0004\u0000\u0000\u0194\u0196\u0005\u0006\u0000"+
		"\u0000\u0195\u0197\u0003H$\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005\u0005\u0000\u0000\u019b\u019c\u0005\u0014\u0000\u0000\u019c"+
		"\u019d\u0005*\u0000\u0000\u019dK\u0001\u0000\u0000\u0000\u019e\u019f\u0005"+
		"=\u0000\u0000\u019f\u01a0\u0005\u0013\u0000\u0000\u01a0\u01a1\u0003P("+
		"\u0000\u01a1\u01a2\u0003R)\u0000\u01a2\u01a3\u0003T*\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005A\u0000\u0000\u01a5\u01a8\u0005"+
		"\u0004\u0000\u0000\u01a6\u01a9\u0003J%\u0000\u01a7\u01a9\u0003H$\u0000"+
		"\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u0014\u0000\u0000"+
		"\u01ab\u01ac\u0005*\u0000\u0000\u01acM\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0005C\u0000\u0000\u01ae\u01af\u0005\u0013\u0000\u0000\u01af\u01b0\u0005"+
		"D\u0000\u0000\u01b0\u01b4\u0005\u0004\u0000\u0000\u01b1\u01b5\u0003L&"+
		"\u0000\u01b2\u01b5\u0003H$\u0000\u01b3\u01b5\u0003J%\u0000\u01b4\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0005\u0014\u0000\u0000\u01b7\u01b8\u00059\u0000\u0000\u01b8O\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0005E\u0000\u0000\u01ba\u01bb\u0005\u0004\u0000"+
		"\u0000\u01bb\u01bc\u0005K\u0000\u0000\u01bc\u01bd\u0005*\u0000\u0000\u01bd"+
		"Q\u0001\u0000\u0000\u0000\u01be\u01bf\u0005G\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0004\u0000\u0000\u01c0\u01c1\u0005J\u0000\u0000\u01c1\u01c2\u0005*\u0000"+
		"\u0000\u01c2S\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005F\u0000\u0000\u01c4"+
		"\u01c5\u0005\u0004\u0000\u0000\u01c5\u01c6\u0005J\u0000\u0000\u01c6\u01c7"+
		"\u0005*\u0000\u0000\u01c7U\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005;"+
		"\u0000\u0000\u01c9\u01ca\u0005\u0013\u0000\u0000\u01ca\u01cb\u0003X,\u0000"+
		"\u01cb\u01cc\u0005\u0014\u0000\u0000\u01ccW\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d2\u0003Z-\u0000\u01ce\u01cf\u0005*\u0000\u0000\u01cf\u01d1\u0003"+
		"Z-\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d3Y\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0005H\u0000\u0000\u01d6\u01d7\u0005\u0004\u0000\u0000\u01d7"+
		"\u01df\u0003\\.\u0000\u01d8\u01d9\u0005E\u0000\u0000\u01d9\u01da\u0005"+
		"\u0004\u0000\u0000\u01da\u01df\u0003P(\u0000\u01db\u01dc\u0005A\u0000"+
		"\u0000\u01dc\u01dd\u0005\u0004\u0000\u0000\u01dd\u01df\u0003@ \u0000\u01de"+
		"\u01d5\u0001\u0000\u0000\u0000\u01de\u01d8\u0001\u0000\u0000\u0000\u01de"+
		"\u01db\u0001\u0000\u0000\u0000\u01df[\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0005M\u0000\u0000\u01e1\u01e2\u0005\u0013\u0000\u0000\u01e2\u01e6\u0005"+
		"\u0014\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0006"+
		".\uffff\uffff\u0000\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6]\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005I\u0000"+
		"\u0000\u01e8\u01e9\u0005\u0013\u0000\u0000\u01e9\u01ea\u0003`0\u0000\u01ea"+
		"\u01eb\u0005\u0014\u0000\u0000\u01eb_\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0005A\u0000\u0000\u01ed\u01ee\u0005\u0004\u0000\u0000\u01ee\u01ef\u0003"+
		"@ \u0000\u01efa\u0001\u0000\u0000\u0000\u001felow~\u0087\u008b\u0090\u009d"+
		"\u00ba\u00c0\u00cd\u00db\u00e9\u00eb\u010c\u0116\u012b\u012f\u013d\u0152"+
		"\u015c\u0165\u0185\u0189\u0198\u01a8\u01b4\u01d2\u01de\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}