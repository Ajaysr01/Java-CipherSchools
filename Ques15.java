import java.util.Scanner;

public class Ques15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i >= j){
                    System.out.print("*");
                }else {
                    break;
                }
            }
            System.out.print("\n");
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}