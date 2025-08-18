
public class BitwiseOperator {

    public static void main(String arg[]) {
        int a = 5; // 0101 in binary
        int b = 6; // 0110

        // binary AND (1&1->1 and 1&0->0)
        int ANDNum = a & b;
        System.out.println("Binary AND num = " + ANDNum);

        // binary OR (1|1->1 and 1|0->1)
        int ORNum = a | b;
        System.out.println("Binary OR num = " + ORNum);

        // binary XOR (1^1->0 or 0^0->0 and 1^0->1)
        int XORNum = a ^ b;
        System.out.println("Binary XOR num = " + XORNum);

        // binary One's compliment (1~->0)
        // changes positive num to negative num and neg to pos but decrease by -1 
        int ComplementNum = ~a;
        System.out.println("One's complement num = " + ComplementNum);
    }
}
