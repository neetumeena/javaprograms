package codingQuestions.strings;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
/*
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
 The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 */

    // Function to remove adjacent duplicates
    static String removeDuplicates(String S) {
        String ans = "";

        // Iterate for every character
        // in the string
        for (int i = 0; i < S.length(); i++) {

            // If ans string is empty or its last
            // character does not match with the
            // current character then append this
            // character to the string
            if (ans.isEmpty() ||
                    ans.charAt(ans.length() - 1) != S.charAt(i))
                ans += S.charAt(i);

                // Matches with the previous one
            else if (ans.charAt(ans.length() - 1) == S.charAt(i))
                ans = ans.substring(0, ans.length() - 1);
        }

        // Return the answer
        return ans;
    }

    static String removeDuplicates_usingStack(String S) {

        Stack<Character> st = new Stack<>();
        StringBuilder shortString = new StringBuilder();


        for (int i = 0; i < S.length(); i++) {

            if (st.empty() || !st.peek().equals(S.charAt(i))) {
                st.push(S.charAt(i));
            } else {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            System.out.println("empty String");
        } else {
            while (!st.isEmpty()) {

                shortString.insert(0, st.peek());
                st.pop();
            }
        }
        return shortString.toString();
    }

    public static void main(String[] args) {

        String str = "keeexxllxaabcdefgg";
//        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicates_usingStack(str));


    }
}
