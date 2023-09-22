package codingQuestions.arrayBased.AdvancedDSAArrays1D;

public class MaxSubArraySum {
    public static void main(String[] args) {
//        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
//        int[] arr = {10, -500, 7, 8, -1, 2,-20,100};
        int[] arr = {-1, -2, -3};

        int maxSum = maxSumArray_KadenAlgo(arr);
        System.out.println("Answer_maxSumArray_KadenAlgo = " + maxSum);


    }

    private static int maxSumArray_KadenAlgo(int[] arr) {
        int ans = arr[0];
        int sum = 0;
        for (int j : arr) {

            sum += j;
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
