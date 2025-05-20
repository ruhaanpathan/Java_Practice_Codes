public class Student_Detail{
    static int AssinRollno = 0;
    int RealRollno;
    String Name;
    int Age;
    public Student_Detail(String name, int age){
        AssinRollno+= 1;
        RealRollno = AssinRollno;
        Name=name;
        Age = age;
    }
    public static void main(String arg[]){
        Student_Detail hello = new Student_Detail("hello",12);
        Student_Detail name1 = new Student_Detail("hel",88);
        Student_Detail Roll = new Student_Detail("hello",99);
        System.out.println("Name is: "+hello.Name+" Rollno is : "+hello.RealRollno+" age is: "+hello.Age);
        System.out.println("Name is: "+Roll.Name+" Rollno is : "+Roll.RealRollno+" age is: "+Roll.Age);
        System.out.println("Name is: "+name1.Name+" Rollno is : "+name1.RealRollno+" age is: "+name1.Age);
    }
       
}