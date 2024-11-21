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

  public static final HashMap<Integer, String> tokenMap = new HashMap<>();
  tokenMap.put(EOF, "EOF");
  tokenMap.put(PLUS, "PLUS");
  tokenMap.put(MINUS, "MINUS");
  tokenMap.put(TIMES, "TIMES");
  tokenMap.put(DIVIDE, "DIVIDE");
  tokenMap.put(LPAREN, "LPAREN");
  tokenMap.put(RPAREN, "RPAREN");
  tokenMap.put(NUMBER, "NUMBER");
  tokenMap.put(ID, "ID");
  tokenMap.put(CLASS, "CLASS");
  tokenMap.put(NIL, "NIL");
  tokenMap.put(ARRAY, "ARRAY");
  tokenMap.put(WHILE, "WHILE");
  tokenMap.put(TYPE_INT, "TYPE_INT");
  tokenMap.put(TYPE_VOID, "TYPE_VOID");
  tokenMap.put(EXTENDS, "EXTENDS");
  tokenMap.put(RETURN, "RETURN");
  tokenMap.put(NEW, "NEW");
  tokenMap.put(IF, "IF");
  tokenMap.put(TYPE_STRING, "TYPE_STRING");
  tokenMap.put(LBRACK, "LBRACK");
  tokenMap.put(RBRACK, "RBRACK");
  tokenMap.put(LBRACE, "LBRACE");
  tokenMap.put(RBRACE, "RBRACE");
  tokenMap.put(COMMA, "COMMA");
  tokenMap.put(DOT, "DOT");
  tokenMap.put(SEMICOLON, "SEMICOLON");
  tokenMap.put(ASSIGN, "ASSIGN");
  tokenMap.put(EQ, "EQ");
  tokenMap.put(LT, "LT");
  tokenMap.put(GT, "GT");
  tokenMap.put(STRING, "STRING");
  tokenMap.put(ERROR, "ERROR");

}