package Practice;

import java.util.HashMap;
import java.util.Map;

/*
Problem Title: Longest Substring with At Most K Distinct Characters

Concept:
Variable Size Sliding Window

Task:
Given a string s and an integer k,
return the length of the longest substring
that contains at most k distinct characters.

Input:
s = "eceba"
k = 2

Output:
3

Explanation:
"ece" contains only 2 distinct characters.

Constraints:
1 ≤ s.length ≤ 100000
1 ≤ k ≤ 26
*/

public class o3_LongestKDistinct {

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;

        int result = longestKDistinct(s, k);
        System.out.println(result);
    }

    public static int longestKDistinct(String s, int k) {
    	Map<Character, Integer> map = new HashMap<>();
        // Write your code here
    	int maxlen = 0;
    	int left =0;
    	
    	for(int right =0;right<s.length();right++) {
    		map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
    		
    		while(map.size()>k) {
    			char leftchr= s.charAt(left);
    			map.put(leftchr, map.get(leftchr)-1);
    			
    			if(map.get(leftchr)==0) {
    				map.remove(leftchr);
    			}
    			left++;
    		}    		
    		maxlen=Math.max(maxlen, right-left+1);
    	}
        return maxlen;
    }
}