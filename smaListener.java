// Generated from sma.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link smaParser}.
 */
public interface smaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link smaParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(smaParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(smaParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(smaParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(smaParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(smaParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(smaParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(smaParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(smaParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#addition_hex}.
	 * @param ctx the parse tree
	 */
	void enterAddition_hex(smaParser.Addition_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#addition_hex}.
	 * @param ctx the parse tree
	 */
	void exitAddition_hex(smaParser.Addition_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#subtraction_hex}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction_hex(smaParser.Subtraction_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#subtraction_hex}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction_hex(smaParser.Subtraction_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#multiplication_hex}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_hex(smaParser.Multiplication_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#multiplication_hex}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_hex(smaParser.Multiplication_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#division_hex}.
	 * @param ctx the parse tree
	 */
	void enterDivision_hex(smaParser.Division_hexContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#division_hex}.
	 * @param ctx the parse tree
	 */
	void exitDivision_hex(smaParser.Division_hexContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_and(smaParser.Bitwise_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#bitwise_and}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_and(smaParser.Bitwise_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_or(smaParser.Bitwise_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#bitwise_or}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_or(smaParser.Bitwise_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_xor(smaParser.Bitwise_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#bitwise_xor}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_xor(smaParser.Bitwise_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link smaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(smaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link smaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(smaParser.NotContext ctx);
}