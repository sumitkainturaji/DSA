public class Lcs {

     int lcs(String s1, String s2, int n, int m) {
          if (n == 0 || m == 0) {
               return 0;
          }
          if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
               return lcs(s1, s2, n - 1, m - 1) + 1;
          } else {
               return Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
          }
     }

     public static void main(String[] args) {
          Lcs lcsInstance = new Lcs();
          String s1 = "ABCBDAB";
          String s2 = "BDCAB";
          int n = s1.length();
          int m = s2.length();

          int lengthOfLcs = lcsInstance.lcs(s1, s2, n, m);
          System.out.println("Length of LCS: " + lengthOfLcs);
     }

     public int liss(int[] arr, int i, int j) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'liss'");
     }
}
