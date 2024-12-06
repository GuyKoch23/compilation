package AST;

public class AST_STMT_VAR_DEC extends AST_STMT {

    public AST_VAR_DEC varDec;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_STMT_VAR_DEC(AST_VAR_DEC varDec)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== STMT -> varDec\n");

        this.varDec = varDec;
	}

	/************************************************/
	/* The printing message for STMT VAR DEC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST STMT VAR DEC */
		/*******************************/
		System.out.format("AST STMT VAR DEC\n");
        varDec.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST STMT VAR DEC"));
        
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, varDec.SerialNumber);
	}
}
