
public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vijay";
        p1.address = "Rajkot";
        p1.contactNumber = "7894561230";
        p1.gender = "Male";
        p1.display();
        Student s1 = new Student();
        s1.name = "Rudra";
        s1.address = "Surat";
        s1.contactNumber = "7794561230";
        s1.gender = "Male";
        s1.enroll = "129";
        s1.dept = "ICT";
        s1.div = "A";
        s1.sem = 2;
        s1.display();
        Person p2 = new Student();
        Student s2 = new Person();


    }
}

class Person {
    String name;
    String address;
    String gender;
    String contactNumber;

    void display() {
        System.out.println(this.name + " " + this.address + " " + this.gender + " " + this.contactNumber);
    }
}

class Student extends Person {
    String enroll;
    String dept;
    String div;
    int sem;

    @Override
    void display() {
        super.display();
        System.out.println(this.enroll + " " + this.dept+ " " + this.div + " " + this.sem);
    }
}
