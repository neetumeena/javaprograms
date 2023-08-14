package codingQuestions.arrayBased;

public class SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int b = 3;
        int index = solution_SubArrayWithLeastAverage(arr, b);
    }

    private static int solution_SubArrayWithLeastAverage(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];

        }
        int s = 1;
        int e = B;
        int minSum = sum;
        int index = 0;
        while (e < n) {
            sum = sum - A[s - 1] + A[e];
            if (minSum > sum) {
                index = s;
                minSum = sum;
            }
            s++;
            e++;
        }
        return index;

    }
}
