package rev.assingment4;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int r = myobj.nextInt();
        circumference(r);
        area(r);
    }
    static void circumference(int r){
        double c = 2*3.14*r;
        System.out.println(c);

    }
    static void area(int r){
        double a = 3.14 * r*r;
        System.out.println(a);
    }
}
