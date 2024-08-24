import java.util.Scanner;
public class si {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int P;
        int R;
        int T;
        
        
        System.out.println("principle_amt"); 
        P = myObj.nextInt();
        System.out.println("rate"); 
        R = myObj.nextInt();
        System.out.println("time"); 
        T = myObj.nextInt();
       

        int Si = P*R*T;
        System.out.println("Simple interest"+Si); 
    }
}
