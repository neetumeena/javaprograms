package codingQuestions.strings;

public class StringReversal {

    public static void main(String[] args) {

        String s = "aabbcbbaa";

        int[] A = {4, 2, 5, 1};

//        reverseString(s);

        findTheSmallestEle(A);


    }

    private static void findTheSmallestEle(int[] a) {

        int len = a.length;
        int res = a[0];
        for (int i = 1; i < len; i++) {
            if (a[i] < res) {
                res = a[i];
            }
        }
        System.out.println(res);
    }

    public static void reverseString(String S) {


        int len = S.length();

        int j = len - 1;
        String res = "";

        while (j >= 0) {
            res = res + S.charAt(j);
            j--;
        }

        if (res.equals(S))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }


}
