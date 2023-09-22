package codingQuestions.arrayBased.AdvancedDSAMaths1;

public class PairSumDivisibleByM {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 2;
        int count = solve_(A, B);
        System.out.println(count);
    }

    private static int solve(int[] A, int B) {
        int mod = 100000007;
        int[] countArr = new int[B];
        int len = A.length;
        for (int k : A) {
            int index = k % B;
            countArr[index] = countArr[index] + 1;

        }
        int res = 0;

        res += (countArr[0] * (countArr[0] - 1) / 2) % mod;
        int i = 1;
        int j = B - 1;
        while (i <= j) {
            if (i == j) {
                res += (countArr[i] * (countArr[j] - 1) / 2) % mod;
            } else {
                res += countArr[i] * countArr[j];
                res = res % mod;
            }
            i++;
            j--;

        }
        return res % mod;
    }

    private static int solve_(int[] A, int B) {
        int mod = 100000007;
        long[] countArr = new long[B];
        for (int j : A) {
            int index = j % B;
            countArr[index] = countArr[index] + 1;
        }
//
//        System.out.println(Arrays.toString(countArr));
        long res = 0;
        long x = countArr[0];
        res += ((x * (x - 1)) / 2);
        int i = 1;
        int j = B - 1;
        if (B % 2 == 0) {
            long y = countArr[B / 2];
            res += ((y * (y - 1)) / 2);
        }
        while (i < j) {
            res += countArr[i] * countArr[j];

            i++;
            j--;
        }
        return (int)res % mod;
    }
}
//925783977 -- ex

//= 25783914