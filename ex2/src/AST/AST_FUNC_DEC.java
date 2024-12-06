package AST;

public class AST_FUNC_DEC extends AST_CFIELD {
    AST_TYPE type;
    String id;
    AST_PARAM_LIST paramList;
    AST_STMT_LIST stmtList;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_FUNC_DEC(AST_TYPE type, String id, AST_PARAM_LIST paramList,AST_STMT_LIST stmtList)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
        System.out.format("====================== funcDec -> type ID(%s)\n", id); //TODO: change this


		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.type = type;
        this.id = id;
        this.paramList = paramList;
        this.stmtList = stmtList;
	}

	/************************************************/
	/* The printing message for FUNC DEC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST FUNC DEC */
		/*******************************/
        type.PrintMe();
		System.out.format("AST FUNC DEC NODE ID(%s)\n", id);
        paramList.PrintMe();
        stmtList.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, type.SerialNumber);

		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("FUNC DEC ID(%s)",id));

        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, paramList.SerialNumber);
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, stmtList.SerialNumber);

	}
}
