import java.util.Scanner;
class InvalidDataExcept extends Exception {
    public InvalidDataExcept(String message) {
        super(message);
    }
}
public class EmployeeExample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();

            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            if (age < 0) {
                throw new InvalidDataExcept("Age cannot be negative.");
            }
            if (salary < 0) {
                throw new InvalidDataExcept("Salary cannot be negative.");
            }
            System.out.println("\nEmployee Data:");
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            
        } catch (InvalidDataExcept e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
            System.out.println("Program finished.");
            System.out.println("\nRuhaan Pathan (055)");
        }
    }
}
