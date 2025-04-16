
class fibonacci {

    public static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibo(b, c, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");
        int n = 7;
        printFibo(0, 1, n - 2);
    }
}
