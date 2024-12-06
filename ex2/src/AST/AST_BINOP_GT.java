package AST;

public class AST_BINOP_GT extends AST_BINOP {
	/************************************************/
	/* The printing message for GT BINOP */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST GT BINOP */
		/*******************************/
		System.out.format("GT\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("GT"));
	}
}
