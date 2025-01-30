/**A retail store offers discounts on the total amount of items in a shopping cart based on specific conditions. You need to write a program that calculates the final amount a customer needs to pay after applying a discount. Use primitive data types, type conversion, and conditional statements to solve the problem.

Conditions:
If the total cart amount is greater than ₹5000, apply a 20% discount.
If the total cart amount is between ₹3000 and ₹5000 (inclusive), apply a 10% discount.
If the total cart amount is less than ₹3000, no discount is applied.
*/

import java.util.Scanner;

    public class QuesThree {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          double totalAmt = sc.nextDouble();
          double disc;

          if(totalAmt >5000){
            disc = 20;
          }else if (totalAmt >=3000 && totalAmt <= 5000){
            disc = 10;
          }else {
            disc = 0;
          }
          
          
          totalAmt -= (disc/100)*totalAmt;
          System.out.printf("The customer needs to pay: Rs. %.2f", totalAmt);
      }
    }