package codingQuestions.strings;

public class PrintDuplicateChars {

    public static final int ASCII_SIZE = 256;

    public static void main(String[] args) {
//        String abc ="mynameisneetumeena123455566677711128";
        String abc = "";

        getMaxOccurringChar(abc);
    }

    private static void getMaxOccurringChar(String abc) {
        int abc_len = abc.length();
        if (abc_len < 1) {
            System.out.println("No duplicate");
            return;
        }
        int[] count = new int[ASCII_SIZE];

        for (int i = 0; i < abc_len; i++) {
            count[abc.charAt(i)]++;
        }
        for (int i = 0; i < abc_len; i++) {
            if (count[abc.charAt(i)] > 0) {
                System.out.println(abc.charAt(i) + " - " + count[abc.charAt(i)]);
                count[abc.charAt(i)] = 0;
            }
        }
//        return result;
    }


}
