package codingQuestions.arrayBased.AdvancedDSAMaths1;

public class LargePower {

    public static void main(String[] args) {
//        System.out.println(solve(2, 27));
        System.out.println(solve_(10, 3));
    }
    public static int solve(int A, int B) {
        long mod = 1000000007;
        long fact = 1;
        for (long i = 2; i <= B; i++) {
            fact = (fact * i) % (mod - 1);
        }
        return (int) getFastPower(A, fact, mod);
    }

    public static long getFastPower(long A, long p, long mod) {
        if (p == 0)
            return 1;

        long half = getFastPower(A, p / 2, mod) % mod;

        if (p % 2 == 0) {
            return (half * half) % mod;
        } else {
            return (((A * half) % mod) * half) % mod;
        }

    }

    public static int solve_(int A, int B) {

        int pow = fastPower(10, B - 2, B);
        return pow;

    }

    public static int fastPower(int A, int P, int B) {
        if (P == 0)
            return 1;
        int halfPow = fastPower(A, P / 2, B) % B;
        halfPow = (int) (halfPow * (long) halfPow % B) % B;
        if (P % 2 == 0)
            return halfPow;
        else
            return (int) (((long) halfPow * A )% B);
    }
    int power(int a, int x, int m) {
        if (x == 0) return 1;

        int half_power = power(a, x / 2, m) % m;
        half_power = (int) (half_power * (long) half_power % m) % m;

        if (x % 2 == 0)
            return half_power;
        else
            return (int) ((a * (long) half_power) % m);
    }
}
