public class LeapYear {

   public static void main(String[] args)
   {
      int year = 2020;

      boolean a = (year % 4) == 0;
      boolean b = (year % 100) != 0;
      boolean c = ((year % 100 == 0) && (year % 400 == 0));

      if(a && (b || c))
         System.out.print("Leap Year");
      else
         System.out.print("Not Leap Year");
   }
}
