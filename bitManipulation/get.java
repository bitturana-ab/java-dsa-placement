class get{
    public static void main(String[] args){
        int n =5 ;//bit 0101 //know 3rd bit 0 or 1s
        int pos = 2;//2nd post min 3 rd bit
        int bitWise = 1<<pos;

        if((bitWise & n) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}