package Assingment3.basic_ques;

public class fibonacci {
    public static void main(String[] args)
    {
        int num = 6;
        int a= 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 0;i<num;i++){
        int c = a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
        }
    }
}
