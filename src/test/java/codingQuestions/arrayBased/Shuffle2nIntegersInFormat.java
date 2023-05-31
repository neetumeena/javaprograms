package codingQuestions.arrayBased;

import java.util.Arrays;

public class Shuffle2nIntegersInFormat {

    // method to shuffle an array of size 2n
    static void shuffleArray(int a[], int n) {
        // Rotate the element to the left
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
            for (int j = k; j > i + q; j--) {
                // swap a[j-1], a[j]
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }
    static void shufleArray(int a[], int f, int l)
    {
        if (f > l)
            return;

        // If only 2 element, return
        if (l - f == 1)
            return;

        // finding mid to divide the array
        int mid = (f + l) / 2;

        // using temp for swapping first half of second array
        int temp = mid + 1;

        // mmid is use for swapping second half for first array
        int mmid = (f + mid) / 2;

        // Swapping the element
        for (int i = mmid + 1; i <= mid; i++) {
            // swap a[i], a[temp++]
            int temp1 = a[i];
            a[i] = a[temp];
            a[temp++] = temp1;
        }

        // Recursively doing for first half and second half
        shufleArray(a, f, mid);
        shufleArray(a, mid + 1, l);
    }

    // Driver Method
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 2, 4, 6, 8};

//        shuffleArray(a, a.length / 2);
        shufleArray(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }
}


