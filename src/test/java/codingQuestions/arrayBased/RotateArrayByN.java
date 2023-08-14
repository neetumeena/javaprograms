package codingQuestions.arrayBased;

public class RotateArrayByN {

    public static void main(String[] args) {
        int[] arr = {6,31,33,13,82,66,9,12,69,21,17,2,50,69,90,71,31,1,13,70,94,46,89,13,55,54,67,97,28,27,62,34,41,18,15,35,13,84,93,27,89,23,6,56,94,40,54,95,47};
//        int[] arr = {5, 17, 100, 11};
        int[] b = {88,85,98,36,66,40,30,26,51,77,62,60,92,64,53,86,24,53,85,49,57,29,32,60,75,82,17,23,67,51,23,11,70,59};

//        rotateArrayByN(arr, 1);
        int[][] res = rotateArrayByN_1(arr, b);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " , ");

            }
            System.out.println();


        }

    }

    private static void rotateArrayByN(int[] arr, int n) {

        int len = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int value : arr) {
            System.out.print(value + " , ");

        }
        System.out.println();
        i = n;
        j = len - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
//        for (int value : arr) {
//            System.out.print(value + " , ");
//
//        }
//        System.out.println();

        i = 0;
        j = len - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
//        for (int value : arr) {
//            System.out.print(value + " , ");
//
//        }
    }

    private static int[][] rotateArrayByN_1(int[] A, int[] B) {
        int len_a = A.length;
        int len_b = B.length;
        int[][] arr = new int[len_b][len_a];

        int[] copyA = new int[len_a];
        System.arraycopy(A, 0, copyA, 0, len_a);
//        for (int value : copyA) {
//            System.out.print(value + " , ");
//
//        }
//        System.out.println();

        for (int r = 0; r < len_b; r++) {
            int n = B[r];
            if(n>len_a)
                n=n%len_a;
            int i = 0;
            int j = n - 1;
            while (i < j) {
                swap(copyA, i, j);
                i++;
                j--;
            }
//            for (int value : copyA) {
//                System.out.print(value + " , ");
//
//            }
//            System.out.println();
            i = n;
            j = len_a - 1;
            while (i < j) {
                swap(copyA, i, j);
                i++;
                j--;
            }
//            for (int value : copyA) {
//                System.out.print(value + " , ");
//
//            }
//            System.out.println();
            i = 0;
            j = len_a - 1;
            while (i < j) {
                swap(copyA, i, j);
                i++;
                j--;
            }
//            for (int value : copyA) {
//                System.out.print(value + " , ");
//
//            }
//            System.out.println();
//            System.out.println("----------------------------------------------------------");
            for (int c = 0; c < len_a; c++) {
                arr[r][c] = copyA[c];
            }
            System.arraycopy(A, 0, copyA, 0, len_a);
        }
        return arr;
    }

    private static void swap(int[] A, int i, int j) {

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
