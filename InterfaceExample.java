interface Animal {
    void sound(); 
}

interface Mammal extends Animal {
    void move(); 
}

class Dog implements Mammal {
    public void sound() {
        System.out.println("Dog barks!");
    }

    public void move() {
        System.out.println("Dog runs!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); 
        dog.move();  
        System.out.println("\nRuhaan Pathan (055)");
    }
}
