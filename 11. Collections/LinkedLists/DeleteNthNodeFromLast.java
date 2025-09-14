
public class DeleteNthNodeFromLast {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    private int size;
    Node head;

    public DeleteNthNodeFromLast() {
        this.size = 0;
    }

    // add - first/last 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        // no any element in list
        if (head == null) {
            head = newNode;
            return;
        }
        // if have any element
        newNode.next = head;
        head = newNode;
    }

    // add in last node
    public void addLast(String data) {
        Node newNode = new Node(data);
        // if no any node
        if (head == null) {
            head = newNode;
            return;
        }
        // check last node.next with null
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print linkedlist 
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete first or head node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty! || No any node to delete");
            return;
        }
        size--;
        // head shifted to next
        head = head.next;
    }

    // delete last element 
    public void deleteLast() {
        if (head == null) {
            System.out.println("No any node to delete!");
            return;
        }
        size--;
        // if only one element
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // one node ahead
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // get size of linkedlist
    public void printSize() {
        System.out.println(size);
    }

    // find nth position from last and delete
    public void deleteNthNode(int n) {
        int searchIndx = size - n;
        Node pre = head;
        int i = 1;
        while (i < searchIndx) {
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
    }

    public static void main(String[] args) {
        DeleteNthNodeFromLast list = new DeleteNthNodeFromLast();
        list.addFirst("First");
        list.addLast("Second");
        list.addLast("Third");
        list.printList();
        list.printSize();
        list.deleteNthNode(2);

        list.printList();
    }
}
