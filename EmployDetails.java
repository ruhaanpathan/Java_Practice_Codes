import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nemployee details:\n"+
               "Employee ID        : " + id + "\n" +
               "Employee Name      : " + name + "\n" +
               "Employee Age       : " + age + "\n" +
               "Employee Department: " + department + "\n" +
               "Employee Salary    : " + salary;
    }
}

public class EmployDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Employee Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = scan.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scan.nextDouble();
        Employee emp = new Employee(id, name, age, department, salary);
        System.out.println(emp);

        System.out.println("\nRuhaan Pathan (055)");
        scan.close();
    }
}
