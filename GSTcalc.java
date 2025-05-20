import java.util.Scanner;
class GSTcalc {
    void calcGst(double amt, double gstper) {
        double igst = amt * gstper * 0.01;
        double total = amt + igst;
        double cgst = igst / 2;
        double sgst = cgst;
        System.out.println("Total:" + total);
        System.out.println("Amnt:" + amt);
        System.out.println("IGST:" + igst);
        System.out.println("CGST:" + cgst);
        System.out.println("SGST:" + sgst);
    }

    public static void main(String[] args) {
        GSTcalc obj = new GSTcalc();
        Scanner scan = new Scanner(System.in);
        int x=1;
        int y;
        int z;
        while(x==1){
            System.out.print("enter amt: ");
            y= scan.nextInt();
            System.out.print("enter gstper: ");
            z= scan.nextInt();
        obj.calcGst(y, z);
        System.out.print("enter 1 to continue: ");
        x= scan.nextInt();}
    }
}