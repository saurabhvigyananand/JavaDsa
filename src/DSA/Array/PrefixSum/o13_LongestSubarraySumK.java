package DSA.Array.PrefixSum;
import java.util.*;

public class o13_LongestSubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 6;

        int result = longestSubarray(nums, k);
        System.out.println(result); // Expected Output: 4
    }

    /*
     * Question:
     * Given an integer array nums and an integer k,
     * return the length of the longest subarray whose sum is equal to k.
     *
     * Example:
     * nums = {1, 2, 3, 1, 1, 1, 1}, k = 6
     * Output: 4
     */

    public static int longestSubarray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int len = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                len = Math.max(len, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return len;
    }
}