package codingQuestions.arrayBased;

import java.util.ArrayList;

public class AccountManager {

    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int[] c = {1, 2, 4, 6, 11, 14, 17, 19};

        ArrayList<Integer> res = solve1(a, b, c);
//        for (int i : res)
//            System.out.println(i);
    }

    private static ArrayList<Integer> solve1(int a1, int b, int[] c) {
        int len = c.length;
        int a = a1;
        int k = 0;
//        int j = 0;
        boolean found = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            found=false;
            a--;
            for (int j = k; j < i; j++) {
                if (c[i] - c[j] > b) {
                    if (a < a1 - 1) {
                        a++;
                        found = true;
                        k = j;
                    }
                }
            }

            if (found) {
                k++;
            }
            if (a < 0)
            {
                list.add(0);
                System.out.println(0);}
            else{
                list.add(a);
                System.out.println(a);}
        }

        return list;
    }

    private static ArrayList<Integer> solve(int a1, int b, int[] c) {
        int len = c.length;
        int a = a1;
        int k = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            a--;
            for (j = k; j < i; j++) {
                if (c[i] - c[j] > b) {
                    if (a < a1 - 1) {
                        a++;
                        k = j;
                    }
                }
            }
            j = k + 1;
            if (a < 0)
                list.add(0);
            else
                list.add(a);
        }

        return list;
    }
}
