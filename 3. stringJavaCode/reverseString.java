class reverseString{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("sanjay");
        // String sb = "sanjay";
        //reverse = first char to last char
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 - i;//6-1-0=5

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}