package rev.assingment4;
import java.util.Scanner;
public class Maxmin {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int num1 = myobj.nextInt();
        int num2 = myobj.nextInt();
        int num3 = myobj.nextInt();
        max(num1, num2, num3);
        min(num1,num2,num3);
    }
    static void max(int a,int b, int c){
        if (a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
    static void min(int a, int b ,int c){
        if (a<b && a<c){
            System.out.println(a);
        }
        else if(b<a && b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
