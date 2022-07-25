public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {7,3,2,1,6,4,1,5,9,4,8};
        int maxprofit=0;
        int minsofar = arr[0];
        int sell=0;
        for(int x : arr)
        {
            if(x<minsofar)
            {minsofar=x;}
            int profit = x-minsofar;
            if(profit>maxprofit)
            {maxprofit=profit;sell=x;}
        }
        int buy = sell - maxprofit;
        System.out.println("Buy at : " + buy);
        System.out.println("Sell at : " + sell);
        System.out.println("Maximum Profit : " + maxprofit);
    }
}