package DSA.Array.SlidingWindow;

import java.util.*;

/*
Problem Title: Longest Repeating Character Replacement

Concept:
Variable Size Sliding Window

Story:
You are given a string consisting of only uppercase English letters.
You can replace at most k characters in the string.

Find the length of the longest substring that can be formed
such that all characters in the substring are the same.

Input:
s = "AABABBA"
k = 1

Output:
4

Explanation:
Replace one 'B' → "AAAA" (or "BBBB")
Longest length = 4

Constraints:
1 ≤ s.length ≤ 100000
0 ≤ k ≤ s.length
*/

public class o19_CharacterReplacement {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);
        System.out.println(result);
    }

    public static int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // 1. count update
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // 2. update maxFreq
            maxFreq = Math.max(maxFreq, map.get(ch));

            // 3. check invalid condition
            if((right-left+1)-maxFreq > k) {
            // 4. shrink if needed
            	char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            // 5. update maxLen
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}