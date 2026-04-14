import java.util.*;

public class Lexer {
    private String input;

    public Lexer(String input) {
        this.input = input;
    }

    public List<String> tokenize() {
        List<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    tokens.add(number.toString());
                    number.setLength(0);
                }
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    tokens.add(String.valueOf(ch));
                }
            }
        }

        if (number.length() > 0) {
            tokens.add(number.toString());
        }

        return tokens;
    }
}