import java.util.Scanner;
class IsInt{


    public static void main(String[] args){
        Scanner IntInput = new Scanner(System.in);
        boolean check = IntInput.hasNextInt();
        System.out.print(check);
    }
   
}