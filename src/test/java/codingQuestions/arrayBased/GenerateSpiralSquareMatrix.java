package codingQuestions.arrayBased;

public class GenerateSpiralSquareMatrix {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = solution_GenerateSpiralSquareMatrix(5);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] solution_GenerateSpiralSquareMatrix(int n) {
        int square = n * n;
        int[][] res = new int[n][n];
        int i = 0;
        int j = 0;
        int s = 1;
        while (s < square) {
            for (int k = 0; k < n - 1; k++) {
                res[i][j] = s++;
                j++;
            }
            for (int k = 0; k < n - 1; k++) {
                res[i][j] = s++;
                i++;
            }
            for (int k = 0; k < n - 1; k++) {
                res[i][j] = s++;
                j--;
            }
            for (int k = 0; k < n - 1; k++) {
                res[i][j] = s++;
                i--;
            }
            n-=2;
            i++;
            j++;
        }
        if (n == 1) {
            res[i][j] = s;
        }
        return res;
    }
}
