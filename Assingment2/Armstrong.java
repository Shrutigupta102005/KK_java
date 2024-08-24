public class Armstrong {
    public static void main (String[] args)
    {
        int num= 153;
        int sum = 0;
        while(num>0)
        {
            int last_digit = num % 10;
            sum += Math.pow(last_digit,3);
            num/=10;
        }
        if (sum == num)
        {
            System.out.println("its an armstrong number ");
        }
        else 
        {
            System.out.println("not an armstrong number");
        }
    }
}
