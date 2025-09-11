// pure abstract 

interface Animal {

    void eat();
}

class Horse implements Animal {

    public void eat() {
        System.out.println("horse eats");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
    }
}
