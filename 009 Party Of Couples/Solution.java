class Solution{
    static int findSingle(int N, int arr[]){
        // code here
        int res = 0;
        for(int x : arr)
        {
            res = res ^ x;
        }
        return res;
    }
}
