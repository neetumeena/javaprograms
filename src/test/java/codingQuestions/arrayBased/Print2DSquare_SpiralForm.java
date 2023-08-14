package codingQuestions.arrayBased;

public class Print2DSquare_SpiralForm {


    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        solution_print2DArrayClockWise(arr1);
    }

    private static void solution_print2DArrayClockWise(int[][] a) {
        int n = a.length;
        int i = 0, j = 0;
        int m = 1;
        System.out.println();
        int counter=0;
        while (n>=1) {
//            i = m-1;
//            j=m-1;
//            System.out.println(++counter);
            for (int k = 0; k < n - 1; k++) {
                System.out.print(a[i][j]);
                System.out.print(" ");

                j++;
            }

            for (int k = 0; k < n - 1; k++) {
                System.out.print(a[i][j]);
                System.out.print(" ");

                i++;
            }
//            System.out.println();
            for (int k = 0; k < n - 1; k++) {
                System.out.print(a[i][j]);
                System.out.print(" ");

                j--;
            }
//            System.out.println();

            for (int k = 0; k < n - 1; k++) {
                System.out.print(a[i][j]);
                System.out.print(" ");

                i--;
            }
            n--;
            n--;
            i++;
            j++;
        }
    }
}
