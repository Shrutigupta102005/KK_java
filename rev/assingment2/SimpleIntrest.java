package rev.assingment2;
import java.util.Scanner ;
public class SimpleIntrest {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int p = myobj.nextInt();
        int r = myobj.nextInt();
        int t = myobj.nextInt();
        int si = p*(1+r*t);
        System.out.println("simple intrest"+si);
    }
}
