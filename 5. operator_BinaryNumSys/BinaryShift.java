
class BinaryShift {

    public static void main(String arg[]) {
        int a = 4; // 0100

        // Binary left shift << by 1
        int n = a << 1; // 0100 -> 1000
        System.out.println("Left shift by 1 of " + a + " = " + n);

        // Binary right shift by 1
        int m = a >> 1; // 0100 -> 0010
        System.out.println("Right shift by 1 of " + a + " = " + m);

        // random try
        int b = 5; // 0101
        System.out.println("Right shift by 1 of " + b + " = " + (b >> 1)); // 0010
        System.out.println("Right shift by 2 of " + b + " = " + (b >> 2)); // 0001
        System.out.println("Left shift by 1 of " + b + " = " + (b << 1)); // 1010
        System.out.println("Left shift by 2 of " + b + " = " + (b << 2)); // 10100

    }
}
