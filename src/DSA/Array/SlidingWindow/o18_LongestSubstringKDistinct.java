package DSA.Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
Problem Title: Longest Substring with At Most K Distinct Characters

Concept:
Variable Size Sliding Window

Story:
You are given a string and an integer k.
Find the length of the longest substring that contains at most k distinct characters.

Input:
s = "eceba"
k = 2

Output:
3

Explanation:
The longest substring is "ece" which contains only 2 distinct characters.

Other Examples:
Input: "aa" , k = 1 → Output: 2
Input: "aabbcc", k = 2 → Output: 4 ("aabb" or "bbcc")

Constraints:
1 ≤ s.length ≤ 100000
1 ≤ k ≤ 26
*/

public class o18_LongestSubstringKDistinct {

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;

        int result = longestKDistinct(s, k);
        System.out.println(result);
    }

    public static int longestKDistinct(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // expand
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink
            while (map.size() > k) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            // update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}