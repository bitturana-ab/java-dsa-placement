
public class SubSequences {

    private static void subSequences(String str, int indx, String newString) {
        if (indx >= str.length()) {
            System.out.println(newString);
            return;
        }
        // to be added
        subSequences(str, indx + 1, newString + str.charAt(indx));
        // not to be added
        subSequences(str, indx + 1, newString);
    }

    public static void main(String[] args) {
        subSequences("abc", 0, "");
    }
}
