import java.util.Scanner;

public class rupee {
    public static void main(String[] args)
    {
        Scanner my_obj = new Scanner(System.in);
        int rupee;

        System.out.println("Enter the amt you want to see in usd ");
        rupee = my_obj.nextInt();

        double  usd = rupee*0.012 ;
        System.out.println("amt in usd  " + usd);


    }
}
