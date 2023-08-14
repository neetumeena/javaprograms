package codingQuestions.recursion;

public class IsMagic {
    public static void main(String[] args) {

        System.out.println(solve(83557));

    }

    private static int solve(int A) {

        if (A > 1 && A < 10)
            return 0;
        if (A == 1)
            return 1;
        return solve(sumOfDigits(A));

    }

    static int sumOfDigits(int A) {
        if (A == 0)
            return 0;
        return (A % 10 + sumOfDigits(A / 10));
    }
}
