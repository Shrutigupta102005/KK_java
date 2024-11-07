package rev.assingment3;
import java.util.*;
public class area{
    public static void main(String[] args) {
        ques1();
        ques2();
        ques3();
        ques4();
        ques5();
        ques6();
        ques7();
        

    }
    static void ques1(){
        float r = 2f;
        double area = 3.14*r*r;
        System.out.println(area+"area of circle");
    }
    static void ques2(){
        int b = 3;
        int h = 4;
        double area2 = 0.5*b*h;
        System.out.println(area2+" area of triangle");
    }
    static void ques3(){
        int l = 3;
        int b = 4;
        double area2 = l*b;
        System.out.println(area2+" area of rectangle");
    }
    static void ques4(){
        int b = 3;
        int h = 4;
        double area2 = 0.5*b*h;
        System.out.println(area2+" area of isosceles triangle");
    }
    static void ques5(){
        int b = 3;
        int h = 4;
        double area2 = b*h;
        System.out.println(area2+" area of parallelogram");}
    static void ques6(){
        int d1 = 3;
        int d2 = 4;
        double area2 = .5*d1*d2;
        System.out.println(area2+" area of rhombus");
    }
    static void ques7(){
        int a = 3;
        double area2 = (Math.sqrt(3)/4)*a*a;
        System.out.println(area2+" area of  equilateral triangle");
    }
    
}