public class IntegerDivisionAndTypeCasting
{
   public static void main(String[] args)
   {
      int people = 4, dumplings = 14;
      double price = 150;

      System.out.println("We ordered " + dumplings + " dumplings; costing $" + price + ".");
      System.out.println("Each one of us has to pay $" + price/people + ".");
      System.out.println("And each one of us gets to eat " + dumplings/people + " dumplings.");

      System.out.println("...my bad, I was doing integer division.");
      //In the next line, (double) tells Java to treat dumplings as a double type.
      System.out.println("Each one of us gets to eat " + (double) dumplings/people + " dumplings.");
   }
}
