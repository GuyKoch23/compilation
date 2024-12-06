package AST;

public abstract class AST_DEC extends AST_Node
{	
	/************************************************/
	/* The printing message for an DEC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST DEC */
		/*******************************/
		System.out.format("AST DEC\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST DEC\n"));
	}
}
