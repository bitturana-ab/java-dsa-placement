
class Mobile {

    String name;
    int price;

    public void printInfo() {
        System.out.println(name + " " + price);
    }

    public Mobile() {
        System.out.println("constructor called");
    }

}

public class ClassNObjects {

    public static void main(String jd[]) {
        // Mobile m = new Mobile();
        // m.name = "Samsung a54";
        // m.price = 45000;
        // m.printInfo();
        Mobile m = new Mobile();

    }
}
