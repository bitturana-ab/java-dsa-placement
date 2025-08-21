
class Factorial {

    private static int calculateFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // int fact_nm1 = calculateFact(n - 1); // calculate and return 1 with base case when n == 1
        // int fact_n = n * fact_nm1;
        // return fact_n;
        return n * calculateFact(n - 1);
    }

    public static void main(String ar[]) {
        int n = 5;
        int factorial = calculateFact(n);
        System.out.println("Factorial of " + n + " is = " + factorial);
    }
}
