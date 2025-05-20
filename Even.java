import java.util.Scanner;

public class Even {
    static int loop=1; // global var
    static Scanner scan = new Scanner(System.in); 
    
    public static void check(){

        System.out.print("Enter a number: ");
        int num = scan.nextInt();  // taking input

        if (num % 2 == 0) {   // even odd check
            System.out.println(num + " is Even."); 
        } else {
            System.out.println(num + " is Odd.");
        }

        System.out.println("Do you want to check aganin (1 for yess | 0 for no): ");  
        loop = scan.nextInt();    // verifing that user  want to continue or not

        if(loop==1){   // if yess then restart the code
            check();
        }

        else{
            System.out.println("Thank you");
        }

    }

    public static void main(String[] args) {
        check();
    }

}
