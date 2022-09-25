public class ExtractDigitAndSum {
    /*
    abc10def20ghi30kl5
10+20+30+5=65

     */

    public static void main(String[] agr) {
        String str = "abcasa";
        extractDigitandSum(str);
    }

    private static void extractDigitandSum(String str) {

        char[] arr = str.toCharArray();
        int len = arr.length;
        int n = 0;
        int count = 0;
        int sum = 0;
        int index = 0;

        for (int i = 0; i < len; i++) {

            if (arr[i] >= '0' && arr[i] <= '9') {
                n = n * 10 + Integer.parseInt(String.valueOf(arr[i]));


            }
            else {
            sum = sum + n;
            n = 0;}

        }
        System.out.println(sum+n);
    }


}



