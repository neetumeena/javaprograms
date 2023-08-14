package codingQuestions.arrayBased;

public class CountSubstrings {

    public static void main(String[] args) {
        String A = "bobob";
        String B = "bob";

        System.out.println(getCount(A, B));
    }

    private static int getCount(String A, String s) {
        int len = A.length();
        int j = 0;
        int s_len = s.length();
        int ans = 0;
        if (A.equals(s))
            return 1;
        int i = 0;
        while (i < len - s_len + 1) {
            int k = i;
            j = 0;
            if (A.charAt(k) == s.charAt(j)) {
                k++;
                j++;
                while (j < s_len) {
                    if (A.charAt(k) == s.charAt(j)) {
                        k++;
                        j++;
                    } else {
                        break;
                    }
                }
                if (j == s_len) {
                    ans++;
                }
            }
            i++;
        }
        return ans;
    }
}
