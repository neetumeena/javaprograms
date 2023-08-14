package codingQuestions.arrayBased;

import java.util.HashSet;

public class SubArrayWithSum0 {


    public static void main(String[] args) {
//        int[] a = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int[] a = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};

        System.out.println(solution(a));

    }

    private static boolean solution(int[] a) {
        int len = a.length;
        int[] ps = new int[len];
        ps[0] = a[0];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 1; i < len; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
        for (int i = 0; i < len; i++) {
            if (ps[i] == 0) {
                return true;
            }
            if (hs.contains(ps[i]))
                return true;
            else
                hs.add(ps[i]);

        }
        return false;
    }
}
