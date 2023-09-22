package codingQuestions.arrayBased.AdvancedDSAArrays2D;

import java.util.Arrays;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
//        generateMatrix(5);
        System.out.println(Arrays.deepToString(generateMatrix(80)));
    }

    public static int[][] generateMatrix(int A) {
        int value = 1;
        int r = 0, c = 0;
        int[][] res = new int[A][A];
        while (A > 1) {
            for (int i = 1; i < A; i++) {
                res[r][c] = value;
                value++;
                c++;
            }
            for (int i = 1; i < A; i++) {
                res[r][c] = value;
                value++;
                r++;
            }
            for (int i = 1; i < A; i++) {
                res[r][c] = value;
                value++;
                c--;
            }
            for (int i = 1; i < A; i++) {
                res[r][c] = value;
                value++;
                r--;
            }
            r += 1;
            c += 1;
            A -= 2;
        }
        if (A == 1) {
            res[r][c] = value;
        }
        return res;
    }


}
