
import java.util.Stack;

public class ReverseStack {

    private static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int pop = s.pop();
        reverseStack(s);
        s.addFirst(pop);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(28);
        s.push(22);
        s.push(25);
        s.push(10);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
