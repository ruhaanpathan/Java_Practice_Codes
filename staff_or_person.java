import java.util.Scanner;


class staff_or_person{
    public static void main(String[] ar){
        Scanner scan = new Scanner(System.in);
        int i;
        i= scan.nextInt();
        if( i==1){
        Person p1 = new Person();}
        else{
            Staff s1 = new Staff();
        }

    }



}


class Person{
        String name;
        String num;
        String age;
        String gender;
        void display(){
            
        }
}
class Staff extends Person{
     String position;
     String enroll;
     String salary;
}
