package codingQuestions.strings;

public class LongestCommonPrefix {


    static String longestCommonPrefix_method1(String[] str) {

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
        StringBuilder pre = new StringBuilder();

        for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {

            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            }
            pre.append(s1.charAt(i));
        }
        return pre.toString();

    }

    public static void main(String[] agr) {
        String[] str = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String s1 = longestCommonPrefix_method1(str);
        String s2 = longestCommonPrefix_method2(str);

        System.out.println(s1);
        System.out.println(s2);


    }

    private static String longestCommonPrefix_method2(String[] str) {

        int n = str.length;
        ;
        String result = str[0];

        for (int i = 1; i < n; i++) {

            while (str[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
            if (result.isEmpty())
                return "-1";
        }
        return result;
    }
}
