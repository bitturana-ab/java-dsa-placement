
class addStrings {

    public static void main(String[] args) {
        // concatenation = add two strings
        String firstName = "Bittu";
        String lastName = "Vijay";
        String fullName = firstName + " " + lastName;
        // String can be added in last and get a new String in memory but can't be modified anywhere
        fullName += " sanjay";
        System.out.println(fullName);
        // find string length
        // Bittu Vijay inlude space
        System.out.println(fullName.length());
        // charAt = single single character printing of a string name
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
    }
}
