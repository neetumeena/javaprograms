package codingQuestions.strings;

/*Print all the LEADERS in array. An element is leader if it is greater than all the elements to its right side and rightmost element is always a leader
I/P - arr = {16, 17, 4, 3, 5, 2}

i/p={0,5,3,4,6,9}
O/p - 17, 5, 2

j=1,
i=0;
i=16,i++,j++;
i=17, j++ if(j==l), i++ and 17 is leader, j=i+1;



 */

import java.util.ArrayList;

public class Problem2 {


    public static void main(String[] args) {
//        int[] arr = {16, 17, 4, 3, 5, 2};
//        int[] arr={0,5,3,4,6,9,1};
        int[] arr = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};

//        findLeaders(arr);
        int[] aq = solve(arr);
        for (int i : aq) {
            System.out.println(i);

        }
    }

    public static int[] solve(int[] arr) {
        int j = 1;
        int i = 0;
        int l = arr.length;
        int k = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < l - 1) {
            if (arr[i] > arr[j]) {
                j++;
                if (j == l) {
                    list.add(arr[i]);
                    i++;
                    j = i + 1;
                    count++;}
            } else {
                i++;
                j = i + 1;
            }
        }
        int[] a = new int[count + 1];
        list.add(arr[l - 1]);
        for (int aa : list)
            a[k++] = aa;
        return a;
    }

//    private static void findLeaders(int[] arr) {
//        int l = arr.length;
//        int j = 1;
//        int i = 0;
//        while (i < l - 1) {
//            if (arr[i] > arr[j]) {
//                j++;
//                if (j == l) {
//                    System.out.println(arr[i]);
//                    i++;
//                    j = i + 1;
//
//                }
//            } else {
//                i++;
//                j=i+1;
//            }
//        }
//        System.out.println(arr[l - 1]);
//    }


}
