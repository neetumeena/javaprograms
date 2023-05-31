package codingQuestions.strings;

import java.util.Arrays;

public class RemoveConsecutiveDuplicate {
    public static void removeConsecutiveDuplicate(char[] input) {

        int len = input.length;
        int j = 0;

        for (int i = 1; i < len; i++) {

            if (input[i] != input[j]) {
                j++;
                input[j] = input[i];
            }

        }
        System.out.println(Arrays.copyOfRange(input, 0, j + 1));
    }
    public static String removeAdjacentDuplicates(String str) {
        int j = 0;
        StringBuilder result= new StringBuilder(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (result.charAt(j) != str.charAt(i)) {
                j++;
                result.append(str.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        char[] input = {'j', 'z', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a'};
//        char[] input = {'j', 'j', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a', 'j', 'j', 'w','a'};
//        char[] input = {'j', '2'};

        removeConsecutiveDuplicate(input);
        String str1="java";
        String str2="abbaca";
        String str3="j";
        String str4="javaa";
//        System.out.println(removeAdjacentDuplicates(str1));
        System.out.println(removeAdjacentDuplicates(str2));
        System.out.println(removeAdjacentDuplicates(str3));
        System.out.println(removeAdjacentDuplicates(str4));

    }
}
