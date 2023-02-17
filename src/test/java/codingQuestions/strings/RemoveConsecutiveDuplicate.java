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

    public static void main(String[] args) {
        char[] input = {'j', 'j', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a'};
//        char[] input = {'j', 'j', 'a', 'a', 'a', 'v', 'v', 'v', 'v', 'a', 'a', 'a', 'a', 'a', 'j', 'j', 'w','a'};
//        char[] input = {'j', '2'};

        removeConsecutiveDuplicate(input);
    }
}
