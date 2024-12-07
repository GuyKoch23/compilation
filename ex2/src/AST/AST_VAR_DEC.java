package AST;

public class AST_VAR_DEC extends AST_CFIELD {
	AST_TYPE type;
	String id;
	AST_EXP exp;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_VAR_DEC(AST_TYPE type, String id, AST_EXP exp)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		if(exp == null){
            System.out.format("====================== varDec -> type ID(%s)\n", id);
        }
        else{
            System.out.format("====================== varDec -> type ID(%s) = EXP\n", id);
        }

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.type = type;
        this.id = id;
        this.exp = exp;
	}

	/************************************************/
	/* The printing message for VAR DEC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST VAR DEC */
		/*******************************/
        type.PrintMe();
		System.out.format("AST VAR DEC NODE ID(%s)\n", id);
        if(exp != null){
            exp.PrintMe();
        }

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("VAR DEC ID(%s)",id));

        if(exp != null){
            AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, exp.SerialNumber);
        }
	}
}
