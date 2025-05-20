import java.util.Scanner;

class Animal {
    static Scanner scan = new Scanner(System.in);
    String name;
    void eat() {
        System.out.print("Enter name of your Pet: ");
        name = scan.nextLine();
        System.out.println(name + " eats food.");
    }
}

class Dog extends Animal {
   String breed;
    void bark() {
        System.out.print("Enter breed of your Pet: ");
        breed = scan.nextLine();

        System.out.println(name + " barks.");
    }
}

class Breed extends Dog {
    void pet_Breed() {
        System.out.println("Breed: " + breed);
    }
}

public class World {
    public static void main(String[] args) {
        Breed myDog = new Breed();

        myDog.eat();        // From Animal
        myDog.bark();       // From Dog
        myDog.pet_Breed();  // From Breed
    }
}
