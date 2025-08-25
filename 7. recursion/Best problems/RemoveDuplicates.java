
public class RemoveDuplicates {

    // store true or false in 0 - 25 indices of array 
    private static final boolean[] AtoZ = new boolean[26];

    private static void removeDuplicates(String str, int indx, String newString) {
        if (indx >= str.length()) {
            System.out.println("Removed duplicates from " + str + " and new String is = " + newString);
            return;
        }
        // 'b' - 'a' = 1
        // if true then came second or more times so don't add into newString 
        if (AtoZ[str.charAt(indx) - 'a']) {
            removeDuplicates(str, indx + 1, newString);
        } else {
            // came first time so add into newString and store true in that indx of array
            newString += str.charAt(indx);
            AtoZ[str.charAt(indx) - 'a'] = true;
            removeDuplicates(str, indx + 1, newString);
        }
    }

    public static void main(String[] args) {
        // also u can use HashSet<Char> contains or add 
        removeDuplicates("abbcacjdajd", 0, "");
    }
}
