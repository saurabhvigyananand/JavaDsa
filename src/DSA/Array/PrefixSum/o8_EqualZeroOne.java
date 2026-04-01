package DSA.Array.PrefixSum;

import java.util.*;

/*
Problem Title: Longest Subarray with Equal 0s and 1s

Concept / Behaviour Tested:
Prefix Sum
HashMap
Transformation Trick

Problem:
Given a binary array (only 0s and 1s),
find the length of the longest subarray where number of 0s and 1s are equal.

Input Example:
arr = [0,1,0,1,1,0]

Output:
6

Explanation:
Entire array has equal number of 0s and 1s → length = 6

-----------------------------------------------------

Another Example:
arr = [0,1,1,0,1]

Output:
4

Explanation:
Subarray [0,1,1,0] → 2 zeros & 2 ones → length = 4

-----------------------------------------------------

Hint:
Replace 0 with -1
Then problem becomes:
Find longest subarray with sum = 0

-----------------------------------------------------

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(N)

-----------------------------------------------------

Task:
Implement the function below
*/

public class o8_EqualZeroOne {

    public static void main(String[] args) {

        int[] arr = {0,1,0,1,1,0};

        int result = longestSubarray(arr);

        System.out.println(result);
    }

    public static int longestSubarray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;
       

        // Important: handle sum = 0 case
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
 
            // convert 0 → -1
            if (arr[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int len = i - prevIndex;
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i); // store first occurrence only
            }
        }

        return maxLen;
    }
}