package AST;

public class AST_TYPE_ID extends AST_TYPE {
	
    String name;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_TYPE_ID(String name)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== type -> ID(%s)\n", name);

        this.name = name;
	}

	/************************************************/
	/* The printing message for an TYPE ID AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = TYPE AST */
		/*******************************/
		System.out.format("AST NODE TYPE ID(%s)\n", name);

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST NODE TYPE ID(%s)", name));
	}
}
