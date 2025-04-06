import java.util.Scanner;

public class SetBitCountDP {
     static int[] dp; // Dynamic programming array to store results

     static int countSetBits(int n) {
          // Base case
          if (n == 0)
               return 0;

          // If result is already computed, return it
          if (dp[n] != -1)
               return dp[n];

          // If the last bit is set, countSetBits(n) = 1 + countSetBits(n-1)
          // If the last bit is not set, countSetBits(n) = countSetBits(n-1)
          return dp[n] = (n & 1) + countSetBits(n >> 1);
     }

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int num = scanner.nextInt();

          // Initialize dp array with -1
          dp = new int[num + 1];
          for (int i = 0; i <= num; i++) {
               dp[i] = -1;
          }

          // Calculate and print the number of set bits
          System.out.println("Number of set bits in " + num + " is: " + countSetBits(num));
     }
}
