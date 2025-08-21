
import java.util.*;

class Add {

    public static int addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public static int calculate(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = calculate(a, b);
        int x = addition();
        System.out.println("Sum= " + z);
        System.out.println("addition = " + x);
    }
}
