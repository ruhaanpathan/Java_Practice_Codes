import java.util.Scanner;

public class NameSpliter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = sc.nextLine();// to accept full name from user with 2 space
        String nameParts[] = fullName.split(" ");
        String fname = "", lname = "", mname = "";
        if (nameParts.length == 3) {
            fname = nameParts[0];
            mname = nameParts[1];
            lname = nameParts[2];
        } else {
            System.out.println("Invalid name");
        }
        if(fname.length()<5){
            System.out.println("nice name");
        }
        else if(fname.length()<10){
            System.out.println("good name");
        }
        else{
            System.out.println("extra ordinary");
        }
    }
}
