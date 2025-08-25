// move 0,0 to n,m in maze or matrix
// conditions : only move right or downword

public class CountPathInMaze {

    private static int countPath(int i, int j, int n, int m) {
        // boundary cell so no any way
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        return countPath(i + 1, j, n, m) + countPath(i, j + 1, n, m);
        // same way
        // move downwords 
        // int downPaths = countPath(i + 1, j, n, m);
        // move right
        // int rightPaths = countPath(i, j + 1, n, m);
        // return total paths
        // return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalpath = countPath(0, 0, n, m);
        System.out.println("Total paths = " + totalpath);

    }
}
