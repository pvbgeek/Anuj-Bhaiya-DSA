public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {4,-5,2,-4,3,2,-8};
        int maxsum=0;
        int currsum=0;
        for(int x : arr)
        {
            currsum = currsum + x;
            if(currsum>maxsum)
            {maxsum=currsum;}
            if(currsum<0)
            {currsum=0;}
        }
        System.out.println("Maximum Sum in is : " + maxsum);
    }
}