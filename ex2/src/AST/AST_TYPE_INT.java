package AST;

public class AST_TYPE_INT extends AST_TYPE {
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_TYPE_INT()
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== type -> INT\n");
	}

	/************************************************/
	/* The printing message for an TYPE INT AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = TYPE AST */
		/*******************************/
		System.out.format("AST NODE TYPE INT\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST NODE TYPE INT"));
	}
}
