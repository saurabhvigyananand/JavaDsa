package Practice;

import java.util.HashMap;
import java.util.Map;

/*
Problem Title: Longest Repeating Character Replacement

Concept / Behaviour Tested:
Variable Size Sliding Window
Frequency Map
Window Validation Logic

Story:
You are given a string consisting of uppercase English letters.

You can replace at most k characters in the string.

Your task is to find the length of the longest substring
that can become completely same characters
after performing at most k replacements.

Input:
s = "AABABBA"
k = 1

Output:
4

Explanation:
Substring:
"AABA"

Replace one 'B' with 'A'

Result:
"AAAA"

Length = 4

Another valid substring:
"ABBA"
Replace one 'A' with 'B'
→ "BBBB"

Constraints:
1 ≤ s.length ≤ 100000
0 ≤ k ≤ s.length

Task:
Implement the following method:

public static int characterReplacement(String s, int k)

Rules:
- Use Sliding Window approach
- Optimize to O(N)

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(1)
*/

public class o4_CharacterReplacement {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);

        System.out.println(result);
    }

    public static int characterReplacement(String s, int k) {
    	Map<Character, Integer> map =  new HashMap<>();
        // Write your code here
    	int maxlen =0;
    	int left =0;
    	int maxFreq = 0;
    	
    	for(int right =0;right<s.length();right++) {
    		char rightChar = s.charAt(right);
    		map.put(rightChar, map.getOrDefault(rightChar, 0)+1);
    		
    		maxFreq= Math.max(maxFreq, map.get(rightChar));
    		
    		while((right-left+1)-maxFreq>k) {
    			char leftChar = s.charAt(left);
    			map.put(leftChar, map.get(leftChar)-1);
    			
    			if(map.get(leftChar)==0) {
    				map.remove(leftChar);
    			}
    			left++;
    		}
    		maxlen = Math.max(maxlen, right-left+1);
    	}
        return maxlen;
    }
}