class appendLast{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("b");
        //append
        sb.append("i");// str = str + "i"; //romba time n memory waste panninga so append try pannu
        sb.append("t"); // str = str + "t";// so on
        sb.append("t");
        sb.append("u");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}