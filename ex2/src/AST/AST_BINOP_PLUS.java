package AST;

public class AST_BINOP_PLUS extends AST_BINOP {
	/************************************************/
	/* The printing message for PLUS BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST PLUS BINOP */
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
