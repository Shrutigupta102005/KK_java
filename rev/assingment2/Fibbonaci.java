package rev.assingment2;
import java.util.Scanner;
public class Fibbonaci {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int num = myobj.nextInt();
        int a =0;
        int b =1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<num ;i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            
        }
    }
}
