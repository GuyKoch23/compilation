package AST;

public class AST_NEW_EXP extends AST_EXP {
	public AST_TYPE type;
    public AST_EXP exp;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_NEW_EXP(AST_TYPE type,AST_EXP exp)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		//System.out.format("====================== exp -> INT( %d )\n", value);

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.type = type;
        this.exp = exp;
	}

	/************************************************/
	/* The printing message for NEW EXP AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST NEW EXP */
		/*******************************/
        System.out.format("AST NEW EXP\n");
		type.PrintMe();
        exp.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
        AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("NEW EXP"));
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, type.SerialNumber);
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, exp.SerialNumber);


	}
}
