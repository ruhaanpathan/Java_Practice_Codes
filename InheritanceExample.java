class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.eat();  
        puppy.bark(); 
        puppy.play(); 

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        System.out.println("\nRuhaan Pathan (055)");
    }
}
