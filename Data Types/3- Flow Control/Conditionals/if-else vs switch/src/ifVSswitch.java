public class ifVSswitch {
   public static void main(String[] args) {
      int monthNum = 8;
      if (monthNum == 1) {
         System.out.print("January");
      } else if (monthNum == 2) {
         System.out.print("February");
      }
      else if (monthNum == 3) {
         System.out.print("March");
      }

      int monthNumber = 8;
      String month = "";
      switch (monthNumber) {
         case 1:
            month = "January";
            break;
         case 2:
            month = "February";
            break;
            case 3:
            month = "March";
            break;
            case 4:
            month = "April";
            break;
            case 5:
            month = "May";
            break;
            case 6:
            month = "June";
            break;
            case 7:
            month = "July";
            break;
            case 8:
            month = "August";
            break;
      }
      System.out.println(month);
   }
}