import java.util.Scanner;
class TryCatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);q++++
        try{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Number is: " + num);}
        catch (Exception e){
            System.out.println("Invalid input");
            System.out.println(e);
            System.out.println(e.getMessage());

            e.printStackTrace();}
        finally{
            sc.close();
            System.out.println("Scanner closed");}
        System.out.println("End of program");
        }
    }