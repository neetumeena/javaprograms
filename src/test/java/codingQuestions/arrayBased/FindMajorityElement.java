package codingQuestions.arrayBased;

public class FindMajorityElement {


    public static void main(String[] args) {

        int[] a = {3,2,3};

        findMajorityElement(a);

    }

    private static void findMajorityElement(int[] a) {
        int size = a.length;

        int cand = findCandidate(a, size);
        if (isMajorityEle(cand, a, size))
            System.out.println("Majority Element is = " + cand);
        else
            System.out.println("No majority element present");

    }

    private static boolean isMajorityEle(int cand, int[] a, int size) {

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == cand) {
                count++;
            }
        }
        return count > size / 2;
    }

    private static int findCandidate(int[] a, int size) {

        int majorityIndex = 0;
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (a[majorityIndex] != a[i]) {
                count = count - 1;
                if (count == 0) {
                    majorityIndex = i;
                    count = 1;
                }

            } else {
                count++;
            }

        }
        return a[majorityIndex];
    }
}
