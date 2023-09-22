package codingQuestions.arrayBased.AdvancedDSAArrays2D;

public class SearchInRowColumnWiseSortedMatrix {

    public static void main(String[] args) {

        int[][] A = {
                {1, 3, 5, 7},
                {2, 4, 6, 8}
        };
        int res = solve(A, 10);
        System.out.println(res);


    }


    private static int solve(int[][] A, int B) {


        int r = A.length;
        int c = A[0].length;
        int i = 0;
        int j = c - 1;
        int ans = Integer.MAX_VALUE;
        boolean found=false;
        while (j >= 0 & i < r) {
            if (A[i][j] == B) {
//                return ((i + 1) * 1009 + (j + 1));
                found=true;
                ans=Math.min(((i + 1) * 1009 + (j + 1)),ans);
                j--;


            } else if (A[i][j] > B) {

                j--;

            } else {
                i++;
            }


        }
        if (found)
            return ans;
        return -1;
    }
}
