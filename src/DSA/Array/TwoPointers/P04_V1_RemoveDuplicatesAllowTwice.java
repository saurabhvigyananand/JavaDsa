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

        // int[] arr = {1,1,1,2,2,3};
        // int[] arr = {0,0,1,1,1,1,2,3,3};
        // int[] arr = {5};
        // int[] arr = {};
        // int[] arr = {2,2,2,2,2};
        int[] arr = { -3, -3, -3, -2, -2, -1 };

        int k = removeDuplicates(arr);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length <= 2) {
            return arr.length;
        }
        // Write your code here

        // TYPE A:-
        // int j= 1;
        // for (int i = 2; i < arr.length; i++) {
        // if(arr[i] != arr[j-1]){
        // arr[++j]=arr[i];
        // }
        // }
        // return j+1;

        // Type B:-
        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[j - 2]) {
                arr[j++] = arr[i];
            }
        }

        return j;
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
 * The time complexity is O(n) because the read pointer (i) traverses the array
 * exactly once from left to right.
 * 
 * The write pointer (j) does not perform a separate traversal. It only moves
 * forward when a valid element needs to be kept, and each element is written at
 * most once.
 * 
 * Since both pointers move only in the forward direction and no element is
 * processed more than once, the total number of operations is proportional to
 * the number of elements in the array.
 * 
 * Therefore, the overall time complexity is O(n).
 *
 * ------------------------------------------------------------
 *
 * Space Complexity:
 *
 * * The auxiliary space complexity is O(1) because the algorithm
 * uses only a fixed number of extra variables, such as the read
 * pointer (i) and the write pointer (j).
 *
 * No additional array or data structure is created, and the
 * amount of extra memory does not increase with the size of the
 * input array.
 *
 * Since the array is modified in-place, the auxiliary space
 * complexity remains O(1).
 *
 * ------------------------------------------------------------
 *
 * Interview Explanation:
 *
 * * I used the Two Pointer technique because I need to traverse the
 * array while simultaneously maintaining the position where the
 * next valid element should be placed.
 *
 * The read pointer (i) traverses every element of the array,
 * whereas the write pointer (j) maintains the next valid position
 * (or the last accepted position, depending on the chosen implementation).
 *
 * Since the array is already sorted, duplicate elements always
 * appear together. To allow at most two occurrences, I compare
 * the current element with the element that is two accepted
 * positions behind. If they are different, I accept the current
 * element and place it at the write pointer; otherwise, I skip it
 * because it would become the third occurrence.
 *
 * This approach modifies the array in-place, requires only one
 * traversal, and satisfies all the constraints of the problem.
 *
 * ------------------------------------------------------------
 *
 * Common Mistakes:
 *
 * 1. Using the wrong comparison condition.
 *
 * Many candidates compare the current element with the
 * wrong accepted position (for example, comparing with
 * the adjacent accepted element instead of the element
 * two accepted positions behind), which breaks the logic
 * of allowing at most two occurrences.
 *
 * 2. Applying the original "unique elements" logic.
 *
 * Many candidates reuse the parent solution and end up
 * allowing only one occurrence of each element instead
 * of allowing at most two occurrences.
 *
 * 3. Incorrect write pointer updates.
 *
 * Initializing the write pointer incorrectly or making
 * mistakes while incrementing it (pre/post increment) or
 * returning the final length may produce incorrect output.
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
 * (arr[j] != arr[i]) work?
 * The original condition works only when each distinct
 * element is allowed to appear once because it compares
 * the current element with the last accepted element.
 *
 * In this variation, each element is allowed to appear
 * at most twice. Therefore, comparing with the last
 * accepted element would reject the second occurrence as
 * well, reducing the solution back to the original
 * "unique elements only" logic.
 *
 * Instead, we compare with the element two accepted
 * positions behind, which correctly allows two
 * occurrences while rejecting the third and subsequent
 * occurrences.
 * ===============================================
 *
 * Q2. Why is the comparison made with the element
 * two accepted positions behind?
 *
 * Because each distinct element is allowed to appear
 * at most twice.
 *
 * The first two occurrences are already accepted, so
 * when processing a new element, we compare it with
 * the element two accepted positions behind.
 *
 * If both are equal, accepting the current element would
 * create a third occurrence, so we reject it.
 *
 * If they are different, the current element can safely
 * be accepted.
 * ===============================================
 *
 * Q3. Can this algorithm be generalized
 * to allow at most K occurrences?
 * 
 * * Yes. The same two-pointer approach can be generalized
 * to allow at most K occurrences of each distinct element.
 *
 * We compare the current element with the element K accepted
 * positions behind.
 *
 * If both elements are equal, accepting the current element
 * would create the (K+1)th occurrence, so we reject it.
 *
 * If they are different, we accept the current element.
 *
 * Therefore, the same logic works for any allowed occurrence
 * count K.
 * ==============================================
 *
 * Q4. Can this be solved recursively?
 * * Yes, this problem can be solved recursively by processing
 * the array elements one by one and maintaining the required
 * write position.
 *
 * However, I would prefer the iterative two-pointer approach
 * for this problem because it is simpler and more intuitive.
 * The iterative solution also uses O(1) auxiliary space,
 * whereas recursion would require O(n) call-stack space in
 * the worst case.
 *
 * Therefore, recursion is possible, but it does not provide
 * any advantage for this problem.
 * =================================================== *
 * 
 * Q5. Can this be solved using Java Streams?
 * * Yes, it is possible to use Java Streams to process the
 * array, but I would not prefer Streams for this problem.
 *
 * The problem requires modifying the input array in-place,
 * whereas Streams are mainly designed for declarative data
 * processing and generally produce a new result rather than
 * modifying the original array in-place.
 *
 * The two-pointer approach using a simple loop is more
 * straightforward, readable, and efficient for this problem.
 *
 * Therefore, I would prefer the iterative two-pointer
 * solution in an interview.
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
 * To allow at most K occurrences, compare with the element K accepted positions
 * behind.
 * 
 * Rule:
 * 
 * Agar kisi element ko maximum K baar
 * allow karna hai, to current element ko
 * usse K accepted positions piche wale
 * element se compare karo.
 * 
 * • Agar dono same hain, to current
 * element (K+1)th occurrence hai,
 * isliye reject kar do.
 * 
 * • Agar alag hain, to current element
 * ko accept kar do.
 *
 * ============================================================
 */