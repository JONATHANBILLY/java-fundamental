public class Marks {
   public static void main(String[] args) {
      double marks = 89.5;
      if (marks == 0) {
         System.out.println("You got Zero Marks");

      } else if (marks > 0 && marks < 60) {
         System.out.println("Your grade is F");

      } else if (marks >= 60 && marks < 70) {
         System.out.println("Your grade is D");

      } else if (marks >= 70 && marks < 80) {
         System.out.println("Your grade is C");

      } else if (marks >= 80 && marks < 90) {
         System.out.println("Your grade is B");

      } else if (marks >= 90 && marks <= 100) {
         System.out.println("Your grade is A");

      } else //This to handle out range values like -5 or 120
         System.out.println("Invalid entry for marks:");
   }
}
