package codingQuestions.strings;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

public class ValidPalindrome {
    private static boolean isValidPalindrome(String str) {

        String strLC = str.toLowerCase();
        int len = strLC.length();
        int i = 0, j = len - 1;
        boolean result=false;
        if(str.replace(" ","").length()==0)
            return true;
        while (i < j) {

            char getAtl = strLC.charAt(i);
            char getAth = strLC.charAt(j);
            if (!(getAtl >= 'a' && getAtl <= 'z')) {
                i++;
            } else if (!(getAth >= 'a' && getAth <= 'z')) {
                j--;

            } else if (getAtl == getAth) {
                i++;
                j--;
                result =true;
            } else
                return false;
        }
        return result;
    }

    public static void main(String[] agr) {

//        String str = "A man, a plan, a canal: Panama";
//        String str = "race a car";
        String str = "  ";

        boolean result = isValidPalindrome(str);

        System.out.println(result);
    }


}
