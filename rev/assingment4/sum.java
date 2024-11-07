package rev.assingment4;
import java.util.Scanner ;
public class sum {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int num1 = myobj.nextInt();
        int num2 = myobj.nextInt();
        sum(num1,num2);
    }
    static void sum(int num1,int num2){
        int rel = num1 + num2 ;
        System.out.println(rel);
    }
}
