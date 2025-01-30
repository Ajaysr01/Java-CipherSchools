/**Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

Declare and initialize variables of different primitive data types (int, double, char, and boolean).
Perform type conversion by converting an int to a double and a char to an int.
Print the values of all variables before and after the conversions.
*/
import java.util.Scanner;

public class q2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int valInt = 1;
        double valDouble = 5.2;
        char charInput = 'a';
        boolean boolInput = false;

        System.out.println("Initial values of given inputs: \n(a)Integer: "
                +valInt+"\n(b)Double: "+valDouble+"\n(c)Char: "+charInput+
                "\n(d)boolean: "+boolInput);

        //Type Conversion:
        double intToDouble = (double)valInt;
        int charToInt = (int)charInput; 
        System.out.println("\nAfter Conversion: \n(a)int to double: "+intToDouble+"\n(b)char to int : "+charToInt);

    }
}
