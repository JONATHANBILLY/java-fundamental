public class MoreConditions {
   public static void main(String[] args) {
      int x = 3;
      if (x % 2 == 0)
      {
         System.out.println("x is even");
      }
      else
      {
         System.out.println("x is odd");
      }
      /*
      x == y // x equals y
      x != y // x is not equal to y
      x > y // x is greater than y
      x < y // x is less than y
      x >= y // x is greater than or equal to y
      x <= y // x is less than or equal to y
       */
      int n = 16;
      boolean evenFlag = (n%2 == 0); // true if n is even
      // boolean positiveFlag = (x > 0); // true if x is positive
      // and then use it as part of a conditional statement:
      if (evenFlag) {
         System.out.println("n was even when I checked it");
      }
   }
}