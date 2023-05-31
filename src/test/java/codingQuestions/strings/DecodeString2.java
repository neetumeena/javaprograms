package codingQuestions.strings;

/*
Input: "ofrsgkeeeekgs"
Output: geeksforgeeks

Input: str = "bbaa"
Output: abba
Approach: It can be observed that while decoding the string, the first letter of the encoded string becomes the median of the decoded string. So first, write the very first character of the encoded string and remove it from the encoded string then start adding the first character of the encoded string first to the left and then to the right of the decoded string and do this task repeatedly till the encoded string becomes empty.
For example:

Encoded String          Decoded String
ofrsgkeeeekgs           o
frsgkeeeekgs            fo
rsgkeeeekgs             for
sgkeeeekgs              sfor
gkeeeekgs               sforg
keeeekgs                ksforg
eeeekgs                 ksforge
eeekgs                  eksforge
eekgs                   eksforgee
ekgs                    eeksforgee
kgs                     eeksforgeek
gs                      geeksgorgeek
s                       geeksforgeeks
 */
public class DecodeString2 {


    // Function to decode and print
// the original String
    static void decodeStr(String str, int len) {

        // To store the decoded String
        char[] c = new char[len];
        int med, pos = 1, k;

        // Getting the mid element
        if (len % 2 == 1)
            med = len / 2;
        else
            med = len / 2 - 1;

        // Storing the first element of the
        // String at the median position
        c[med] = str.charAt(0);

        // If the length is even then store
        // the second element also
        if (len % 2 == 0)
            c[med + 1] = str.charAt(1);

        // k represents the number of characters
        // that are already stored in the c[]
        if (len % 2 == 1)
            k = 1;
        else
            k = 2;

        for (int i = k; i < len; i += 2) {
            c[med - pos] = str.charAt(i);

            // If String length is odd
            if (len % 2 == 1)
                c[med + pos] = str.charAt(i + 1);

                // If it is even
            else
                c[med + pos + 1] = str.charAt(i + 1);
            pos++;
        }

        // Print the decoded String
        for (int i = 0; i < len; i++)
            System.out.print(c[i]);
    }

    // Driver code
    public static void main(String[] args) {
        String str = "ofrsgkeeeekgs";
        int len = str.length();

        decodeStr(str, len);
    }
}

// This code is contributed by 29AjayKumar


