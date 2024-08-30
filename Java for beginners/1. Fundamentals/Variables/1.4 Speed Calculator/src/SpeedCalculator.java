public class SpeedCalculator
{
   public static void main(String[] args)
   {
      //Define two integer numbers.
      String kilometers = "231";
        String hours = "2";
      //Define a floating point number.
      String speed;
      //Beware of integer division!
      speed = kilometers.concat(" km in ").concat(hours).concat(" hours is ").concat(String.valueOf(Integer.parseInt(kilometers) / Integer.parseInt(hours))).concat(" km/h.");

      System.out.println("The speed is " + speed + " km/h.");
   }
}