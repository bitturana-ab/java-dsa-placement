
public class RevString {

    //time complexity = O(n)
    private static void revString(String str, int indx) {
        if (indx <= 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        // both are same
        // System.out.print(str.charAt(indx));
        System.out.print(str.substring(indx, indx + 1));
        revString(str, indx - 1);
    }

    public static void main(String[] args) {
        String name = "edoc dj";
        revString(name, name.length() - 1);
    }

    // another way
    // call with revString1("string",0);
    // private static void revString1(String str, int indx) {
    //     if (indx >= str.length()) {
    //         return;
    //     }
    //     revString1(str, indx + 1);
    //     System.out.print(str.charAt(indx));
    // }
}
