import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Given an Array
        // Some ELements are repeating and some are unique
        // Find all unique elements
        // Time Complexity : O(N) & Space Complexity : O(N)
        int[] arr = {1,3,3,2,2,5,6,8,4,7,6,3,7};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : arr)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue() == 1)
            {
                System.out.println(e.getKey() + " is a unique non-repeating element");
            }
        }
    }
}