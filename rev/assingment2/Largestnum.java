package rev.assingment2;
import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int a = myobj.nextInt();
        int b = myobj.nextInt();
        if(a>b){
            System.out.println(a+"is larger");
        }
        else if(a<b){
            System.out.println(b+"is larger");
        }
    }
}
