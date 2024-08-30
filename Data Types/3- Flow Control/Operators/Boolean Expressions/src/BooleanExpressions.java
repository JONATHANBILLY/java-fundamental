public class BooleanExpressions
{
   public static void main(String[] args)
   {
      int x = 3, y = -4, z = 1;
      boolean t = true, f = false;

      boolean bool2 = (!t == f) != (y+z/x > x-y*z);

      System.out.println(bool2);
   }
}
