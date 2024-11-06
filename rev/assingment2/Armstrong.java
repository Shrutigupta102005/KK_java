package rev.assingment2;

public class Armstrong {
    public static void main(String[] args){
        int num = 153;
        int rel = 0 ;
        while(num>0){
            int digit = num %10 ;
            rel = rel+digit*digit*digit;
            
        }
        if(rel == num){
            System.out.println("its an armstrong number");

        }
        else{
            System.out.println("its not an armstrong number");
        }
    }
}
