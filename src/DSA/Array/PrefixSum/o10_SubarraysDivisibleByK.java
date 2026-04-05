package DSA.Array.PrefixSum;
import java.util.*;

public class o10_SubarraysDivisibleByK {

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int result = subarraysDivByK(nums, k);
        System.out.println(result); // Expected Output: 7
    }

    /*
     * Question:
     * Given an integer array nums and an integer k,
     * return total number of subarrays whose sum is divisible by k.
     *
     * Example:
     * nums = {4, 5, 0, -2, -3, 1}, k = 5
     * Output: 7
     */

    public static int subarraysDivByK(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int modulo = sum % k;
            if (modulo < 0) {
                modulo += k;
            }

            if (map.containsKey(modulo)) {
                count += map.get(modulo);
            }

            map.put(modulo, map.getOrDefault(modulo, 0) + 1);
        }

        return count;
    }
}