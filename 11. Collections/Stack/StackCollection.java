
import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(28);
        stack.push(25);
        stack.push(22);
        stack.push(10);
        System.out.println(stack);
        System.out.println("Poped : " + stack.pop());
        System.out.println(stack);
        System.out.println("Peeked : " + stack.peek());
        System.out.println(stack.isEmpty());
    }
}
