package Assingment4;

public class Prime {
    public static void main(String[] args){
        prime(2);
        prime(3);
        prime(7);
        prime(8);

    }
    static void prime(int n){
        boolean rel = true;
        for(int i=2;i<n;i++){
            if (n%i!=0){
                 rel = true;
            }
            else{
                rel = false;
            }
        }
        if (rel == true){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }

    }
    
}
