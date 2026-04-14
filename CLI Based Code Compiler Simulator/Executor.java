import java.util.*;

public class Executor {

    public int evaluate(List<String> tokens) {
        Iterator<String> it = tokens.iterator();

        int result = Integer.parseInt(it.next());

        while (it.hasNext()) {
            String op = it.next();
            int num = Integer.parseInt(it.next());

            switch (op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": result /= num; break;
            }
        }

        return result;
    }
}