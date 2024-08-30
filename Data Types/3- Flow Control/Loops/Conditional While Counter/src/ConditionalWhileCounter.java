public class ConditionalWhileCounter {
   public static void main(String[] args)
   {
      int conditionCounter = 2;
      int downCounter = 10;
      while (downCounter >= 1)
      {
         if (downCounter % 2 == 0 && downCounter % 4 ==0)
         {
            conditionCounter++;
         }
         downCounter--;
      }
        System.out.println("The condition was met " + conditionCounter + " times.");
   }
}
