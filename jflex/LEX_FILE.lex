/***************************/
/* FILE NAME: LEX_FILE.lex */
/***************************/

/*************/
/* USER CODE */
/*************/
import java_cup.runtime.*;

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/

%%

/************************************/
/* OPTIONS AND DECLARATIONS SECTION */
/************************************/
   
/*****************************************************/ 
/* Lexer is the name of the class JFlex will create. */
/* The code will be written to the file Lexer.java.  */
/*****************************************************/ 
%class Lexer

/********************************************************************/
/* The current line number can be accessed with the variable yyline */
/* and the current column number with the variable yycolumn.        */
/********************************************************************/
%line
%column

/*******************************************************************************/
/* Note that this has to be the EXACT same name of the class the CUP generates */
/*******************************************************************************/
%cupsym TokenNames

/******************************************************************/
/* CUP compatibility mode interfaces with a CUP generated parser. */
/******************************************************************/
%cup

/****************/
/* DECLARATIONS */
/****************/
/*****************************************************************************/   
/* Code between %{ and %}, both of which must be at the beginning of a line, */
/* will be copied verbatim (letter to letter) into the Lexer class code.     */
/* Here you declare member variables and functions that are used inside the  */
/* scanner actions.                                                          */  
/*****************************************************************************/   
%{
	/*********************************************************************************/
	/* Create a new java_cup.runtime.Symbol with information about the current token */
	/*********************************************************************************/
	private Symbol symbol(int type)               {return new Symbol(type, yyline, yycolumn);}
	private Symbol symbol(int type, Object value) {return new Symbol(type, yyline, yycolumn, value);}

	/*******************************************/
	/* Enable line number extraction from main */
	/*******************************************/
	public int getLine() { return yyline + 1; } 

	/**********************************************/
	/* Enable token position extraction from main */
	/**********************************************/
	public int getTokenStartPosition() { return yycolumn + 1; } 
%}

/***********************/
/* MACRO DECALARATIONS */
/***********************/
/* Comments */
Comment1	= "//" [a-zA-Z0-9 \t\r\(\)\[\]\{\}\?\!\+\-\*\/\.\;]* {LineTerminator}
Comment2_illegal	= "/*" [a-zA-Z0-9 \t\r\n\(\)\[\]\{\}\?\!\+\-\*\/\.\;]*
Comment2	= {Comment2_illegal} "*/"
Letter		= [a-zA-Z]
Digit		= [0-9]
ID	= {Letter}({Letter}|{Digit})*
INT			= [0-9]+
LineTerminator	= \r|\n|\r\n
WhiteSpace		= {LineTerminator} | [ \t]
STRING			= \"[a-zA-Z]*\"

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/

%%

/************************************************************/
/* LEXER matches regular expressions to actions (Java code) */
/************************************************************/

/**************************************************************/
/* YYINITIAL is the state at which the lexer begins scanning. */
/* So these regular expressions will only be matched if the   */
/* scanner is in the start state YYINITIAL.                   */
/**************************************************************/

<YYINITIAL> {
{Comment1}		{ /* just skip what was found, do nothing */ }
{Comment2}		{ /* just skip what was found, do nothing */ }
{Comment2_illegal}		{ return symbol(TokenNames.ERROR); }
"class"		{ return symbol(TokenNames.CLASS); }
"nil"			{ return symbol(TokenNames.NIL); }
"array"		{ return symbol(TokenNames.ARRAY); }
"while"		{ return symbol(TokenNames.WHILE); }
"int"			{ return symbol(TokenNames.TYPE_INT); }
"void"		{ return symbol(TokenNames.TYPE_VOID); }
"extends"		{ return symbol(TokenNames.EXTENDS); }
"return"		{ return symbol(TokenNames.RETURN); }
"new"			{ return symbol(TokenNames.NEW); }
"if"			{ return symbol(TokenNames.IF); }
"string"		{ return symbol(TokenNames.TYPE_STRING); }
"("			{ return symbol(TokenNames.LPAREN); }
")"			{ return symbol(TokenNames.RPAREN); }
"["			{ return symbol(TokenNames.LBRACK); }
"]"			{ return symbol(TokenNames.RBRACK); }
"{"			{ return symbol(TokenNames.LBRACE); }
"}"			{ return symbol(TokenNames.RBRACE); }
"+"			{ return symbol(TokenNames.PLUS); }
"-"			{ return symbol(TokenNames.MINUS); }
"*"			{ return symbol(TokenNames.TIMES); }
"/"			{ return symbol(TokenNames.DIVIDE); }
","			{ return symbol(TokenNames.COMMA); }
"."			{ return symbol(TokenNames.DOT); }
";"			{ return symbol(TokenNames.SEMICOLON); }
":="			{ return symbol(TokenNames.ASSIGN); }
"="			{ return symbol(TokenNames.EQ); }
"<"			{ return symbol(TokenNames.LT); }
">"			{ return symbol(TokenNames.GT); }
{STRING}				{ return symbol(TokenNames.STRING,     new String( yytext()));}   
{ID}				{ return symbol(TokenNames.ID,     new String( yytext()));} 
{WhiteSpace}		{ /* just skip what was found, do nothing */ }
<<EOF>>				{ return symbol(TokenNames.EOF);}
{INT}		{ 
    String text = yytext();

    // Check for leading zeros (allow "0" but not "0123")
    if (text.length() > 1 && text.startsWith("0")) {
        return symbol(TokenNames.ERROR);
    }

    int value = Integer.parseInt(text);

    if (value > 32767 || value < 0) {
        return symbol(TokenNames.ERROR);
    }

    return symbol(TokenNames.INT, value);
}
.			{ return symbol(TokenNames.ERROR); }
}
