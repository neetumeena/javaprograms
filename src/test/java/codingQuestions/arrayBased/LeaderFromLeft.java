package codingQuestions.arrayBased;

public class LeaderFromLeft {

    public static void main(String[] args) {
//        int[] arr = {2, 5, 3, 4, 17, 16};
        int[] arr = {20, 5, 3, 4, 17, 16};

        solve(arr);
    }

    private static void solve(int[] arr) {
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
