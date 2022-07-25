public class Main
{
    public static void main(String[] args)
    {
        // Given an Array
        // The array has only one unique element and all other elements occur twice
        // ********** Approach-1 ********** Use two for loops then Time - Complexity will O(N*N) and Space Complexity will be O(1)
        // ********** Approach-2 ********** Use a HashMap and find frequency of elements then Time - Complexity will be O(N) and Space Complexity will be O(N)
        // ********** Approach-3 ********** Use Bitwise X-OR operator , Time Complexity will be O(N) and Space Complexity will be O(1) ---> Best Approach
        int[] arr = {5,1,4,3,1,5,4};
        int res = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            res = res ^ arr[i];
        }
        System.out.println("Unique Element in the array is : " + res);
    }
}