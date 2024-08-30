package Assingment9;

public class Pattern34 {
    public static void main(String[] args){
        int n = 5;
        for(int i =1,k='E';i<=n;i++,k--){
            int p =k;
            for(int j = i;j<=n;j++){
                
                System.out.print((char)p--+" ");
            }
            System.out.println();
        }
    }
    
}
/*
 * 34. E D C B A
       D C B A
       C B A
       B A
       A
 */
