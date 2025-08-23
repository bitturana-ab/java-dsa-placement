
import java.util.HashSet;

public class UniqueSubSequences {

    private static void uniqueSubSequences(String str, int indx, String newString, HashSet<String> set) {
        if (indx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        uniqueSubSequences(str, indx + 1, newString + str.charAt(indx), set);
        uniqueSubSequences(str, indx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequences(str, 0, "", set);
    }
}
