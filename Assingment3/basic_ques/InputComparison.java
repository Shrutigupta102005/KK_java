package Assingment3.basic_ques;
import java.util.Scanner;
public class InputComparison {
    public static void main()
        {
            Scanner my_obj = new Scanner(System.in);
            int digit = 0;
            while (true) {
                System.out.println("enter the number and to escape press 0");
                int n = my_obj.nextInt();
                if(n>digit)
                {
                    digit = n;
                }
                else if (n == 0){
                    break;
                }
            }
            System.out.println("the largest digit is"+ digit);
        }
        
    }

