package DSA.Array.PrefixSum;

import java.util.*;

/*
Problem Title: Subarray Sum Equals K

Concept / Behaviour Tested:
Prefix Sum
HashMap
Counting Pattern

Problem:
Given an integer array nums[] and an integer k,
return the total number of subarrays whose sum equals to k.

-----------------------------------------------------

Input:
nums = [1,1,1]
k = 2

Output:
2

Explanation:
Subarrays:
[1,1] (index 0-1)
[1,1] (index 1-2)

-----------------------------------------------------

Input:
nums = [1,2,3]
k = 3

Output:
2

Explanation:
[1,2] and [3]

-----------------------------------------------------

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(N)

-----------------------------------------------------

Task:
Implement the function below
*/

public class o9_SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1,1,1};
        int k = 2;

        int result = countSubarrays(nums, k);

        System.out.println(result);
    }

    public static int countSubarrays(int[] nums, int k) {

        if (nums == null || nums.length == 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        map.put(0, 1); // important

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // FIX 1
            }

            // FIX 2: update frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}