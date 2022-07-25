public class Main
{
    static long power(int a , int b)
    {
        if(b==0){return 1;}
        return a*power(a,b-1);
    }
    public static void main(String[] args)
    {
        System.out.println("a to the power b is : " + power(3,5));
    }
}