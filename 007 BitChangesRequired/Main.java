public class Main
{
    public static void main(String[] args)
    {
    
    	// Given two numbers , we need to find number of changes required to be done in number 'a' to change it to number 'b'
        int a = 6; // Initial Number
        int b = 5; // Final Number
        int cnt = 0 ; // Count of changes
        int n = a^b; // To find the number of different bits in a and b.
        while(n!=0)
        {
            cnt++;
            n = n & (n-1);
        }
        System.out.println("Number of Changes required in bits to change from a to b is : " + cnt);
    }
}
