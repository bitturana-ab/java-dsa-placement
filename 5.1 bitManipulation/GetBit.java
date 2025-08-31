
class GetBit {

    public static void main(String[] args) {
        int n = 5; //bit 0101 //knew 3rd bit 0 or 1s
        int pos = 3; //2nd pos means 3 rd bit
        int bitWise = 1 << pos - 1; // for AND operation (0100)

        // 0100 & 0101 -> 0100 non zero number
        if ((bitWise & n) == 0) {
            System.out.println("bit was 0");
        } else {
            System.out.println("bit was 1");
        }
    }
}
