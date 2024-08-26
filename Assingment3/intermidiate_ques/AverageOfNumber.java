package Assingment3.intermidiate_ques;

public class AverageOfNumber {
    public static void main(String[] args)
    {
        int num = 7;
        int sum =0 ;
        for (int i =0; i<=num;i++){
            sum +=i;
        }
        double avg = sum / num ;
        System.out.println("the average is"+ avg);
    }
}
