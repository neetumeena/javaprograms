public class Test15 {


    // arr ={2,3,2,6,4,7,7,8,9,10} , output = 2,3,6,7,8,9,10 =7


    static void getOutput(int[] arr) {

        int len = arr.length;
        int count = 1;
        int a1 = arr[0];
        System.out.print("1" + " ,");
        for (int i = 1; i < len; i++) {
            if (arr[i] > a1) {
                a1 = arr[i];
                count++;
                System.out.print(i + 1 + " , ");
            }

        }
        System.out.println();
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[] a = {2, 1, 2, 8, 4, 7, 7, 8, 9, 10};
        getOutput(a);

    }


}
