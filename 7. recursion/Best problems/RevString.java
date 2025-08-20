
public class RevString {

    //time complexity = O(n)
    private static void revString(String str, int indx) {
        if (indx <= 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        revString(str, indx - 1);
    }

    public static void main(String[] args) {
        String name = "edoc dj";
        revString(name, name.length() - 1);
    }
}
