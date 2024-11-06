package rev.assingment2;
import java.util.Scanner;
public class Minicalculator {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = myobj.nextInt();
        System.out.println("enter second number");
        int num2 = myobj.nextInt();
        System.out.println("enter the operation you want to perform ...");
        char opr = myobj.next().charAt(0);
        if( opr == '+'){
            int rel = num1+num2;
            System.out.println(rel);
        }
        else if(opr == '-'){
            int rel = num1-num2; 
            System.out.println(rel);
        }
        else if(opr == '/'){
            int rel = num1/num2; 
            System.out.println(rel);
        }
        else if(opr == '*'){
            int rel = num1*num2; 
            System.out.println(rel);
        }
        else{
            System.out.println("please enter a valid operator");
            
        }

    }
    
}
