public class Main
{
    public static void main(String[] args)
    {
        int a = 7; // Number
        int i = 1; // Position i
        int mask = ~(1<<i);
        int res = a & mask;
        System.out.println("Result after clearing i-th Bit is : " + res);
    }
}