package codingQuestions.arrayBased.BitMap2;

public class SumOfXorOfAllPairs {

    public static void main(String[] args) {

        int [] A={1,2,3};

        System.out.println(solve(A));
    }

    private static int solve(int [] A)
    {
        int mod = 1000000007;
        int len=A.length;
        int res=0;
       for(int i=0;i<32;i++)
       {
           int count0=0;
           int count1=0;
           for (int k : A) {
               if ((k & (i << 1)) != 0)
                   count0++;
               else
                   count1++;
           }
           int p=count0*count1;
           res+=((1<<i)*p);
           res=res%mod;
       }
       return (res%mod);
    }
}
