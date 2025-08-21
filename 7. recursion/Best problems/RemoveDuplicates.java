
public class RemoveDuplicates {

    private static boolean[] AtoZ = new boolean[26];

    private static void removeDuplicates(String str, int indx, String newString) {
        if (indx >= str.length()) {
            System.out.println("Removed duplicates from " + str + " and new String is = " + newString);
            return;
        }
        // 'b' - 'a' = 1
        if (AtoZ[str.charAt(indx) - 'a']) {
            removeDuplicates(str, indx + 1, newString);
        } else {
            newString += str.charAt(indx);
            AtoZ[str.charAt(indx) - 'a'] = true;
            removeDuplicates(str, indx + 1, newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("abbcacjdajd", 0, "");
    }
}
