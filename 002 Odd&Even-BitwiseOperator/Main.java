import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if((x&1) == 0) // Using Bitwise Operator Logic
        {
            System.out.println(x + " is an Even Number.");
        }
        else
        {
            System.out.println(x + " is an Odd Number.");
        }
    }
}