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
		
//		System.out.printf("makePi() = %s", Arrays.toString(makePi()));
		
//		int[][][] nums3 = { { {1, 2, 3}, {7, 3} }, 
//				{ {1, 2, 3}, {7, 3, 2} }, 
//				{ {1, 2, 3}, {1, 3} },
//				{ {1, 2, 3}, {1} },
//				{ {1, 2, 3}, {2} } };
//		for ( int[][] num3 : nums3 ) {
//			System.out.printf("a = %s, b = %s : %b\n", Arrays.toString(num3[0]), Arrays.toString(num3[1]), commonEnd(num3[0], num3[1]));
//		}
		
//		int[][] nums4 = { {1, 2, 3}, {5, 11, 2}, {7, 0, 0} };
//		for ( int[] num4 : nums4 ) {
//			System.out.printf("nums = %s : %d\n", Arrays.toString(num4), sum3(num4) );
//		}
		
//		int[][] nums5 = { {1, 2, 3}, {5, 11, 9}, {7, 0, 0} };
//		for ( int[] num5 : nums5 ) {
//			System.out.printf("nums = %s : %s\n", Arrays.toString(num5), Arrays.toString(rotateLeft3(num5)));
//		}
		
//		int[][] nums6 = { {1, 2, 3}, {5, 11, 9}, {7, 0, 0} };
//		for ( int[] num6 : nums6 ) {
//			System.out.printf("nums = %s : %s\n", Arrays.toString(num6), Arrays.toString(reverse3(num6)));
//		}
		
//		int[][] nums7 = { {1, 2, 3}, {11, 5, 9}, {2, 11, 3} };
//		for ( int[] num7 : nums7 ) {
//			System.out.printf("nums = %s : %s\n", Arrays.toString(num7), Arrays.toString(maxEnd3(num7)));
//		}
		
		int[][] nums8 = { {1, 2, 3}, {1, 1}, {1, 1, 1, 1} };
		for ( int[] num8 : nums8 ) {
			System.out.printf("nums = %s : %d\n", Arrays.toString(num8), sum2(num8));
		}
		
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

	private boolean commonEnd(int[] a, int[] b) {
		
//		Given 2 arrays of ints, a and b, return true if they 
//		have the same first element or they have the same last 
//		element. Both arrays will be length 1 or more.
//
//		commonEnd([1, 2, 3], [7, 3]) → true
//		commonEnd([1, 2, 3], [7, 3, 2]) → false
//		commonEnd([1, 2, 3], [1, 3]) → true
		
		return (a[a.length - 1] == b[b.length - 1])
				|| (a[0] == b[0]);
	}

	private int sum3(int[] nums) {

//		Given an array of ints length 3, return the sum of all the elements.
//
//
//		sum3([1, 2, 3]) → 6
//		sum3([5, 11, 2]) → 18
//		sum3([7, 0, 0]) → 7
		
		return nums[0] + nums[1] + nums[2];
	}

	private int[] rotateLeft3(int[] nums) {

//		Given an array of ints length 3, return an array 
//		with the elements "rotated left" so {1, 2, 3} yields 
//		{2, 3, 1}.
//
//		rotateLeft3([1, 2, 3]) → [2, 3, 1]
//		rotateLeft3([5, 11, 9]) → [11, 9, 5]
//		rotateLeft3([7, 0, 0]) → [0, 0, 7]
		
		int[] rotateleft3 = { nums[1], nums[2], nums[0] };
		return rotateleft3;
	}

	private int[] reverse3(int[] nums) {
		
//		Given an array of ints length 3, return a new array 
//		with the elements in reverse order, so {1, 2, 3} 
//		becomes {3, 2, 1}.
//
//		reverse3([1, 2, 3]) → [3, 2, 1]
//		reverse3([5, 11, 9]) → [9, 11, 5]
//		reverse3([7, 0, 0]) → [0, 0, 7]
		int[] reversethree = { nums[2], nums[1], nums[0] };
		return reversethree;
	}

	private int[] maxEnd3(int[] nums) {
		
//		Given an array of ints length 3, figure out which is 
//		larger, the first or last element in the array, and 
//		set all the other elements to be that value. Return 
//		the changed array.
//
//		maxEnd3([1, 2, 3]) → [3, 3, 3]
//		maxEnd3([11, 5, 9]) → [11, 11, 11]
//		maxEnd3([2, 11, 3]) → [3, 3, 3]
		int max = Integer.MIN_VALUE;
		if ( nums[0] > max ) max = nums[0];
		if ( nums[2] > max ) max = nums[2];
		
		int[] maxend3 = { max, max, max };
		return maxend3;
		
	}

	private int sum2(int[] nums) {

//		Given an array of ints, return the sum of the first 
//		2 elements in the array. If the array length is less 
//		than 2, just sum up the elements that exist, returning 
//		0 if the array is length 0.
//
//		sum2([1, 2, 3]) → 3
//		sum2([1, 1]) → 2
//		sum2([1, 1, 1, 1]) → 2
		if ( nums.length == 0 ) return 0;
		if ( nums.length == 1 ) return nums[0];
		return nums[0] + nums[1];
	}

}
