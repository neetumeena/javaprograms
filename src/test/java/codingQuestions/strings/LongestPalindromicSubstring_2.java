package codingQuestions.strings;

public class LongestPalindromicSubstring_2 {
    public static void main(String[] agr) {
        String str = "abb";
        printLongestSubstringPalindrome(str);
    }

    private static void printLongestSubstringPalindrome(String A) {
        int len = A.length();
        int ans = 0;
        String res = "";
        for (int i = 0; i < len; i++) {
            int p1 = i;
            int p2 = i;
            String temp = expand(A, p1, p2);
            if (temp.length() > ans) {
                res = temp;
                ans=temp.length();
            }

        }
        for (int i = 0; i < len - 1; i++) {
            int p1 = i;
            int p2 = i + 1;
            String temp = expand(A, p1, p2);
            if (temp.length() > ans) {
                res = temp;
                ans=temp.length();

            }

        }

        System.out.println(res);
    }

    static String expand(String A, int p1, int p2) {
        int p1_ = p1;

        int len = A.length();
//        System.out.println(A.charAt(p1));
        while (p1 >= 0 && p2 < len && A.charAt(p1) == A.charAt(p2)) {
            p1--;
            p2++;
        }
        if (p1_ == p1)
            return A.substring(p1, p2);
        return A.substring(p1 + 1, p2);
    }


}
