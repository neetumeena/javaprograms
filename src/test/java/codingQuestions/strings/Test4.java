package codingQuestions.strings;

public class Test4 {


    static int removeSpaces(char[] str) {
        // To keep track of non-space character count
        int count = 0;

        // Traverse the given string.
        // If current character
        // is not space, then place
        // it at index 'count++'
        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ')
                str[count++] = str[i]; // here count is
        // incremented
        System.out.println(str);
        return count;
    }

    // Driver code
    public static void main(String[] args) {
        char[] str = "g eeks for ge eeks ".toCharArray();
        int i = removeSpaces(str);
        System.out.println(String.valueOf(str).subSequence(0, i));
    }


}
