public class Main
{
    public static void main(String[] args)
    {
        // To check if a given number is a palindrome or not
        int num = 12321;
        int temp = num;
        int rev=0;
        while(temp!=0)
        {
            rev = rev*10 + (temp%10);
            temp = temp/10;
        }
        if(rev == num)
        {
            System.out.println("YES !! PALINDROME");
        }
        else
        {
            System.out.println("NO !! Not a PALINDROME");
        }
    }
}