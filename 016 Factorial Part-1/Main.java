public class Main
{
    public static void main(String[] args)
    {
        int num = 7;
        long ans = 1;
        for(int i=num ; i>=1 ; i--) // Logic Using Loop
        {
            ans*=i;
        }
        System.out.println("Factorial is : " + ans);
    }
}