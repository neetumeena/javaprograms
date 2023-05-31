package codingQuestions.arrayBased;

public class ConstructString {
    public static void main(String[] args) {
        String[] arr = {"Daisy", "Rose", "Hyacinth", "Poppy"};
        System.out.println(solution(arr));


    }

    static String solution(String[] arr) {
        int j = 0;
        StringBuilder res = new StringBuilder();
        int count1 = calculateNumberChar(arr);
        int len = arr.length;
        int i = 0;
        while (true) {

            while (i < len) {

//                if(arr[i].charAt(j)!='\0')
                if (arr[i].length() > j) {
                    res.append(arr[i].charAt(j));
                    count1--;
                }

                i++;


            }
            j++;
            i = 0;

            if (count1 == 0)
                break;
        }
        return res.toString();

    }

    private static int calculateNumberChar(String[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++)
                count++;
        }
        return count;
    }
}
