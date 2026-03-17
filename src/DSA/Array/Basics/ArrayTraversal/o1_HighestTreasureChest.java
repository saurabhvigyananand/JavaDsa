package DSA.Array.Basics.ArrayTraversal;

/*
Problem Title: Highest Treasure Chest

Story:
A pirate island has N treasure chests. Each chest contains some gold coins.
The pirate captain wants to know which chest contains the maximum number of coins.

You are given an array where each element represents
the number of coins present in each chest.

Your task is to find the maximum number of coins.

Input Example:
N = 6
coins = [12, 45, 7, 89, 34, 56]

Output:
89

Constraints:
1 ≤ N ≤ 100000
-10^9 ≤ coins[i] ≤ 10^9

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
*/

public class o1_HighestTreasureChest {

    public static void main(String[] args) {

        int[] coins = {12, 45, 7, 89, 34, 56};

        int result = findMaxCoins(coins);

        System.out.println(result);

    }

    public static int findMaxCoins(int[] coins) {

        // write your logic here
    	if (coins == null || coins.length==0) {
    		return 0;
    	}
    	int result = coins[0];
    	for(int i: coins) {
    		if( result<i) {
    			result = i;
    		}
    	}
        return result;
    }
}