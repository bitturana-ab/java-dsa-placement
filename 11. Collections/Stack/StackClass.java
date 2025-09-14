
public class StackClass {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    // add at the top of the stack
    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // remove from top of the stack
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty || underflow");
            return -1;
        }
        int pop = head.data;
        head = head.next;
        return pop;

    }

    // peek the top element of the stack
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty || underflow");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        push(28);
        push(10);

        push(25);
        push(22);

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

}
