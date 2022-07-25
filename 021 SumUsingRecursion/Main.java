public class Main
{
    static long sum(int n)
    {
        if(n==1){return 1;}
        return n + sum(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of first N natural numbers is : " + sum(15));
    }
}