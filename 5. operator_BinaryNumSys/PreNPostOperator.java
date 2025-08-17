
public class PreNPostOperator {

    public static void main(String[] args) {
        int a = 28;
        int b = 10;
        int c = a++; // first assign 28 then update in a -> 29
        b = ++a; // first updated a->30 then assign b = a
        System.out.println("C " + c);
        System.out.println("B " + b);
        System.out.println("A " + a);

    }
}
