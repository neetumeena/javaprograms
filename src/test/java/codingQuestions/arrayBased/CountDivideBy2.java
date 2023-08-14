package codingQuestions.arrayBased;


public class CountDivideBy2 {


    public static void main(String[] args) {
        int a = solve(100);
        System.out.println(a);
    }

    private static int solve(int A) {
        int count = 0;
        while (A / 2 >= 1) {


            count++;

            A = A / 2;
        }
        return count;
    }
}
