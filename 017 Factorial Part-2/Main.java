public class Main
{
    public static long fact(int num) // Logic Using Recursion
    {
        if(num==0) {return 1;}
        else return num*fact(num-1);
    }
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial is : " + fact(num));
    }
}