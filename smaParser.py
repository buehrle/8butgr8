# Generated from sma.g4 by ANTLR 4.7.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4")
        buf.write("\20\4\2\t\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16")
        buf.write("\2\16\13\2\3\2\2\3\2\3\2\2\2\2\17\2\4\3\2\2\2\4\5\b\2")
        buf.write("\1\2\5\6\7\4\2\2\6\f\3\2\2\2\7\b\f\4\2\2\b\t\7\3\2\2\t")
        buf.write("\13\7\4\2\2\n\7\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r")
        buf.write("\3\2\2\2\r\3\3\2\2\2\16\f\3\2\2\2\3\f")
        return buf.getvalue()


class smaParser ( Parser ):

    grammarFileName = "sma.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "ZAHL" ]

    RULE_addition = 0

    ruleNames =  [ "addition" ]

    EOF = Token.EOF
    T__0=1
    ZAHL=2

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class AdditionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ZAHL(self):
            return self.getToken(smaParser.ZAHL, 0)

        def addition(self):
            return self.getTypedRuleContext(smaParser.AdditionContext,0)


        def getRuleIndex(self):
            return smaParser.RULE_addition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddition" ):
                listener.enterAddition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddition" ):
                listener.exitAddition(self)



    def addition(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = smaParser.AdditionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 0
        self.enterRecursionRule(localctx, 0, self.RULE_addition, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 3
            self.match(smaParser.ZAHL)
            self._ctx.stop = self._input.LT(-1)
            self.state = 10
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = smaParser.AdditionContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_addition)
                    self.state = 5
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 6
                    self.match(smaParser.T__0)
                    self.state = 7
                    self.match(smaParser.ZAHL) 
                self.state = 12
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[0] = self.addition_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def addition_sempred(self, localctx:AdditionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         




