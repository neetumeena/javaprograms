package codingQuestions.strings;

public class ToggleAlphabets {

    public static void main(String[] args) {
        System.out.println(solve("HelLo"));
        System.out.println(solve2("HelLo"));
    }

    private static String solve2(String A) {
        int len = A.length();
        char[] str = A.toCharArray();
        for (int i = 0; i < len; i++) {

            str[i] = (char) ((int) str[i] ^ 32);

        }
        return String.valueOf(str);

    }

    private static String solve(String A) {

        int len = A.length();
        char[] str = A.toCharArray();
        for (int i = 0; i < len; i++) {
            if (str[i] >= 'a' && str[i] <= 'z') {
                str[i] = (char) (str[i] - 32);

            } else
                str[i] = (char) (str[i] + 32);

        }
        return String.valueOf(str);
    }
}
