package AST;

public class AST_BINOP_EQ extends AST_BINOP {
	/************************************************/
	/* The printing message for EQ BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST EQ BINOP */
		/*******************************/
		System.out.format("EQ\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("EQ"));
	}
}
