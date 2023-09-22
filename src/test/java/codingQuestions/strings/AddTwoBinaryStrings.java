package codingQuestions.strings;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110'";
        String res = getSumString(A, B);
        System.out.println(res);
//        System.out.println("1001110001111010101001110");
    }

    private static String getSumString(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int i = lenA - 1;
        int j = lenB - 1;
        int carray = 0;
        int sum = 0;
        int bit = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {

            if (i >= 0) {
                sum += (int) (A.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (int) (A.charAt(j) - '0');
                j--;
            }

            sum += carray;

            bit = sum % 2;
            carray = sum / 2;

            sb.append((char) (bit + '0'));


        }
        if (carray == 1)
            sb.append((char) (carray + '0'));
        sb.reverse();
        return sb.toString();

    }
}
