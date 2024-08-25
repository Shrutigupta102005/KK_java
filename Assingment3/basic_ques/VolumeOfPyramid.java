package Assingment3.basic_ques;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        //Triangular Pyramid
        int b = 2;
        int h =4 ;
        double v1 = (1.0/3)*(1.0/2*(b*h));
        System.out.println(v1);
        //Square Pyramid
        int a = 2;
        int h2 =4 ;
        double v2 = (1.0/3)*a*a*h2;
        System.out.println(v2);
        //Rectangular Pyramid
        int l = 3;
        int w = 4;
        int h3 = 6;
        double v3 = (1.0/3)*l*w*h3;
        System.out.println(v3);
        //Hexagonal Pyramid
        int a4 = 4;
        int h4 = 6;
        double v4 = (Math.pow(3,1/2))*a4*a4*h4;
        System.out.println(v4);
    }
}
