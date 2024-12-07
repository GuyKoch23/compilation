package AST;

public class AST_ARRAY_TYPEDEF extends AST_DEC {

    String id;
    AST_TYPE type;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_ARRAY_TYPEDEF(String id, AST_TYPE type)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
    System.out.format("====================== arrayTypeDef -> type ID(%s)\n", id);

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.type = type;
    this.id = id;
	}

	/************************************************/
	/* The printing message for VAR AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST ARRAY TYPE DEF DEC */
		/*******************************/
    type.PrintMe();
		System.out.format("AST ARRAY TYPE DEF NODE ID(%s)\n", id);


		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("ARRAY TYPE DEF ID(%s)",id));
	}
}
