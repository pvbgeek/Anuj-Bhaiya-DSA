class Solution {
    static int setBits(int N) 
    {
        // code here
        int cnt=0;
        while(N!=0)
        {
            cnt++;
            N = N&(N-1); 
        }
        return cnt;
    }
}
