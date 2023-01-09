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
		HEIGHT=70, WIDTH=71, ON_PRESSED=72, CENTER=73, NUMBER=74, CHARS=75, STRING_EXP=76;
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
		RULE_row = 37, RULE_container = 38, RULE_container_att = 39, RULE_scaffold = 40, 
		RULE_body = 41, RULE_color = 42, RULE_width = 43, RULE_height = 44, RULE_e_button = 45, 
		RULE_elevatedButtonWidgetArgs = 46, RULE_elevatedButtonWidgetArg = 47, 
		RULE_voidFunction = 48, RULE_center = 49, RULE_centerWidgetArgs = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevel", "class_decl", "class_member", "variables_decl", 
			"function", "function_parameters", "call_function", "for_statement", 
			"for_first_part", "for_secomd_part", "block", "for_statement_variable_number", 
			"type", "expr", "fast_math", "for_statement_adding_one", "for_statement_minuss_one", 
			"adding_one", "minus_one", "number_attribute", "code_attribute", "else_statment", 
			"operation_if", "while_statment", "if_statment", "else_if_statements", 
			"if_part", "assignment", "print_statements", "list", "list_exp", "widget", 
			"image", "image_assets", "text", "column", "row", "container", "container_att", 
			"scaffold", "body", "color", "width", "height", "e_button", "elevatedButtonWidgetArgs", 
			"elevatedButtonWidgetArg", "voidFunction", "center", "centerWidgetArgs"
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
			"ON_PRESSED", "CENTER", "NUMBER", "CHARS", "STRING_EXP"
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				topLevel();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 4323561242636583046L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 525L) != 0 );
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new ClassDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				class_decl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				function();
				}
				break;
			case 4:
				_localctx = new WidgetDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(113);
				match(ABSTRACT);
				}
			}

			setState(116);
			match(CLASS);
			setState(117);
			match(CHARS);
			setState(118);
			match(CURLYOPEN);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 47244640390L) != 0) {
				{
				{
				setState(119);
				class_member();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new FunctionDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				_localctx = new VariableDeclarationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				type();
				setState(132);
				match(CHARS);
				setState(133);
				match(EQUAL);
				setState(134);
				expr(0);
				setState(135);
				match(SEMICOLON);
				}
				break;
			case LIST:
				_localctx = new VaraibleListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(140);
				match(VOID);
				}
				break;
			case VAR:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(141);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			match(CHARS);
			setState(145);
			match(OPENTEXT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 38654705670L) != 0) {
				{
				setState(146);
				function_parameters();
				}
			}

			setState(149);
			match(CLOSETEXT);
			setState(150);
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
			setState(152);
			type();
			setState(153);
			match(CHARS);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				type();
				setState(156);
				match(CHARS);
				}
				}
				setState(162);
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
			setState(163);
			match(CHARS);
			setState(164);
			match(OPENTEXT);
			setState(165);
			match(CLOSETEXT);
			setState(166);
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
			setState(168);
			match(FOR);
			setState(169);
			match(OPENTEXT);
			setState(170);
			for_first_part();
			setState(171);
			match(SEMICOLON);
			setState(172);
			for_secomd_part();
			setState(173);
			match(SEMICOLON);
			setState(174);
			for_statement_variable_number();
			setState(175);
			match(CLOSETEXT);
			setState(176);
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
			setState(178);
			match(CHARS);
			setState(179);
			match(EQUAL);
			setState(180);
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
			setState(182);
			match(CHARS);
			setState(183);
			operation_if();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(184);
				match(CHARS);
				}
				break;
			case 2:
				{
				setState(185);
				match(CHARS);
				setState(186);
				match(DOT);
				setState(187);
				match(LENGTH);
				}
				break;
			case 3:
				{
				setState(188);
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
			setState(191);
			match(CURLYOPEN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5647336550171014L) != 0 || _la==CHARS) {
				{
				{
				setState(192);
				code_attribute();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ForStatementNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(CHARS);
				setState(201);
				match(EQUAL);
				{
				setState(202);
				number_attribute();
				setState(203);
				match(CHARS);
				}
				}
				break;
			case 2:
				_localctx = new ForStatementPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				for_statement_adding_one();
				}
				break;
			case 3:
				_localctx = new ForStatementMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				for_statement_minuss_one();
				}
				break;
			case 4:
				_localctx = new ForStatementFastMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
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
			setState(210);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(CHARS);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(STRING_EXP);
				}
				break;
			case 4:
				{
				_localctx = new AddingOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				adding_one();
				}
				break;
			case 5:
				{
				_localctx = new MinusOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				minus_one();
				}
				break;
			case 6:
				{
				_localctx = new FastMatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				fast_math();
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				call_function();
				}
				break;
			case 8:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(225);
						match(MULTIPLY);
						setState(226);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(228);
						match(SUM);
						setState(229);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						match(MINUS);
						setState(232);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						match(DIVID);
						setState(235);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						match(OR);
						setState(238);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						match(AND);
						setState(241);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(246);
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
			setState(247);
			match(CHARS);
			setState(248);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1811939328L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
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
			setState(251);
			match(CHARS);
			setState(252);
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
			setState(254);
			match(CHARS);
			setState(255);
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
			setState(257);
			match(CHARS);
			setState(258);
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
			setState(260);
			match(CHARS);
			setState(261);
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
			setState(263);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new PrintCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				print_statements();
				}
				break;
			case 3:
				_localctx = new IfCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				if_statment();
				}
				break;
			case 4:
				_localctx = new ElseCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				else_statment();
				}
				break;
			case 5:
				_localctx = new ForCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				for_statement();
				}
				break;
			case 6:
				_localctx = new WhileStatementsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				while_statment();
				}
				break;
			case 7:
				_localctx = new AssignmentCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				assignment();
				}
				break;
			case 8:
				_localctx = new CallCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				call_function();
				}
				break;
			case 9:
				_localctx = new BreakCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(273);
				match(BREAK);
				setState(274);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ReturnCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				match(RETURN);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 240518168579L) != 0) {
					{
					setState(276);
					expr(0);
					}
				}

				setState(279);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new CodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(280);
				match(CHARS);
				setState(281);
				match(EQUAL);
				setState(282);
				match(CHARS);
				setState(283);
				number_attribute();
				setState(284);
				match(NUMBER);
				setState(285);
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
			setState(289);
			match(ELSE);
			setState(290);
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
			setState(292);
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
			setState(294);
			match(WHILE);
			setState(295);
			match(OPENTEXT);
			setState(296);
			if_part();
			setState(297);
			match(CLOSETEXT);
			setState(298);
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
			setState(300);
			match(IF);
			setState(301);
			match(OPENTEXT);
			setState(302);
			if_part();
			setState(303);
			match(CLOSETEXT);
			setState(304);
			block();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					else_if_statements();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(311);
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
			setState(314);
			match(ELSE);
			setState(315);
			match(OPENTEXT);
			setState(316);
			if_part();
			setState(317);
			match(CLOSETEXT);
			setState(318);
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
		enterRule(_localctx, 54, RULE_if_part);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfPartOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(CHARS);
				setState(321);
				operation_if();
				setState(322);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CharsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(CHARS);
				}
				break;
			case 3:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
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
			setState(328);
			match(CHARS);
			setState(329);
			match(EQUAL);
			setState(330);
			expr(0);
			setState(331);
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
			setState(333);
			match(PRINT);
			setState(334);
			match(OPENTEXT);
			setState(335);
			expr(0);
			setState(336);
			match(CLOSETEXT);
			setState(337);
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
			setState(339);
			match(LIST);
			setState(340);
			match(TAG_OPEN);
			setState(341);
			type();
			setState(342);
			match(TAG_CLOSE);
			setState(343);
			match(CHARS);
			setState(344);
			match(EQUAL);
			setState(345);
			match(OB);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 240518168579L) != 0) {
				{
				setState(346);
				list_exp();
				}
			}

			setState(349);
			match(CB);
			setState(350);
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
			setState(352);
			expr(0);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				expr(0);
				}
				}
				setState(359);
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
		enterRule(_localctx, 64, RULE_widget);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				_localctx = new ScaffoldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				scaffold();
				}
				break;
			case IMAGE:
				_localctx = new ImageWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				image();
				}
				break;
			case TEXT:
				_localctx = new TextWidgetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				text();
				}
				break;
			case CONTAINER:
				_localctx = new ContainerWidgetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				container();
				}
				break;
			case COLUMN:
				_localctx = new ColumnWidgetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				column();
				}
				break;
			case ROW:
				_localctx = new RowWidgetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				row();
				}
				break;
			case CENTER:
				_localctx = new CenterWidgetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				center();
				}
				break;
			case E_BUTTON:
				_localctx = new ElevatedButtonWidgetContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(367);
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
			setState(370);
			match(IMAGE);
			setState(371);
			match(OPENTEXT);
			setState(372);
			image_assets();
			setState(373);
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
			setState(375);
			match(IMAGEASSETS);
			setState(376);
			match(OPENTEXT);
			setState(377);
			match(SINGLE_QUOTE);
			setState(378);
			match(CHARS);
			setState(379);
			match(SINGLE_QUOTE);
			setState(380);
			match(CLOSETEXT);
			setState(381);
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
			setState(383);
			match(TEXT);
			setState(384);
			match(OPENTEXT);
			setState(385);
			match(SINGLE_QUOTE);
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==CHARS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(387);
			match(SINGLE_QUOTE);
			setState(388);
			match(CLOSETEXT);
			setState(389);
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
			setState(391);
			match(COLUMN);
			setState(392);
			match(OPENTEXT);
			setState(393);
			match(CHILDREN);
			setState(394);
			match(C);
			setState(395);
			match(OB);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMAGE) {
				{
				{
				setState(396);
				image();
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(397);
					text();
					}
					}
					setState(400); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(CB);
			setState(408);
			match(CLOSETEXT);
			setState(409);
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
			setState(411);
			match(ROW);
			setState(412);
			match(OPENTEXT);
			setState(413);
			match(CHILDREN);
			setState(414);
			match(C);
			setState(415);
			match(OB);
			setState(417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(416);
				column();
				}
				}
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			setState(421);
			match(CB);
			setState(422);
			match(CLOSETEXT);
			setState(423);
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
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public List<Container_attContext> container_att() {
			return getRuleContexts(Container_attContext.class);
		}
		public Container_attContext container_att(int i) {
			return getRuleContext(Container_attContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(CONTAINER);
			setState(426);
			match(OPENTEXT);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0) {
				{
				{
				setState(427);
				container_att();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(CHILD);
			setState(434);
			match(C);
			setState(435);
			widget();
			setState(436);
			match(CLOSETEXT);
			setState(437);
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
	public static class Container_attContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(Example1Parser.COLOR, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode WIDTH() { return getToken(Example1Parser.WIDTH, 0); }
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public TerminalNode HEIGHT() { return getToken(Example1Parser.HEIGHT, 0); }
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public Container_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_att; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterContainer_att(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitContainer_att(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitContainer_att(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_attContext container_att() throws RecognitionException {
		Container_attContext _localctx = new Container_attContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_container_att);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(COLOR);
				setState(440);
				match(C);
				setState(441);
				color();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(WIDTH);
				setState(443);
				match(C);
				setState(444);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(HEIGHT);
				setState(446);
				match(C);
				setState(447);
				height();
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(Example1Parser.SEMICOLON, 0); }
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
		enterRule(_localctx, 80, RULE_scaffold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(SCAFFOLD);
			setState(451);
			match(OPENTEXT);
			setState(452);
			body();
			setState(453);
			match(CLOSETEXT);
			setState(454);
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(Example1Parser.BODY, 0); }
		public TerminalNode C() { return getToken(Example1Parser.C, 0); }
		public TerminalNode COMMA() { return getToken(Example1Parser.COMMA, 0); }
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(BODY);
			setState(457);
			match(C);
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				{
				setState(458);
				container();
				}
				break;
			case COLUMN:
				{
				setState(459);
				column();
				}
				break;
			case ROW:
				{
				setState(460);
				row();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
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
	public static class ColorContext extends ParserRuleContext {
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
		enterRule(_localctx, 84, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(CHARS);
			setState(466);
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
		enterRule(_localctx, 86, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(NUMBER);
			setState(469);
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
		enterRule(_localctx, 88, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(NUMBER);
			setState(472);
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
		enterRule(_localctx, 90, RULE_e_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(E_BUTTON);
			setState(475);
			match(OPENTEXT);
			setState(476);
			elevatedButtonWidgetArgs();
			setState(477);
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
		enterRule(_localctx, 92, RULE_elevatedButtonWidgetArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			elevatedButtonWidgetArg();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(480);
				match(COMMA);
				setState(481);
				elevatedButtonWidgetArg();
				}
				}
				setState(486);
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
		enterRule(_localctx, 94, RULE_elevatedButtonWidgetArg);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_PRESSED:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(ON_PRESSED);
				setState(488);
				match(C);
				setState(489);
				voidFunction();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(COLOR);
				setState(491);
				match(C);
				setState(492);
				color();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(CHILD);
				setState(494);
				match(C);
				setState(495);
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
		public TerminalNode CHARS() { return getToken(Example1Parser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(Example1Parser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(Example1Parser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_voidFunction);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(CHARS);
				setState(499);
				match(OPENTEXT);
				setState(500);
				match(CLOSETEXT);
				}
				break;
			case OPENTEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(OPENTEXT);
				setState(502);
				match(CLOSETEXT);
				setState(503);
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
		enterRule(_localctx, 98, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(CENTER);
			setState(507);
			match(OPENTEXT);
			setState(508);
			centerWidgetArgs();
			setState(509);
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
		enterRule(_localctx, 100, RULE_centerWidgetArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CHILD);
			setState(512);
			match(C);
			setState(513);
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
		"\u0004\u0001L\u0204\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u0001\u0000\u0004\u0000h\b\u0000\u000b\u0000\f\u0000i\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001p\b\u0001\u0001\u0002"+
		"\u0003\u0002s\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0082\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008b\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u008f\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0094\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009f\b\u0006\n\u0006\f\u0006\u00a2\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00be\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00c2"+
		"\b\u000b\n\u000b\f\u000b\u00c5\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d1"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00df\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00f3\b\u000e\n\u000e\f\u000e\u00f6\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0116\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0120\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0133\b\u0019\n\u0019\f\u0019\u0136\t\u0019\u0001\u0019\u0003\u0019\u0139"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0147\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u015c\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0164\b\u001f\n\u001f\f\u001f\u0167\t\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0171\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0004$\u018f\b$\u000b$\f$"+
		"\u0190\u0005$\u0193\b$\n$\f$\u0196\t$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004%\u01a2\b%\u000b%\f%\u01a3\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u01ad\b&\n&\f&\u01b0"+
		"\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01c1\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01ce\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0005.\u01e3\b.\n.\f.\u01e6\t.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u01f1\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u01f9\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u0000\u0001\u001c3\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0005\u0003\u0000\u0001\u0002  ##\u0002"+
		"\u0000\u001a\u001b\u001d\u001e\u0001\u0000JK\u0001\u0000\u000f\u0012\u0004"+
		"\u0000\u001c\u001c\u001f\u001f0156\u0213\u0000g\u0001\u0000\u0000\u0000"+
		"\u0002o\u0001\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006\u0081"+
		"\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u008e\u0001"+
		"\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u00a3\u0001\u0000"+
		"\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000"+
		"\u0000\u0000\u0014\u00b6\u0001\u0000\u0000\u0000\u0016\u00bf\u0001\u0000"+
		"\u0000\u0000\u0018\u00d0\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000"+
		"\u0000\u0000\u001c\u00de\u0001\u0000\u0000\u0000\u001e\u00f7\u0001\u0000"+
		"\u0000\u0000 \u00fb\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000"+
		"\u0000$\u0101\u0001\u0000\u0000\u0000&\u0104\u0001\u0000\u0000\u0000("+
		"\u0107\u0001\u0000\u0000\u0000*\u011f\u0001\u0000\u0000\u0000,\u0121\u0001"+
		"\u0000\u0000\u0000.\u0124\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000"+
		"\u00002\u012c\u0001\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u00006"+
		"\u0146\u0001\u0000\u0000\u00008\u0148\u0001\u0000\u0000\u0000:\u014d\u0001"+
		"\u0000\u0000\u0000<\u0153\u0001\u0000\u0000\u0000>\u0160\u0001\u0000\u0000"+
		"\u0000@\u0170\u0001\u0000\u0000\u0000B\u0172\u0001\u0000\u0000\u0000D"+
		"\u0177\u0001\u0000\u0000\u0000F\u017f\u0001\u0000\u0000\u0000H\u0187\u0001"+
		"\u0000\u0000\u0000J\u019b\u0001\u0000\u0000\u0000L\u01a9\u0001\u0000\u0000"+
		"\u0000N\u01c0\u0001\u0000\u0000\u0000P\u01c2\u0001\u0000\u0000\u0000R"+
		"\u01c8\u0001\u0000\u0000\u0000T\u01d1\u0001\u0000\u0000\u0000V\u01d4\u0001"+
		"\u0000\u0000\u0000X\u01d7\u0001\u0000\u0000\u0000Z\u01da\u0001\u0000\u0000"+
		"\u0000\\\u01df\u0001\u0000\u0000\u0000^\u01f0\u0001\u0000\u0000\u0000"+
		"`\u01f8\u0001\u0000\u0000\u0000b\u01fa\u0001\u0000\u0000\u0000d\u01ff"+
		"\u0001\u0000\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u0001\u0001\u0000\u0000\u0000kp\u0003\b\u0004\u0000lp\u0003"+
		"\u0004\u0002\u0000mp\u0003\n\u0005\u0000np\u0003@ \u0000ok\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0005-\u0000\u0000uv\u0005K\u0000\u0000vz\u0005\r\u0000\u0000"+
		"wy\u0003\u0006\u0003\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u000e\u0000\u0000~\u0005"+
		"\u0001\u0000\u0000\u0000\u007f\u0082\u0003\b\u0004\u0000\u0080\u0082\u0003"+
		"\n\u0005\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u001a"+
		"\r\u0000\u0084\u0085\u0005K\u0000\u0000\u0085\u0086\u00057\u0000\u0000"+
		"\u0086\u0087\u0003\u001c\u000e\u0000\u0087\u0088\u00059\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u008b\u0003<\u001e\u0000\u008a\u0083"+
		"\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\t\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0005!\u0000\u0000\u008d\u008f\u0003\u001a"+
		"\r\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005K\u0000\u0000"+
		"\u0091\u0093\u0005\u0013\u0000\u0000\u0092\u0094\u0003\f\u0006\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096"+
		"\u0097\u0003\u0016\u000b\u0000\u0097\u000b\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u001a\r\u0000\u0099\u00a0\u0005K\u0000\u0000\u009a\u009b"+
		"\u0005*\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000\u009c\u009d\u0005"+
		"K\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\r\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005K\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000"+
		"\u00a6\u00a7\u00059\u0000\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000\u0000\u00aa"+
		"\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u00059\u0000\u0000\u00ac\u00ad"+
		"\u0003\u0014\n\u0000\u00ad\u00ae\u00059\u0000\u0000\u00ae\u00af\u0003"+
		"\u0018\f\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0\u00b1\u0003\u0016"+
		"\u000b\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005K\u0000"+
		"\u0000\u00b3\u00b4\u00057\u0000\u0000\u00b4\u00b5\u0005J\u0000\u0000\u00b5"+
		"\u0013\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005K\u0000\u0000\u00b7\u00bd"+
		"\u0003.\u0017\u0000\u00b8\u00be\u0005K\u0000\u0000\u00b9\u00ba\u0005K"+
		"\u0000\u0000\u00ba\u00bb\u00053\u0000\u0000\u00bb\u00be\u0005+\u0000\u0000"+
		"\u00bc\u00be\u0005J\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u0015\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005\r\u0000\u0000\u00c0\u00c2"+
		"\u0003*\u0015\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u000e\u0000\u0000\u00c7\u0017\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005K\u0000\u0000\u00c9\u00ca\u00057\u0000"+
		"\u0000\u00ca\u00cb\u0003(\u0014\u0000\u00cb\u00cc\u0005K\u0000\u0000\u00cc"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cd\u00d1\u0003 \u0010\u0000\u00ce\u00d1"+
		"\u0003\"\u0011\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u0019\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3\u001b\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0006\u000e\uffff\uffff\u0000\u00d5\u00df"+
		"\u0005K\u0000\u0000\u00d6\u00df\u0005J\u0000\u0000\u00d7\u00df\u0005L"+
		"\u0000\u0000\u00d8\u00df\u0003$\u0012\u0000\u00d9\u00df\u0003&\u0013\u0000"+
		"\u00da\u00df\u0003\u001e\u000f\u0000\u00db\u00df\u0003\u000e\u0007\u0000"+
		"\u00dc\u00df\u0005\'\u0000\u0000\u00dd\u00df\u0005(\u0000\u0000\u00de"+
		"\u00d4\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de"+
		"\u00d7\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00de"+
		"\u00d9\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00f4\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\n\u000f\u0000\u0000\u00e1\u00e2\u0005\u0011\u0000\u0000\u00e2\u00f3"+
		"\u0003\u001c\u000e\u0010\u00e3\u00e4\n\u000e\u0000\u0000\u00e4\u00e5\u0005"+
		"\u000f\u0000\u0000\u00e5\u00f3\u0003\u001c\u000e\u000f\u00e6\u00e7\n\r"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0012\u0000\u0000\u00e8\u00f3\u0003\u001c"+
		"\u000e\u000e\u00e9\u00ea\n\f\u0000\u0000\u00ea\u00eb\u0005\u0010\u0000"+
		"\u0000\u00eb\u00f3\u0003\u001c\u000e\r\u00ec\u00ed\n\u000b\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0017\u0000\u0000\u00ee\u00f3\u0003\u001c\u000e\f\u00ef"+
		"\u00f0\n\n\u0000\u0000\u00f0\u00f1\u0005\u0019\u0000\u0000\u00f1\u00f3"+
		"\u0003\u001c\u000e\u000b\u00f2\u00e0\u0001\u0000\u0000\u0000\u00f2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00f2\u00e6\u0001\u0000\u0000\u0000\u00f2\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f2\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u001d"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005K\u0000\u0000\u00f8\u00f9\u0007\u0001\u0000\u0000\u00f9\u00fa\u0007"+
		"\u0002\u0000\u0000\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"K\u0000\u0000\u00fc\u00fd\u0005\u0015\u0000\u0000\u00fd!\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005K\u0000\u0000\u00ff\u0100\u0005\u0016\u0000\u0000"+
		"\u0100#\u0001\u0000\u0000\u0000\u0101\u0102\u0005K\u0000\u0000\u0102\u0103"+
		"\u0005\u0015\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"K\u0000\u0000\u0105\u0106\u0005\u0016\u0000\u0000\u0106\'\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0007\u0003\u0000\u0000\u0108)\u0001\u0000\u0000"+
		"\u0000\u0109\u0120\u0003\b\u0004\u0000\u010a\u0120\u0003:\u001d\u0000"+
		"\u010b\u0120\u00032\u0019\u0000\u010c\u0120\u0003,\u0016\u0000\u010d\u0120"+
		"\u0003\u0010\b\u0000\u010e\u0120\u00030\u0018\u0000\u010f\u0120\u0003"+
		"8\u001c\u0000\u0110\u0120\u0003\u000e\u0007\u0000\u0111\u0112\u00052\u0000"+
		"\u0000\u0112\u0120\u00059\u0000\u0000\u0113\u0115\u0005,\u0000\u0000\u0114"+
		"\u0116\u0003\u001c\u000e\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0120\u00059\u0000\u0000\u0118\u0119\u0005K\u0000\u0000\u0119\u011a\u0005"+
		"7\u0000\u0000\u011a\u011b\u0005K\u0000\u0000\u011b\u011c\u0003(\u0014"+
		"\u0000\u011c\u011d\u0005J\u0000\u0000\u011d\u011e\u00059\u0000\u0000\u011e"+
		"\u0120\u0001\u0000\u0000\u0000\u011f\u0109\u0001\u0000\u0000\u0000\u011f"+
		"\u010a\u0001\u0000\u0000\u0000\u011f\u010b\u0001\u0000\u0000\u0000\u011f"+
		"\u010c\u0001\u0000\u0000\u0000\u011f\u010d\u0001\u0000\u0000\u0000\u011f"+
		"\u010e\u0001\u0000\u0000\u0000\u011f\u010f\u0001\u0000\u0000\u0000\u011f"+
		"\u0110\u0001\u0000\u0000\u0000\u011f\u0111\u0001\u0000\u0000\u0000\u011f"+
		"\u0113\u0001\u0000\u0000\u0000\u011f\u0118\u0001\u0000\u0000\u0000\u0120"+
		"+\u0001\u0000\u0000\u0000\u0121\u0122\u0005%\u0000\u0000\u0122\u0123\u0003"+
		"\u0016\u000b\u0000\u0123-\u0001\u0000\u0000\u0000\u0124\u0125\u0007\u0004"+
		"\u0000\u0000\u0125/\u0001\u0000\u0000\u0000\u0126\u0127\u0005\b\u0000"+
		"\u0000\u0127\u0128\u0005\u0013\u0000\u0000\u0128\u0129\u00036\u001b\u0000"+
		"\u0129\u012a\u0005\u0014\u0000\u0000\u012a\u012b\u0003\u0016\u000b\u0000"+
		"\u012b1\u0001\u0000\u0000\u0000\u012c\u012d\u0005$\u0000\u0000\u012d\u012e"+
		"\u0005\u0013\u0000\u0000\u012e\u012f\u00036\u001b\u0000\u012f\u0130\u0005"+
		"\u0014\u0000\u0000\u0130\u0134\u0003\u0016\u000b\u0000\u0131\u0133\u0003"+
		"4\u001a\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0003,\u0016\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u01393\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005%\u0000\u0000\u013b\u013c\u0005\u0013\u0000\u0000\u013c"+
		"\u013d\u00036\u001b\u0000\u013d\u013e\u0005\u0014\u0000\u0000\u013e\u013f"+
		"\u0003\u0016\u000b\u0000\u013f5\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"K\u0000\u0000\u0141\u0142\u0003.\u0017\u0000\u0142\u0143\u0003\u001c\u000e"+
		"\u0000\u0143\u0147\u0001\u0000\u0000\u0000\u0144\u0147\u0005K\u0000\u0000"+
		"\u0145\u0147\u0003\u001c\u000e\u0000\u0146\u0140\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000"+
		"\u01477\u0001\u0000\u0000\u0000\u0148\u0149\u0005K\u0000\u0000\u0149\u014a"+
		"\u00057\u0000\u0000\u014a\u014b\u0003\u001c\u000e\u0000\u014b\u014c\u0005"+
		"9\u0000\u0000\u014c9\u0001\u0000\u0000\u0000\u014d\u014e\u00054\u0000"+
		"\u0000\u014e\u014f\u0005\u0013\u0000\u0000\u014f\u0150\u0003\u001c\u000e"+
		"\u0000\u0150\u0151\u0005\u0014\u0000\u0000\u0151\u0152\u00059\u0000\u0000"+
		"\u0152;\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0007\u0000\u0000\u0154"+
		"\u0155\u00050\u0000\u0000\u0155\u0156\u0003\u001a\r\u0000\u0156\u0157"+
		"\u00055\u0000\u0000\u0157\u0158\u0005K\u0000\u0000\u0158\u0159\u00057"+
		"\u0000\u0000\u0159\u015b\u0005\u0006\u0000\u0000\u015a\u015c\u0003>\u001f"+
		"\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0005\u0000"+
		"\u0000\u015e\u015f\u00059\u0000\u0000\u015f=\u0001\u0000\u0000\u0000\u0160"+
		"\u0165\u0003\u001c\u000e\u0000\u0161\u0162\u0005*\u0000\u0000\u0162\u0164"+
		"\u0003\u001c\u000e\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166?\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0171\u0003P(\u0000\u0169\u0171\u0003B!\u0000"+
		"\u016a\u0171\u0003F#\u0000\u016b\u0171\u0003L&\u0000\u016c\u0171\u0003"+
		"H$\u0000\u016d\u0171\u0003J%\u0000\u016e\u0171\u0003b1\u0000\u016f\u0171"+
		"\u0003Z-\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u0169\u0001\u0000"+
		"\u0000\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000"+
		"\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171A\u0001\u0000\u0000\u0000\u0172\u0173\u0005@\u0000\u0000"+
		"\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u0175\u0003D\"\u0000\u0175"+
		"\u0176\u0005\u0014\u0000\u0000\u0176C\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005?\u0000\u0000\u0178\u0179\u0005\u0013\u0000\u0000\u0179\u017a\u0005"+
		"8\u0000\u0000\u017a\u017b\u0005K\u0000\u0000\u017b\u017c\u00058\u0000"+
		"\u0000\u017c\u017d\u0005\u0014\u0000\u0000\u017d\u017e\u0005*\u0000\u0000"+
		"\u017eE\u0001\u0000\u0000\u0000\u017f\u0180\u0005B\u0000\u0000\u0180\u0181"+
		"\u0005\u0013\u0000\u0000\u0181\u0182\u00058\u0000\u0000\u0182\u0183\u0007"+
		"\u0002\u0000\u0000\u0183\u0184\u00058\u0000\u0000\u0184\u0185\u0005\u0014"+
		"\u0000\u0000\u0185\u0186\u0005*\u0000\u0000\u0186G\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0005:\u0000\u0000\u0188\u0189\u0005\u0013\u0000\u0000\u0189"+
		"\u018a\u0005>\u0000\u0000\u018a\u018b\u0005\u0004\u0000\u0000\u018b\u0194"+
		"\u0005\u0006\u0000\u0000\u018c\u018e\u0003B!\u0000\u018d\u018f\u0003F"+
		"#\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018c\u0001\u0000\u0000"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0005\u0000"+
		"\u0000\u0198\u0199\u0005\u0014\u0000\u0000\u0199\u019a\u0005*\u0000\u0000"+
		"\u019aI\u0001\u0000\u0000\u0000\u019b\u019c\u0005<\u0000\u0000\u019c\u019d"+
		"\u0005\u0013\u0000\u0000\u019d\u019e\u0005>\u0000\u0000\u019e\u019f\u0005"+
		"\u0004\u0000\u0000\u019f\u01a1\u0005\u0006\u0000\u0000\u01a0\u01a2\u0003"+
		"H$\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u0005\u0000"+
		"\u0000\u01a6\u01a7\u0005\u0014\u0000\u0000\u01a7\u01a8\u0005*\u0000\u0000"+
		"\u01a8K\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005=\u0000\u0000\u01aa\u01ae"+
		"\u0005\u0013\u0000\u0000\u01ab\u01ad\u0003N\'\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"A\u0000\u0000\u01b2\u01b3\u0005\u0004\u0000\u0000\u01b3\u01b4\u0003@ "+
		"\u0000\u01b4\u01b5\u0005\u0014\u0000\u0000\u01b5\u01b6\u0005*\u0000\u0000"+
		"\u01b6M\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005E\u0000\u0000\u01b8\u01b9"+
		"\u0005\u0004\u0000\u0000\u01b9\u01c1\u0003T*\u0000\u01ba\u01bb\u0005G"+
		"\u0000\u0000\u01bb\u01bc\u0005\u0004\u0000\u0000\u01bc\u01c1\u0003V+\u0000"+
		"\u01bd\u01be\u0005F\u0000\u0000\u01be\u01bf\u0005\u0004\u0000\u0000\u01bf"+
		"\u01c1\u0003X,\u0000\u01c0\u01b7\u0001\u0000\u0000\u0000\u01c0\u01ba\u0001"+
		"\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c1O\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0005C\u0000\u0000\u01c3\u01c4\u0005\u0013\u0000"+
		"\u0000\u01c4\u01c5\u0003R)\u0000\u01c5\u01c6\u0005\u0014\u0000\u0000\u01c6"+
		"\u01c7\u00059\u0000\u0000\u01c7Q\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005"+
		"D\u0000\u0000\u01c9\u01cd\u0005\u0004\u0000\u0000\u01ca\u01ce\u0003L&"+
		"\u0000\u01cb\u01ce\u0003H$\u0000\u01cc\u01ce\u0003J%\u0000\u01cd\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005*\u0000\u0000\u01d0S\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005K"+
		"\u0000\u0000\u01d2\u01d3\u0005*\u0000\u0000\u01d3U\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0005J\u0000\u0000\u01d5\u01d6\u0005*\u0000\u0000\u01d6W"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005J\u0000\u0000\u01d8\u01d9\u0005"+
		"*\u0000\u0000\u01d9Y\u0001\u0000\u0000\u0000\u01da\u01db\u0005;\u0000"+
		"\u0000\u01db\u01dc\u0005\u0013\u0000\u0000\u01dc\u01dd\u0003\\.\u0000"+
		"\u01dd\u01de\u0005\u0014\u0000\u0000\u01de[\u0001\u0000\u0000\u0000\u01df"+
		"\u01e4\u0003^/\u0000\u01e0\u01e1\u0005*\u0000\u0000\u01e1\u01e3\u0003"+
		"^/\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5]\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005H\u0000\u0000\u01e8\u01e9\u0005\u0004\u0000\u0000\u01e9"+
		"\u01f1\u0003`0\u0000\u01ea\u01eb\u0005E\u0000\u0000\u01eb\u01ec\u0005"+
		"\u0004\u0000\u0000\u01ec\u01f1\u0003T*\u0000\u01ed\u01ee\u0005A\u0000"+
		"\u0000\u01ee\u01ef\u0005\u0004\u0000\u0000\u01ef\u01f1\u0003@ \u0000\u01f0"+
		"\u01e7\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000\u0000\u01f0"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f1_\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0005K\u0000\u0000\u01f3\u01f4\u0005\u0013\u0000\u0000\u01f4\u01f9\u0005"+
		"\u0014\u0000\u0000\u01f5\u01f6\u0005\u0013\u0000\u0000\u01f6\u01f7\u0005"+
		"\u0014\u0000\u0000\u01f7\u01f9\u0003\u0016\u000b\u0000\u01f8\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f9a\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005I\u0000\u0000\u01fb\u01fc\u0005\u0013\u0000"+
		"\u0000\u01fc\u01fd\u0003d2\u0000\u01fd\u01fe\u0005\u0014\u0000\u0000\u01fe"+
		"c\u0001\u0000\u0000\u0000\u01ff\u0200\u0005A\u0000\u0000\u0200\u0201\u0005"+
		"\u0004\u0000\u0000\u0201\u0202\u0003@ \u0000\u0202e\u0001\u0000\u0000"+
		"\u0000 iorz\u0081\u008a\u008e\u0093\u00a0\u00bd\u00c3\u00d0\u00de\u00f2"+
		"\u00f4\u0115\u011f\u0134\u0138\u0146\u015b\u0165\u0170\u0190\u0194\u01a3"+
		"\u01ae\u01c0\u01cd\u01e4\u01f0\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}