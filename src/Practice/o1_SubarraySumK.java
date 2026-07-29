package Practice;

import java.util.HashMap;
import java.util.Map;

/*
Problem Title: Subarray Sum Equals K

Concept:
Prefix Sum + HashMap

Task:
Given an integer array nums and an integer k,
return the total number of subarrays whose sum equals k.

Input:
nums = [1, 1, 1]
k = 2

Output:
2

Explanation:
Subarrays:
[1,1] (index 0-1)
[1,1] (index 1-2)

Constraints:
1 ≤ nums.length ≤ 100000
-1000 ≤ nums[i] ≤ 1000
*/

public class o1_SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = countSubarrays(nums, k);
        System.out.println(result);
    }

    public static int countSubarrays(int[] nums, int k) {

        // Write your code here
    	Map<Integer,Integer> map = new HashMap<>();
    	map.put(0, 1);
    	
    	int sum =0;
    	int count =0;
    	
    	for(int i =0;i<nums.length;i++) {
    		sum+=nums[i];
    		
    		if(map.containsKey(sum-k)) {
    			count+=map.get(sum-k);
    		}
    		map.put(sum, map.getOrDefault(sum, 0)+1);
    	}
    	return count;
    }
}