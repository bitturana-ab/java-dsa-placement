
import java.util.ArrayList;

public class SubsetsOfN {

    private static void printSubset(ArrayList<Integer> subsets) {
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i) + " ");
        }
        System.out.println();
    }

    private static void findSubset(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            printSubset(subsets);
            return;
        }

        // to be added
        subsets.add(n);
        findSubset(n - 1, subsets);

        // or to be not added
        subsets.remove(subsets.size() - 1);
        findSubset(n - 1, subsets);
    }

    public static void main(String[] jd) {
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubset(n, subsets);
    }
}
