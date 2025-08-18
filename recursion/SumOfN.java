
class SumOfN {

    public static void printN(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printN(i + 1, n, sum);

    }

    public static void main(String ar[]) {
        int n = 5;
        printN(1, n, 0);
    }
}
