package codingQuestions.arrayBased;

public class MaximumSumTriplet {


    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4, 9};
        System.out.println(getMaximumSumOfTriplet(arr));
    }

    private static int getMaximumSumOfTriplet(int[] arr) {

        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int max1 = 0;
            int max2 = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max1 = Math.max(arr[j], max1);
                }
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    max2 = Math.max(arr[j], max2);
                }
            }
            ans = Math.max(ans, arr[i] + max1 + max2);
        }
        return ans;
    }

}
