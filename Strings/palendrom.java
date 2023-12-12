package Strings;

import java.util.Scanner;

public class palendrom {

  public static void createPalindromeString(int N, int A, int B) {

    int halfLength = N / 2;

    String distinctChars = "WAL".substring(0, A);
    String distinctIntegers = "23".substring(0, B);

    String firstHalf = distinctChars.substring(0, halfLength - B) + distinctIntegers;
  
    String secondHalf = "";
    char ch;

    for (int i = 0; i < firstHalf.length(); i++) {
      ch = firstHalf.charAt(i);
      secondHalf = ch + secondHalf;
    }

    String palindromeString = firstHalf + secondHalf; // WAL23 + 32LAW

    System.out.println("Input: N = " + N + ", A = " + A + ", B = " + B);
    System.out.println("Output: " + palindromeString);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length (N) of the palindrome (even number): ");
    int N = scanner.nextInt();

    System.out.print("Enter the number of distinct characters (A): ");
    int A = scanner.nextInt();

    System.out.print("Enter the number of distinct integers (B): ");
    int B = scanner.nextInt();

    createPalindromeString(N, A, B);

    scanner.close();
  }
}