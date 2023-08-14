package codingQuestions.arrayBased;

public class Print2DAArrayAllElementsDiagonally {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {13, 14, 15}};
        int[][] arr3 = {{1}, {5}, {9}, {13}};
        int[][] arr4 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
//        printAllDiagonals(arr1);
//        printAllDiagonals(arr2);
//        printAllDiagonals(arr3);
        printAllDiagonals(arr4);
    }
    private static void printAllDiagonals(int[][] arr) {
        int C = arr[0].length;
        int R = arr.length;
        int i = 0, j = 0;
        for (int c = 0; c < C; c++) {
            i = 0;
            j = c;
            while (i < R && j >= 0) {
                System.out.print(arr[i++][j--] + ",");
            }
            System.out.println();
        }
        for (int r = 1; r < R; r++) {
            i = r;
            j = C - 1;
            while (i < R && j >= 0) {
                System.out.print(arr[i++][j--] + ",");
            }
            System.out.println();
        }
    }
}
