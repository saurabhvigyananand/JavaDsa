package DSA.Array.SlidingWindow;

/*
Problem Title: Minimum Sum Subarray of Size K

Concept:
Fixed Size Sliding Window

Story:
You are given an array of integers representing daily expenses.
You want to find the minimum total expense over any consecutive k days.

Your task is to find the minimum sum of any subarray of size k.

Input:
arr = [2, 1, 5, 1, 3, 2]
k = 3

Output:
7

Explanation:
Subarrays:
[2,1,5] = 8
[1,5,1] = 7  <-- min
[5,1,3] = 9
[1,3,2] = 6  <-- actually this is smaller → output should be 6

(Correct Output: 6)

Constraints:
1 ≤ arr.length ≤ 100000
*/

public class o16_MinSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = minSum(arr, k);
        System.out.println(result);
    }

    public static int minSum(int[] arr, int k) {
        // Write your code here
    	int minSum = 0;
    	int sum =0;
    	for(int i =0;i<k;i++) {
    		sum += arr[i];
    	}
    	minSum = sum;
    	int j =0;
    	for(int i = k;i<arr.length;i++) {
    		sum+=arr[i];
    		sum-=arr[j++];
    		minSum = Math.min(sum, minSum);
    	}

        return minSum;
    }
}