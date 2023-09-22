package codingQuestions.strings;

public class IsDictionary {
    public static void main(String[] args) {
        String[] str = {"fine", "none", "no"};
        String B = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(solve(str, B));

    }

    private static int solve(String[] A, String B) {
        int len = A.length;
        for (int i = 0; i < len - 1; i++) {
            int j = 0;
            if (A[i].length() > A[i + 1].length())
                return 0;
            while (A[i].charAt(j) == A[i + 1].charAt(j) && j < A[i].length()) {
                j++;
            }
            if (B.indexOf(A[i].charAt(0)) > B.indexOf(A[i + 1].charAt(0)))
                return 0;

        }
        return 1;

    }
}
