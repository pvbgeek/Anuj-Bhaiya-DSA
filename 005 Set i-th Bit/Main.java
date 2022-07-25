public class Main
{
    public static void main(String[] args)
    {
        int a = 3; // Number
        int i = 2; // Position i
        int mask = 1 << i;
        int res = a | mask ;
        System.out.println("After Setting bit value is : " + res);
    }
}