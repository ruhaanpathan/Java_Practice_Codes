public class OverLoad {
    OverLoad() {
        System.out.println("This is the default constructor.");
    }
    OverLoad(String name) {
        System.out.println("Hello, " + name);
    }
    void Con() {
        System.out.println("Hii");
    }
    void Con(String name) {
        System.out.println("Good Morning, " + name);
    }
    public static void main(String[] args) {

        OverLoad obj1 = new OverLoad();
        OverLoad obj2 = new OverLoad("Ruhaan");
        System.out.println();

        obj1.Con();
        obj1.Con("Ruhaan");
        System.out.println("\nRuhaan Pathan (055)");
    }
}
