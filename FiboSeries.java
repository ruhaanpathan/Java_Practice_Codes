import java.util.Scanner;
public class FiboSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        System.out.println("\nFibonacci Series using Recursion:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
        System.out.println("\n\nFibonacci Series using Iteration:");
        printFibonacciIterative(terms);

        System.out.println("\n\nRuhaan Pathan (055)");
        scanner.close();
    }
    public static int fibRecursive(int n) {
        if (n <= 2) return 1;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    public static void printFibonacciIterative(int n) {
        if (n <= 0) return;
        int first = 1, second = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}
