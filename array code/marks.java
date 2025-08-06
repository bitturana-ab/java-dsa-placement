
class marks {

    public static void main(String args[]) {
        // define array
        //int [] marks=new int[3];
        int marks[] = new int[10];  //same same hai

        // auto initialize array with 0
        int newMark[] = new int[4];
        for (int i = 0; i < newMark.length; i++) {
            System.err.println(newMark[i]);
        }

        // initialize with own data
        String nameString[] = {"ab", "jd", "sanjay"};
        for (int i = 0; i < nameString.length; i++) {
            System.err.println("names: " + nameString[i]);
        }

        marks[0] = 97;  //phy
        marks[1] = 98;  //chem
        marks[2] = 95;  //eng
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        for (int i = 0; i < marks.length; i++) {
            // System.out.println(marks[i]);
        }
    }
}
