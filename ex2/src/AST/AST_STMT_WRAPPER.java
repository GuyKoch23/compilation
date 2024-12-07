package AST;

public class AST_STMT_WRAPPER extends AST_Node {
  public AST_STMT stmt;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_WRAPPER(AST_STMT stmt)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		this.stmt = stmt;
	}

  public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST PARAM EXP */
		/*******************************/
    System.out.format("AST STMT Wrapper\n");

		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("STMT Wrapper"));
	}
}
