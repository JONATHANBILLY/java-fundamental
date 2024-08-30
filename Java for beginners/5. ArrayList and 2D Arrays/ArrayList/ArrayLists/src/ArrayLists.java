import java.util.ArrayList;
public class ArrayLists
{
   public static void main(String[] args)
   {
      ArrayList<String> weekdays;
      weekdays = new ArrayList<String>(5);
      weekdays.add("Monday");
      weekdays.add("Tuesday");
      weekdays.add("Thursday");
      weekdays.add("Friday");
      System.out.println(weekdays);

      //Add at index 2 (3rd place) the String "Wednesday"
      weekdays.add(2, "Wednesday");
      System.out.println(weekdays);
   }
}