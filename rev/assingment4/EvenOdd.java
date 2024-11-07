package rev.assingment4;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        check(n);
    }
    static void check(int num){
        if (num % 2 == 0){
            System.out.println("num is even");
        }
        else{
            System.out.println("it is odd");
        }
    }
}
