
class Marks {

    public static void main(String args[]) {
        // define array
        int[] marks = new int[3];
        // int marks[] = new int[10];  //same same daa
        marks[0] = 28;
        marks[1] = 36;
        marks[2] = 02;
        for (int i = 0; i < marks.length; i++) {
            // System.out.println(marks[i]);
        }

        // auto initialize array with 0
        int newMark[] = new int[4];
        for (int i = 0; i < newMark.length; i++) {
            // System.out.println(newMark[i]);
        }

        // initialize with own data
        String nameString[] = {"ab", "jd", "sanjay"};
        for (int i = 0; i < nameString.length; i++) {
            // System.out.println("names: " + nameString[i]);
        }
        // enhanced for loop
        for (String elem : nameString) {
            System.out.println(elem);
        }
    }
}
