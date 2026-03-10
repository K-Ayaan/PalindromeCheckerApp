
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded input
        String input = "madam";
        boolean isPalindrome = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Loop only till half of the string length
        for (int j = 0; j < input.length() / 2; j++) {
            String reversed = "";

            if (input.charAt(j) != input.charAt(input.length() - 1 - j)) {
                isPalindrome = false;
                break;
            }
            // Iterate from the last character to the first
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            // Display results
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome?: " + isPalindrome);
        }
        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

    }
        scanner.close();
}
}