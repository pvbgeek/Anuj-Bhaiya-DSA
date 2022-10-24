import java.util.*;
public class Better
{
	public static void poweroffour(int num)
	{
		if(num==0 || ((num&num-1)!=0)) // If number is zero or not a power of 2 then return False
		{
			System.out.println("NO");
			return;
		}
		else
		{
			int m=1;
			int pos=1;
			while((num&m) == 0) // To count the position of first set bit
			{
				pos++;
				m = m<<1;
			}
			if(pos%2 == 0)
			{System.out.println("NO");} // If position is Even then return False
			else
			{System.out.println("YES");} // If position is Odd then return True
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		poweroffour(num);	
	}
}
