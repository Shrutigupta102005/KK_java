package rev.assingment2;
import java.util.Scanner ;
public class Pallindrone {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        String word = myobj.next();
    
        String rev_word = "";
        for (int i =word.length()-1; i>=0;i++)
        {
        char ch =word.charAt(i);
        rev_word = ch + rev_word;
        }

        if (rev_word== word){
            System.out.println("string is palindrone");
        }
        else{
            System.out.println("String is not palindrone");
        }
    }
}
