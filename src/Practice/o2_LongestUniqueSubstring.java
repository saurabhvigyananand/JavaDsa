package Practice;

import java.util.HashSet;
import java.util.Set;

/*
Problem Title: Longest Substring Without Repeating Characters

Concept:
Variable Size Sliding Window

Task:
Given a string s,
find the length of the longest substring
without repeating characters.

Input:
s = "abcabcbb"

Output:
3

Explanation:
"abc" is the longest substring without repeating characters.

Constraints:
1 ≤ s.length ≤ 100000
*/

public class o2_LongestUniqueSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = longestUnique(s);
        System.out.println(result);
    }

    public static int longestUnique(String s) {
        // Write your code here
    	Set<Character> set = new HashSet<>();
    	int maxLen = 0;
    	int left = 0;
    	
    	for(int right =0;right<s.length();right++) {
    		while(set.contains(s.charAt(right))) {
    			set.remove(s.charAt(left));
    			left++;
    		}
    		set.add(s.charAt(right));
    		maxLen =Math.max(maxLen, right-left+1);
    	}
    	return maxLen;
    }
}