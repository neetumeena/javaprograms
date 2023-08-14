package codingQuestions.strings;

public class CountSubString {

    public static void main(String[] args) {

        solve("acbagkagg");
    }

    private static void solve(String s) {

        char[] ch = s.toCharArray();
        int c_a = 0;
        int c_p = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                c_a++;
            }
            if (ch[i] == 'g') {
                c_p = c_p + c_a;
            }
        }
        System.out.println(c_p);
    }
}
