// pure abstract 

interface Animal {

    void eat();
}

interface herbibore {

    void vegEat();
}

// multiple inheritance by interface
class Horse implements Animal, herbibore {

    public void vegEat() {
        System.out.println("veg eating");
    }

    public void eat() {
        System.out.println("horse eats");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.vegEat();
    }
}
