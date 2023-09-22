package codingQuestions.arrayBased.AdvancedDSAArrays1D;

import java.util.Arrays;

// A- Q1
public class AddOneToNumber {

    public static void main(String[] args) {
//        int[] A = {0, 0, 1, 2, 3};
//        int[] A = {0, 0, 1, 2, 9};
        int[] A = {1,3,9,9};
        int[] res = plusOne(A);
        System.out.println(Arrays.toString(res));
    }


    public static int[] plusOne(int[] A) {

        int len = A.length;
        int[] res;
        int carry = 0;
        int j = len;
        int i = len - 1;
        if (A[len - 1] < 9) {
            A[len - 1] = A[len - 1] + 1;
            return trim(A, len);
        } else {
            res = new int[len + 1];

            while (i >= 0) {
                if (A[i] == 9) {
                    res[j--] = 0;
                    carry = 1;
                } else {
                    res[j--] = A[i--] + 1;
                    carry = 0;
                    break;
                }
                i--;
            }
            if (carry == 1)
                res[j] = 1;
            if (i>=0) {
                while (i >= 0) {
                    res[j--] = A[i--];

                }

            }
        }
        return trim(res, len + 1);

    }

    private static int[] trim(int[] A, int len) {
        int count = 0;
        int i = 0;

        while (A[i] == 0 && i < len) {
            count++;
            i++;
        }
        return Arrays.copyOfRange(A, count, len);
    }
}
