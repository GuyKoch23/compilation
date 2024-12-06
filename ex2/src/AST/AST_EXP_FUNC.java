package AST;

public class AST_EXP_FUNC extends AST_EXP{
    
	public AST_VAR var;
    public String id;
    public AST_EXP_WRAPPER_LIST expList;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_FUNC(AST_VAR var,String id,AST_EXP_WRAPPER_LIST expList)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== exp -> expFunc(%s)\n", id);

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.var = var;
        this.id = id;
		this.expList = expList;
	}

	/************************************************/
	/* The printing message for an func EXP AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST func EXP */
		/*******************************/
        var.PrintMe();
		System.out.format("AST FUNC EXP ID(%s)\n",id);
        expList.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST FUNC EXP ID(%s)\\n",id));
        
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,var.SerialNumber);
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,expList.SerialNumber);

	}
}
