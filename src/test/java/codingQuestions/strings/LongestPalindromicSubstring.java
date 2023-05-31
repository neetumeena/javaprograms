package codingQuestions.strings;

public class LongestPalindromicSubstring {
    private static void printLongestSubstringPalindrome(String str) {
        int n = str.length();
        boolean[][] table = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }
        int maxLen = 1;
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                start = i;
                maxLen = 2;
                table[i][i + 1] = true;

            }
        }

        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {

                    table[i][j] = true;
                    if (k > maxLen) {
                        maxLen = k;
                        start = i;
                    }
                }
            }
        }

        System.out.println(str.substring(start, start + maxLen));
    }

    public static void main(String[] agr) {

//        String str = "ababbacbbbc";
        String str = "e";


        printLongestSubstringPalindrome(str);
    }
}
