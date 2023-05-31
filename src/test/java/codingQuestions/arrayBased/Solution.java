package codingQuestions.arrayBased;

public class Solution {

    static int solution(int[] a, int[] b, int k) {

        int as=a.length;
        int count =0;

        int i=0;
        int j=as-1;

       for(int t=0;t<as;t++)
        {
            int n=Integer.parseInt(a[i] + String.valueOf(b[j]));
            if(k>n)
            {
                count++;
                i++;
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        return count;

    }

    public static void main(String[] agr)
    {
        int[] a={16, 1, 4, 2, 14};
        int[] b={7, 11, 2, 0, 15};
        int k=743;
        System.out.println(solution(a,b,k));

    }

}
