package codingQuestions.strings;

public class LongestCommonPrefix {


    static String longestCommonPrefix(String[] str) {

        int str_len = str.length;

        String pre = str[0];


        for (int i = 1; i < str_len; i++) {
            pre = getCommonPrefix(pre, str[i]);
        }
        return pre;
    }

    static String getCommonPrefix(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        String pre = "";

        for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {

            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            }
            pre += s1.charAt(i);
        }
        return pre;

    }

    public static void main(String[] agrs) {
        String[] str = {"fa"};
        String s = longestCommonPrefix(str);

        System.out.println(s);


    }
}
