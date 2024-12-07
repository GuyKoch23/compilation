import java.io.*;
import java_cup.runtime.Symbol;

public class Main {
    static public void main(String argv[]) {
        Lexer l;
        Symbol s;
        FileReader file_reader = null;
        PrintWriter file_writer = null;
        String inputFilename = argv[0];
        String outputFilename = argv[1];

        try {
            /********************************/
            /* [1] Initialize a file reader */
            /********************************/
            file_reader = new FileReader(inputFilename);

            /********************************/
            /* [2] Initialize a file writer */
            /********************************/
            file_writer = new PrintWriter(outputFilename);

            /******************************/
            /* [3] Initialize a new lexer */
            /******************************/
            l = new Lexer(file_reader);

            /***********************/
            /* [4] Read next token */
            /***********************/
            s = l.next_token();

            /********************************/
            /* [5] Main reading tokens loop */
            /********************************/
            while (s.sym != TokenNames.EOF) {
                if (s.sym == TokenNames.ERROR) {
                    throw new Exception("ERROR");
                }
                /*********************/
                /* [7] Print to file */
                /*********************/
                file_writer.print(TokenNames.tokens[s.sym]);
                if (s.sym == TokenNames.INT || s.sym == TokenNames.ID || s.sym == TokenNames.STRING) {
                    file_writer.print("(");
                    file_writer.print(s.value);
                    file_writer.print(")");
                }
                file_writer.print("[");
                file_writer.print(l.getLine());
                file_writer.print(",");
                file_writer.print(l.getTokenStartPosition());
                file_writer.print("]");
                file_writer.print("\n");

                /***********************/
                /* [8] Read next token */
                /***********************/
                s = l.next_token();
            }

            /******************************/
            /* [9] Close lexer input file */
            /******************************/
            l.yyclose();

            /**************************/
            /* [10] Close output file */
            /**************************/
            file_writer.close();

        } catch (Exception e) {
            if (file_writer != null) {
                file_writer.close();
							}
            try {
                file_writer = new PrintWriter(outputFilename);
                file_writer.print("ERROR");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Failed to write error output: " + fnfe.getMessage());
            }
        } finally {
            if (file_writer != null) {
                file_writer.close();
            }
        }
    }
}
