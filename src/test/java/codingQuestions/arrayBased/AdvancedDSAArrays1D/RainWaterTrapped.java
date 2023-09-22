package codingQuestions.arrayBased.AdvancedDSAArrays1D;

//Q3
public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] A = {1, 0, 2, 5, 1, 0, 3, 8, 0, 7, 4};
        int res = solve_RainWaterTrapped(A);
        System.out.println(res);

    }

    private static int solve_RainWaterTrapped(int[] A) {
        int len = A.length;
        int ans = 0;
        int left = 0, right = len - 1;
        int maxLeft = 0, maxRight = 0;
        while (left < right) {
            if (A[left] < A[right]) {
                if (A[left] >= maxLeft) {
                    maxLeft = A[left];
                } else {
                    ans += maxLeft - A[left];
                }
                left++;
            } else {
                if (A[right] >= maxRight) {
                    maxRight = A[right];
                } else {
                    ans += maxRight - A[right];
                }
                right--;
            }
        }
        return ans;
    }
}
