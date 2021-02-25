package codingQuestions.arrayBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class SortMultiples {


    // Function to sort all the
    // multiples of x from the
    // array in decreasing order
    static void sortMultiples(int arr[], int n, int x) {
//        Vector<Integer> v = new Vector<Integer>();

        ArrayList<Integer> arrList = new ArrayList<>();
        // Insert all multiples of x to a vector
        for (int i = 0; i < n; i++) {
            if (arr[i] % x == 0) {
                arrList.add(arr[i]);
            }
        }

        // Sort the vector in descending
//        Collections.sort(v, Collections.reverseOrder());
        Collections.sort(arrList);

        int j = 0;

        // update the array elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % x == 0) {
                arr[i] = arrList.get(j++);
            }
        }
    }

    // Utility function to print the array
    static void printArray(int[] arr, int N) {
        // Print the array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {125, 3, 15, 6, 100, 5};
        int x = 5;
        int n = arr.length;

        sortMultiples(arr, n, x);

        printArray(arr, n);
    }
}

// This code has been contributed by 29AjayKumar


