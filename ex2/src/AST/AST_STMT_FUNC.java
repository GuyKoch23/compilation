package AST;

public class AST_STMT_FUNC extends AST_STMT {

  AST_VAR var;
	String id;
	AST_EXP_WRAPPER_LIST lst;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_STMT_FUNC(AST_VAR var, String id, AST_EXP_WRAPPER_LIST lst)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== STMT -> STMT FUNC LIST\n");

		this.var = var;
		this.id = id;
		this.lst = lst;
	}

	/************************************************/
	/* The printing message for STMT FUNC AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST STMT FUNC */
		/*******************************/
		var.PrintMe();
		System.out.format("AST STMT FUNC ID(%s)\n", id);
        lst.PrintMe();

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST STMT FUNC"));
        
        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, var.SerialNumber);
		AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, lst.SerialNumber);
	}
}
