package DSA.Array.Basics.ArrayTraversal;

/*
Problem Title: Even Soldiers

Concept / Behaviour Tested:
Array Traversal
Counting Pattern

Story:
A king has N soldiers standing in a line.
Each soldier has a strength value.

The king wants to know how many soldiers have an EVEN strength
because those soldiers will be selected for a special mission.

You are given an array where each element represents
the strength of a soldier.

Your task is to count how many soldiers have EVEN strength.

Input Example:
N = 6
strength = [5, 8, 11, 14, 6, 7]

Output:
3

Explanation:
Even numbers are: 8, 14, 6
Total even soldiers = 3

Constraints:
1 ≤ N ≤ 100000
0 ≤ strength[i] ≤ 10^9

Task:
Implement the following method:

public static int countEvenSoldiers(int[] strength)

Rules:
- Do not use streams
- Use loop logic

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(1)
*/

public class o3_EvenSoldiers {

    public static void main(String[] args) {

        int[] strength = {5, 8, 11, 14, 6, 7};

        int result = countEvenSoldiers(strength);

        System.out.println(result);

    }

    public static int countEvenSoldiers(int[] strength) {

        // Write your solution here
    	int count =0;
    	if(strength == null || strength.length ==0) {
    		return count;
    	}
    	for(int s:strength) {
    		if(s%2 ==0) {
    			count++;
    		}
    	}

        return count;

    }
}
