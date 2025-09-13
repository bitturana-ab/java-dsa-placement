
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("This");
        list.add("is");
        list.add("a");
        list.add("list");
        System.out.println(list);
        LinkedList<String> reverseList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            reverseList.addFirst(list.get(i));
        }
        System.out.println(reverseList);
    }
}
