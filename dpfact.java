
import java.util.Scanner;

public class dpfact {
     static int fibo(int n) {
          int arr[] = new int[n + 1]; // Initialize the array with size n + 1
          if (n <= 1) {
               return n;
          }
          if (arr[n] != 0) {
               return arr[n];
          }
          arr[n] = fibo(n - 1) + fibo(n - 2);
          return arr[n];
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
               System.out.println(fibo(i));
          }
     }
}
