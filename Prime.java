public class Prime{
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) { // loop from 1 as 1 is also prime
            boolean checker = true;  // checker
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    checker = false;
                    break; // Not prime
                }
            }
            if (checker) {
                System.out.print(num + " ");}
        }
    }
}
