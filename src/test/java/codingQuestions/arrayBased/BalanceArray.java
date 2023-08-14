package codingQuestions.arrayBased;

import java.util.ArrayList;
import java.util.Arrays;

public class BalanceArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        int n = list.size();
        int result = cntIndexesToMakeBalance(list, n);
        System.out.println(result);
    }

    private static int cntIndexesToMakeBalance(ArrayList<Integer> list, int n) {

        int evenCount = 0;
        int oddCount = 0;
        int curr_evenCount = list.get(0);
        int curr_oddCount = 0;
        int new_oddC = 0;
        int new_evenC = 0;
        int res = 0;
        for (int i=0;i<n;i++) {
            if (i % 2 == 0)
                evenCount += list.get(i);
            else
                oddCount += list.get(i);
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                new_evenC = oddCount;
                new_oddC = evenCount - list.get(0);
            } else if (i % 2 == 0) {
                curr_evenCount = curr_evenCount + list.get(i);
                new_evenC = curr_evenCount + oddCount - curr_oddCount - list.get(i);
                new_oddC = curr_oddCount + evenCount - curr_evenCount;

            } else if (i % 2 != 0) {
                curr_oddCount = curr_oddCount + list.get(i);
                new_evenC = curr_evenCount + oddCount - curr_oddCount;
                new_oddC = curr_oddCount + evenCount - curr_evenCount - list.get(i);

            }
            if (new_evenC == new_oddC)
                res++;

        }

        return res;
    }
}
