package Assingment9;

public class Pattern20 {
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||j==n||i==1||i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
/*
 * 20. 
 *     ****
       *  *
       *  *
       *  *
       ****
 */