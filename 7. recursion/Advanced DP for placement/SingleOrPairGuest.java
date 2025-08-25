
public class SingleOrPairGuest {

    private static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        // single guest
        int way1 = callGuest(n - 1);
        // pair guest (for pair n-1 guest have choice)
        int way2 = (n - 1) * callGuest(n - 2);
        return way1 + way2;
    }

    public static void main(String[] jd) {
        int n = 5;
        System.out.println("Total ways to call single or pair of " + n + " members is = " + callGuest(4));
    }
}
