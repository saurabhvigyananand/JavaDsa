package DSA.Array.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/*
Problem Title: Longest Substring Without Repeating Characters

Concept:
Variable Size Sliding Window

Story:
You are given a string.
Find the length of the longest substring without repeating characters.

Input:
s = "abcabcbb"

Output:
3

Explanation:
"abc" is the longest substring without repeating characters.

Other Examples:
Input: "bbbbb" → Output: 1
Input: "pwwkew" → Output: 3 ("wke")

Constraints:
1 ≤ s.length ≤ 100000
*/

public class o17_LongestSubstringUnique {

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = longestUnique(s);
        System.out.println(result);
    }

    public static int longestUnique(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}