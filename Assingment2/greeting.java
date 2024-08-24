import java.util.Scanner;
public class greeting {
    public static void main(String[] main)
    {
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        // Enter username and press Enter
        System.out.println("Enter  your name"); 
        userName = myObj.nextLine();   
           
        System.out.println(" welcome to the world of java dear  " + userName);   
    }
}
