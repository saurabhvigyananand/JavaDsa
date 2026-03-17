package DSA.Array.Basics.ArrayTraversal;

/*
Problem Title: Strongest and Weakest Soldier

Concept / Behaviour Tested:
Array Traversal
Min-Max Tracking (Single Pass Optimization)

Story:
A king has N soldiers. Each soldier has a strength value.

The king wants to find:
1. The strongest soldier (maximum strength)
2. The weakest soldier (minimum strength)

You are given an array where each element represents
the strength of a soldier.

Your task is to find BOTH the minimum and maximum strength.

Input Example:
N = 6
strength = [5, 8, 11, 14, 6, 7]

Output:
Min = 5
Max = 14

Constraints:
1 ≤ N ≤ 100000
-10^9 ≤ strength[i] ≤ 10^9

Task:
Implement the following method:

public static void findMinMax(int[] strength)

Rules:
- Do not use built-in functions
- Solve in a single traversal

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(1)
*/

public class o4_StrongestWeakest {

    public static void main(String[] args) {

        int[] strength = {5, 8, 11, 14, 6, 7};

        findMinMax(strength);

    }

    public static void findMinMax(int[] strength) {

        if(strength == null || strength.length == 0) {
            System.out.println("Min = 0");
            System.out.println("Max = 0");
            return;
        }

        int strong = strength[0];
        int weak = strength[0];

        for(int i = 1; i < strength.length; i++) {

            if(strength[i] > strong) {
                strong = strength[i];
            }

            if(strength[i] < weak) {
                weak = strength[i];
            }
        }

        System.out.println("Min = " + weak);
        System.out.println("Max = " + strong);
    }
}