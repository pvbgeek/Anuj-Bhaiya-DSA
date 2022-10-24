import java.util.*;
public class Solution
{
	public static int trailz(int n)
	{
		int ans=0;
		while(n!=0)
		{
			ans += n/5;
			n = (n/5);
		}
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(trailz(n));
	}
}
