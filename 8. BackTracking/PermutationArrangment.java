
public class PermutationArrangment {

    private static void printArrangment(String str, String permu) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i); // 'A'
            String newStr = str.substring(0, i) + str.substring(i + 1); // "BC"
            printArrangment(newStr, permu + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printArrangment(str, "");
    }
}
