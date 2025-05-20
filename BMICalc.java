import java.util.Scanner;
class BMICalc{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float weight=0;
        float height=0;
        float bmi=0;
        System.out.print("Enter your weight: ");
        weight=scan.nextFloat();
        System.out.print("Enter your height: ");
        weight=scan.nextFloat();
        bmi=(weight/(height*height));
        if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<=24.9){
            System.out.print("Normal Weight");
        }
        else if(bmi<=35)
        {
            System.out.print("OverrWeight");
        }
        else{
            System.out.print("Obese");
        }
    }
}