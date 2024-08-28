package Assingment9;

public class pattern14 {
    public static void main(String[] args){
        int n =5;
        for(int i= 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = i;j<=n;j++){
                if(i==1||i==j||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println("");
        }

    }
    
}
/*
 * 14*********
      *     *
       *   *
        * *
         *
 */
