package AST;

public class AST_TYPE_VOID extends AST_TYPE {
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_TYPE_VOID()
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== type -> VOID\n");
	}

	/************************************************/
	/* The printing message for an TYPE VOID AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = TYPE AST */
		/*******************************/
		System.out.format("AST NODE TYPE VOID\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST NODE TYPE VOID"));
	}
}
