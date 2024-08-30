public class Conditionals
{
   public static void main(String[] args)
   {
      int age = 15;
      System.out.println("If your age is " + age + ", then...");
      if (age >= 18)
      {
         System.out.println("You can drive a car.");
      }
      if (13 <= age && age < 18)
      {
         System.out.println("You must be in high school.");
      }
      if (age < 3)
      {
         System.out.println("How are you reading this?");
      }
   }
}