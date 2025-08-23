
public class SubSequences {

    private static void subSequences(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println(newString);
            return;
        }
        // to be added char at indx from str
        subSequences(str, indx + 1, newString + str.charAt(indx));
        // or not to be
        subSequences(str, indx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");

    }
}
