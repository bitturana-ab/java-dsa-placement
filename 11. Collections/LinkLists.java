
import java.util.LinkedList;

// linked without collection framework
public class LinkLists {

    // class Node {
    //     String data;
    //     Node next;
    //     Node(String data) {
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }
    // private int size;
    // Node head;
    // public LinkLists() {
    //     this.size = 0;
    // }
    // // add - first/last 
    // public void addFirst(String data) {
    //     Node newNode = new Node(data);
    //     // no any element in list
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     // if have any element
    //     newNode.next = head;
    //     head = newNode;
    // }
    // // add in last node
    // public void addLast(String data) {
    //     Node newNode = new Node(data);
    //     // if no any node
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     // check last node.next with null
    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }
    // // print linkedlist 
    // public void printList() {
    //     if (head == null) {
    //         System.out.println("List is empty!");
    //         return;
    //     }
    //     Node currNode = head;
    //     while (currNode != null) {
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("null");
    //     // if currNode.next != null
    //     // System.out.println(currNode.data);
    // }
    // // delete first or head node
    // public void deleteFirst() {
    //     if (head == null) {
    //         System.out.println("List is empty! || No any node to delete");
    //         return;
    //     }
    //     size--;
    //     // head shifted to next
    //     head = head.next;
    // }
    // // delete last element 
    // public void deleteLast() {
    //     if (head == null) {
    //         System.out.println("No any node to delete!");
    //         return;
    //     }
    //     size--;
    //     // if only one element
    //     if (head.next == null) {
    //         head = null;
    //         return;
    //     }
    //     // Node currNode = head;
    //     // while (currNode.next.next != null) {
    //     //     currNode = currNode.next;
    //     // }
    //     // currNode.next = null;
    //     // another way 
    //     Node secondLast = head;
    //     Node lastNode = head.next; // one node ahead
    //     while (lastNode.next != null) {
    //         lastNode = lastNode.next;
    //         secondLast = secondLast.next;
    //     }
    //     secondLast.next = null;
    // }
    // // get size of linkedlist
    // public void printSize() {
    //     System.out.println(size);
    // }
    public static void main(String[] args) {
        // LinkLists list = new LinkLists();
        // list.addFirst("J");
        // list.addLast("D");
        // list.printList();
        // // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // list.printSize();

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("J");
        list.addLast("D");
        list.add("C");
        list.addLast("o");
        list.add("d");
        list.addLast("e");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

    }
}
