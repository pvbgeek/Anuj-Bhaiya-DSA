import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a = 15;
        int b = 20;
        System.out.println("Before Swapping : " + "a="+a + " " + "b="+b);
        a = a^b;
        b = a^b;
        a = a^b; // Using Bitwise Logic ... (X-OR Operation)
        System.out.println("After Swapping : " + "a="+a + " " + "b="+b);
    }
}