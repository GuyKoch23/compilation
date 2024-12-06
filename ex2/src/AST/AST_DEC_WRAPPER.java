package AST;

public class AST_DEC_WRAPPER extends AST_Node
{
	public AST_DEC dec;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_DEC_WRAPPER(AST_DEC dec)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.dec = dec;
	}

	/************************************************/
	/* The printing message for DEC WRAPPER AST node */
	/************************************************/
	public void PrintMe()
	{
		dec.PrintMe();
	}
}
