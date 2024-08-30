public class ChainedVsNested {
   public static void main(String[] args) {
      int x = 10;
      int y = 10;

      if( x < y)
         System.out.println("x is less than y");
      else {
         if (x > y)
            System.out.println("x is greater than y");
         else
            System.out.println("x and y must be equal");
      }
   }
}
