
import java.util.*;

class SumOfNNumber {

    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum=" + sum);
    }
}
