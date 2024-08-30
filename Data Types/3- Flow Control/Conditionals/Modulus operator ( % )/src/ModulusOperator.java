public class ModulusOperator {
   public static void main(String[] args) {
      int x = 3, n = 7;
      // Even Number Or Odd Number
      if (x % 2 == 0)
      {
         System.out.println("x is even");
      }
      else {
         System.out.println("x is Odd");
      }

      // Divisible Or Not
      if (n % x == 0)
      {
         System.out.println("n is divisible by x");
      }
      else {
         System.out.println("n is NOT divisible by x");
      }
   }
}
