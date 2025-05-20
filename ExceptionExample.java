public class ExceptionExample {
    public static void checkNumber(int number) throws ArithmeticException {
        if (number < 0) {
            throw new ArithmeticException("Number must be non-negative.");
        }
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
            checkNumber(-5);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues");
        System.out.println("\nRuhaan Pathan (055)");
    }
}
