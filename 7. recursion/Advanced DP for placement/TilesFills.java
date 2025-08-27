
public class TilesFills {

    private static int placeTiles(int n, int m) {
        // two ways hor and vert
        if (n == m) {
            return 2;
        }
        // only one way to arrange
        if (n < m) {
            return 1;
        }
        // vertically and horizontaly arrangment
        return placeTiles(n - m, m) + placeTiles(n - 1, m);
    }

    public static void main(String[] args) {
        int n = 4, m = 3;

        System.out.println("Total ways to arrange " + n + " and " + m + " tiles is = " + placeTiles(n, m));
    }
}
