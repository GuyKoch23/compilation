package AST;

public class AST_BINOP_DIVIDE extends AST_BINOP {
	/************************************************/
	/* The printing message for DIVIDE BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST DIVIDE BINOP */
		/*******************************/
		System.out.format("DIVIDE\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("DIVIDE"));
	}
}
