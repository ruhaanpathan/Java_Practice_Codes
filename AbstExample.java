abstract class Animal {
    abstract void sound(); 
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bhav Bhav");
    }
}

public class AbstExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat(); 
        System.out.println("\nRuhaan Pathan (055)");
    }
}
