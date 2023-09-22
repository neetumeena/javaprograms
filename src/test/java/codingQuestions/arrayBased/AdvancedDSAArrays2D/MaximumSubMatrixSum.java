package codingQuestions.arrayBased.AdvancedDSAArrays2D;

import java.util.Arrays;

public class MaximumSubMatrixSum {

    public static void main(String[] args) {
        int[][] A = {
                {2, 3, 6, 7},
                {2, 3, 4, 5}
        };
        int res = solve(A);
    }

    private static int solve(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] ps = new int[r][c];
        int res = 0;
        ps[0][0] = A[0][0];
        for (int i = 1; i < c; i++) {
            ps[0][i] = ps[0][i - 1] + A[0][i];
        }
        for (int i = 1; i < r; i++) {
            ps[i][0] = ps[i - 1][0] + A[i][0];
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                ps[i][j] = ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1] + A[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ps));


//        for (int i = 0; i < lenB; i++) {
//            int s1 = B[i] - 1;
//            int s2 = C[i] - 1;
//            int e1 = D[i] - 1;
//            int e2 = E[i] - 1;
//
////            if(e1==0)
////                res[i]=ps[s1][s2]
//
//
//        }
        return res;
    }
}
