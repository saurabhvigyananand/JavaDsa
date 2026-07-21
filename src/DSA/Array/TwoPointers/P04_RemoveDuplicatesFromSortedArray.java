package DSA.Array.TwoPointers;

/*
 * ============================================================
 * Problem 4: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Pattern: Two Pointers
 * ============================================================
 *
 * Problem Statement:
 *
 * Given a sorted integer array, remove the duplicate elements
 * in-place such that each unique element appears only once.
 *
 * Return the number of unique elements.
 *
 * The first k elements of the array should contain the unique
 * elements in their original order, where k is the number of
 * unique elements.
 *
 * You must modify the input array in-place.
 *
 * ------------------------------------------------------------
 * Examples
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input:
 * arr = {1, 1, 2}
 *
 * Output:
 * k = 2
 * arr = {1, 2, _, _}
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * arr = {0,0,1,1,1,2,2,3,3,4}
 *
 * Output:
 * k = 5
 * arr = {0,1,2,3,4,_,_,_,_,_}
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
 * arr = {5}
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
 * arr = {2,2,2,2}
 *
 * Output:
 * k = 1
 * arr = {2,_,_,_}
 *
 * ------------------------------------------------------------
 *
 * Constraints:
 *
 * 0 <= arr.length <= 100000
 * -10^9 <= arr[i] <= 10^9
 *
 * The array is already sorted.
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
 * 2. Do NOT use HashSet.
 * 3. Do NOT use Collections.
 * 4. Do NOT use Streams.
 * 5. Modify the array in-place.
 *
 * ------------------------------------------------------------
 *
 * Prerequisites:
 *
 * ✓ Arrays Basics
 * ✓ Array Traversal
 * ✓ Time Complexity
 * ✓ Two Pointers (Introduction)
 *
 * ------------------------------------------------------------
 *
 * Asked In:
 *
 * Frequently Asked By:
 *
 * ✓ TCS
 * ✓ Infosys
 * ✓ Wipro
 * ✓ Cognizant
 * ✓ Capgemini
 * ✓ Accenture
 *
 * Also Asked (or Variations Asked) In:
 *
 * ✓ Amazon
 * ✓ Microsoft
 * ✓ Google
 * ✓ Oracle
 * ✓ Adobe
 * ✓ Samsung
 *
 * Note:
 *
 * This is one of the most famous Two Pointer interview
 * problems and is available on LeetCode.
 *
 * ------------------------------------------------------------
 *
 * Think Before Coding:
 *
 * 1. Why is one pointer not enough?
 *
 * 2. What should the second pointer represent?
 *
 * 3. What should happen when a new unique element is found?
 *
 * 4. Should duplicate elements be copied?
 *
 * 5. What should happen if the array is empty?
 *
 * ------------------------------------------------------------
 *
 * Your Solution:
 *
 */

public class P04_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 1, 2 };
//		int [] arr = {0,0,1,1,1,2,2,3,3,4};
//		int []arr = {5};
//		int []arr = {};
		int[] arr = { 2, 2, 2, 2 };

		// Test Here
		System.out.println(removeDuplicates(arr));

	}

	public static int removeDuplicates(int[] arr) {

		// Write your code here
		if (arr == null || arr.length == 0) {
			return 0;
		}
		if (arr.length == 1) {
			return 1;
		}

		int j = 0;
//		int i = 1;
//		while (i < arr.length) {
//			if (arr[j] != arr[i]) {
//				arr[++j] = arr[i];
//			}
//			i++;
//		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				arr[++j] = arr[i];
			}
		}

		return j + 1;
	}

}

/*
 * ------------------------------------------------------------
 *
 * Dry Run:
 *
 *
 *
 *
 * ------------------------------------------------------------
 *
 * Time Complexity: The read pointer traverses the array exactly once from index
 * 1 to n−1. Each element is processed only one time, therefore the time
 * complexity is O(n).
 *
 *
 * ------------------------------------------------------------
 *
 * Space Complexity: No additional array or data structure is created. The
 * algorithm modifies the given array in-place, therefore the auxiliary space
 * complexity is O(1).
 *
 *
 * ------------------------------------------------------------
 *
 * Interview Explanation: Since the array is already sorted, all duplicate
 * elements appear together. I use two pointers: one read pointer to traverse
 * the array and one write pointer to keep track of the position where the next
 * unique element should be placed. Whenever the read pointer finds a new unique
 * element, I increment the write pointer and copy the unique value to that
 * position. At the end, the write pointer represents the last unique element,
 * so I return j + 1 as the number of unique elements.
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
 * 3. All Elements Same
 *
 * 4. No Duplicate Elements
 *
 * 5. Duplicate Elements Together
 *
 * 6. Negative Numbers
 *
 * ------------------------------------------------------------
 *
 * Interview Variations:
 *
 * ⭐ Easy
 *
 * 1. Allow each element to appear at most twice.
 *
 * 2. Count duplicate elements.
 *
 * -----------------------------
 *
 * ⭐ Medium
 *
 * 3. Move all duplicates to the end.
 *
 * 4. Remove duplicates from an unsorted array.
 *
 * -----------------------------
 *
 * ⭐ Hard
 *
 * 5. Remove duplicates from a linked list.
 *
 * ------------------------------------------------------------
 *
 * Follow-up Questions:
 *
 * Q1. Why do we need two pointers instead of one?
 *
 * Q2. Why is this algorithm O(n)?
 *
 * Q3. Can this be solved recursively?
 *
 * Q4. Can this be solved using Java Streams?
 *
 * Q5. Why is extra space O(1)?
 *
 * ------------------------------------------------------------
 *
 * Java Concepts Used:
 *
 * ✓ Arrays ✓ for Loop ✓ if Statement ✓ Two Pointers ✓ In-place Modification
 *
 * ------------------------------------------------------------
 *
 * Real-world Analogy:
 *
 * Imagine arranging a queue of students where duplicate ID cards are removed.
 *
 * One person checks every student, while another person decides the next
 * correct position for a unique student.
 *
 * This is exactly how the two-pointer technique works.
 *
 * ------------------------------------------------------------
 *
 * Notes / Learning:
 *	Why did you write arr[++j] = arr[i] instead of arr[j] = arr[i]?
 *		j always points to the last unique element that has already been placed correctly. When I find a new unique element, I first move j to the next available position using ++j, and then copy the new unique element there. This ensures that I never overwrite an existing unique element and always maintain the correct sequence.
 *
 *
 * ============================================================
 */