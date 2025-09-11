
public class LinkLists {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    Node head;

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

    public static void main(String[] args) {
        LinkLists list = new LinkLists();
        list.addFirst("J");
        list.addLast("D");
        list.printList();
    }
}
