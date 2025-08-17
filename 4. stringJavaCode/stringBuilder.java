class stringBuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0 
        System.out.println(sb.charAt(0));

        //set or replace char at index 0
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // insert in string
        sb.insert(0,'B');
        System.out.println(sb);

        //insert in middle
        sb.insert(3,'m');
        System.out.println(sb);

        //delete any extra char
        sb.delete(3,4);//3 to 3 not 4
        System.out.println(sb);
    }
}