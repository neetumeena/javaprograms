package codingQuestions.arrayBased;
public class CountOfPrimes {

    public int solve(int A) {
        int count=0;
        if(A==0|| A==1)
            return 0;
        for(int i=2;i<=A;i++)
        {
            if(isPrime(i))
            {
                count++;}
        }
        return count;
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CountOfPrimes().solve(8));
    }
}
