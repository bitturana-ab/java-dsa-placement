
class Mobile {

    String name;
    int price;

    public void printInfo() {
        System.out.println(name + " " + price);
    }

    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " " + price);
    }

}

public class ClassNObjects {

    public static void main(String jd[]) {
        // Mobile m = new Mobile();
        // m.name = "Samsung a54";
        // m.price = 45000;
        // m.printInfo();
        Mobile m = new Mobile("Samsung-a54", 45000);

    }
}
