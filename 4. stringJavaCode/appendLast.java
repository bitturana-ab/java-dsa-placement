
class appendLast {

    public static void main(String args[]) {
        // Strings are immutable in java(can't be changed/modified anywhere) but StringBuilder class can 

        StringBuilder sb = new StringBuilder("B");
        // append (str = str + "i";) String la romba time n memory waste paninga eppo StringBuilder la append try pna
        sb.append("i");
        sb.append("t");
        sb.append("t");
        sb.append("u");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
