package codingQuestions.arrayBased;

/*
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.
 */
public class PickFromBothSides {

    public static void main(String[] args) {
        int b = 9;
//        int[] arr = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};

//        int[] arr={2, 3, -1, 4, 2, 1 };
        int[] arr = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436};
        int maxSum = pickFromBothSidesSolution(arr, b);
        System.out.println(maxSum);
    }

    private static int pickFromBothSidesSolution(int[] arr, int b) {
        int maxSum = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < b) {
            maxSum = maxSum + arr[i++];
        }
        int ans = maxSum;
        while (b > 0) {

            maxSum -= arr[--i];
            maxSum += arr[j--];
            ans = Math.max(ans, maxSum);
            b--;
        }
        return ans;
    }

}
