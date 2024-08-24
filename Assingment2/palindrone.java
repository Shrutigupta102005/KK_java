import java.util.Scanner;
public class palindrone {
    public static void main(String[] args){
        Scanner my_obj = new Scanner(System.in);
        String word ;
        System.out.println("enter the word");
        word = my_obj.nextLine();
        //reversing the string 
        String rev_word = "";
        for (int i =word.length()-1; i>=0;i++)
        {
        char ch =word.charAt(i);
        rev_word = ch + rev_word;
        }


        //checking for pallindrone 
        if (word.equals(rev_word) )
        {
            System.out.println("its a pallindrone... ");
        }
        else
        {
            System.out.println("not an pallindrone...");
        }

    }
}
