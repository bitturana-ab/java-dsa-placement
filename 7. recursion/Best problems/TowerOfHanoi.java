
public class TowerOfHanoi {

    private static void towerOfHanoi(int n, String src, String helper, String dest) {
        // transfer last one disk, src to dest direct
        if (n <= 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // n-1 disks transfer from src to helper using dest as a helper
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        // again n-1 disks transfer from helper to dest using src as helper.
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "Src", "Helper", "Dest");
    }
}
