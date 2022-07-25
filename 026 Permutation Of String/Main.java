public class Main
{
    static String swapString(String str , int x , int y)
    {
        char[] temp = str.toCharArray();
        char b = temp[x];
        temp[x] = temp[y];
        temp[y] = b;
        return String.valueOf(temp);
    }
    static void permute(String str , int s , int e)
    {
        if(s==e-1)
        {
            System.out.println(str);
            return;
        }
        else
        {
            for(int i=s ; i<e ; i++)
            {
                str = swapString(str, s, i);
                permute(str, s + 1, e);
                str = swapString(str, s, i);
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "ABC";
        permute(str,0,str.length());
    }
}