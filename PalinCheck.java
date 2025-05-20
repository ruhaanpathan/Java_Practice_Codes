import java.util.Scanner;

public class PalinCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        System.out.println("\nRuhaan Pathan (055)");

        scan.close();
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
