public class Main
{
    public static void main(String[] args)
    {
        int a = 6; // Number
        int i = 2; // Position i (Position Starting from 0)
        int mask = 1 << i;
        int res = a & mask;
        if(res != 0)
        {
            System.out.println("i-th Bit is 1.");
        }
        else
        {
            System.out.println("i-th Bit is 0.");
        }
    }
}
