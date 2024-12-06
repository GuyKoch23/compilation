package AST;

public class AST_BINOP_MINUS extends AST_BINOP {
	/************************************************/
	/* The printing message for MINUS BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST MINUS BINOP */
		/*******************************/
		System.out.format("PLUS\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("PLUS"));
	}
}
