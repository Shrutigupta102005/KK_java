package rev.assingment2 ;
import java.util.Scanner ;
public class Evenodd{
    public static void main(String[] args){
        Scanner myobj  = new Scanner(System.in);
        int num = myobj.nextInt();
        if (num%2==0){
            System.out.println("number is even ");
        }
        else{
            System.out.println("number is odd");
        }
    }
}