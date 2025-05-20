import java.util.Scanner;
class Major_Minor{
    int age;
    String name;
    public static void main (String a[]){
        int q=0;
        while(q==0){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        if(age<19){
            System.out.println("you are minor");
        }
        else if(age>18 && age<69){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are senior citizen");
        }
        System.out.print("Do yo want to continue? (if Yes enter 0, else enter 1): ");
        q=input.nextInt();
        }}
}