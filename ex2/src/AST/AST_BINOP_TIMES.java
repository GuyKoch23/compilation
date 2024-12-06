package AST;

public class AST_BINOP_TIMES extends AST_BINOP {
	/************************************************/
	/* The printing message for TIMES BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST TIMES BINOP */
		/*******************************/
		System.out.format("TIMES\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("TIMES"));
	}
}
