package Assingment3.basic_ques;

public class Parallelogram5 {
    public static void main(String[] args)
    { // using base and height 
        int base = 22;
        int height = 22;
        double area =  base * height ;
        System.out.println("Area of Parallelogram is "+area);

     // using trignomertry
        double x = 90 ;
        double area2 =  base * height * Math.sin(x) ;
        System.out.println("Area of Parallelogram is "+area2);

    // using diagonals
        int d1 = 23;
        int d2 =2 ;
        double area3 =  .5*d1* d2 * Math.sin(x) ;
        System.out.println("Area of Parallelogram is "+area3);
    }
}
