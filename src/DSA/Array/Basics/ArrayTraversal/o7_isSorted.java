package DSA.Array.Basics.ArrayTraversal;

/*
 * ============================================================ 
 * Problem 3: Check if an Array is Sorted Difficulty: Easy Pattern: Array Traversal
 * ============================================================
 *
 * Problem Statement:
 *
 * Given an integer array, determine whether the array is sorted in
 * NON-DECREASING order.
 *
 * Return true if the array is sorted. Otherwise, return false.
 *
 * Note: Duplicate elements are allowed.
 *
 * ------------------------------------------------------------ 
 * Examples
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input: arr = {1, 2, 3, 4, 5}
 *
 * Output: true
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input: arr = {1, 2, 2, 3, 5}
 *
 * Output: true
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input: arr = {1, 5, 3, 4}
 *
 * Output: false
 *
 * ------------------------------------------------------------
 *
 * Example 4:
 *
 * Input: arr = {10}
 *
 * Output: true
 *
 * ------------------------------------------------------------
 *
 * Example 5:
 *
 * Input: arr = {}
 *
 * Output: true
 *
 * ------------------------------------------------------------
 *
 * Example 6:
 *
 * Input: arr = {-5, -3, -3, 0, 7}
 *
 * Output: true
 *
 * ------------------------------------------------------------
 *
 * Constraints:
 *
 * 0 <= arr.length <= 100000 -10^9 <= arr[i] <= 10^9
 *
 * ------------------------------------------------------------
 *
 * Expected Complexity:
 *
 * Time : O(n) Space : O(1)
 *
 * ------------------------------------------------------------
 *
 * Rules:
 *
 * 1. Do NOT sort the array. 2. Do NOT use Collections.sort(). 3. Do NOT use
 * Streams. 4. Traverse the array only once.
 *
 * ------------------------------------------------------------
 *
 * Prerequisites:
 *
 * ✓ Arrays Basics ✓ Array Traversal ✓ Comparison Operators ✓ Time Complexity
 * O(n)
 *
 * ------------------------------------------------------------
 *
 * Asked In:
 *
 * Frequently Asked By:
 *
 * ✓ TCS ✓ Infosys ✓ Wipro ✓ Cognizant ✓ Capgemini ✓ Accenture
 *
 * Also Asked (or Variations Asked) In:
 *
 * ✓ Amazon ✓ Microsoft ✓ Google ✓ Oracle ✓ Adobe ✓ Samsung
 *
 * Note: This is one of the most fundamental array interview questions. Almost
 * every company has asked this problem directly or as a follow-up.
 *
 * ------------------------------------------------------------
 *
 * Think Before Coding:
 *
 * 1. What condition makes an array unsorted? 
 * 2. Can you stop checking immediately after finding an unsorted pair? 
 * 3. Should duplicate values be considered sorted? 4. What should happen if the array is empty? 
 * 5. What should happen if the array has only one element?
 *
 * ------------------------------------------------------------
 *
 * Your Solution:
 *
 */

public class o7_isSorted {

	public static void main(String[] args) {
//		int []arr = {1, 2, 3, 4, 5};
//		int []arr = {1, 2, 2, 3, 5};
//		int[] arr = {1, 5, 3, 4};
//		int [] arr = {10};
//		int [] arr = {};
		int[] arr = { -5, -3, -3, 0, 7 };

		System.out.println(isSorted(arr));
	}

	public static boolean isSorted(int[] arr) {

		// Write your code here
		if (arr == null || arr.length < 2) {
			return true;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}
}

/*
 * ------------------------------------------------------------
 *
 * Dry Run:
 *  
 *
 * ------------------------------------------------------------
 *
 * Time Complexity:
 * 
 * We compare each adjacent pair exactly once. In the worst case, if the array
 * is completely sorted, we traverse all n elements once. Therefore the time
 * complexity is O(n).
 *
 * ------------------------------------------------------------
 *
 * Space Complexity:
 *
 * The algorithm does not use any extra data structure whose size depends on the
 * input. Therefore the auxiliary space complexity is O(1).
 *
 * ------------------------------------------------------------
 *
 * Interview Explanation: I traverse the array from the second element because I
 * need to compare each element with its previous element. If I find any
 * adjacent pair where the previous element is greater than the current element,
 * I immediately return false because the array is no longer sorted. If the loop
 * completes without finding any violation, I return true. This solution
 * requires one traversal, so the time complexity is O(n) and the auxiliary
 * space complexity is O(1).
 *
 * ------------------------------------------------------------
 *
 * Common Mistakes:
 *
 * 1. Starting the loop from index 0.
 * 
 * 2. Using >= instead of > and incorrectly rejecting duplicate values.
 * 
 * 3. Traversing the entire array even after finding an unsorted pair instead of
 * returning immediately.
 * 
 * ------------------------------------------------------------
 *
 * Edge Cases to Test:
 *
 * 1. Empty Array
 *
 * 2. Single Element
 *
 * 3. All Elements Same
 *
 * 4. Already Sorted
 *
 * 5. Descending Order
 *
 * 6. Duplicate Elements
 *
 * 7. Negative Numbers
 *
 * ------------------------------------------------------------
 *
 * Interview Variations:
 *
 * 1. Check if array is sorted in strictly increasing order.
 * 
 * arr[i - 1] >= arr[i]  this condition will make it strictly increasing order.
 *
 * 2. Check if array is sorted in descending order.
 *
 * 3. Find the first index where sorting breaks.
 * 	
 * (arr[i - 1] > arr[i]) -> for this condition I'll return index i, and outside the loop -1.
 *
 * 4. Check whether the array can become sorted after swapping exactly one pair.
 *
 * 5. Check whether the array can become sorted after removing one element.
 *
 * ------------------------------------------------------------
 *
 * Follow-up Questions:
 *
 * Q1. Can you solve it recursively?
 *
 * Q2. Can you solve it using Java Streams?
 *
 * Q3. How would you check descending order?
 *
 * Q4. Why is the time complexity O(n)?
 *
 * Q5. Why is the space complexity O(1)?
 *
 * ------------------------------------------------------------
 *
 * Java Concepts Used:
 *
 * ✓ Arrays ✓ for Loop ✓ if Statement ✓ Relational Operators ✓ boolean ✓ Early
 * Return
 *
 * ------------------------------------------------------------
 *
 * Real-world Analogy:
 *
 * Imagine checking the marks of students arranged from lowest to highest.
 *
 * As soon as you find one student whose marks are lower than the previous
 * student, you immediately know the list is not sorted.
 *
 * There is no need to check the remaining students.
 *
 * ------------------------------------------------------------
 *
 * Notes / Learning:
 *
 *
 *
 * ============================================================
 */
