
import java.util.Stack;

public class ReverseStack {

    private static void pushBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int pop = stack.pop();
        pushBottom(stack, data);
        stack.push(pop);

    }

    private static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int pop = s.pop();
        reverseStack(s);
        // push bottom or first
        // s.addFirst(pop);
        pushBottom(s, pop);

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
