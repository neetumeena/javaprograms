package codingQuestions.recursion;

public class kthGrammar {
    public static void main(String[] args) {
        System.out.println(solve(4, 3));
    }

    public static int solve(int A, int B) {


        if (A == 1)
            return 0;

        int mid = (int) Math.pow(2, A - 1) / 2;

        if (B < mid)
            return solve(A - 1, B);
        else
            return 1-(solve(A - 1, B - mid));

    }
}
