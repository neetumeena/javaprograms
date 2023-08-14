package codingQuestions.arrayBased;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110'";
        String res = getSumString(A, B);
        System.out.println(res);
        System.out.println("1001110001111010101001110");
    }

    private static String getSumString(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int i = lenA - 1;
        int j = lenB - 1;
        char carray = '0';
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            if (A.charAt(i) == '0' && B.charAt(j) == '0') {
                if (carray == '0')
                    sb.append("0");
                else
                    sb.append("1");
            } else if ((A.charAt(i) == '1' && B.charAt(j) == '0') || (A.charAt(i) == '0' && B.charAt(j) == '1')) {
                if (carray == '0')
                    sb.append("1");
                else {
                    sb.append("0");
                }
            } else if ((A.charAt(i) == '1' && B.charAt(j) == '1')) {
                if (carray == '0') {
                    sb.append("0");

                } else {
                    sb.append("1");
                }
                carray = '1';
            }
            i--;
            j--;
        }
        if (i != 0) {
            while (i >= 0) {
                if (carray == '1') {
                    if (A.charAt(i) == '1')
                        sb.append("0");
                    else {
                        sb.append("1");
                        carray = '0';
                    }

                }
                i--;
            }
        }
        if (j != 0) {
            while (j >= 0) {
                if (carray == '1') {
                    if (B.charAt(j) == '1')
                        sb.append("0");
                    else {
                        sb.append("1");
                        carray = '0';
                    }

                }
                j--;
            }
        }
        if (carray == '1')
            sb.append("1");
        sb.reverse();
        return sb.toString();

    }
}
