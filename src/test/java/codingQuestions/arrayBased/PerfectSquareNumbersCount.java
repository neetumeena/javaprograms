package codingQuestions.arrayBased;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquareNumbersCount {
    public static void main(String[] args) {
        int n = 43;
        System.out.println(new PerfectSquareNumbersCount().numSquares(n));
    }

    public int numSquares(int n) {

        int t = n;
        int count = 0;
        int maxN = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (i * i <= n)
                list.add(i * i);

        }
        int list1S = list.size();

        while (list1S != 0) {

            list1S--;

            for (int i = list1S; i >= 0; i--) {

                if (n - list.get(i) >= 0) {
                    count++;
                    n = n - list.get(i);
                    i++;

                }

            }
            if (maxN > count && n==0) {
                maxN = count;
            }
            n = t;
            count=0;

        }


        return maxN;

    }
}

