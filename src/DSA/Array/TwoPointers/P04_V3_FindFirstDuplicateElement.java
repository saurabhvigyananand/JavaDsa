package DSA.Array.TwoPointers;

/*
 * ============================================================
 * Problem 4 - Variation 3:
 * Find the First Duplicate Element
 *
 * Difficulty: Easy
 * Pattern: Array Traversal
 *
 * Derived From:
 * P04_RemoveDuplicatesFromSortedArray
 * ============================================================
 *
 * Problem Statement:
 *
 * Given a sorted integer array, find the first duplicate
 * element.
 *
 * A duplicate element is an element that appears more than
 * once in the array.
 *
 * Return the first element that has a duplicate occurrence.
 *
 * If the array contains no duplicate elements, return -1.
 *
 * Since the array is sorted, the first duplicate can be
 * identified by checking adjacent elements.
 *
 * ------------------------------------------------------------
 * Examples
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input:
 * arr = {1,1,2,3,3}
 *
 * Output:
 * 1
 *
 * Explanation:
 *
 * 1 is the first element that appears more than once.
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * arr = {1,2,2,3,3}
 *
 * Output:
 * 2
 *
 * Explanation:
 *
 * 2 is the first duplicate element.
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * arr = {1,2,3,4,5}
 *
 * Output:
 * -1
 *
 * Explanation:
 *
 * No duplicate element exists.
 *
 * ------------------------------------------------------------
 *
 * Example 4:
 *
 * Input:
 * arr = {5,5,5,6,7}
 *
 * Output:
 * 5
 *
 * ------------------------------------------------------------
 *
 * Example 5:
 *
 * Input:
 * arr = {}
 *
 * Output:
 * -1
 *
 * ------------------------------------------------------------
 *
 * Example 6:
 *
 * Input:
 * arr = {-5,-3,-3,-1,0}
 *
 * Output:
 * -3
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
 * Time  : O(n) worst case
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
 * 5. Return immediately when the first duplicate is found.
 *
 * ------------------------------------------------------------
 *
 * Prerequisites:
 *
 * ✓ Arrays Basics
 * ✓ Array Traversal
 * ✓ Duplicate Handling
 * ✓ Sorted Arrays
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
 * ✓ Accenture
 *
 * Also Asked (or Variations Asked) In:
 *
 * ✓ Amazon
 * ✓ Microsoft
 * ✓ Oracle
 * ✓ Adobe
 *
 * Note:
 *
 * This is a direct variation of duplicate detection in a
 * sorted array.
 *
 * ------------------------------------------------------------
 *
 * Think Before Coding:
 *
 * 1. Since the array is sorted, where will duplicate elements
 *    appear relative to each other?
 *
 * 2. What should you compare to identify a duplicate?
 *
 * 3. Why should the loop start from index 1?
 *
 * 4. When should you return the answer?
 *
 * 5. What should you return if no duplicate exists?
 *
 * 6. What is the worst-case scenario for time complexity?
 *
 * ------------------------------------------------------------
 *
 * Your Solution:
 *
 */

public class P04_V3_FindFirstDuplicateElement {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 3, 3 };
        // int[] arr = {1,2,2,3,3};
        // int[] arr = {1,2,3,4,5};
        // int[] arr = {5,5,5,6,7};
        // int[] arr = {};
        // int[] arr = { -5, -3, -3, -1, 0 };

        // Test Here
        System.out.println(findFirstDuplicate(arr));
    }

    public static int findFirstDuplicate(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        // Write your code here
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                return arr[i];
            }
        }
        return -1;
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
 * 3. No Duplicate Elements
 *
 * 4. First Two Elements Are Duplicate
 *
 * 5. Duplicate Appears Later
 *
 * 6. Multiple Duplicate Groups
 *
 * 7. Negative Numbers
 *
 * ------------------------------------------------------------
 *
 * Interview Variations:
 *
 * ⭐ Easy
 *
 * 1. Find the last duplicate element.
 *
 * 2. Find all elements that have duplicates.
 *
 * -----------------------------
 *
 * ⭐ Medium
 *
 * 3. Find the first duplicate in an unsorted array.
 *
 * 4. Find the first element with maximum frequency.
 *
 * -----------------------------
 *
 * ⭐ Hard
 *
 * 5. Find the first duplicate in an unsorted array
 * using O(1) extra space.
 *
 * ------------------------------------------------------------
 *
 * Follow-up Questions:
 *
 * Q1. Why can we stop immediately when we find a duplicate?
 *
 * Q2. Why does sorted order matter in this problem?
 *
 * Q3. What happens to the complexity if the array is unsorted?
 *
 * Q4. How would you modify the solution to find the last
 * duplicate instead?
 *
 * ------------------------------------------------------------
 *
 * Java Concepts Used:
 *
 * ✓ Arrays
 * ✓ Array Traversal
 * ✓ for Loop
 * ✓ if Statement
 * ✓ Comparison Operators
 * ✓ Early Return
 *
 * ------------------------------------------------------------
 *
 * Real-world Analogy:
 *
 * Imagine a sorted list of employee IDs.
 *
 * You scan the list from left to right. The moment you see
 * the same ID twice consecutively, you have found the first
 * employee ID that appears more than once.
 *
 * ------------------------------------------------------------
 *
 * Notes / Learning:
 *
 *
 *
 * ============================================================
 */