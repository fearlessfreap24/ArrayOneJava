import java.util.Arrays;

// Trying this a different way

//Basic array problems -- no loops.. Use a[0], a[1],
//... to access elements in an array, a.length is the length
//(note that s.length() is for Strings). Allocate a new array
//like this: int[] a = new int[10]; // length 10 array
//See the Java Arrays and Loops Help document for help.


public class Array1pt2 {

    public static void main(String[] args){
        Array1pt2 start = new Array1pt2();
        start.run();
    }

    private void run() {

//        int[][] nums15 = { {1, 2, 3}, {2, 3, 5}, {1, 2, 1} };
//        for ( int[] nums : nums15 ){
//            System.out.printf("nums = %s : %S\n", Arrays.toString(nums), Arrays.toString(fix23(nums)));
//        }

//        int[][][] nums16 = { { {1, 2, 3}, {1, 3} }, { {7, 2, 3}, {1} }, { {1, 2}, {} } };
//        for ( int[][] nums : nums16 ){
//            System.out.printf("arrays = %s : %d\n", Arrays.deepToString(nums), start1(nums[0], nums[1]));
//        }

//        int[][][] nums17 = { { {1, 2}, {3, 4} }, { {3, 4}, {1, 2} }, { {1, 1}, {1, 2} }, { {2, 2}, {1, 3} } };
//        for ( int[][] nums : nums17 ){
//            System.out.printf("arrays = %s : %s\n", Arrays.deepToString(nums),
//                    Arrays.toString(biggerTwo(nums[0], nums[1])));
//        }

//        int[][] nums18 = { {1, 2, 3, 4}, {7, 1, 2, 3, 4, 9}, {1, 2} };
//        for ( int[] nums : nums18 ){
//            System.out.printf("nums = %s : %s\n", Arrays.toString(nums), Arrays.toString(makeMiddle(nums)));
//        }

//        int[][][] nums19 = { { {1, 2}, {3, 4} }, { {4, 4}, {2, 2} }, { {9, 2}, {3, 4} } };
//        for ( int[][] nums : nums19 ){
//            System.out.printf("arrays = %s : %s\n", Arrays.deepToString(nums),
//                    Arrays.toString(plusTwo(nums[0], nums[1])));
//        }

        int[][] nums20 = { {1, 2, 3, 4}, {1, 2, 3}, {8, 6, 7, 9, 5}, {1} };
        for ( int[] nums : nums20 ){
            System.out.printf("nums = %s : %s\n", Arrays.toString(nums), Arrays.toString(swapEnds(nums)));
        }
    }

    private int[] fix23(int[] nums) {

//        Given an int array length 3, if there is a 2 in the array
//        immediately followed by a 3, set the 3 element to 0. Return
//        the changed array.
//
//        fix23([1, 2, 3]) → [1, 2, 0]
//        fix23([2, 3, 5]) → [2, 0, 5]
//        fix23([1, 2, 1]) → [1, 2, 1]
        if ( nums[0] == 2 && nums[1] == 3 ) nums[1] = 0;
        if ( nums[1] == 2 && nums[2] == 3 ) nums[2] = 0;

        return nums;
    }

    private int start1(int[] a, int[] b) {

//        Start with 2 int arrays, a and b, of any length. Return how
//        many of the arrays have 1 as their first element.
//
//        start1([1, 2, 3], [1, 3]) → 2
//        start1([7, 2, 3], [1]) → 1
//        start1([1, 2], []) → 1
        int count1s = 0;
        for ( int i = 0; i < a.length; i++ ){
            if ( a[i] == 1 ) count1s++;
        }
        for ( int j = 0; j < b.length; j++ ){
            if ( b[j] == 1 ) count1s++;
        }
        return count1s;
    }

    private int[] biggerTwo(int[] a, int[] b) {

//        Start with 2 int arrays, a and b, each length 2. Consider the
//        sum of the values in each array. Return the array which has the
//        largest sum. In event of a tie, return a.
//
//        biggerTwo([1, 2], [3, 4]) → [3, 4]
//        biggerTwo([3, 4], [1, 2]) → [3, 4]
//        biggerTwo([1, 1], [1, 2]) → [1, 2]
        if ( a[0] + a[1] == b[0] + b[1] ) return a;
        if ( a[0] + a[1] > b[0] + b[1] ) return a;
        return b;
    }

    private int[] makeMiddle(int[] nums) {

//        Given an array of ints of even length, return a new array
//        length 2 containing the middle two elements from the original
//        array. The original array will be length 2 or more.
//
//        makeMiddle([1, 2, 3, 4]) → [2, 3]
//        makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//        makeMiddle([1, 2]) → [1, 2]
        int numsLength = nums.length;
        int[] makemiddle = new int[2];
        makemiddle[0] = nums[(numsLength/2) -1];
        makemiddle[1] = nums[numsLength/2];
        return makemiddle;
    }

    private int[] plusTwo(int[] a, int[] b) {

//        Given 2 int arrays, each length 2, return a new array length
//        4 containing all their elements.
//
//        plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//        plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//        plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
        int[] plustwo = new int[4];
        plustwo[0] = a[0];
        plustwo[1] = a[1];
        plustwo[2] = b[0];
        plustwo[3] = b[1];
        return plustwo;
    }

    private int[] swapEnds(int[] nums) {

//        Given an array of ints, swap the first and last elements
//        in the array. Return the modified array. The array length
//        will be at least 1.
//
//        swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//        swapEnds([1, 2, 3]) → [3, 2, 1]
//        swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
        if ( nums.length == 1 ) return nums;
        int front = nums[0];
        int back = nums[nums.length - 1];
        nums[0] = back;
        nums[nums.length - 1] = front;
        return nums;
    }
}
