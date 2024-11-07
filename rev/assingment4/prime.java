package rev.assingment4;

public class prime {
    public static void main(String[] args) {
        int num = 1 ;
        prime(num);
    }
    static void prime(int n ){
        boolean rel = false ;
        if (n==1 && n==2){
            System.out.println("its a prime ");
        }else{
            for(int i = 2 ;i<n;i++){
                if(n%i==0){
                    rel = false;
                }
                else{
                    rel = true;
                }
            }
            if (rel == false){
                System.out.println("not a prime");
            }
            else{
                System.out.println("its a prime number");
            }
        }
    }
}
