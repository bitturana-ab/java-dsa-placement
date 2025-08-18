
class LogicalOperator {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        if (a < b && b > 1) {
            System.out.println("Logical AND");
        }
        if (a < b || b < a) {
            System.out.println("Logical OR");
        }
        if (!(a < b)) {
            System.out.println("Logical NOT");
        }
    }
}
