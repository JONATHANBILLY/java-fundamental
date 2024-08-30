public class ConditionalDivisible {
   public static void main(String[] args) {
      // Test if a number is divisible by two and four.
      int number = 16;

      if (number % 2 == 0 && number % 4 == 0)
      {
         System.out.println("It's divisible by two and four!");
      }
      else
      {
         System.out.println("Not divisible by two and four!");
      }
   }
}
