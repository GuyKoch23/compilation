package AST;

public class AST_PARAM extends AST_STMT{

    AST_TYPE type;
    String id;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_PARAM(AST_TYPE type, String id)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		System.out.format("====================== type id -> param\n"); //TODO : check this
		this.type = type;
		this.id = id;
	}

	/************************************************/
	/* The printing message for a PARAM AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST PARAM EXP */
		/*******************************/
        type.PrintMe();
        System.out.format("AST PARAM ID(%s)\n", id);

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("PARAM ID(%s)",id));
	}
}
