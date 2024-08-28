package Assingment9;

public class Pattern35 {
    public static void main(String[] args){
        int n =5;
        for (int i =1;i<=n ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
/*
 * 35. 1      1
       12    21
       123  321
       12344321
 */