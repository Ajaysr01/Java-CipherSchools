/**  Write a Java program to calculate the grade of a student based on their marks using if-else conditional statements. The program should follow these criteria:

// Marks >= 90: Grade A
// Marks >= 80 and < 90: Grade B
// Marks >= 70 and < 80: Grade C
// Marks >= 60 and < 70: Grade D
 Marks < 60: Grade F
 */

import java.util.*;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        char grade = ' ';

        if(marks>=90){
            grade = 'A';
        }else if (marks >= 80 && marks < 90){
            grade = 'B';
        }else if (marks >= 70 && marks < 80){
            grade = 'C';
        }else if (marks >= 60 && marks < 70){
            grade = 'D';
        }else if (marks < 60) {
            grade = 'F';
        }else {
            System.out.println("Please enter valid marks. (0 - 100) only");
        }
    }
}