public class Lis {
     int liss(int arr[], int prind, int currind) {
          if (currind == arr.length) {
               return 0;
          }
          int include = 0;
          if (prind == -1 || arr[currind] > arr[prind]) {
               include = 1 + liss(arr, currind, currind + 1);
          }
          int exclude = liss(arr, prind, currind + 1);
          return Math.max(include, exclude);
     }

     public static void main(String[] args) {
          Lis lisInstance = new Lis();
          int arr[] = { 1, 2, 18, 3, 4 };

          int lengthOfLis = lisInstance.liss(arr, -1, 0);
          System.out.println("Length of LIS: " + lengthOfLis);
     }
}
