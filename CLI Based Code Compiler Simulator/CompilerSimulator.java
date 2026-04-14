import java.util.*;

public class CompilerSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        Lexer lexer = new Lexer(input);
        List<String> tokens = lexer.tokenize();

        Parser parser = new Parser(tokens);

        if (parser.validate()) {
            Executor executor = new Executor();
            int result = executor.evaluate(tokens);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Syntax Error!");
        }
    }
}
