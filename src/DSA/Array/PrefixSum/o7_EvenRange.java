package DSA.Array.PrefixSum;

import java.util.Arrays;

/*
Problem Title: Even Numbers in Range

Concept / Behaviour Tested:
Prefix Sum
Counting Pattern
Range Query Optimization

Story:
A teacher has N students. Each student has a roll number.

The teacher receives Q queries. Each query asks:
"How many students have EVEN roll numbers between index L and R?"

You are given:
- An array arr[] where arr[i] represents roll number
- Q queries (L, R)

Your task is to answer all queries efficiently.

Input Example:
N = 6
arr = [1, 2, 3, 4, 5, 6]

Q = 3
queries:
(0, 3)
(2, 5)
(1, 4)

Output:
2
2
2

Explanation:
(0,3) → [1,2,3,4] → even = 2
(2,5) → [3,4,5,6] → even = 2
(1,4) → [2,3,4,5] → even = 2

Constraints:
1 ≤ N, Q ≤ 100000

Task:
Implement:

1. buildEvenPrefix()
2. countEvenInRange()

Expected Time Complexity:
O(N + Q)
*/

public class o7_EvenRange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[][] queries = {
            {0, 3},
            {2, 5},
            {1, 4}
        };

        int[] prefix = buildEvenPrefix(arr);

        for (int[] q : queries) {
            System.out.println(countEvenInRange(prefix, q[0], q[1]));
        }
    }

    public static int[] buildEvenPrefix(int[] arr) {
    	int [] prefix = new int [arr.length];
    	if(arr == null || arr.length==0) {
    		return prefix;
    	}
    	prefix[0]= arr[0]% 2 == 0? 1:0;
        // Write your code
    	for(int i =1;i<arr.length;i++) {
    		if(arr[i] % 2 == 0) {
    			prefix[i] = prefix[i-1] + 1;
    		}else {
    			prefix[i] = prefix[i-1];
    		}
    	}
    	System.out.println(Arrays.toString(prefix));
        return prefix;
    }

    public static int countEvenInRange(int[] prefix, int l, int r) {
    	int count =0;
        // Write your code
    	if(l==0) {
    		return prefix[r];
    	}
        return prefix[r] - prefix[l-1];
    }
}