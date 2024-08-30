public class BreakAndContinue
{
   public static void main(String[] args)
   {
      // The break Statement
      System.out.println("Using the break statement :");
      int n = 1;
      while(n <= 15)
      {
         System.out.println(n);
         n++;
         if(n == 7)
         {
            System.out.println("The loop is terminated.");
            break;
         }
      }
      // The continue Statement
      System.out.println("\nUsing the continue statement :");

      for(int i = 1; i <= 10; i++) //for loop
      {
         if(i == 5)
         {
            System.out.println("This iteration is skipped, moving to the next iteration.");
            continue; // it will skip the rest statement
         }
         System.out.println(i);
      }
   }
}