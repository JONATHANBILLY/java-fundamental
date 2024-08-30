public class Debugging {
   public static void main(String[] args) {
       // kinds of errors XXX
       // 1. Syntax errors:
             //System.out.println(Hello, world.); // Syntax error
             System.out.println("Hello, world.");
      /*
          2. Run-time errors:
             Does not appear until you run the program, and it appears as windows or dialog boxes that contain
                information about what happened and what the program was doing when it happened.

          3. Logic errors and semantics:
             The program works but gives wrong output. For example
       */
             int number = -1;
             if (number < 0)
                 System.out.println("Number is negative"); // Logical error because "Number is negative"
   }
}
