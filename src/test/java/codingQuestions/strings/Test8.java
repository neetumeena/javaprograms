package codingQuestions.strings;

public class Test8 {


    /*

    String s1=popabcdefbob
    out= pop, bob,

    String a =abc
    output = abc, acb, cab,bca,
     */
    // 90, 180, 360
    //batballabcdbalbllbatabcbaball , i=0, l_s1=3
    // all bats to ball, all balls to bat, out ==ballbatabcbalbllball

    /*
   if(s1[i]!=s1[i+1])
   {
        s=s+s[i]
   }

     */


    static void replaceBatBall(String s, String s1, String s2) {
        int l_s1 = s1.length();
        int l_s2 = s2.length();
        int i = 0;

        String result = "";
        while (i < s.length() - 1) {
            if (s.substring(i, i + l_s1).equals(s1)) {
//                s.replace(s.substring(i,i+l_s1-1),s2);
                result = result + s2;
                i = i + l_s1;

            } else if (s.substring(i, i + l_s2).equals(s2)) {
//                s.replace(s.substring(i,i+l_s1-1),s2);
                result = result + s1;
                i = i + l_s1;

            } else {
                result = result + s.charAt(i);
                i++;
            }
        }
        System.out.println(result);
    }


    static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }

        }
        return true;
    }

    static void findPalindromes(String s) {
        String s2;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                s2 = s.substring(i, j + 1);
                if (isPalindrome(s2))
//                    if(s2.length()>2)
                    System.out.print(s.substring(i, j + 1) + ", ");
//                System.out.println();
            }


        }

    }

    public static void main(String[] agrs) {
//        findPalindromes("popabcdefbob");

//        replaceBatBall("batballabcdbalbllbatabcbaball", "bat", "ball");
        replaceBatBall("batballabcdbalbllbat", "bat", "ball");

    }


}
