package codingQuestions;

public class PanlindromTest {


//    String s="my name is name my my neetu is name neetu";


    String abc = "abaabc";

    static void palindrome(String a) {
        int len = a.length();
        int i = 0, j = len - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                System.out.println("String is not palindrome");
                break;
            } else {
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        String name = "abccba";
        palindrome(name);
    }


}
