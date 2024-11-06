package rev.assingment2;
import java.util.Scanner;
public class Correncyconverter {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        float paisa = myobj.nextFloat();
        float usd = 0.0118788f* paisa ;
        System.out.println(usd);
    }
}
