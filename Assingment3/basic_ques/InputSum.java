package Assingment3.basic_ques;
import java.util.Scanner;
public class InputSum {
    public static void main(String[] args)
    {
        Scanner my_obj = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("enter the number and to escape press 0");
            int n = my_obj.nextInt();
            sum += n ;
            if (n == 0){
                break;
            }
        }
        System.out.println("the sum is" + sum);
    }
    
}
