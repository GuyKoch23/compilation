public interface TokenNames {
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
  public static final int INT = 13;
  public static final int TYPE_VOID = 14;
  public static final int EXTENDS = 15;
  public static final int RETURN = 16;
  public static final int NEW = 17;
  public static final int IF = 18;
  public static final int LBRACK = 19;
  public static final int RBRACK = 20;
  public static final int LBRACE = 21;
  public static final int RBRACE = 22;
  public static final int COMMA = 23;
  public static final int DOT = 24;
  public static final int SEMICOLON = 25;
  public static final int ASSIGN = 26;
  public static final int EQ = 27;
  public static final int LT = 28;
  public static final int GT = 29;
  public static final int STRING = 30;
  public static final int ERROR = 31; // TODO: remove this token maybe
  public static final int TYPE_INT = 32;
  public static final int TYPE_STRING = 33;

  String[] tokens = {
    "EOF", "PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "NUMBER", "ID", "CLASS", "NIL", "ARRAY",
    "WHILE", "INT", "TYPE_VOID", "EXTENDS", "RETURN", "NEW", "IF", "LBRACK", "RBRACK", "LBRACE", "RBRACE",
    "COMMA", "DOT", "SEMICOLON", "ASSIGN", "EQ", "LT", "GT", "STRING", "ERROR", "TYPE_INT", "TYPE_STRING"
  };
}
