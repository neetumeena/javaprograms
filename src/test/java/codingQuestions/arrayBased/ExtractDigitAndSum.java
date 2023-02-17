package codingQuestions.arrayBased;

public class ExtractDigitAndSum {
    /*
    abc10def20ghi30kl5
10+20+30+5=65
     */
    public static void main(String[] agr) {
        String str = "abc10def20ghi30kl5";
        extractDigitAndSum(str);
    }
    private static void extractDigitAndSum(String str) {
        char[] arr = str.toCharArray();
        int n = 0;
        int sum = 0;
        for (char c : arr) {

            if (c >= '0' && c <= '9') {
                n = n * 10 + Integer.parseInt(String.valueOf(c));
            } else {
                sum = sum + n;
                n = 0;
            }
        }
        System.out.println(sum + n);
    }
}



