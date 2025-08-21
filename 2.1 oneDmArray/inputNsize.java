
import java.util.*;

class InputNsize {

    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // size=numbers.length // properties dha
        // input data in array
        System.err.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // output data from array
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }
    }
}
