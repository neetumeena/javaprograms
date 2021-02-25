package codingQuestions.strings;

public class MaxOccurrenceOfChar {

    public static final int ASCII_SIZE = 256;


    public static void main(String[] args) {
//        String abc ="My name is neetu meena";
        String abc = "";

        char c = getMaxOccurringChar(abc);
        if (c == '0') {
            System.out.println("length is 0 ");
        } else
            System.out.println("max occurring char = " + c);

    }

    private static char getMaxOccurringChar(String abc) {
        int abc_len = abc.length();
        if (abc_len < 1)
            return '0';
        int[] count = new int[ASCII_SIZE];

        for (int i = 0; i < abc_len; i++) {
            count[abc.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';

        for (int i = 0; i < abc_len; i++) {
            if (max < count[abc.charAt(i)]) {
                max = count[abc.charAt(i)];
                result = abc.charAt(i);
            }
        }
        return result;
    }


}
