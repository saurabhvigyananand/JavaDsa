package DSA.Array.PrefixSum;
import java.util.*;

public class o12_EqualZeroOneSubarrays {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 1, 1, 0};

        int result = countSubarrays(nums);
        System.out.println(result); // Expected Output: 8
    }

    /*
     * Question:
     * Given a binary array nums (containing only 0s and 1s),
     * return the total number of subarrays with equal number of 0s and 1s.
     *
     * A subarray is a contiguous part of the array.
     *
     * Example:
     * nums = {0, 1, 0, 1, 1, 0}
     * Output: 7
     */

    public static int countSubarrays(int[] nums) {
    	int len = nums.length;
    	if(nums == null || len == 0) {
    		return 0;
    	}
        // Write your code here

    	int sum =0;
    	int count =0;
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(0, 1);
    	
    	for(int i =0 ;i<len;i++) {
    		if(nums[i]==0) {
    			sum += -1;
    		}else {
    			sum +=1;
    		}
    		
    		if(map.containsKey(sum)) {
    			count += map.get(sum);
    		}
    		
    		map.put(sum, map.getOrDefault(sum, 0)+1);
    	}
    	
        return count;
    }
}