import java.util.*;

public class QuesSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = "";
        String tempWord ="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                tempWord+=str.charAt(i);
            }else{         
                if(tempWord.length() > word.length()){
                    word = tempWord;
                }
                tempWord = "";
            }
        }

        if(tempWord.length() > word.length()){
            word = tempWord;
        }

        System.out.println("The longest word in the given string is : "+word);

    }
}
