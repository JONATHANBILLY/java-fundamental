public class TheWhileLoop
{
   public static void main(String[] args)
   {
      int i = 1;
      System.out.println("This is While Loop");
      System.out.print("The first 10 natural numbers are:\n");

      while(i <= 10)
      {
         System.out.println("counter value is " + i);
         i++;  // Variable update is important in the while loops.
      }


   /*
      // remove the comment to run this example of an infinite loop
      int j = 0;
      while (j >= 0)
      {
         System.out.println("counter value is " + j);
         System.out.println("This is an infinite loop!");
      }
   */
   }
}
