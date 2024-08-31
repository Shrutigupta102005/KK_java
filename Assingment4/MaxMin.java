package Assingment4;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        System.out.println(max());
        System.out.println(min());


    }
    static int max(){
        Scanner my_obj = new Scanner(System.in);
        System.out.println("enter first number");
        int a = my_obj.nextInt();
        System.out.println("enter Second number");
        int b = my_obj.nextInt();
        System.out.println("enter third number");
        int c= my_obj.nextInt();
        if (a>b&&a>c){
            return a;
        }
        else if(b>a&&b>c){
            return b;
        }
        else 
        return c;
    }
    static int min(){
        Scanner my_obj2= new Scanner(System.in);
        System.out.println("enter first number");
        int a = my_obj2.nextInt();
        System.out.println("enter Second number");
        int b = my_obj2.nextInt();
        System.out.println("enter third number");
        int c= my_obj2.nextInt();
        if (a<b&&a<c){
            return a;
        }
        else if(b<a&&b<c){
            return b;
        }
        else 
        return c;
    }
    
}
