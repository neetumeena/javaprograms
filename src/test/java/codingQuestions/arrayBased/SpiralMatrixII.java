package codingQuestions.arrayBased;

import java.util.ArrayList;

public class SpiralMatrixII {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int r1 = 0, r2 = A;
        int c1 = 0, c2 = A;
        int val = 1;
        while (r1 < r2 && c1 < c2) {
            for (int i = r1; i < c2; i++) {
                arr.add(val++);

            }
            res.add(arr);
            arr.clear();
            for (int i = r1; i < c2; i++) {
                arr.add(val++);

            }
            res.add(arr);
            arr.clear();
            for (int i = r2; i > c1; i--) {
                arr.add(val++);

            }
            res.add(arr);
            arr.clear();
            for (int i = r2; i < r1; i--) {
                arr.add(val++);

            }
            res.add(arr);
            arr.clear();

            r1++;
            c1++;
            r2--;
            c2--;


        }
        return res;

    }

    public static void main(String[] args) {
        new SpiralMatrixII().generateMatrix(5);
    }
}
