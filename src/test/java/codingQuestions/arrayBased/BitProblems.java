package codingQuestions.arrayBased;

public class BitProblems {

    public static void main(String[] args) {
        findOutSetBits_approach1(45);
        findOutSetBits_approach2(45);

    }

    private static void findOutSetBits_approach1(int N) {
        int i = 0;
        int count = 0;
        while ((N <<i)!=0) {
            if (checkBit(N, i)) {
                count++;
            }
            i++;
        }
        System.out.println(count);


    }private static void findOutSetBits_approach2(int N) {
        int i = 0;
        int count = 0;
        while (i < 32) {
            if (checkBit(N, i)) {
                count++;
            }
            i++;
        }
        System.out.println(count);


    }

    private static boolean checkBit(int n, int i) {

        return (n & (n << i)) != 0;
    }
}
