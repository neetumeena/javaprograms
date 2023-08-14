package codingQuestions.arrayBased;

public class ReverseTheString {
    public static void main(String[] args) {
        String s = " bwroafq rfmy eimspekey w wnzjh qisjiabv ya hncn mazvb pfwlcsnkqz muiapt nnvwwx rp bsypbqu ymg bjwapykfil";
        System.out.println("s length = "+ s.length());
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        String[] str = s.split(" ");

        for (int k = 0; k < str.length; k++) {
            System.out.println(" str[k] = " + str[k]);
            if (k < str.length - 1) {


                System.out.print(" ");
            }
        }
        System.out.println("---------------------------");

        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            String s1 = str[i];
            str[i] = str[j];
            str[j] = s1;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < str.length; k++) {
            if (!str[k].contains(" ") && str[k] != "") {
                sb.append(str[k]);
            }
            else
            {
                System.out.println("0934809384023840");
            }
            // System.out.println(" str[k] = " + str[k]);

            if (k < str.length - 1) {
                System.out.println(" str[k] = " + str[k]);

                sb.append(" ");
            }
        }
        System.out.println("sb length = "+ s.length());

        System.out.println("sb = " + sb);
        String res=sb.toString();
        System.out.println("res length = "+ res.length());
        System.out.println("res = " + res);
        return sb.toString();

    }
}
