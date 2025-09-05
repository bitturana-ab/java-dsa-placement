
// parent or base class
class LivingThings {

    String name;

    public void printName() {
        System.out.println(name);
    }

    public void breathing() {
        System.out.println("breating");
    }
}

// child or sub class
class Human extends LivingThings {

    public void walk() {
        System.out.println("walking");
    }
}

public class Inheritances {

    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.breathing();
        h.name = "kumaar";
        h.printName();

    }
}
