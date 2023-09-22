package codingQuestions.strings;

import java.util.HashMap;
import java.util.Map;

public class GetMaximumConsecutiveSubstringsLen {


    /*
    Str s = aabbbbcbbcccaaaadadd
    a= 4
    b=4
    c=3
    d=2
     */


    /*
    array[]={-40,-5,1,3,6,7,8,20};
    Find the pair of int whose sum is closest to 5
     */

    public static void main(String[] args) {
        String s = "ababbbbcbbcccaaaadadde";
        getLen(s);
        int[] array = {-40, -5, 1, 3, 6, 7, 8, 20};
        int x=5;
//        getThePair(array,5);


    }

    private static void getThePair(int[] array, int x) {

        int len = array.length;
        int ans = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
//                System.out.println(Math.abs(array[i] + array[j] ));
                if (Math.abs((array[i] + array[j] )-x) < ans) {
                    index1 = i;
                    index2 = j;
                    ans =Math.abs((array[i] + array[j] )-x);
                    System.out.println(ans + " , Value 1 = " + array[index1]+ " , Value 2 = " + array[index2]);


                }
            }
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("index 1 = " + index1 + ", index 2 = " + index2);
        System.out.println(ans);


    }

    private static void getLen(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        int currCount = 1;
        int i;
        for (i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                currCount++;
                if (hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i), Math.max(currCount, hm.get(s.charAt(i))));
                } else {
                    hm.put(s.charAt(i), currCount);
                }
            } else {
                if (hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i), Math.max(currCount, hm.get(s.charAt(i))));
                } else {
                    hm.put(s.charAt(i), currCount);
                }
                currCount = 1;
            }
        }
        if (s.charAt(i-1) != s.charAt(i)) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), Math.max(currCount, hm.get(s.charAt(i))));
            } else {
                hm.put(s.charAt(i), currCount);
            }
        }
        for (Map.Entry<Character, Integer> hm_ : hm.entrySet()) {
            System.out.println(hm_.getKey() + " = " + hm_.getValue());
        }
    }
}
