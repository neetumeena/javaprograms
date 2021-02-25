package codingQuestions.arrayBased;

public class ArrangeArray {
/*
input=[1,0,0,8,9,9,6,4,3,3,5,0,1,1,1,4]
output=[0,0,0,1,1,1,1,3,3,4,5,8,9,9]


 */

    public static void getOutput(int[] arr) {
        int len = arr.length;

        int[] temp = new int[len];


        for (int i = 0; i < len; i++) {
            temp[arr[i]] = temp[arr[i]] + 1;
        }
        int j = 0;
        int k = 0;
        while (j < len) {
//            int v=arr[j];
            if (temp[k] > 0) {
                for (int i = 0; i < temp[k]; i++) {
                    arr[i] = k;
                    j++;
                }
            }
        }
        for (int value : arr) {
            System.out.print(value + " , ");
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 0, 8, 9, 9, 6, 4, 3, 3, 5, 0, 1, 1, 1, 4};
        for (int value : input) {
            System.out.print(value + " , ");
        }
        System.out.println("");
        getOutput(input);


    }
}
