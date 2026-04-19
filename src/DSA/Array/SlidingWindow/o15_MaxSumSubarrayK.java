package DSA.Array.SlidingWindow;

/*
Problem Title: Maximum Sum Subarray of Size K

Concept:
Fixed Size Sliding Window

Story:
You are given an array of integers.
Find the maximum sum of any contiguous subarray of size k.

Input:
arr = [2, 1, 5, 1, 3, 2]
k = 3

Output:
9

Explanation:
Subarrays:
[2,1,5] = 8
[1,5,1] = 7
[5,1,3] = 9  <-- max
[1,3,2] = 6

Constraints:
1 ≤ arr.length ≤ 100000
*/

public class o15_MaxSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSum(arr, k);
        System.out.println(result);
    }

    public static int maxSum(int[] arr, int k) {    		
        // Write your code here
    	int sum =0;
    	int maxSum =0;
    	for(int i=0;i<k;i++) {
    		sum+=arr[i];
    	}
    	maxSum = sum;
    	int j =0;
    	for(int i =k;i<arr.length;i++) {
    		sum+= arr[i];
    		sum-= arr[j++];
    		maxSum = Math.max(maxSum, sum);
    	}
    	
        return maxSum;
    }
}