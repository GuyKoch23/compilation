package AST;

public class AST_CLASS_DEC extends AST_DEC {
    String classId;
    String extendsId;
    AST_CFIELD_LIST cFieldList;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_CLASS_DEC(String classId, String extendsId, AST_CFIELD_LIST cFieldList)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();


		/*******************************/
		/* COPY INPUT DATA NENBERS ... */
		/*******************************/
		this.classId = classId;
		this.extendsId = extendsId;
		this.cFieldList = cFieldList;
	}

	/************************************************/
	/* The printing message for VAR DEC AST node */
	/************************************************/
	public void PrintMe()
	{

		if (extendsId == null){
			System.out.format("AST CLASS DEC NODE CLASS_ID(%s)\n", classId);
			AST_GRAPHVIZ.getInstance().logNode(
				SerialNumber,
				String.format("CLASS DEC ID(%s)", classId));
		}
		else{
			System.out.format("AST CLASS DEC NODE CLASS_ID(%s) EXTENDS_ID(%s)\n", classId, extendsId);
			AST_GRAPHVIZ.getInstance().logNode(
				SerialNumber,
				String.format("CLASS DEC ID(%s) EXTENDS_ID(%s)", classId, extendsId));
		}
	}
}
