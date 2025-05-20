import java.util.Scanner;
class result{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int repeat =1;
        float sub1=0;
        float sub2=0;
        float sub3=0;
        float sub4=0;
        float res;
        while(repeat==1){
            System.out.print("Enter the marks of 1 sub: ");
            sub1=scan.nextFloat();
            System.out.print("Enter the marks of 2 sub: ");
            sub2=scan.nextFloat();
            System.out.print("Enter the marks of 3 sub: ");
            sub3=scan.nextFloat();
            System.out.print("Enter the marks of 4 sub: ");
            sub4=scan.nextFloat();
            res=(sub1+sub2+sub3+sub4)/4;
            if(res>=75){
                System.out.println("1st");
            }
            else if(res>=65){
                System.out.println("2nd");
            }
            else if(res>=50){
             System.out.println("3rd");
            }
            else if(res>=35){
            System.out.println("last");
            }
            else{
                System.out.println("BLNT");
            }
            System.out.println("any num to break 1 to repeat: ");
            repeat=scan.nextInt();

        }
    }
}