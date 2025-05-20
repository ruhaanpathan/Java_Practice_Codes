import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int maxNumber = scannerObj.nextInt();
        System.out.println("Prime numbers up to " + maxNumber + ":");
        for (int candidate = 2; candidate <= maxNumber; candidate++) {
            if (checkIfPrime(candidate)) {
                System.out.print(candidate + " ");
            }
        }
        System.out.println("\nRuhaan Pathan (055)");
        scannerObj.close();
    }
    public static boolean checkIfPrime(int testNum) {
        if (testNum <= 1) return false;

        for (int divisor = 2; divisor * divisor <= testNum; divisor++) {
            if (testNum % divisor == 0) return false;
        }
        return true;
    }
}
