package codingQuestions.arrayBased;

public class Test {



    /*
    Find all the pair of prime numbers that add upto the given number.
Input = 14 Output => 7+7; 11+3
5=2+3
6=3+3

     */


    static void findPair(int sum) {
        int n1 = 0;
        int n2 = 0;
        boolean found = false;
        for (int i = 2; i < sum; i++) {
            if (isPrime(i)) {
                n1 = i;
                n2 = sum - i;
                if (isPrime(n2)) {
                    found = true;
                    System.out.println("First number = " + n1 + "Second number =" + n2);
                }

            }
        }
//        if(found)
//            System.out.println("First number = "+ n1 + "Second number =" + n2);
//        else
//            System.out.println("combination not available");

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] argr) {

        int n = 14;
        findPair(14);


    }

}
