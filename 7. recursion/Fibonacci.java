
class Fibonacci {

    private static void printFibbo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFibbo(b, c, n - 1);
    }

    public static void main(String[] args) {
        System.out.print("0 ");
        System.out.print("1 ");
        int n = 5;
        printFibbo(0, 1, n);
    }
}
