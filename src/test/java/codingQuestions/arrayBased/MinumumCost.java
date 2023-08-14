package codingQuestions.arrayBased;

import java.util.Arrays;

public class MinumumCost {

    public static void main(String[] args) {
//        int[] a={2,5,1};

        int[] a={20, 4, 2, 18, 19, 18, 19, 15, 16 };

        getMinimumTime(a);
    }

    private static void getMinimumTime(int[] a) {

        int len=0;
        int sum=0;
        int mode=100000007;
        Arrays.sort(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        int p_sum=0;
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans=ans+sum;
            sum=sum+a[i];
//            sum=sum+p_sum;
            sum=sum%mode;
        }
        System.out.println(ans);

    }
}
