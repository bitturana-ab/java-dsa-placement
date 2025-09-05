
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

// single level inheritance
class Food extends LivingThings {

    public void eat() {
        System.out.println("eating food");
    }
}
// hierarichial inheritance

class Animal extends LivingThings {

    public void bark() {
        System.out.println("animal can bark");
    }
}

// multilevel inheritance
class Human extends Food {

    public void walk() {
        System.out.println("walking");
    }
}

public class Inheritances {

    public static void main(String[] args) {
        // Human h = new Human();
        // h.walk();
        // h.breathing();
        // h.name = "kumaar";
        // h.printName();
        // h.eat();

        Animal a = new Animal();
        a.bark();
        a.breathing();

    }
}
