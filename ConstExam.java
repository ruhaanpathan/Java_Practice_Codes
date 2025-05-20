public class ConstExam {

    ConstExam() {
        System.out.println("Default constructor");
    }

    ConstExam(String name) {
        System.out.println("Parameterized constructor");
    }

    ConstExam(ConstExam obj) {
        System.out.println("Copy constructor");
    }

    public static void main(String[] args) {
        ConstExam obj1 = new ConstExam();
        ConstExam obj2 = new ConstExam("Ruhaan");
        ConstExam obj3 = new ConstExam(obj2); 
        System.out.println("\nRuhaan Pathan (055)");
    }
     
}
