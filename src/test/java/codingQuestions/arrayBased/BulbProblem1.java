package codingQuestions.arrayBased;

/*
A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class BulbProblem1 {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1};
        System.out.println(lightBulbCount(a));
    }

    static int lightBulbCount(int[] arr) {
        int switchC = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && switchC % 2 == 0) {
                switchC++;
            } else if (arr[i] == 0 && switchC % 2 != 0) {
                continue;

            } else if (arr[i] == 1 && switchC % 2 == 0) {
                continue;

            } else if (arr[i] == 1 && switchC % 2 != 0) {
                switchC++;

            }
        }
        return switchC;
    }

//    static int lightBulbCount(int[] arr) {
//        int n = arr.length;
//        int c0 = 0;
//        int c1 = 0;
//        int count = 0;
//        int newC0 = 0;
//        for (int j : arr) {
//            if (j == 0)
//                c0++;
//            else
//                c1++;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 1)
//                c1--;
//            else {
//                c0--;
//
//                count=count+c0;
//                c0=c1
//                int t = c0;
//                c0 = c1;
//                c1 = t;
//            }
//            if (c0 == 0)
//                break;
//        }
//        return count;
//    }
}
