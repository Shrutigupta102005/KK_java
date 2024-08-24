import java.util.Scanner;

public class largest {
    public static void main(String[] args)
    {
    
        Scanner my_obj = new Scanner(System.in);
        int num1;
        int num2;
        

        System.out.println("enter first number");
        num1 = my_obj.nextInt();
        System.out.println("enter Second number");
        num2 = my_obj.nextInt();

        if (num1>num2)
        {System.out.println(num1);}
        else
        {System.out.println(num2);}
    }
}
