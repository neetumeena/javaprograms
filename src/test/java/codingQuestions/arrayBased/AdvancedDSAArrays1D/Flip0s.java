package codingQuestions.arrayBased.AdvancedDSAArrays1D;

import java.util.Arrays;

public class Flip0s {

    public static void main(String[] args) {
        String s = "0111000100010";
        int[] res = flip(s);
        int[] res_ = flip_(s);

        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res_));

    }


    public static int[] flip(String A) {

        int len = A.length();
        int cSum = 0;
        int maxSum = 0;
        int l = 0, r = 0;

        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            if (A.charAt(i) == '0') {
                cSum++;
            } else {
                cSum--;
            }
            if (cSum > maxSum) {
                maxSum = cSum;
                res[0] = l + 1;
                res[1] = r + 1;
            }
            if (cSum < 0) {
                cSum = 0;
                l = l + 1;
            }
            r = r + 1;

        }
        if (maxSum == 0)
            return new int[0];

        return res;

    }
    public static int[] flip_(String A) {

        int len = A.length();
        int cSum = 0;
        int maxSum = 0;
        int l = 0, r = 0;

        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            if (A.charAt(i) == '0') {
                cSum++;
            } else {
                cSum--;
            }
            if (cSum > maxSum) {
                maxSum = cSum;
                res[0] = l + 1;
                res[1] = r + 1;
            }
            if (cSum < 0) {
                cSum = 0;
                l = l + 1;
            }
            r = r + 1;

        }
        if (maxSum == 0)
            return new int[0];

        return res;

    }
}
