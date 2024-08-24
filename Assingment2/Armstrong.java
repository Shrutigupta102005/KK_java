public class Armstrong {
    public static void main (String[] args)
    {
        int num= 153;
        int sum = 0;
        while(num>0)
        {
            int cube = i*i*i;
            sum += cube ;
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
