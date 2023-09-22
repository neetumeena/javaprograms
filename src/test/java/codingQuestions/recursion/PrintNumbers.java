package codingQuestions.recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        print(10);
        System.out.println();
        printNumbers(10);
    }

    public void solve(int A) {
        print(A); //In recurssion if you dont want any logic to repeating then
        System.out.println(); //call it from seprate function.
    }

    public static void printNumbers(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }
        printNumbers(A - 1);
        System.out.print(A + " ");
    }

    public static void print(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }
        print(A - 1);
        System.out.print(A + " ");
    }
}
