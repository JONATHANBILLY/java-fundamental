public class TypeCasting {
   public static void main(String[] args) {
      int n = 5, m = 2;
      double ans = n / (double) m;

      System.out.println(ans);

      int i = 9;
      double d = i; // Automatic casting: int to double

      System.out.println(i);      // Outputs 9
      System.out.println(d);   // Outputs 9.0

      double d2 = 9.78;
      int i2 = (int) d2; // Manual casting: double to int

      System.out.println(d2);   // Outputs 9.78
      System.out.println(i2);      // Outputs 9
   }
}
