public class ShortcutOperators
{
   public static void main(String[] args)
   {
      int var1 = 3, var2 = 2, var3 = -3;

      System.out.println("var1 = " + var1);
      var1++;
      System.out.println("Now: var1 = " + var1);

      System.out.println("var2 = " + var2);
      var2--;
      System.out.println("Now: var2 = " + var2);

      System.out.println("var2 = " + var2);
      var2 += var1;
      System.out.println("Now: var2 = " + var2);

      System.out.println("var3 = " + var3);
      var3 *= var1-var2;
      System.out.println("Now: var3 = " + var3);
   }
}
