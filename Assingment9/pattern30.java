package Assingment9;

public class pattern30 {
    public static void main(String[] args){
        int n =5;
        for(int i =1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1,p=1;j<=i;j++,p++){
                System.out.print(p+" ");
            }
            for(int j=1,p=2;j<i;j++,p++){
                System.out.print(p+" ");
            }
            System.out.println();

        }
    }
    
}
/*
 * 30.      1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */
// 2nd triangle ke number pattern meh dikat hai 