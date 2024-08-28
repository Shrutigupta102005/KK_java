package Assingment9;

public class Pattern13 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j = i;j<=n;j++){
                System.out.print(" ");
            }
           
            for(int j=1;j<=i;j++){
                if(j==1||i==n||i==j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}  

/*
 * 13    *
        * *
       *   *
      *     *
     *********
 */