import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args )
    {
    Scanner my_obj = new Scanner(System.in);
    int num ;
    System.out.println("enter the number ");
    num = my_obj.nextInt();

    int a = 0;
    int b =1;
    System.out.print(a + " ");
    System.out.print(b+" ");
    for (int i =0;i<num;i++){
       
    int c= a+b;
    System.out.print(c + " ");
    a=b;
    b=c;
    }
    
}
}
