Problem 28 :
Write an efficient program to find the sum of the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

Kadane’s Algorithm is an iterative dynamic programming algorithm. It calculates the maximum sum subarray ending at a particular position by using the maximum sum subarray ending at the previous position. Follow the below steps to solve the problem.

1] Define two-variable currSum which stores maximum sum ending here and maxSum which stores maximum sum so far.

2] Initialize currSum with 0 and maxSum with INT_MIN.

3] Now, iterate over the array and add the value of the current element to currSum and check

  -> If currSum is greater than maxSum, update maxSum equals to currSum.
  
  -> If currSum is less than zero, make currSum equal to zero.

4] Finally, print the value of maxSum.
