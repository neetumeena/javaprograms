package codingQuestions.strings;

import java.util.Stack;

public class ValidParentheses {


    public static boolean isValid(String s) {

        Stack st = new Stack();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else if (!st.empty() && (s.charAt(i) == ')' && st.peek().equals('(')) ||
                    (s.charAt(i) == '}' && st.peek().equals('{'))
                    || (s.charAt(i) == ']' && st.peek().equals('[')))
                st.pop();

        }
        return st.empty();


    }


    public static void main(String[] agrs) {
        String s = "((())){}{}{{}}{[]";
        System.out.println(isValid(s));

    }
}
