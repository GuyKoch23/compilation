package AST;

public class AST_PROGRAM extends AST_Node
{
	public AST_DEC_WRAPPER_LIST dLst;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_PROGRAM(AST_DEC_WRAPPER_LIST dLst)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/***************************************/
		/* PRINT CORRESPONDING DERIVATION RULE */
		/***************************************/
		System.out.format("====================== program -> dLst[%s]\n", dLst);

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.dLst = dLst;
	}

	/************************************************/
	/* The printing message for Program AST node */
	/************************************************/
	public void PrintMe()
	{
		/*******************************/
		/* AST NODE TYPE = AST program EXP */
		/*******************************/
		System.out.format("AST NODE PROGRAM\n");
        dLst.PrintMe();
		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			String.format("AST NODE PROGRAM\n"));

        AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, SerialNumber);
	}
}
