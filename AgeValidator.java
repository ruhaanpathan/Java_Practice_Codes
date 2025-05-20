public class AgeValidator {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        try {
            ageCheck(age);
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void ageCheck(int age) throws MyAgeException {
        // try {
        if (age < 17) {
            throw new MyAgeException();
        } else {
            System.out.println("You are old enough for professional courses");
        }
        // } catch (Exception e) {

        // System.out.println(e.getMessage());
        // }
    }
}

class MyAgeException extends Exception {
    MyAgeException() {
        super("Not eligible for professional courses");
    }

}
