package codingQuestions.arrayBased;

public class RowToColumnZero {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        rowToColumnZero_Solution(arr1);
    }

    private static void rowToColumnZero_Solution(int[][] A) {

        int N = A.length;
        int M = A[0].length;
        int col0 = 1;
        int[][] res = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0) {
                    A[i][0] = 0;
                    if (j != 0)
                        A[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (A[i][j] != 0) {
                    if (A[0][j] == 0 || A[i][0] == 0) {
                        A[i][j] = 0;
                    }
                }
            }
        }

        if (A[0][0] == 0) {
            for (int i = 0; i < M; i++) {
                A[0][i] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < N; i++) {
                A[i][0] = 0;
            }
        }


    }
}
