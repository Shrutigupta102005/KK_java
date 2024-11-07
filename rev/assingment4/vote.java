package rev.assingment4;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int age = myobj.nextInt();
        vote(age) ;
    }
    static void vote(int age){
        if(age>=18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("sorry you cannot vote ");
        }

    }
}
