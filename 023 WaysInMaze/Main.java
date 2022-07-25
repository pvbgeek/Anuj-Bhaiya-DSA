public class Main
{
    static int numofways(int rows , int cols)
    {
        if(rows==1 || cols==1){return 1;}
        return numofways(rows-1,cols) + numofways(rows,cols-1);
    }
    public static void main(String[] args)
    {
        // Given n*m matrix , with n rows and m columns
        // starting point is top left most corner and ending point is bottom right most corner
        // You can move only in right direction and downwards direction
        // Find the number of ways in which you can go from starting point to end point
        int rows = 4;
        int cols = 3;
        System.out.println("Number of ways are : " + numofways(rows,cols));
    }
}