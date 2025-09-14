
import java.util.ArrayList;

public class StackAraayList {

    private static class Stack {

        ArrayList<Integer> stackList = new ArrayList<>();

        public boolean isEmpty() {
            return stackList.size() == 0;
        }

        // push 
        public void push(int data) {
            stackList.add(data);
        }

        // pop top
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            // int pop = stackList.get(stackList.size() - 1);
            int pop = stackList.getLast();
            stackList.remove(stackList.size() - 1);
            return pop;
        }

        // peek top
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return stackList.getLast();
        }
    }

    public static void main(String jd[]) {
        Stack s = new Stack();
        s.push(28);
        s.push(10);
        s.push(22);
        s.push(25);
        System.out.println(s.stackList);
        System.out.println("Poped from stack: " + s.pop());
        System.out.println(s.stackList);
        System.err.println("Peek element: " + s.peek());

    }
}
