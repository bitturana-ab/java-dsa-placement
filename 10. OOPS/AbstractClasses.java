
// can't be create obj of this abstract class
abstract class Animal {

    int name;

    public Animal() {
        System.out.println("you are creating animal");
    }

    abstract void eat();

    public void walk() {
        System.out.println("walking");
    }

}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog created");
    }

    void eat() {
        System.out.println("eating");
    }
}

public class AbstractClasses {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();

    }
}
