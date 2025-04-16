class clearBit{
    public static void main(String args[]){
        int n = 5;//0101 // clear 3rd bit means 0 place
        int pos = 2;
        int bitMask = 1<<pos;//0100
        int notbitMask = ~(bitMask);//1011
        int newNumber = notbitMask & n;//1011 & 0101 = 0001 =1
        System.out.println(newNumber);
    }
}