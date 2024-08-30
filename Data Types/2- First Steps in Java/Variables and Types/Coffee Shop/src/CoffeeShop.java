public class CoffeeShop
{
   public static void main(String[] args)
   {
      /* Declare and initialize the variables used below. */
      String customerName = "Adel";
      int cups = 2;
      double cost = 5.9;
      boolean takeAway = true;

      System.out.println("Dear " + customerName + ", thank you for visiting our Coffee Shop.");
      System.out.println("You ordered " + cups + " cups of coffee.");
      System.out.println("Your total is: $" + cost * cups + ".");
      System.out.print("Take Away? " + takeAway);
   }
}
