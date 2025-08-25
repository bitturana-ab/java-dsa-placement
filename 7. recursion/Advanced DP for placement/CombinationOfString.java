
public class CombinationOfString {

    private static void printCombination(String str, String combination) {
        if (str.length() == 0) {
            System.out.println(combination);
            return;
        }
        // fill first chair one-by-one then exclude that element
        for (int i = 0; i < str.length(); i++) {
            // "abc" -> (a) "bc" || (b)"ac" || (c) "ab"
            String newString = str.substring(0, i) + str.substring(i + 1);
            printCombination(newString, combination + str.charAt(i)); // "a"
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printCombination(str, "");
    }
}
