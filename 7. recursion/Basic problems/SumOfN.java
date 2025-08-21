
class SumOfN {

    // my version descending order
    private static void sumNum(int n, int sum) {
        if (n <= 0) {
            System.out.println("Sum = " + sum);
            return;
        }
        sum += n;
        sumNum(n - 1, sum);
    }

    public static void main(String ar[]) {
        int n = 5;
        sumOfN(1, n, 0);
        sumNum(n, 0);

    }

    // ascending order
    private static void sumOfN(int i, int n, int sum) {
        if (i >= n) {
            sum += i;
            System.out.println("Sum of " + n + " numbers = " + sum);
            return;
        }
        sum += i;
        sumOfN(i + 1, n, sum);

    }
}
