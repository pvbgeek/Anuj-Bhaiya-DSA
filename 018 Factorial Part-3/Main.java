public class Main
{
    public static void main(String[] args)
    {
        // Find number of trailing zeros in the factorial of a given number
        int num = 30;
        int res=0;
        for(int i=5 ; i<=num ; i=i*5)
        {
            res = res + num/i;
        }
        System.out.println("Number of Trailing zeros are : " + res);
    }
}