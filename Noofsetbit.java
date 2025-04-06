public class Noofsetbit {
     static int check(int n) {
          if (n == 1) {
               return 1;
          }
          return check(n / 2) + (n & 1); // n&1 == n%2==1
     }

     public static void main(String[] args) {
          System.out.println(check(5));

     }

}
