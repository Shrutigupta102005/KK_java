package Assingment9;

public class Pattern33 {
    public static void main(String[] args){
        int n = 5;
        int p = 'a';
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++,p++){
                if(j%2!=0)
                System.out.print(Character.toUpperCase((char)p)+" ");
                else
                System.out.print((char)p+" ");

            }
            System.out.println((" "));
        }
    }
    
}
/*
 * 33. a
       B c
       D e F
       g H i J
       k L m N o
 */