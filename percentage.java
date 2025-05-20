import java.util.Scanner;
class percentage{
    static int result;
    static int perce(int a, int b, int c){
        result = (a+b+c)/3;
        return result;
    }
    public static void main(String[] args)
    {
    Scanner input1 = new Scanner(System.in);
    System.out.print("Enter the marks of 1 sub: ");
    int input_1 = input1.nextInt();
    System.out.print("Enter the marks of 2 sub: ");
    int input_2 = input1.nextInt();
    System.out.print("Enter the marks of 3 sub: ");
    int input_3 = input1.nextInt();
   
    percentage hello = new percentage();
    percentage helo = new percentage();
    hello.result=10;
     System.out.print("the result in percentage is: ");
    System.out.print(helo.result + " %");
    
}
}