package codingQuestions.classObjectBasedQs;

import java.util.Scanner;

public class TwoDMatrixOperations {

    int[][] mat;
    int r1;
    int c1;

    public TwoDMatrixOperations(int r, int c) {
        mat = new int[r][c];
        this.r1 = r;
        this.c1 = c;

    }

    public static void main(String[] args) {

        TwoDMatrixOperations a = new TwoDMatrixOperations(10, 5); // 10 rows, 5 columns
        a.input(new Scanner(System.in));
//        TwoDMatrixOperations b = new TwoDMatrixOperations(10, 5)  // 10 rows, 5 columns
//        b.input();
//        TwoDMatrixOperations c1 = a.add(b);
//        Matrix c2 = a.TwoDMatrixOperations(b);
//        TwoDMatrixOperations c3 = a.TwoDMatrixOperations();
        a.print();

    }

    private void input(Scanner sc) {

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    TwoDMatrixOperations add(TwoDMatrixOperations x) {
        TwoDMatrixOperations obj = new TwoDMatrixOperations(x.r1, x.c1);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat[i][j] = this.mat[i][j] + x.mat[i][j];
            }
        }
        return obj;
    }

    TwoDMatrixOperations subtract(TwoDMatrixOperations x) {
        TwoDMatrixOperations obj = new TwoDMatrixOperations(x.r1, x.c1);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat[i][j] = this.mat[i][j] - x.mat[i][j];
            }
        }
        return obj;

    }

    TwoDMatrixOperations transpose() {
        TwoDMatrixOperations obj = new TwoDMatrixOperations(this.r1, this.c1);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                obj.mat[j][i] = this.mat[i][j];
            }
        }
        return obj;
    }

    private void print() {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
