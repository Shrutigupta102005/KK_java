import java.util.Scanner;
public class Calc {
    public static void main(String[] args)
    {
        Scanner my_obj = new Scanner(System.in);
        int num1;
        int num2;
        int operator;

        System.out.println("enter first number");
        num1 = my_obj.nextInt();
        System.out.println("enter Second number");
        num2 = my_obj.nextInt();
        System.out.println("press 1 for +,2 for -, 3 for *, 4 for /");
        operator = my_obj.nextInt();

        if (operator==1)
        {
            System.out.println(num1+num2);
        }
        else if (operator==2)
        {
            System.out.println(num1-num2);
        }
        else if (operator==3)
        {
            System.out.println(num1*num2);
        }
        else if (operator==4)
        {
            System.out.println(num1/num2);
        }
        else
        {
            System.out.println("enter a valid number ...");
        }




    }
}
