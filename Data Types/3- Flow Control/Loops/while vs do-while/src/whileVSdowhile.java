public class whileVSdowhile {
   public static void main(String[] args) {

      // The while loop
      int n = 3;
      while(n < 3) {
         System.out.println("n = " + n);
         n = n + 1;
      }

      // The do-while loop
      int m = 3;
      do{
         System.out.println("m = " + m);
         m = m + 1;
      }
      while(m < 3);
   }
}
