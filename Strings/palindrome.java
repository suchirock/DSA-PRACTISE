import java.util.HashSet;
import java.util.Set;

public class palindrome {

    public static void main(String[] args) {
        int N = 10; // Length of the palindrome string
        int A = 3;  // Number of distinct characters
        int B = 2;  // Number of distinct integers

        String palindrome = generatePalindrome(N, A, B);
        System.out.println("Palindrome: " + palindrome);
    }

    public static String generatePalindrome(int N, int A, int B) {
        if (N % 2 != 0) {
            // Palindromes with an odd length cannot have distinct characters and integers.
            System.out.println("Cannot generate palindrome with odd length and distinct characters/integers.");
            return "";
        }

        int halfLength = N / 2;

        // Check if the given criteria can be satisfied
        if (A + B > 10 || A > halfLength || B > halfLength) {
            System.out.println("Invalid input parameters. Cannot satisfy the criteria.");
            return "";
        }

        StringBuilder palindromeBuilder = new StringBuilder();

        Set<Character> charSet = new HashSet<>();
        Set<Integer> intSet = new HashSet<>();

        // Generate the first half of the palindrome
        for (int i = 0; i < halfLength; i++) {
            if (i < A) {
                char ch = (char) ('A' + i);
                palindromeBuilder.append(ch);
                charSet.add(ch);
            } else {
                int digit = i - A;
                palindromeBuilder.append(digit);
                intSet.add(digit);
            }
        }

        // Generate the second half of the palindrome by reversing the first half
        for (int i = halfLength - 1; i >= 0; i--) {
            char ch = palindromeBuilder.charAt(i);
            palindromeBuilder.append(ch);
        }

        return palindromeBuilder.toString();
    }
}

