package codingQuestions.arrayBased.Sorting;

import java.util.Arrays;

public class Sort3NumbersArray {

    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 0, 1, -1, 1, 0, 0, -1};
        int[] res = sortArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sortArray(int[] A) {
        int low = 0, mid = 0, high = A.length - 1;
        while (mid < high) {
            if (A[mid] == -1) {
                int temp = A[mid];
                A[mid] = A[low];
                A[low] = temp;
                low++;
                mid++;
            } else if (A[mid] == 0) {
                mid++;

            } else if (A[mid] == 1) {
                int temp = A[mid];
                A[mid] = A[high];
                A[high] = temp;
                high--;
            }
        }
        return A;
    }
}
