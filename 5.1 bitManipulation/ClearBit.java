
class ClearBit {

    public static void main(String args[]) {
        int n = 5; //0101 // clear 3rd bit means 0 place = 0001
        int pos = 3;
        int bitMask = 1 << pos - 1; //0100
        int notBitMask = ~(bitMask); //1011
        int newNumber = notBitMask & n; //1011 & 0101 = 0001 =1
        System.out.println(newNumber);
    }
}
