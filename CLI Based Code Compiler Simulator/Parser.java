import java.util.*;

public class Parser {
    private List<String> tokens;

    public Parser(List<String> tokens) {
        this.tokens = tokens;
    }

    public boolean validate() {
        if (tokens.size() % 2 == 0) return false;

        Iterator<String> it = tokens.iterator();

        while (it.hasNext()) {
            // Check number
            try {
                Integer.parseInt(it.next());
            } catch (Exception e) {
                return false;
            }

            // Check operator (if exists)
            if (it.hasNext()) {
                String op = it.next();
                if (!(op.equals("+") || op.equals("-") ||
                      op.equals("*") || op.equals("/"))) {
                    return false;
                }
            }
        }
        return true;
    }
}