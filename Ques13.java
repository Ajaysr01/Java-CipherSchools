import java.util.*;

    public class Main {
      public static boolean isPalindrome(String str){
            int l=0;
            int r = str.length()-1;

            while(l < r){
              if(str.charAt(l) != str.charAt(r)){
                return false;
              }
              l++;
              r--;
            }

            return true;
      }
      public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);

          String str = sc.nextLine();

          if(isPalindrome(str)){
            System.out.println("True");
          }else {
            System.out.println("False");
          }

          
      }
    }