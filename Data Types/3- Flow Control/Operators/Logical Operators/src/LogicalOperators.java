public class LogicalOperators
{
   public static void main(String[] args)
   {
      boolean expression1 = true;
      boolean expression2 = false;

      System.out.println("expression1: " + expression1);
      System.out.println("expression2: " + expression2);

      System.out.println("!expression1: " + !expression1);
      System.out.println("!expression2: " + !expression2);

      System.out.println("expression1 && expression2: " + (expression1 && expression2));
      System.out.println("expression1 || expression2: " + (expression1 || expression2));

      System.out.println("!(expression1 && !expression2)"+ !(expression1 && !expression2));
   }
}
