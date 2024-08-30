public class WhatisProgram {
   public static void main(String[] args)
   {
      String a = "kasur rusak";
        System.out.println(isPalindrome(a));
   }

   public static boolean isPalindrome(String a){
      int left = 0;
      int right = a.length() - 1;

      while (left < right){
            if (a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
      }
      return true;
   }
}
