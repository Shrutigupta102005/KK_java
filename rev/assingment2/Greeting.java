package rev.assingment2;
import java.util.Scanner ;
public class Greeting {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("hey, what is your name?");
        String name = myobj.nextLine();
        System.out.println(name+" welcome to my world dear ...");
    }
}
