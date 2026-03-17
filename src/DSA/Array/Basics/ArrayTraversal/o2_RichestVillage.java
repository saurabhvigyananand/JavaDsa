package DSA.Array.Basics.ArrayTraversal;

/*
Problem Title: Richest Village

Concept / Behaviour Tested:
Array Traversal
Accumulation Pattern (Running Sum)

Story:
A kingdom has N villages. Each village produces some amount of wheat every year.
The king wants to know the total wheat production of the kingdom.

You are given an array where each element represents
the wheat produced by each village.

Your task is to calculate the total wheat production.

Input Example:
N = 5
wheat = [10, 20, 30, 40, 50]

Output:
150

Explanation:
Total wheat production = 10 + 20 + 30 + 40 + 50 = 150

Constraints:
1 ≤ N ≤ 100000
0 ≤ wheat[i] ≤ 10^6

Task:
Implement the following method:

public static int totalWheat(int[] wheat)

Rules:
- Do not use streams
- Do not use built-in sum functions
- Use loop logic

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(1)
*/

public class o2_RichestVillage {

    public static void main(String[] args) {

        int[] wheat = {10, 20, 30, 40, 50};

        int result = totalWheat(wheat);

        System.out.println(result);

    }

    public static int totalWheat(int[] wheat) {

        // Write your solution here
    	if(wheat == null || wheat.length==0) {
    		return 0;
    	}
    	int sum = 0;
    	for(int i : wheat) {
    		sum+= i;
    	}

        return sum;

    }
}