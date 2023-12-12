import java.util.*;

public class string1 {

    // public static void main (String args[]) {
      //  char arr[] = { 'a', 'b' , 'c' , 'd'};
      //  String str = "abcd";
       // String str2 = new String("xyz");

        //string are immutable

       // Scanner sc = new Scanner(System.in);
       // String name;
       // name = sc.nextLine();
       // System.out.println(name);
   // }
 //}

//    public static boolean isPalindrom(String str) {
//      for(int i=0; i<str.length()/2; i++){
//          int n = str.length();
//          if(str.charAt(i) != str.charAt(n-1-i)) {
//             //not a palindrome
//              return false;
//          }
//      }
//     return true;
//  }

//  public static void main(String args[]) {
//      String str = "WAL2332LAW";
//      System.out.println(isPalindrom(str));
//  }
//  }

public class PalindromeString {

    public static String createPalindromeString(int n, int a, int b) {
        if (n % 2 != 0) {
            return "";
        }

        int halfLength = n / 2;
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();

        for (int i = 0; i < a; i++) {
            firstHalf.append("A");
            secondHalf.insert(0, "A");
        }

        for (int i = 0; i < b; i++) {
            firstHalf.append(Integer.toString(i));
            secondHalf.insert(0, Integer.toString(i));
        }

        return firstHalf.toString() + secondHalf.toString();
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 3;
        int b = 2;

        String palindromeString = createPalindromeString(n, a, b);
        System.out.println(palindromeString);
    }
}
}
  
