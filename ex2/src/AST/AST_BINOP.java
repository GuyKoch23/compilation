package AST;

public class AST_BINOP extends AST_Node
{	
	/************************************************/
	/* The printing message for an DEC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST BINOP */
		/*******************************/
		System.out.format("AST BINOP\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST BINOP\n"));
	}
}
