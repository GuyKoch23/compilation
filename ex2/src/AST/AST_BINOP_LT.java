package AST;

public class AST_BINOP_LT extends AST_BINOP {
	/************************************************/
	/* The printing message for LT BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST LT BINOP */
		/*******************************/
		System.out.format("LT\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("LT"));
	}
}
