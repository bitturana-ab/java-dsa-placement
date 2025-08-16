
class compareStrings {

    public static void main(String args[]) {
        String name1 = "bittu";
        String name2 = "bittu";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        if ("a".equals("b")) {
            System.out.println("Equal");
        } else if ("a".compareTo("b") > 0) {
            System.out.println("greater");
        } else {
            System.out.println("lesser");
        }
    }
}
