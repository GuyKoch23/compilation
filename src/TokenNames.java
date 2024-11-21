import java.util.Map;
import static java.util.Map.entry;    

public interface TokenNames {
  /* terminals */
  public static final int EOF = 0;
  public static final int PLUS = 1;
  public static final int MINUS = 2;
  public static final int TIMES = 3;
  public static final int DIVIDE = 4;
  public static final int LPAREN = 5;
  public static final int RPAREN = 6;
  public static final int NUMBER = 7;
  public static final int ID = 8;
  public static final int CLASS = 9;
  public static final int NIL = 10;
  public static final int ARRAY = 11;
  public static final int WHILE = 12;
  public static final int TYPE_INT = 13;
  public static final int TYPE_VOID = 14;
  public static final int EXTENDS = 15;
  public static final int RETURN = 16;
  public static final int NEW = 17;
  public static final int IF = 18;
  public static final int TYPE_STRING = 19;
  public static final int LBRACK = 20;
  public static final int RBRACK = 21;
  public static final int LBRACE = 22;
  public static final int RBRACE = 23;
  public static final int COMMA = 24;
  public static final int DOT = 25;
  public static final int SEMICOLON = 26;
  public static final int ASSIGN = 27;
  public static final int EQ = 28;
  public static final int LT = 29;
  public static final int GT = 30;
  public static final int STRING = 31;
  public static final int ERROR = 32; // TODO: remove this token maybe

  public static final Map<String, String> tokenMap = Map.ofEntries(
    entry(Integer.toString(EOF), "EOF"),
    entry(Integer.toString(PLUS), "PLUS"),
    entry(Integer.toString(MINUS), "MINUS"),
    entry(Integer.toString(TIMES), "TIMES"),
    entry(Integer.toString(DIVIDE), "DIVIDE"),
    entry(Integer.toString(LPAREN), "LPAREN"),
    entry(Integer.toString(RPAREN), "RPAREN"),
    entry(Integer.toString(NUMBER), "NUMBER"),
    entry(Integer.toString(ID), "ID"),
    entry(Integer.toString(CLASS), "CLASS"),
    entry(Integer.toString(NIL), "NIL"),
    entry(Integer.toString(ARRAY), "ARRAY"),
    entry(Integer.toString(WHILE), "WHILE"),
    entry(Integer.toString(TYPE_INT), "TYPE_INT"),
    entry(Integer.toString(TYPE_VOID), "TYPE_VOID"),
    entry(Integer.toString(EXTENDS), "EXTENDS"),
    entry(Integer.toString(RETURN), "RETURN"),
    entry(Integer.toString(NEW), "NEW"),
    entry(Integer.toString(IF), "IF"),
    entry(Integer.toString(TYPE_STRING), "TYPE_STRING"),
    entry(Integer.toString(LBRACK), "LBRACK"),
    entry(Integer.toString(RBRACK), "RBRACK"),
    entry(Integer.toString(LBRACE), "LBRACE"),
    entry(Integer.toString(RBRACE), "RBRACE"),
    entry(Integer.toString(COMMA), "COMMA"),
    entry(Integer.toString(DOT), "DOT"),
    entry(Integer.toString(SEMICOLON), "SEMICOLON"),
    entry(Integer.toString(ASSIGN), "ASSIGN"),
    entry(Integer.toString(EQ), "EQ"),
    entry(Integer.toString(LT), "LT"),
    entry(Integer.toString(GT), "GT"),
    entry(Integer.toString(STRING), "STRING"),
    entry(Integer.toString(ERROR), "ERROR")
);
}