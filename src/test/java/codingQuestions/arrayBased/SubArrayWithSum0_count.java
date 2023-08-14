package codingQuestions.arrayBased;

import java.util.HashMap;

public class SubArrayWithSum0_count {
    public static void main(String[] args) {
//        int[] a = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int[] a = {4, 8, 3, 6, -5, -4, 7, -2, 1, -6, 2};


        System.out.println(solution(a));

    }

    private static int solution(int[] a) {
        int len = a.length;
        int[] ps = new int[len];
        ps[0] = a[0];
        HashMap<Integer, Integer> hp = new HashMap<>();
        int count = 0;
        for (int i = 1; i < len; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
        for (int i = 0; i < len; i++) {
            if (ps[i] == 0) {
                count = count + 1;
            }
            if (hp.containsKey(ps[i])) {
                count = count + hp.get(ps[i]);
                hp.put(ps[i], hp.get(ps[i]) + 1);
            } else
                hp.put(ps[i], 1);

        }
        return count;
    }
}

//[90,497,-411,990,145,353,314,-349,-260,-956,258,-665,-241,192,605,264,-819,-497,829,775,-392,292,997,549,556,561,627,-533,541,-871,240,813,174,-399,-923,-785]
