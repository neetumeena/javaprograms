package codingQuestions.strings;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    static final int ASCII_SIZE = 256;

    public static void main(String[] args) {
        String abc = "mynameisneetumeenaz1122334455667890";
        removeDuplicate_method_1(abc);
        System.out.println("------------m2-----------------");
        removeDuplicate_method_2(abc);
    }

    private static void removeDuplicate_method_1(String abc) {

        int abc_len = abc.length();
        int[] count = new int[ASCII_SIZE];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < abc_len; i++) {
            if (count[abc.charAt(i)] < 1) {
                count[abc.charAt(i)]++;
                result.append(abc.charAt(i));

            }

        }
        System.out.println(result);
    }

    private static void removeDuplicate_method_2(String abc) {

        int abc_len = abc.length();
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < abc_len; i++) {
            hashSet.add(abc.charAt(i));
        }

        for (char a : hashSet) {
            System.out.print(a);

        }

    }

}
