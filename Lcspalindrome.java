public class Lcspalindrome {

     int lcspali(String s1, String s2, int m, int n) {
          if (m == 0 || n == 0) {
               return 0;
          }
          if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
               return lcspali(s1, s2, m - 1, n - 1) + 1;
          } else {
               return Math.max(lcspali(s1, s2, m - 1, n), lcspali(s1, s2, m, n - 1));
          }
     }

     int longestPalindromicSubsequence(String s) {
          String rev = new StringBuilder(s).reverse().toString();
          int n = s.length();
          return lcspali(s, rev, n, n);
     }

     public static void main(String[] args) {
          Lcspalindrome lp = new Lcspalindrome();
          String s = "BBABCBCAB";
          int len = lp.longestPalindromicSubsequence(s);

          System.out.println("Length " + len);
     }

}
