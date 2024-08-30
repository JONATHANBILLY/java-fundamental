public class ChangingValues
{
   public static void main(String[] args)
   {
      //Initializing variables.
      int hoursInADay = 24;
      int workHours = 9;
      int sleepHours = 8;
      int freeHours = hoursInADay - (workHours + sleepHours);

      System.out.println("I have " + freeHours + " free hours per day.");

      //Changing values of previously declared variables.
      workHours = workHours + 5;
      freeHours = hoursInADay - (workHours + sleepHours);

      System.out.println("I got a part time job.\nNow I have only " + freeHours + " free hours per day :(" );
   }
}
