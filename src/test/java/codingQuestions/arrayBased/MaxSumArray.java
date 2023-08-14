package codingQuestions.arrayBased;

public class MaxSumArray {

    public static void main(String[] args) {
//        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        int[] arr = {-3, 4, -2, 5, 3, -2, -8, 2, -1, 4};
//        int k=1;
        int k=5;

        int maxSum = maxSumArray_bruteForceApproach(arr, k);
        System.out.println("Answer_maxSumArray_bruteForceApproach = " + maxSum);
        maxSum = maxSumArray_prefixSum(arr, k);
        System.out.println("Answer_maxSumArray_prefixSum = " + maxSum);
        maxSum = maxSumArray_slidingWindowSolution(arr, k);
        System.out.println("Answer_maxSumArray_slidingWindowSolution = " + maxSum);
    }

    private static int maxSumArray_bruteForceApproach(int[] A, int k) {
        int n = A.length;
        int s = 0, e = k - 1;
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        while (e < n) {
            sum = 0;
            for (int i = s; i <= e; i++) {
                sum += A[i];
            }
            if (sum > maxSum) {
//                System.out.println("Sum=" +sum);
                maxSum = sum;
//                System.out.println(maxSum);
            }
            s++;
            e++;
        }
        return maxSum;
    }

    private static int maxSumArray_prefixSum(int[] A, int k) {
        int n = A.length;
        int s = 0, e = k - 1;
        int[] ps = new int[n];
        ps[0] = A[0];
        for (int i = 1; i < n; i++) {
            ps[i] += ps[i - 1] + A[i];
        }
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        while (e < n) {
            if (s == 0)
                sum = ps[e];
            else
                sum = ps[e] - ps[s - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
            s++;
            e++;
        }
        return maxSum;
    }

    private static int maxSumArray_slidingWindowSolution(int[] A, int k) {
        int n = A.length;
        int s = 1, e = k;
        int sum = 0;
        int maxSum = sum;
        for (int i = 0; i < k; i++) {
            sum += A[i];
        }
        while (e < n) {
            sum = sum-A[s - 1] +A[e];
            if (sum > maxSum) {
                maxSum = sum;
            }
            s++;
            e++;
        }
        return maxSum;
    }
}
