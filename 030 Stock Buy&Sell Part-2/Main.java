public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {5,2,6,1,4,7,3,6};
        int profit=0;
        for(int i=1 ; i<arr.length ; i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit+=(arr[i]-arr[i-1]);
                System.out.println("Buy at : " + arr[i-1] + " " + "Sell at : " + arr[i]);
            }
        }
        System.out.println("Total Profit : " + profit);
    }
}