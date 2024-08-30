import java.util.ArrayList;

public class ArrayListMethods
{
   public static void main(String[] args)
   {
      ArrayList<Character> letters = new ArrayList<>();
      //The compiler autoboxes the char types into Character objects
      letters.add('A');
      letters.add('B');
      letters.add('C');
      letters.add('D');
      //The add method can be used with two arguments.
      letters.add(0,'$');
      letters.add(5,'*');
      //Set the element at index 3 to 'Z'.
      letters.set(3, 'Z');
      System.out.println(letters);

      letters.remove(1);
      //Don't forget to box the primitive type!
      letters.remove( (Character) 'D');
      System.out.println(letters);

      char symbol = letters.get(3);
      System.out.println(symbol);

      int whereIsA = letters.indexOf((Character) 'A');
      System.out.println(whereIsA); //There's no 'A'!

      int whereIsZ = letters.indexOf((Character) 'Z');
      System.out.println(whereIsZ);

      letters.remove(1);
      letters.remove((Character) '$');
      System.out.println(letters);

      System.out.println(letters.size());
      letters.clear();
      System.out.println(letters.size());
   }
}