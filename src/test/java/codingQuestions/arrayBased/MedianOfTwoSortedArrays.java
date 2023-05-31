package codingQuestions.arrayBased;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static float getMedian(int[] arr1, int[] arr2) {

        int arr1_l = arr1.length;
        int arr2_l = arr2.length;
        List<Integer> arr3 = new ArrayList<>();
        int i = 0, j = 0;
        int k = 0;
        float m = 0;
        while (i < arr1_l && j < arr2_l) {
            if (arr1[i] < arr2[j]) {
                arr3.add(arr1[i]);
                i++;
            } else if (arr1[i] == arr2[j]) {
                //    arr3[k++]=arr1[i];
                arr3.add(arr1[i]);
                i++;
                j++;
            } else {
                arr3.add(arr2[j]);
                j++;
            }
        }

        if (i != arr1_l) {
            while (i < arr1_l) {
                arr3.add(arr1[i]);
                i++;
            }
        }
        if (j != arr2_l) {
            while (j < arr2_l) {
                arr3.add(arr2[j]);
                j++;
            }
        }


        int arr3_l = arr3.size();

        for (int a : arr3) {
            System.out.println(a);
        }
        if (arr3_l % 2 == 0) {
            int m1 = arr3_l / 2;
            m = (arr3.get(m1) + arr3.get(m1 + 1)) / 2;
        } else {
            int m1 = arr3_l / 2;
            m = arr3.get(m1);
        }
        return m;


    }


    public static void main(String[] args) {


        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {1, 5, 6, 9};

        float median = getMedian(array1, array2);
        System.out.println(median);


    }

// print("The sum is", addNumbers(num1, num2))

// int array1 = [1, 3, 5, 7]

// int array2 = [1, 5, 6, 9]

// arr3=[1,3,5,6,7,9]


}
