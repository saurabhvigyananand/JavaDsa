package DSA.Array.TwoPointers;

/*
 * ============================================================
 * Problem 4 - Variation 2:
 * Count Duplicate Elements
 *
 * Difficulty: Easy
 * Pattern: Two Pointers / Array Traversal
 *
 * Derived From:
 * P04_RemoveDuplicatesFromSortedArray
 * ============================================================
 *
 * Problem Statement:
 *
 * Given a sorted integer array, count the number of duplicate
 * elements present in the array.
 *
 * A duplicate occurrence means every occurrence of an element
 * after its first occurrence.
 *
 * Return the total number of duplicate occurrences.
 *
 * Note:
 *
 * If an element appears 3 times, it contributes 2 duplicate
 * occurrences.
 *
 * ------------------------------------------------------------
 * Examples
 * ------------------------------------------------------------
 *
 * Example 1:
 *
 * Input:
 * arr = {1,1,2}
 *
 * Output:
 * 1
 *
 * Explanation:
 *
 * 1 appears twice, so there is 1 duplicate occurrence.
 *
 * ------------------------------------------------------------
 *
 * Example 2:
 *
 * Input:
 * arr = {1,1,1,2,2,3}
 *
 * Output:
 * 3
 *
 * Explanation:
 *
 * 1 appears 3 times -> 2 duplicate occurrences.
 * 2 appears 2 times -> 1 duplicate occurrence.
 *
 * Total = 3
 *
 * ------------------------------------------------------------
 *
 * Example 3:
 *
 * Input:
 * arr = {1,2,3,4,5}
 *
 * Output:
 * 0
 *
 * Explanation:
 *
 * No element occurs more than once.
 *
 * ------------------------------------------------------------
 *
 * Example 4:
 *
 * Input:
 * arr = {5,5,5,5}
 *
 * Output:
 * 3
 *
 * ------------------------------------------------------------
 *
 * Example 5:
 *
 * Input:
 * arr = {}
 *
 * Output:
 * 0
 *
 * ------------------------------------------------------------
 *
 * Example 6:
 *
 * Input:
 * arr = {-3,-3,-2,-1,-1,0}
 *
 * Output:
 * 2
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
 * 5. Traverse the array only once.
 *
 * ------------------------------------------------------------
 *
 * Prerequisites:
 *
 * ✓ Arrays Basics
 * ✓ Array Traversal
 * ✓ Two Pointers
 * ✓ Duplicate Handling
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
 * ✓ Google
 * ✓ Oracle
 * ✓ Adobe
 *
 * Note:
 *
 * This problem is a common variation of duplicate-handling
 * questions in array interviews.
 *
 * ------------------------------------------------------------
 *
 * Think Before Coding:
 *
 * 1. What exactly counts as a duplicate occurrence?
 *
 * 2. If an element appears 4 times, how many duplicates
 *    should it contribute?
 *
 * 3. Since the array is sorted, how can you identify
 *    duplicates without extra space?
 *
 * 4. Do you actually need two pointers for this problem?
 *
 * 5. What should happen for an empty array?
 *
 * 6. What should happen if every element is unique?
 *
 * ------------------------------------------------------------
 *
 * Your Solution:
 *
 */

public class P04_V2_CountDuplicateElements {

    public static void main(String[] args) {

        // int[] arr = {1,1,2};
        // int[] arr = {1,1,1,2,2,3};
        // int[] arr = {1,2,3,4,5};
        // int[] arr = {5,5,5,5};
        // int[] arr = {};
        int[] arr = { -3, -3, -2, -1, -1, 0 };

        // Test Here
        System.out.println(countDuplicates(arr));
    }

    public static int countDuplicates(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        // Write your code here
        int count = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }
        }
        return count;
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
 * The time complexity is O(n) because we traverse the array
 * from the second element to the last element.
 *
 * We need to check every element because duplicate occurrences
 * can exist anywhere in the array, including at the last
 * position. Since we need to count all duplicate occurrences,
 * we cannot stop after finding the first duplicate.
 *
 * Therefore, the time complexity is O(n).
 * ------------------------------------------------------------
 *
 * Space Complexity:
 *
 * The auxiliary space complexity is O(1) because we only use
 * a fixed number of variables such as the loop variable and
 * the duplicate counter.
 *
 * The amount of extra memory does not increase with the size
 * of the input array.
 *
 * Therefore, the auxiliary space complexity is O(1).
 * ------------------------------------------------------------
 *
 * Interview Explanation:
 * I start traversing from index 1 because I need to compare each element with
 * its previous element at i-1.
 * If arr[i] is equal to arr[i-1], it means the current element is a duplicate
 * occurrence,
 * so I increment the counter. Since the array is sorted, all occurrences of the
 * same element will be adjacent,
 * which allows us to identify duplicates by comparing adjacent elements. After
 * traversing the entire array,
 * I return the counter as the total number of duplicate occurrences
 *
 *
 * ------------------------------------------------------------
 *
 * Common Mistakes:
 *
 * 1. Starting the loop from index 0 and then trying to access
 * arr[i - 1], which would cause an invalid index.
 * 
 * 2. Using != instead of == in the condition and counting
 * unique transitions instead of duplicate occurrences.
 * 
 * 3. Incorrectly incrementing the counter, such as incrementing
 * it when elements are different or forgetting to increment
 * it when a duplicate is found.
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
 * 4. All Elements Same
 *
 * 5. Multiple Duplicate Groups
 *
 * 6. Negative Numbers
 *
 * ------------------------------------------------------------
 *
 * Interview Variations:
 *
 * ⭐ Easy
 *
 * 1. Count the number of distinct elements that have duplicates.
 *
 * 2. Find the first duplicate element.
 *
 * -----------------------------
 *
 * ⭐ Medium
 *
 * 3. Find the element with the maximum frequency.
 *
 * 4. Find the number of unique elements after removing duplicates.
 *
 * -----------------------------
 *
 * ⭐ Hard
 *
 * 5. Count duplicate elements in an unsorted array using
 * O(1) extra space.
 *
 * ------------------------------------------------------------
 *
 * Follow-up Questions:
 *
 * Q1. Why does the sorted property make this problem easier?
 * The sorted property makes the problem easier because all duplicate
 * occurrences of the same element appear adjacent to each other. Therefore, we
 * only need to compare each element with its previous element. If they are
 * equal, we know that the current element is a duplicate occurrence, so we
 * increment the counter.
 *
 * Q2. Can this be solved without using two pointers?
 * Yes. In fact, this problem does not require two pointers.
 * We only need one traversal pointer, i, because we can compare
 * arr[i] with arr[i - 1] to identify a duplicate occurrence.
 * 
 * The second pointer would be redundant because it would simply
 * follow the traversal pointer and provide no additional benefit.
 * Therefore, a single pointer with a counter is the simpler
 * approach.
 *
 * Q3. What would change if the array were unsorted?
 * If the array is unsorted, we can't rely on adjacent elements because we don't
 * know where duplicate occurrences are. Without using an extra data structure,
 * we may need nested traversal, resulting in O(n²) time
 *
 * Q4. Can this be solved using a HashMap?
 * Yes, we can solve this using a HashMap by storing the frequency of each
 * element. However, since the array is already sorted, we can count duplicate
 * occurrences with a single traversal and O(1) auxiliary space. Therefore, I
 * would prefer the simpler approach without an additional data structure.
 *
 * Q5. Can this be solved using Java Streams?
 * Yes, this problem can be solved using Java Streams.
 * However, I would prefer the simple iterative approach because
 * the problem only requires comparing adjacent elements and
 * maintaining a counter.
 * 
 * Using a loop is more straightforward and readable for this
 * simple traversal, so I would choose the iterative approach
 * in an interview.
 *
 * ------------------------------------------------------------
 *
 * Java Concepts Used:
 *
 * ✓ Arrays
 * ✓ Array Traversal
 * ✓ for Loop
 * ✓ if Statement
 * ✓ Counter
 * ✓ Comparison Operators
 *
 * ------------------------------------------------------------
 *
 * Real-world Analogy:
 *
 * Imagine checking a list of student IDs that has already
 * been sorted.
 *
 * Whenever the current ID is the same as the previous ID,
 * it represents an additional occurrence of that student.
 *
 * Count those additional occurrences to find the total
 * number of duplicates.
 *
 * ------------------------------------------------------------
 *
 * Notes / Learning:
 * 
 * Because the array is sorted, duplicate occurrences always
 * appear adjacent to each other. Therefore, we can compare
 * arr[i] with arr[i - 1] and count every additional occurrence.
 * 
 * A second pointer is not required because i - 1 already gives
 * us the previous element needed for comparison.
 * 
 * This problem helped me understand that not every array problem
 * requires the Two Pointer technique, even if it comes from a
 * Two Pointer-related problem set.
 *
 * ============================================================
 */