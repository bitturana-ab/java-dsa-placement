
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(28);
        list.add(10);
        System.out.println(list);
        // get element by index
        System.out.println(list.get(0));
        // add element at index 
        list.add(1, 82);
        System.out.println(list);
        // set element
        list.set(1, 25);
        System.out.println(list);
        // remove element from index
        list.remove(2);
        System.out.println(list);
        // size of list
        System.out.println(list.size());
        // sort the list through collectio
        Collections.sort(list);
        System.out.println(list);

    }
}
