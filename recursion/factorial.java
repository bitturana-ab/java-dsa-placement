
class factorial {

    public static int calFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = calFact(n - 1); //stack height n-1 == ~n 
        int fact_nm = n * fact_nm1;
        return fact_nm; //return to previous stack in memory
    }

    public static void main(String ar[]) {
        int fact = calFact(5);
        System.out.println("factorial = " + fact);
    }
}
