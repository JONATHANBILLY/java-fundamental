public class Constructors
{
   //Instance attributes//
   public String label;
   public double number;

   //Constructor//
   public Constructors(String valueOfLabel, double valueOfNumber)
   {
      label = valueOfLabel;
      number = valueOfNumber;
   }

   public static void main(String[] args)
   {
      //create an object and assign the values at the same time
      Constructors thing = new Constructors("HIS", 1.2);

      //let's see if it worked
      System.out.println("My thing's label is " + thing.label + " and my thing's number is " + thing.number);
   }
}