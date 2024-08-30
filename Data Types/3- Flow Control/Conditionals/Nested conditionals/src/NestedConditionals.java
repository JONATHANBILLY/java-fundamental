public class NestedConditionals {
   public static void main(String[] args) {
      int x = -99;

      if (x == 0) {     //outer conditional
         System.out.println("x is zero");
      }
      else {
         if (x > 0) { // Branch 1
            System.out.println("x is positive");
         }
         else {   //Branch 2
            System.out.println("x is negative");
         }
      }
   }
}
