public class NestedLoops
{
   public static void main(String[] args)
   {
      /* Nested loops that prints week number,
         and for each week, it prints days number.
       */
      int week =4;
      int day =7;

      for (int i=1; i <= week; i++) // the outer loop
      {
         System.out.println("Week: " + i);

         for (int j=1; j <= day; j++) // the inner loop
         {
            System.out.println("\t Day: " + j); // \t is escape character for TABs
         }
      }

      // Another example of using Nested Loops
      int row =5;
      for (int i=1; i <= row; i++)
      {
         for (int j=1; j <= i; j++)
         {
            System.out.print(j + "  ");
         }
         System.out.println(" ");
      }
   }
}
