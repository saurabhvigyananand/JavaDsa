package DSA.Array.Basics.ArrayTraversal;

public class secondLargest {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
//		int[] arr = { 5, 5, 5 };
//		int[] arr = { 5, Integer.MIN_VALUE };
//		int[] arr = { 12 };
//		int[] arr = { -5, -2, -10, -1 };
//		int[] arr = { 50, 40, 50, 30 };
//		int[] arr = { Integer.MIN_VALUE, 5 };
//		int[] arr = { Integer.MIN_VALUE, Integer.MIN_VALUE };
//		int []arr= {5, 10};
//		int []arr= {10, 5};

		System.out.println(secLarge(arr));
		;
	}

	// BEST SOLUTION FOR PRODUCTION WITH ( WRAPPER + NULL)
	public static Integer secLarge(int[] arr) {
		if (arr == null || arr.length < 2) {
			return -1;
		}
		Integer largest = null;
		Integer secondLargest = null;

		for (int num : arr) {
			if (largest == null || num > largest) {
				if (largest != null) {
					secondLargest = largest;
				}
				largest = num;

			} else if (num != largest && (secondLargest == null || num > secondLargest)) {
				secondLargest = num;
			}
		}
		return secondLargest == null ? -1 : secondLargest;
	}

	
	// SOLUTION WITH ( arr[0] initialization)
//	public static int secLarge(int[] arr) {
//		if (arr.length < 2) {
//			return -1;
//		}
//		int largest = arr[0];
//		int secondLargest = arr[0];
//		boolean secondFound = false;
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				secondLargest = largest;
//				largest = arr[i];
//				secondFound = true;
//
//			} else if (arr[i] < largest) {
//				if (!secondFound || arr[i] > secondLargest) {
//					secondLargest = arr[i];
//					secondFound = true;
//				}
//			}
//		}
//		return secondFound ? secondLargest : -1;
//	}

	// SOLUTION WITH LONG TYPE
//	private static long secLarge(int[] arr) {
//		long largest = Long.MIN_VALUE;
//		long secondLargest = Long.MIN_VALUE;
//
//		if (arr.length <= 1) {
//			secondLargest = -1;
//			return -1;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				secondLargest = largest;
//				largest = arr[i];
//			} else if (arr[i] < largest && arr[i] > secondLargest) {
//				secondLargest = arr[i];
//			}
//		}
//		return secondLargest == Long.MIN_VALUE ? -1 : secondLargest;
//	}
}
