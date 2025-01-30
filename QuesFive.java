/**You are managing a system that uses a 4-bit permission scheme to represent the access rights of a user. Each bit represents a specific permission:

Bit 3 (from left): Read
Bit 2: Write
Bit 1: Execute
Bit 0 (from left): Delete
Write a program that:

Takes a 4-bit integer (0–15) as the current permissions.
Takes a bit position (0 to 3) as input and toggles (reverses) the bit at that position using bitwise operators.
Displays the new permission set after toggling the bit.

Input:
Enter current permissions (0-15): 10
Enter the bit position to toggle (0-3): 2

Output:
Original permissions: 1010
Updated permissions: 1110
*/

import java.util.*;

    public class QuesFive {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int num = sc.nextInt();
          int bit = sc.nextInt();
          
          if(num < 0 || num > 15 || bit < 0 || bit > 3){
            return;
          }
          
          
          int updNum = num ^ (1 << bit);
          
          System.out.println("Original: "+num);
          System.out.println("Updated: "+updNum);
          
      }
    }
