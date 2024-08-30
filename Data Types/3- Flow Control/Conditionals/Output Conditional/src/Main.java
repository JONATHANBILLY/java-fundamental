public class Main {
   public static void main(String[] args) {
      int x = 11;
      int y = 9;

      if( x != y)
      {
         x += 1;
         y += 1;
         System.out.print(y);
         x ++;
         y = y + 3;
      }
      else
      {
         System.out.println(x);
      }
   }
}