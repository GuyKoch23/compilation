package AST;

public class AST_STMT_RETURN extends AST_STMT {

    public AST_EXP exp;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_STMT_RETURN(AST_EXP exp)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== STMT -> exp\n");

        this.exp = exp;
	}

	/************************************************/
	/* The printing message for STMT RETURN AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST STMT RETURN */
		/*******************************/
		System.out.format("AST STMS RETURN\n");
        exp.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST STMS RETURN"));
        
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, exp.SerialNumber);
	}
}
