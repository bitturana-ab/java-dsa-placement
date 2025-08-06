import java.util.*;

class searchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        //input x for searching
        int x = sc.nextInt();
        //search in array
        for (int i = 0; i < numbers.length; i++) {//linear search
            if (numbers[i] == x) {
                System.out.println(x + "  is found at index: " + i);
            }
        }
    }
}
