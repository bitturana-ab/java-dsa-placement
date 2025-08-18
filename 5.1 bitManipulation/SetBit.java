
public class SetBit {

    public static void main(String args[]) {
        int n = 5; //0101 set 2nd bit 1;
        int pos = 2;
        int bitMask = 1 << pos - 1; //0010
        int newNumber = bitMask | n; //0010 | 0101 = 0111 = 7
        System.out.println("New number = " + newNumber);
    }
}
