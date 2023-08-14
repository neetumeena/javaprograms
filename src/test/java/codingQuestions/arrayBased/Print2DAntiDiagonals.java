package codingQuestions.arrayBased;

public class Print2DAntiDiagonals {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res[][] = Print2DAntiDiagonals.diagonal(arr);
        int N = res.length;
        int M = res[0].length;
        System.out.println("N =" + N +" ,  M = "+M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <M; j++) {
//                System.out.println("i =" + i +" ,  j = "+j);
                System.out.print(res[i][j] + " ");
//                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][] diagonal(int[][] A) {

        int N = A.length;
        // int C=A[0].length;
        int i = 0, j = 0;
        int[][] res = new int[(2 * N - 1)][N];
        int k = 0;
        int n = 0;
        int m = 0;
        for (int c = 0; c < N; c++) {
            i = 0;
            j = c;
            while (i < N && j >= 0) {

                res[n][m++] = A[i][j];
                i++;
                j--;
            }
            m = 0;
            n++;

        }
        for (int r = 1; r < N; r++) {
            i = r;
            j = N - 1;
            while (i < N && j >= 0) {
                res[n][m++] = A[i][j];
                i++;
                j--;
            }
            m = 0;
            n++;

        }
        return res;
    }

}
