
import java.util.Stack;

public class PushBottomInStack {

    private static void pushBottom(Stack stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        // int peek = (Integer) stack.get(stack.size() - 1);
        int pop = (Integer) stack.pop();
        pushBottom(stack, data);
        stack.push(pop);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(28);
        stack.push(22);
        stack.push(25);
        System.out.println(stack);
        // System.err.println(stack.pop());
        // push at bottom of stack
        // stack.addFirst(21);
        // System.out.println(stack);
        // for explicite use recursion
        pushBottom(stack, 21);
        System.out.println(stack);

    }
}
