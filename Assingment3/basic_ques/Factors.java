
package Assingment3.basic_ques;
import java.util.Scanner;

public class Factors {
    public static void main (String[] args)
    {
        Scanner my_obj = new Scanner(System.in);
        int num ;
        System.out.println("enter a number");
        num = my_obj.nextInt();
        System.out.println("factors are");
        for (int i = 1 ; i<=num ; i++){
            if (num%i==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
