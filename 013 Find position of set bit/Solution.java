class Solution 
{
    static int findPosition(int n) 
    {
        // code here
        if(n==0)
        {return -1;}
        else if((n&(n-1)) == 0)
        {
            int m=1;
         int pos=1;
         while((n&m)==0)
         {
            m = m<<1;
            pos++;
         }
         return pos;
        }
        else
        {return -1;}
    }
}
