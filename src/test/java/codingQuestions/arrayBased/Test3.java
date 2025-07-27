package codingQuestions.arrayBased;

public class Test3 {
    /*




    arr=2,5,3,6,8,9,10
    k=3
    output=5



     */
    /*
     1: sort and
     */


    /*
     input=lets crack it
     output=#letscrackit
     */


    static int sort(int[] arr, int n, int k) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        return arr[k - 1];
    }

//     int findLength(String)
//     {
//         while (s)
//
//     }

    static void removeSpace(String str) {
//         findLength(srt)
//
        char charstr[] = str.toCharArray();
        String str2 = "#";
        int len2 = str.length();
        int count = 0;
        for (int i = 0; i < len2; i++)

            if (!String.valueOf(charstr[i]).equals(" ")) {

                if (count == 0)
                    System.out.print("#");
                count++;
                System.out.print(charstr[i]);
            }
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 7, 9, 10};
        int len = arr.length;
        int k = 3;
        int[] arr2 = {1, 2, 2, 0, 0, 1, 2, 2, 1};
        String a = "jkbfdkefw";
        int a1 = a.length();
//        int r=sort(arr,len,k);
//        System.out.println(r);

//        String str="lets crack it";
//        removeSpace(str);

        String str = "neetu";
        printSubStrings(str);
    }

    private static void printSubStrings(String str) {
        //neetu
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                //from i to j

                System.out.println(str.substring(i, j));
            }
        }

    }

//     public static void apiTest()
//    {
//        Request.URI="https://www.google.com/complete/search";
//        // SET QUERY PARAMS
//        Request res= new Request();
//
//        Response response =
//    }

    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }


    }

}
