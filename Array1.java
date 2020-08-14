import java.util.Arrays;

// Trying this a different way

//Basic array problems -- no loops.. Use a[0], a[1], 
//... to access elements in an array, a.length is the length 
//(note that s.length() is for Strings). Allocate a new array 
//like this: int[] a = new int[10]; // length 10 array
//See the Java Arrays and Loops Help document for help.


public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1 start = new Array1();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
//		int[][] nums1 = { {1, 2, 6}, {6, 1, 2, 3}, {13, 6, 1, 2, 3} };
//		for ( int[] num1 : nums1 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(num1), firstLast6(num1));
//		}
		
//		int[][] nums2 = { {1, 2, 3}, {1, 2, 3, 1}, {1, 2, 1} };
//		for ( int[] num2 : nums2 ) {
//			System.out.printf("nums = %s : %b\n", Arrays.toString(num2), sameFirstLast(num2));
//		}
		
		System.out.printf("makePi() = %s", Arrays.toString(makePi()));
		
	}

	private boolean firstLast6(int[] nums) {
		
//		Given an array of ints, return true if 6 appears 
//		as either the first or last element in the array. 
//		The array will be length 1 or more.//
//
//		firstLast6([1, 2, 6]) → true
//		firstLast6([6, 1, 2, 3]) → true
//		firstLast6([13, 6, 1, 2, 3]) → false
		
		
		if ( nums[0] == 6 || nums[nums.length - 1] == 6) return true;
		return false;
	}

	private boolean sameFirstLast(int[] nums) {
		
//		Given an array of ints, return true if the array is 
//		length 1 or more, and the first element and the last 
//		element are equal.
//
//		sameFirstLast([1, 2, 3]) → false
//		sameFirstLast([1, 2, 3, 1]) → true
//		sameFirstLast([1, 2, 1]) → true
		if ( nums.length < 1 ) return false;
		return nums[0] == nums[nums.length - 1];
	}

	private int[] makePi() {

//		Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//
//		makePi() → [3, 1, 4]
		int[] makepi = {3, 1, 4}; 
		return makepi;
	}

}
