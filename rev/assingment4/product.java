package rev.assingment4;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int num1 = myobj.nextInt();
        int num2 = myobj.nextInt();
        pro(num1,num2);
    }
    static void pro(int num1,int num2){
        int rel = num1 *num2 ;
        System.out.println(rel);
    }
}