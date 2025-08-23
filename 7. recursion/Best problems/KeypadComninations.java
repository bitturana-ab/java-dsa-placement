
public class KeypadComninations {

    private static String[] keypad = {".", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static void keypadCombinations(String str, int indx, String combination) {
        if (indx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0']; // '2'-'0' = 2 integer
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombinations(str, indx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "28";
        keypadCombinations(str, 0, "");
    }
}
