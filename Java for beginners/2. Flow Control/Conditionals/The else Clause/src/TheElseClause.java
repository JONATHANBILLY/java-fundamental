public class TheElseClause
{
   public static void main(String[] args)
   {
      double score = 8.9;
      System.out.println("I got " + score + "/10 on the test.");
      if (score > 6.0)
      {
         System.out.println("That means I passed.");
      }
      else
      {
         System.out.println("I must take the retest.");
      }
   }
}