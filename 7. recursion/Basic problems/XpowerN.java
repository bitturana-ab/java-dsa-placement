
class XpowerN {

    public static int calPow(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 1) {
            return x; // x*n
        }
        if (n == 0) {
            return 1;
        }

        // time complexity = log n;
        if (n % 2 == 0) {
            return calPow(x, n / 2) * calPow(x, n / 2);
        } else {
            return calPow(x, n / 2) * calPow(x, n / 2) * x;
        }

    }

    // time complexity = n;
    private static int calPower(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * calPower(x, n - 1);
        // both are same
        // int xpownm1 = calPow(x, n - 1); //stack height n-1 == ~n 
        // int xpow = x * xpownm1;
        // return xpow;
    }

    public static void main(String ar[]) {
        int x = 2;
        int n = 5;
        System.out.println("CalPow in logn time = " + calPow(x, n));
        System.out.println("CalPower of " + x + "^" + n + " is = " + calPower(x, n));
    }
}
