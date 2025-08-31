
class appendLast {

    public static void main(String args[]) {
        // Strings are immutable in java(can't be changed/modified anywhere) 
        // but StringBuilder class can 

        StringBuilder sb = new StringBuilder("S");
        // append (str = str + "i";) String la romba time n memory waste paninga eppo StringBuilder la append try pna
        sb.append("a");
        sb.append("n");
        sb.append("j");
        sb.append("a");
        sb.append("y");
        System.out.println(sb);
    }
}
