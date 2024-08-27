package Assingment3.intermidiate_ques;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 2;
        int y1 = 9;
        int y2 = 7;

        // Calculate the distance between the two points using the Euclidean distance formula
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + AB);
    }
}
/*

public class DistanceBetweenTwoPoints {
    public static void main(String[] args)
    {
        int x1 = 3;
        int x2= 2;
        int y1 = 9;
        int y2 = 7;
        //let AB be the distance between the two points
        double AB= Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),1/2) ;
        System.out.println(AB);


    }

}*/