public class Main
{
    static boolean chkpal(String str , int s , int e)
    {
        if(s>=e){return true;}
        if(str.charAt(s) != str.charAt(e)){return false;}
        return chkpal(str,s+1,e-1);
    }
    public static void main(String[] args)
    {
        String str = "1234321";
        if(chkpal(str,0,str.length()-1))
        {
            System.out.println("Yes !! Palindrome");
        }
        else
        {
            System.out.println("No !! Not a Palindrome");
        }
    }
}
