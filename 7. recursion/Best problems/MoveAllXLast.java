
public class MoveAllXLast {

    private static int countChar = 0;

    private static void findXAndAppendLast(String str, char findChar, String newString, int indx) {
        if (indx >= str.length()) {
            System.out.println(newString);
            for (int i = 0; i < countChar; i++) {
                // System.out.print(findChar);
                newString += findChar;
            }
            System.out.println(newString + " and " + findChar + " found " + countChar + " times!");
            return;
        }
        if (findChar == str.charAt(indx)) {
            countChar++;
            findXAndAppendLast(str, findChar, newString, indx + 1);
        } else {
            newString += str.charAt(indx);
            findXAndAppendLast(str, findChar, newString, indx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "axbscbxnxmxjd";
        findXAndAppendLast(str, 'x', "", 0);
    }
}
