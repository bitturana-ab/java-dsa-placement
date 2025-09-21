
public class QueueUsingArray {

    static class Queue {

        static int arr[];
        static int size;
        static int rear = -1;

        // front always will be 0 index
        // intialize size of array through constructor
        Queue(int size) {
            arr = new int[size];
            this.size = size;

        }

        // check is queue empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            // check if queue is full
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            // if not full then increase rear and add data
            rear++;
            arr[rear] = data;
        }
        // deque (dubble ended queue)

        // time complexity -> O(n)
        // dequeue // remove from front
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // if not empty 
            int front = arr[0];
            // slide all element to front
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;

        }

        // front or peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // return front or first element
            return arr[0];
        }
    }

    public static void main(String[] jd) {
        Queue q = new Queue(5);
        q.add(28);
        q.add(22);
        q.add(25);
        // 28 22 25
        while (!q.isEmpty()) {
            System.err.println(q.peek());
            q.remove();
        }
    }
}
