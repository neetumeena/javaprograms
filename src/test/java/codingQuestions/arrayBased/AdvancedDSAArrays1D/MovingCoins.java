package codingQuestions.arrayBased.AdvancedDSAArrays1D;

public class MovingCoins {

    public static void main(String[] args) {
        int[] A = {2, 2, 2, 3, 3};
        System.out.println(solve(A));
    }

    private static int solve(int[] A) {
        int len = A.length;
        int ans = 0;
        for (int i = 0; i < len - 1; i++) {
            if ((A[i] - A[i + 1]) % 2 != 0) {
                ans += 1;
            }
        }
        return ans;
    }
}
