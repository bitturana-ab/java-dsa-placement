
class OccuranceElement {

    private static int first = -1;
    private static int last = -1;

    private static void findOccurance(String str, int indx, char search) {
        if (indx >= str.length()) {
            System.out.println("Element " + search + " found at index " + first + " and " + last);
            return;
        }
        if (search == str.charAt(indx)) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        findOccurance(str, indx + 1, search);
    }

    public static void main(String args[]) {
        String str = "jdabavmdsmkasfdmvcassad";
        findOccurance(str, 0, 'a');
    }
}
