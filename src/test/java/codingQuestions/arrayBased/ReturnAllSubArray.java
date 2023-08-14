package codingQuestions.arrayBased;

public class ReturnAllSubArray {
    /*
    public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int n = A.size();
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j <n ; j++){
                ArrayList<Integer> v = new ArrayList<Integer>();
                for(int k = i ; k <= j ; k++){
                    v.add(A.get(k));
                }
                ans.add(v);
            }
        }
        return ans;
    }
}
     */

    public static void main(String[] args) {

        System.out.println();

    }

    public int[][] solve_returnAllSubArray(int[] a) {
        int n = a.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    res[i][k] = a[i];
                }
            }
        }
        return res;

    }

    public int[][] solve(int[] A) {

        int[][] b = new int[A.length * (A.length + 1) / 2][];

        int row = 0;

        for (int s = 0; s < A.length; s++) {


            for (int e = s; e < A.length; e++) {

                b[row] = new int[e - s + 1];

                int indx = 0;

                for (int k = s; k <= e; k++) {

                    b[row][indx] = A[k];

                    indx++;

                }

                row++;

            }

        }

        return b;


    }

}
