package Assingment9;

public class Pattern32 {
    public static void main(String[] args){
        int n = 5;
        for(int i =1,k='E';i<=n;i++,k--){
            int p =k;
            for(int j = 1;j<=i;j++){
                
                System.out.print((char)p+++" ");
            }
            System.out.println();
        }
    }
    
}
/*
 * 32. E
       D E
       C D E
       B C D E
       A B C D E
 */
