package codingQuestions.arrayBased;

public class NoOfSwapsToGetNumberLessThanB {
    public static void main(String[] args) {
//        int[] arr = {-3, 4, -2, 5, 3, -2, -8, 2, -1, 4};
        int[] arr = {19, 11, 3, 9, 7, 25, 6, 20, 4};

        int b = 10;
        int swaps = solution_NoOfSwapsToGetNumberLessThanB(arr, b);
        System.out.println("Swaps are = " + swaps);
    }

    private static int solution_NoOfSwapsToGetNumberLessThanB(int[] A, int b) {
        int n = A.length;
        int k = 0;
        int ans = 0;
        int badNo = 0;
        int s = 1;
        int e;
        if(b==0||b==1)
            return 0;
        for (int j : A) {
            if (j < b)
                k++;
        }
        e = k;
        for (int i = 0; i < k; i++) {
            if (A[i] >= b)
                badNo++;
        }
        ans = badNo;
        while (e < n) {
            if (A[s - 1] > b)
                badNo--;
            if (A[e] > b)
                badNo++;
            ans = Math.min(ans, badNo);
            s++;
            e++;
        }
        return ans;
    }
}
