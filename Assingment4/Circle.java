package Assingment4;

public class Circle {
    public static void main(String[] args){
        circumference(5);
        area(6);
    }
    static void circumference(int r){
        double c =2*3.14*r;
        System.out.println(c);

    }
    static void area(int r){
        double a =3.14*r*r;
        System.out.println(a);
    }
}
