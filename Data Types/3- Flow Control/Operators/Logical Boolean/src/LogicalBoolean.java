public class LogicalBoolean
{
   public static void main(String[] args)
   {
      boolean bool1, bool2, bool3;
      bool1 = true;
      bool2 = !bool1 && false;

      bool3 = !((!bool1 || bool2)||(bool1 && !bool2));

        System.out.println("bool3: " + bool3);
   }
}
