// space complexity -> O(1)
// time -> O(n)

public class ReverseLinkedList {

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

    public ReverseLinkedList() {
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
        // if currNode.next != null
        // System.out.println(currNode.data);
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
        // Node currNode = head;
        // while (currNode.next.next != null) {
        //     currNode = currNode.next;
        // }
        // currNode.next = null;
        // another way 
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

    // for reverse linkedlist
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            // update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    // reverse linkedlist with recursion 
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst("First");
        list.addLast("Second");
        list.addLast("Third");
        list.printList();
        // list.reverseIterate();
        // list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

        // more space will be use so avoid it
        // LinkedList<String> list = new LinkedList<>();
        // list.addFirst("This");
        // list.add("is");
        // list.add("a");
        // list.add("list");
        // System.out.println(list);
        // space complexity -> O(n)
        // LinkedList<String> reverseList = new LinkedList<>();
        // for (int i = 0; i < list.size(); i++) {
        //     reverseList.addFirst(list.get(i));
        // }
        // System.out.println(reverseList);
    }
}
