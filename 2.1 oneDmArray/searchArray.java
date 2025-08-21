
import java.util.*;

class SearchArray {

    public static void main(String[] args) {
        System.err.println("Enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //input
        System.err.println("Enter " + size + " elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        //input x for searching
        System.out.println("Enter number to search: ");
        int x = sc.nextInt();
        //search in array
        for (int i = 0; i < numbers.length; i++) {//linear search
            if (numbers[i] == x) {
                System.out.println(x + "  is found at index: " + i);
            }
        }
    }
}
