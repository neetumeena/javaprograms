package codingQuestions.arrayBased;

public class FirstAndLastOccurrence {
/*
get first and last occurrence index of given integer

intput =[1,1,1,1,3,3,3,5,5,5,5,6,7,8,9]
n=1, o/p= 0,3
 */

    public static void print(int[] a, int n) {
        int count = 0;
        int lastIndex = 0;
        int f = 0, l = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
                lastIndex = i;

            }
        }
        if (count == 0) {
            System.out.println("not found");

        } else if (count == 1) {
            System.out.println("Single occurrence at " + lastIndex);
        } else {
            f = lastIndex - count + 1;
            l = lastIndex;
            System.out.println(f + "," + l);
        }

    }

    public static void main(String[] agrs) {
//        int[] a = {1, 1, 1, 1, 3, 3, 3, 5, 5, 5, 5, 6, 7, 8, 9};
        int[] a = {1, 2, 3, 4, 5, 100};


        print(a, 1);


    }


}
