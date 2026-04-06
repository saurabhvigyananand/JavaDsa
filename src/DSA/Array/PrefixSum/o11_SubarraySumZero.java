package DSA.Array.PrefixSum;
import java.util.*;

public class o11_SubarraySumZero {

    public static void main(String[] args) {

        int[] nums = {1, -1, 2, -2};

        int result = countSubarrays(nums);
        System.out.println(result); // Expected Output: 3
    }

    /*
     * Question:
     * Given an integer array nums,
     * return the total number of subarrays whose sum is equal to 0.
     *
     * A subarray is a contiguous part of the array.
     *
     * Example:
     * nums = {1, -1, 2, -2}
     * Output: 3
     */

    public static int countSubarrays(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return 0;
    	}
        // Write your code here
    	int sum =0;
    	int count =0;
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(0, 1);
    	
    	for(int i =0 ;i<nums.length;i++) {
    		sum+= nums[i];
    		
    		if(map.containsKey(sum)) {
    			count+=map.get(sum);
    		}
    		map.put(sum,map.getOrDefault(sum,0)+1);
    	}
        return count;
    }
}