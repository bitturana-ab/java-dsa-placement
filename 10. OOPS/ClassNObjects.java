
class Mobile {

    String name;
    int price;

    public void printInfo() {
        System.out.println(name + " " + price);
    }

    public Mobile() {
    }

    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " " + price);
    }

    // copy constructor
    Mobile(Mobile m) {
        this.name = m.name;
        this.price = m.price;
    }

}

public class ClassNObjects {

    public static void main(String jd[]) {
        Mobile m = new Mobile();
        // m.name = "Samsung a54";
        // m.price = 45000;
        // m.printInfo();
        // Mobile m1 = new Mobile("Samsung-a54", 45000);

        // copy constructor
        m.name = "samsung-a55";
        m.price = 34000;
        Mobile copyMobile = new Mobile(m);
        System.out.println(copyMobile.name);
        System.out.println(copyMobile.price);

    }
}
