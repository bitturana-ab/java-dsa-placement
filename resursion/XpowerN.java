
class XpowerN {

    public static int calPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        //time complexity = n;
        // int xpownm1 = calPow(x, n - 1); //stack height n-1 == ~n 
        // int xpow = x * xpownm1;
        // return xpow;

        //time complexity = log n;
        if (n % 2 == 0) {
            return calPow(x, n / 2) * calPow(x, n / 2);
        } else {
            return calPow(x, n / 2) * calPow(x, n / 2) * x;
        }

    }

    public static void main(String ar[]) {
        int x = 2;
        int n = 5;
        int result = calPow(x, n);
        System.out.println(result);
    }
}
