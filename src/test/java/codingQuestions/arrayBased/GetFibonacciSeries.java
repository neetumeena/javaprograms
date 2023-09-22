package codingQuestions.arrayBased;

import java.util.Arrays;

public class GetFibonacciSeries {

    public static void main(String[] args) {

        int n = 4;
        // 0, 1,1,2,3
        int[] res = getListOfFibSeries(n);
        System.out.println(Arrays.toString(res));

    }

    private static int[] getListOfFibSeries(int n) {

        int[] arr = new int[n];
        int a = 0;
        int b = 1;
        if(n==0)
        {

        }

        else if (n == 1) {
            arr[0] = a;
            return arr;
        }
        else if (n == 2) {
            arr[0] = a;
            arr[1] = b;

            return arr;
        }

        int i = 2;
        arr[0]=a;
        arr[1]=b;
        while (i < n) {

            int c = a + b;
            arr[i] = c;
            a = b;
            b = c;
            i++;
        }
        return arr;

    }
}
