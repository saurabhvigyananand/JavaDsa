package DSA.Array.PrefixSum;

import java.util.Arrays;

/*
Problem Title: Kingdom Tax Collection

Concept / Behaviour Tested:
Prefix Sum
Range Sum Query
Preprocessing Optimization

Story:
A kingdom has N cities. Each city generates some amount of tax.

The king receives Q queries. Each query asks:
"What is the total tax collected from city L to city R (inclusive)?"

You are given:
- An array tax[] where tax[i] represents tax collected from city i
- Q queries where each query contains two integers L and R

Your task is to answer all queries efficiently.

Input Example:
N = 6
tax = [2, 4, 6, 8, 10, 12]

Q = 3
queries:
(0, 2)
(1, 4)
(3, 5)

Output:
12
28
30

Explanation:
(0,2) → 2+4+6 = 12
(1,4) → 4+6+8+10 = 28
(3,5) → 8+10+12 = 30

Constraints:
1 ≤ N, Q ≤ 100000
0 ≤ tax[i] ≤ 10^9

Task:
Implement the following methods:

1. public static int[] buildPrefix(int[] tax)
2. public static int rangeSum(int[] prefix, int l, int r)

Rules:
- Build prefix array only once
- Each query must run in O(1)

Expected Time Complexity:
O(N + Q)

Expected Space Complexity:
O(N)
*/

public class o5_KingdomTax {

    public static void main(String[] args) {

        int[] tax = {2, 4, 6, 8, 10, 12};

        int[][] queries = {
            {0, 2},
            {1, 4},
            {3, 5}
        };

        int[] prefix = buildPrefix(tax);

        for (int[] q : queries) {
            int ans = rangeSum(prefix, q[0], q[1]);
            System.out.println(ans);
        }
    }

    public static int[] buildPrefix(int[] tax) {
    	int[] prefix = new int [tax.length];
        // Write your code
    	prefix[0] = tax[0];
    	for(int i=1;i<tax.length;i++) {
    		prefix[i]= prefix[i-1]+ tax[i];
    	}
    	System.out.println(Arrays.toString(prefix) );;
    	return prefix;
    }

    public static int rangeSum(int[] prefix, int l, int r) {
    	if(l ==0) {
    		return prefix[r];
    	}
        // Write your code
    	return prefix[r] - prefix[l-1];
    }
}