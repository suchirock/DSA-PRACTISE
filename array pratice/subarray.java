import java.util.*;

//Print Subarrays
public class subarray {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for (int k =start; k<=end; k++){  //Print
                    System.out.print(numbers[k] + " "); //Subarray                }
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subarrays =" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6 , 8 , 10};
        printSubarrays(numbers);
    }
}
