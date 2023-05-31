package codingQuestions.strings;

public class StringProblem {


    public static void main(String[] agr) {
        String a = "EVERYTHING";
        String b = "SomeThings";
        String c = getSubString(a, b);
        System.out.println(c);
    }

    private static String getSubString(String a, String b) {
        String res = "";
        int al = a.length();
        int bl = b.length();
        int j = 0;
        int i = 0;
        while (j < bl) {
            if (b.charAt(j) >= 'A' && b.charAt(j) <= 'Z') {
                if (j < al) {
                    res = res + a.charAt(j);
                    j++;
                } else
                    break;
            } else
                j++;
        }
        while (i < al) {

            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                if (i < bl) {
                    res = res + b.charAt(i);
                    i++;
                } else
                    break;
            } else
                i++;
        }

        return res;
    }


}
