// Generated from sma.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class smaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, DIGIT=9, 
		HEX_NUMBER=10;
	public static final int
		RULE_addition = 0, RULE_subtraction = 1, RULE_multiplication = 2, RULE_division = 3, 
		RULE_addition_hex = 4, RULE_subtraction_hex = 5, RULE_multiplication_hex = 6, 
		RULE_division_hex = 7, RULE_bitwise_and = 8, RULE_bitwise_or = 9, RULE_bitwise_xor = 10, 
		RULE_not = 11;
	public static final String[] ruleNames = {
		"addition", "subtraction", "multiplication", "division", "addition_hex", 
		"subtraction_hex", "multiplication_hex", "division_hex", "bitwise_and", 
		"bitwise_or", "bitwise_xor", "not"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "DIGIT", "HEX_NUMBER"
	};
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
	public String getGrammarFileName() { return "sma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public smaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smaParser.DIGIT, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		return addition(0);
	}

	private AdditionContext addition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionContext _localctx = new AdditionContext(_ctx, _parentState);
		AdditionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_addition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			match(DIGIT);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addition);
					setState(27);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(28);
					match(T__0);
					setState(29);
					match(DIGIT);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class SubtractionContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smaParser.DIGIT, 0); }
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitSubtraction(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		return subtraction(0);
	}

	private SubtractionContext subtraction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubtractionContext _localctx = new SubtractionContext(_ctx, _parentState);
		SubtractionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_subtraction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			match(DIGIT);
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubtractionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subtraction);
					setState(38);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(39);
					match(T__1);
					setState(40);
					match(DIGIT);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smaParser.DIGIT, 0); }
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		return multiplication(0);
	}

	private MultiplicationContext multiplication(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, _parentState);
		MultiplicationContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_multiplication, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			match(DIGIT);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplication);
					setState(49);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(50);
					match(T__2);
					setState(51);
					match(DIGIT);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smaParser.DIGIT, 0); }
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		return division(0);
	}

	private DivisionContext division(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivisionContext _localctx = new DivisionContext(_ctx, _parentState);
		DivisionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_division, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			match(DIGIT);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivisionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_division);
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61);
					match(T__3);
					setState(62);
					match(DIGIT);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Addition_hexContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(smaParser.HEX_NUMBER, 0); }
		public Addition_hexContext addition_hex() {
			return getRuleContext(Addition_hexContext.class,0);
		}
		public Addition_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterAddition_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitAddition_hex(this);
		}
	}

	public final Addition_hexContext addition_hex() throws RecognitionException {
		return addition_hex(0);
	}

	private Addition_hexContext addition_hex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Addition_hexContext _localctx = new Addition_hexContext(_ctx, _parentState);
		Addition_hexContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_addition_hex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Addition_hexContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addition_hex);
					setState(71);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(72);
					match(T__0);
					setState(73);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Subtraction_hexContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(smaParser.HEX_NUMBER, 0); }
		public Subtraction_hexContext subtraction_hex() {
			return getRuleContext(Subtraction_hexContext.class,0);
		}
		public Subtraction_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterSubtraction_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitSubtraction_hex(this);
		}
	}

	public final Subtraction_hexContext subtraction_hex() throws RecognitionException {
		return subtraction_hex(0);
	}

	private Subtraction_hexContext subtraction_hex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Subtraction_hexContext _localctx = new Subtraction_hexContext(_ctx, _parentState);
		Subtraction_hexContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_subtraction_hex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Subtraction_hexContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subtraction_hex);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					match(T__1);
					setState(84);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Multiplication_hexContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(smaParser.HEX_NUMBER, 0); }
		public Multiplication_hexContext multiplication_hex() {
			return getRuleContext(Multiplication_hexContext.class,0);
		}
		public Multiplication_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterMultiplication_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitMultiplication_hex(this);
		}
	}

	public final Multiplication_hexContext multiplication_hex() throws RecognitionException {
		return multiplication_hex(0);
	}

	private Multiplication_hexContext multiplication_hex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplication_hexContext _localctx = new Multiplication_hexContext(_ctx, _parentState);
		Multiplication_hexContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multiplication_hex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Multiplication_hexContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplication_hex);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					match(T__2);
					setState(95);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Division_hexContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(smaParser.HEX_NUMBER, 0); }
		public Division_hexContext division_hex() {
			return getRuleContext(Division_hexContext.class,0);
		}
		public Division_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterDivision_hex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitDivision_hex(this);
		}
	}

	public final Division_hexContext division_hex() throws RecognitionException {
		return division_hex(0);
	}

	private Division_hexContext division_hex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Division_hexContext _localctx = new Division_hexContext(_ctx, _parentState);
		Division_hexContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_division_hex, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Division_hexContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_division_hex);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(T__3);
					setState(106);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Bitwise_andContext extends ParserRuleContext {
		public List<TerminalNode> HEX_NUMBER() { return getTokens(smaParser.HEX_NUMBER); }
		public TerminalNode HEX_NUMBER(int i) {
			return getToken(smaParser.HEX_NUMBER, i);
		}
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterBitwise_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitBitwise_and(this);
		}
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		return bitwise_and(0);
	}

	private Bitwise_andContext bitwise_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, _parentState);
		Bitwise_andContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_bitwise_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			match(HEX_NUMBER);
			setState(114);
			match(T__4);
			setState(115);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_and);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					match(T__4);
					setState(119);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Bitwise_orContext extends ParserRuleContext {
		public List<TerminalNode> HEX_NUMBER() { return getTokens(smaParser.HEX_NUMBER); }
		public TerminalNode HEX_NUMBER(int i) {
			return getToken(smaParser.HEX_NUMBER, i);
		}
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterBitwise_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitBitwise_or(this);
		}
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		return bitwise_or(0);
	}

	private Bitwise_orContext bitwise_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, _parentState);
		Bitwise_orContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_bitwise_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			match(HEX_NUMBER);
			setState(127);
			match(T__5);
			setState(128);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_or);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					match(T__5);
					setState(132);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Bitwise_xorContext extends ParserRuleContext {
		public List<TerminalNode> HEX_NUMBER() { return getTokens(smaParser.HEX_NUMBER); }
		public TerminalNode HEX_NUMBER(int i) {
			return getToken(smaParser.HEX_NUMBER, i);
		}
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public Bitwise_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterBitwise_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitBitwise_xor(this);
		}
	}

	public final Bitwise_xorContext bitwise_xor() throws RecognitionException {
		return bitwise_xor(0);
	}

	private Bitwise_xorContext bitwise_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_xorContext _localctx = new Bitwise_xorContext(_ctx, _parentState);
		Bitwise_xorContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bitwise_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(139);
			match(HEX_NUMBER);
			setState(140);
			match(T__6);
			setState(141);
			match(HEX_NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_xorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_xor);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					match(T__6);
					setState(145);
					match(HEX_NUMBER);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(smaParser.HEX_NUMBER, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smaListener ) ((smaListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__7);
			setState(152);
			match(HEX_NUMBER);
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
		case 0:
			return addition_sempred((AdditionContext)_localctx, predIndex);
		case 1:
			return subtraction_sempred((SubtractionContext)_localctx, predIndex);
		case 2:
			return multiplication_sempred((MultiplicationContext)_localctx, predIndex);
		case 3:
			return division_sempred((DivisionContext)_localctx, predIndex);
		case 4:
			return addition_hex_sempred((Addition_hexContext)_localctx, predIndex);
		case 5:
			return subtraction_hex_sempred((Subtraction_hexContext)_localctx, predIndex);
		case 6:
			return multiplication_hex_sempred((Multiplication_hexContext)_localctx, predIndex);
		case 7:
			return division_hex_sempred((Division_hexContext)_localctx, predIndex);
		case 8:
			return bitwise_and_sempred((Bitwise_andContext)_localctx, predIndex);
		case 9:
			return bitwise_or_sempred((Bitwise_orContext)_localctx, predIndex);
		case 10:
			return bitwise_xor_sempred((Bitwise_xorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addition_sempred(AdditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subtraction_sempred(SubtractionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplication_sempred(MultiplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean division_sempred(DivisionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addition_hex_sempred(Addition_hexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subtraction_hex_sempred(Subtraction_hexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplication_hex_sempred(Multiplication_hexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean division_hex_sempred(Division_hexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_and_sempred(Bitwise_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_or_sempred(Bitwise_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_xor_sempred(Bitwise_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b"+
		"\16\bf\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\r\3\r\3\r\3\r\2\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u009b"+
		"\2\32\3\2\2\2\4%\3\2\2\2\6\60\3\2\2\2\b;\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2"+
		"\16\\\3\2\2\2\20g\3\2\2\2\22r\3\2\2\2\24\177\3\2\2\2\26\u008c\3\2\2\2"+
		"\30\u0099\3\2\2\2\32\33\b\2\1\2\33\34\7\13\2\2\34\"\3\2\2\2\35\36\f\4"+
		"\2\2\36\37\7\3\2\2\37!\7\13\2\2 \35\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#\3\3\2\2\2$\"\3\2\2\2%&\b\3\1\2&\'\7\13\2\2\'-\3\2\2\2()\f\4\2"+
		"\2)*\7\4\2\2*,\7\13\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2"+
		"\2\2/-\3\2\2\2\60\61\b\4\1\2\61\62\7\13\2\2\628\3\2\2\2\63\64\f\4\2\2"+
		"\64\65\7\5\2\2\65\67\7\13\2\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289"+
		"\3\2\2\29\7\3\2\2\2:8\3\2\2\2;<\b\5\1\2<=\7\13\2\2=C\3\2\2\2>?\f\4\2\2"+
		"?@\7\6\2\2@B\7\13\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2"+
		"\2EC\3\2\2\2FG\b\6\1\2GH\7\f\2\2HN\3\2\2\2IJ\f\4\2\2JK\7\3\2\2KM\7\f\2"+
		"\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\b\7"+
		"\1\2RS\7\f\2\2SY\3\2\2\2TU\f\4\2\2UV\7\4\2\2VX\7\f\2\2WT\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2\\]\b\b\1\2]^\7\f\2\2^d\3"+
		"\2\2\2_`\f\4\2\2`a\7\5\2\2ac\7\f\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e\17\3\2\2\2fd\3\2\2\2gh\b\t\1\2hi\7\f\2\2io\3\2\2\2jk\f\4\2\2k"+
		"l\7\6\2\2ln\7\f\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\21\3\2\2"+
		"\2qo\3\2\2\2rs\b\n\1\2st\7\f\2\2tu\7\7\2\2uv\7\f\2\2v|\3\2\2\2wx\f\4\2"+
		"\2xy\7\7\2\2y{\7\f\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\23\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\b\13\1\2\u0080\u0081\7\f\2\2\u0081\u0082\7\b"+
		"\2\2\u0082\u0083\7\f\2\2\u0083\u0089\3\2\2\2\u0084\u0085\f\4\2\2\u0085"+
		"\u0086\7\b\2\2\u0086\u0088\7\f\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\b\f\1\2\u008d\u008e\7\f\2\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0096\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7\t"+
		"\2\2\u0093\u0095\7\f\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009a\7\n\2\2\u009a\u009b\7\f\2\2\u009b\31\3\2\2\2\r\"-8CNYd"+
		"o|\u0089\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}