package codingQuestions.arrayBased.AdvancedDSAArrays1D;

import java.util.Arrays;

//Q2
public class ContinuousSumQuery {

    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] res = findEachBeggarsSum(A, B);
        System.out.println(Arrays.toString(res));

    }

    private static int[] findEachBeggarsSum(int A, int[][] B) {

        int[] res = new int[A];
        for (int[] ints : B) {
            int l = ints[0];
            int r = ints[1];
            int j = l - 1;
            res[l - 1] = res[l - 1] + ints[2];
            if (r < A)
                res[r] = res[r] - ints[2];
        }
        System.out.println(Arrays.toString(res));

        for(int i=1;i<A;i++)
        {
            res[i]=res[i]+res[i-1];
        }
        return res;
    }
}
