package DSA.Array.PrefixSum;

import java.util.*;

/*
Problem Title: Divisible Subarray Challenge

Concept / Behaviour Tested:
Prefix Sum
HashMap
Modulo Arithmetic
Handling Negative Numbers

Story:
A data analyst is given an array of integers representing daily profit and loss.
He wants to analyze patterns where the total sum of a continuous period is divisible by a given number k.

Your task is to help him find the longest such period.

You are given:
- An integer array nums[] containing both positive and negative numbers
- An integer k

Find the length of the longest subarray whose sum is divisible by k.

Input Example:
nums = [2, 7, 6, 1, 4, 5]
k = 3

Output:
4

Explanation:
Subarray [7, 6, 1, 4] → sum = 18 → divisible by 3 → length = 4

Example 2:
nums = [-2, 2, -5, 12, -11, -1, 7]
k = 3

Output:
5

Constraints:
1 ≤ nums.length ≤ 100000
-10000 ≤ nums[i] ≤ 10000
1 ≤ k ≤ 10000

Task:
Implement the following method:

public static int longestSubarrayDivisibleByK(int[] nums, int k)

Rules:
- Subarray must be contiguous
- Return only the length
- Optimize for large input size

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(N)
*/

public class o14_DivisibleSubarray {

    public static void main(String[] args) {

        int[] nums = {2, 7, 6, 1, 4, 5};
        int k = 3;

        int result = longestSubarrayDivisibleByK(nums, k);
        System.out.println(result);
    }

    public static int longestSubarrayDivisibleByK(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        // Write your code here
        int sum = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        
        for(int i =0;i<nums.length; i++) {
        	sum += nums[i];
        	int mod = sum %k;
        	
        	if( mod< 0) {
        		mod = (mod +k)%k;
        	}
        	if(map.containsKey(mod)) {
        		maxLen = Math.max(maxLen, i - map.get(mod));
        	}
        	
        	if(!map.containsKey(mod)) {
        		map.put(mod, i);
        	}
        }
        
        return maxLen;
    }
}