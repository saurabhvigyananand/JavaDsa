package DSA.Array.Basics.ArrayTraversal;

/*
Problem Title: Second Strongest Soldier

Concept / Behaviour Tested:
Array Traversal
Max Tracking
Edge Case Handling

Story:
A king wants to select the second strongest soldier for a special mission.

Each soldier has a strength value.

Your task is to find the SECOND maximum element in the array.

Input Example:
N = 6
strength = [5, 8, 11, 14, 6, 7]

Output:
11

Explanation:
Max = 14
Second Max = 11

Constraints:
1 ≤ N ≤ 100000
-10^9 ≤ strength[i] ≤ 10^9

Task:
Implement the following method:

public static int secondMax(int[] strength)

Rules:
- Do not sort the array ❌
- Solve in single traversal ✔️

Expected Time Complexity:
O(N)

Expected Space Complexity:
O(1)
*/

public class o5_SecondStrongest {

    public static void main(String[] args) {

        int[] strength = {5, 8, 11, 14, 6, 7};

        int result = secondMax(strength);

        System.out.println(result);

    }

    public static int secondMax(int[] strength) {

        if (strength == null || strength.length < 2) {
            return -1;
        }

        int strong = Integer.MIN_VALUE;
        int secStrong = Integer.MIN_VALUE;

        int i = 0;

        while (i < strength.length) {

            if (strength[i] > strong) {
                secStrong = strong;
                strong = strength[i];
            }
            else if (strength[i] < strong && strength[i] > secStrong) {
                secStrong = strength[i];
            }

            i++;
        }

        return secStrong == Integer.MIN_VALUE ? -1 : secStrong;
    }
}