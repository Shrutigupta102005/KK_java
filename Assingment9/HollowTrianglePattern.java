package Assingment9;

public class HollowTrianglePattern {
    public static void main(String[] args){
        int n =5;
        for (int i =1;i<=n ; i++){
            for(int j = 1;j<=i;j++){
                if(i==n||j==1||i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i =1;i<=n ; i++){
            for(int j = i;j<=n;j++){
                if(j==n||i==1||i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
/*
 *  *
    **
    * *
    *  *
    *****
 */