package codingQuestions.arrayBased;

public class PerfectNumber {

    public int solve(int A) {

        int sum = 0;
        int i;
        if (A == 0 || A == 1)
            return 0;
        for (i = 1; i <= A/2; i++) {
            if (A % i == 0) {

                sum = sum + i;
                System.out.println("sum ="+sum);

            }
        }
        if (sum == A)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        int a=new PerfectNumber().solve(28);
        System.out.println(a);
    }


}
