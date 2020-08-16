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

//        int[][] nums20 = { {1, 2, 3, 4}, {1, 2, 3}, {8, 6, 7, 9, 5}, {1} };
//        for ( int[] nums : nums20 ){
//            System.out.printf("nums = %s : %s\n", Arrays.toString(nums), Arrays.toString(swapEnds(nums)));
//        }

//        int[][] nums21 = { {1, 2, 3, 4, 5}, {8, 6, 7, 5, 3, 0, 9}, {1, 2, 3} };
//            for ( int[] nums : nums21 ){
//                System.out.printf("nums = %s : %s\n", Arrays.toString(nums), Arrays.toString(midThree(nums)));
//            }

//        int[][] nums22 = { {1, 2, 3}, {1, 5, 3}, {5, 2, 3} };
//        for ( int[] nums : nums22 ){
//            System.out.printf("nums = %s : %d\n", Arrays.toString(nums), maxTriple(nums));
//        }

//        int[][] nums23 = { {1, 2, 3}, {1, 2}, {1} };
//        for ( int[] nums : nums23 ){
//            System.out.printf("nums = %s : %s\n", Arrays.toString(nums), Arrays.toString(frontPiece(nums)));
//        }

//        int[][] nums24 = { {1, 3, 4, 5}, {2, 1, 3, 4, 5}, {1, 1, 1} };
//        for ( int[] nums : nums24 ){
//            System.out.printf("nums = %s : %b\n", Arrays.toString(nums), unlucky1(nums));
//        }

//        int[][][] nums25 = { { {4, 5}, {1, 2, 3} }, { {4}, {1, 2, 3} }, { {}, {1, 2} } };
//        for ( int[][] nums : nums25 ){
//            System.out.printf("arrays = %s : %s\n", Arrays.deepToString(nums),
//                    Arrays.toString(make2(nums[0], nums[1])));
//        }

        int[][][] nums26 = { { {1, 2, 3}, {7, 9, 8} }, { {1}, {1, 2} }, { {1, 7}, {} }, { {}, {} } };
        for ( int[][] nums : nums26 ){
            System.out.printf("arrays = %s : %s\n", Arrays.deepToString(nums),
                    Arrays.toString(front11(nums[0], nums[1])));
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

    private int[] midThree(int[] nums) {

//        Given an array of ints of odd length, return a new array
//        length 3 containing the elements from the middle of the array.
//        The array length will be at least 3.
//
//        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//        midThree([1, 2, 3]) → [1, 2, 3]
        if ( nums.length == 3 ) return nums;
        int numsLength = nums.length;
        int[] midthree = new int[3];
        midthree[0] = nums[(numsLength/2) - 1];
        midthree[1] = nums[(numsLength/2)];
        midthree[2] = nums[(numsLength/2) + 1];
        return midthree;
    }

    private int maxTriple(int[] nums) {

//        Given an array of ints of odd length, look at the first,
//        last, and middle values in the array and return the largest.
//        The array length will be a least 1.
//
//        maxTriple([1, 2, 3]) → 3
//        maxTriple([1, 5, 3]) → 5
//        maxTriple([5, 2, 3]) → 5
        if ( nums.length == 1 ) return nums[0];
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(Math.max(first, middle), Math.max(middle, last));
    }

    private int[] frontPiece(int[] nums) {

//        Given an int array of any length, return a new array of its
//        first 2 elements. If the array is smaller than length 2, use
//        whatever elements are present.
//
//        frontPiece([1, 2, 3]) → [1, 2]
//        frontPiece([1, 2]) → [1, 2]
//        frontPiece([1]) → [1]
        if ( nums.length < 2 ) return nums;
        int[] frontpiece = new int[2];
        frontpiece[0] = nums[0];
        frontpiece[1] = nums[1];
        return frontpiece;
    }

    private boolean unlucky1(int[] nums) {

//        We'll say that a 1 immediately followed by a 3 in an array
//        is an "unlucky" 1. Return true if the given array contains
//        an unlucky 1 in the first 2 or last 2 positions in the array.
//
//        unlucky1([1, 3, 4, 5]) → true
//        unlucky1([2, 1, 3, 4, 5]) → true
//        unlucky1([1, 1, 1]) → false
        int numsL = nums.length;
        if ( numsL < 2 ) return false;
        if ( numsL == 2 ) return ( nums[0] == 1) && ( nums[1] == 3 );
        if ( ( nums[0] == 1 && nums[1] == 3)
                || ( nums[1] == 1 && nums[2] == 3)
                || (nums[numsL - 2] == 1 && nums[numsL - 1] == 3) )
            return true;
        return false;
    }

    private int[] make2(int[] a, int[] b) {

//        Given 2 int arrays, a and b, return a new array length 2
//        containing, as much as will fit, the elements from a followed
//        by the elements from b. The arrays may be any length, including
//        0, but there will be 2 or more elements available between the
//        2 arrays.
//
//        make2([4, 5], [1, 2, 3]) → [4, 5]
//        make2([4], [1, 2, 3]) → [4, 1]
//        make2([], [1, 2]) → [1, 2]
        int[] maketwo = new int[2];
        if ( a.length == 0 ){
            maketwo[0] = b[0];
            maketwo[1] = b[1];
        }
        else if ( a.length == 1 ){
            maketwo[0] = a[0];
            maketwo[1] = b[0];
        }
        else {
            maketwo[0] = a[0];
            maketwo[1] = a[1];
        }
        return maketwo;
    }

    private int[] front11(int[] a, int[] b) {

//        Given 2 int arrays, a and b, of any length, return a new
//        array with the first element of each array. If either array
//        is length 0, ignore that array.
//
//        front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//        front11([1], [2]) → [1, 2]
//        front11([1, 7], []) → [1]
        if ( a.length == 0 && b.length == 0 ){
            int[] front11 = {};
            return front11;
        }
        else if ( a.length == 0 ) {
            int[] front11 = {b[0]};
            return front11;
        }
        else if ( b.length == 0 ) {
            int[] front11 = {a[0]};
            return front11;
        }
        else {
            int[] front11 = { a[0], b[0] };
            return front11;
        }
    }
}
