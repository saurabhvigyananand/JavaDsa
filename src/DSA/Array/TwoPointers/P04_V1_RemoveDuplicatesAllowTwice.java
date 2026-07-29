package DSA.Array.TwoPointers;

/*
 * ============================================================
 * Problem 4 - Variation 1:
 * Remove Duplicates from Sorted Array II
 *
 * Difficulty: Medium
 * Pattern: Two Pointers
 *
 * Derived From:
 * P04_RemoveDuplicatesFromSortedArray
 * ============================================================
 *
 * Problem Statement:
 *
 * Given a sorted integer array, remove the duplicate elements
 * in-place such that each distinct element appears
 * at most TWICE.
 *
 * Return the number of valid elements after modification.
 *
 * The first k elements of the array should contain the
 * final result in the same relative order.
 *
 * Modify the input array in-place.
 *
 * ------------------------------------------------------------
 * Examples
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input:
 * arr = {1,1,1,2,2,3}
 *
 * Output:
 * k = 5
 *
 * Array:
 * {1,1,2,2,3,_}
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * arr = {0,0,1,1,1,1,2,3,3}
 *
 * Output:
 * k = 7
 *
 * Array:
 * {0,0,1,1,2,3,3,_,_}
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * arr = {5}
 *
 * Output:
 * k = 1
 *
 * Array:
 * {5}
 *
 * ------------------------------------------------------------
 *
 * Example 4:
 *
 * Input:
 * arr = {}
 *
 * Output:
 * k = 0
 *
 * ------------------------------------------------------------
 *
 * Example 5:
 *
 * Input:
 * arr = {2,2,2,2,2}
 *
 * Output:
 * k = 2
 *
 * Array:
 * {2,2,_,_,_}
 *
 * ------------------------------------------------------------
 *
 * Example 6:
 *
 * Input:
 * arr = {-3,-3,-3,-2,-2,-1}
 *
 * Output:
 * k = 5
 *
 * Array:
 * {-3,-3,-2,-2,-1,_}
 *
 * ------------------------------------------------------------
 *
 * Constraints:
 *
 * 0 <= arr.length <= 100000
 * -10^9 <= arr[i] <= 10^9
 *
 * The array is sorted in non-decreasing order.
 *
 * ------------------------------------------------------------
 *
 * Expected Complexity:
 *
 * Time  : O(n)
 * Space : O(1)
 *
 * ------------------------------------------------------------
 *
 * Rules:
 *
 * 1. Do NOT create another array.
 * 2. Do NOT use HashMap or HashSet.
 * 3. Do NOT use Collections.
 * 4. Do NOT use Java Streams.
 * 5. Modify the array in-place.
 *
 * ------------------------------------------------------------
 *
 * Prerequisites:
 *
 * ✓ Remove Duplicates from Sorted Array
 * ✓ Two Pointers
 * ✓ Array Traversal
 * ✓ In-place Modification
 *
 * ------------------------------------------------------------
 *
 * Asked In:
 *
 * Frequently Asked By:
 *
 * ✓ Amazon
 * ✓ Microsoft
 * ✓ Google
 * ✓ Meta
 * ✓ Bloomberg
 *
 * Also Asked (or Variations Asked) In:
 *
 * ✓ Adobe
 * ✓ Oracle
 * ✓ Samsung
 * ✓ VMware
 * ✓ Goldman Sachs
 *
 * Note:
 *
 * This is the direct follow-up of
 * Remove Duplicates from Sorted Array.
 *
 * ------------------------------------------------------------
 *
 * Think Before Coding:
 *
 * 1. Why doesn't the previous solution work?
 *
 * 2. What does the write pointer represent?
 *
 * 3. Why do we compare with j - 2 instead of j - 1?
 *
 * 4. Do we really need a counter?
 *
 * 5. What should happen if the array length is
 *    less than or equal to 2?
 *
 * ------------------------------------------------------------
 *
 * Your Solution:
 *
 */

public class P04_V1_RemoveDuplicatesAllowTwice {

	public static void main(String[] args) {

//		int[] arr = {1,1,1,2,2,3};
//		int[] arr = {0,0,1,1,1,1,2,3,3};
//		int[] arr = {5};
//		int[] arr = {};
//		int[] arr = {2,2,2,2,2};
		int[] arr = {-3,-3,-3,-2,-2,-1};

		int k = removeDuplicates(arr);

		System.out.println("k = " + k);

		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int removeDuplicates(int[] arr) {

		// Write your code here

		return 0;
	}

}

/*
 * ------------------------------------------------------------
 *
 * Dry Run:
 *
 *
 *
 * ------------------------------------------------------------
 *
 * Time Complexity:
 *
 *
 *
 * ------------------------------------------------------------
 *
 * Space Complexity:
 *
 *
 *
 * ------------------------------------------------------------
 *
 * Interview Explanation:
 *
 *
 *
 * ------------------------------------------------------------
 *
 * Common Mistakes:
 *
 * 1.
 *
 * 2.
 *
 * 3.
 *
 * ------------------------------------------------------------
 *
 * Edge Cases to Test:
 *
 * 1. Empty Array
 *
 * 2. Single Element
 *
 * 3. Array with Exactly Two Occurrences
 *
 * 4. Array with More Than Two Occurrences
 *
 * 5. No Duplicate Elements
 *
 * 6. Negative Numbers
 *
 * ------------------------------------------------------------
 *
 * Follow-up Questions:
 *
 * Q1. Why doesn't the original condition
 *     (arr[j] != arr[i]) work?
 *
 * Q2. Why is j - 2 used instead of j - 1?
 *
 * Q3. Can this algorithm be generalized
 *     to allow at most K occurrences?
 *
 * Q4. Can this be solved recursively?
 *
 * Q5. Can this be solved using Java Streams?
 *
 * ------------------------------------------------------------
 *
 * Java Concepts Used:
 *
 * ✓ Arrays
 * ✓ Two Pointers
 * ✓ In-place Modification
 * ✓ Array Traversal
 *
 * ------------------------------------------------------------
 *
 * Real-world Analogy:
 *
 * Imagine a library where each book title
 * is allowed to have at most two copies
 * on the shelf.
 *
 * As books arrive in sorted order, you
 * place a book only if fewer than two
 * copies of that title have already been
 * stored.
 *
 * ------------------------------------------------------------
 *
 * Notes / Learning:
 *
 *
 *
 * ============================================================
 */