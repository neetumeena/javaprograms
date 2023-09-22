package codingQuestions.strings;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
//        System.out.println(sortString("asdf"));
//        System.out.println(sortString("asdf"));

        int[] a = {1, 3, 1};
        System.out.println(Arrays.toString(sortArray(a)));


    }

    private static int[] sortArray(int[] A) {
        int[] ch = new int[100001];
        int len = A.length;
        for (int i = 0; i < len; i++) {

            ch[A[i]] = ch[A[i]] + 1;
        }
        int j = 0;
        for (int i = 0; i < 100000; i++) {
            if (ch[i] > 0) {
                int k = 0;
                while (k < ch[i]) {
                    A[j++] = i;
                    k++;
                }

            }
        }
        return A;
    }

    private static String sortString(String A) {

        int[] ch = new int[26];
        int len = A.length();
        for (int i = 0; i < len; i++) {
            int index = A.charAt(i) - 'a';
            System.out.println("index = " + index);
            ch[index] = ch[index] + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (ch[i] > 0) {
                int k = 0;
                while (k < ch[i]) {
                    sb.append((char) ('a' + i));
                    k++;
                }

            }
        }
        return sb.toString();
    }
}
