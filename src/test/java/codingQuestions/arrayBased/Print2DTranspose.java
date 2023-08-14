package codingQuestions.arrayBased;

public class Print2DTranspose {

    public static void main(String[] args) {
//        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr1 = {{1, 2}, {1, 2}, {1, 2}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        printTranspose(arr1);

    }

    private static void printTranspose(int[][] arr) {
        int N = arr.length;
        int M = arr[0].length;
        int[][] res = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res[j][i] = arr[i][j];

            }

        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
