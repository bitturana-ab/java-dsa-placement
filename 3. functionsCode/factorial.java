
import java.util.*;

class Factorial {

    public static void fact(int num) {
        if (num < 0) {  //no factorial for negative num 
            System.out.print("Invalid number.");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.print("Factorial is = " + factorial);
        return;
    }

    public static void main(String args[]) {
        System.out.println("Enter a num to calculate factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
    }
}
