class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int ones = 0, twos = 0;
        int common_bit_mask;
        for (int i = 0; i < N; i++) 
        {
            twos = twos | (ones & arr[i]);
            ones = ones ^ arr[i];
            common_bit_mask = ~(ones & twos);
            ones &= common_bit_mask;
            twos &= common_bit_mask;
        }
        return ones;
    }
}
