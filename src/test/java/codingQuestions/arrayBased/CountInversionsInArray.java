package codingQuestions.arrayBased;

public class CountInversionsInArray {

    static void getInversionCount(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] ar = {9, 6, 8, 4, 0, 10};
        getInversionCount(ar);
    }
}
