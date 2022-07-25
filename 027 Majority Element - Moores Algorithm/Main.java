public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {5,1,3,1,1,3,1,1,1,1,8,1,2,1,6,3,1};
        int ansindex = 0;
        int cnt=1;
        for(int i=1 ; i<arr.length ; i++)
        {
            if(arr[i]==arr[ansindex])
            {cnt++;}
            else
            {cnt--;}
            if(cnt==0)
            {ansindex=i;cnt=1;}
        }
        cnt=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==arr[ansindex])
            {cnt++;}
        }
        if(cnt>arr.length/2)
        {
            System.out.println("Majority Element is : " + arr[ansindex]);
        }
        else
        {
            System.out.println("Majority Element Not Present");
        }
    }
}