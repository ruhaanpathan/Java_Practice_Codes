public class ConstOverload {
    ConstOverload() {
        System.out.println("Default constructor called.");
    }
    ConstOverload(String a) {
        System.out.println("Constructor with one parameter called.");
    }

    ConstOverload(String a, int b) {
        System.out.println("Constructor with two parameters called.");
    }

    ConstOverload(String a, int b, String c) {
        System.out.println("Constructor with three parameters called.");
    }

    public static void main(String[] args) {
        new ConstOverload();                    
        new ConstOverload("One");               
        new ConstOverload("Two", 2);            
        new ConstOverload("Three", 3, "End");   
        System.out.println("\nRuhaan Pathan (055)");
    }
}
