package codingQuestions.strings;

public class Test16 {

    //count =1
    //   1.
    //abbbbcccca -> a3b3c4a1
    //i=0, j=3, c=3
    //else --> str.replace((i+1,j),count) ==>a3bbbbccca
    //increment -> i=i+j (0+2)=3 , count =1
    //2.


    //aaaaaaa --best -O(n)
    //abcdefgh-->a1b1


//    static void getOutput(StringBuilder str) {
//        int len = str.length();
//        System.out.println("length = " + len);
//        if (len == 1) {
//            str.append("1");
//        } else {
//            int count = 1;
//            int i = 0;
//            while (i < str.length() - 1) {
//                for (int j = i + 1; j < str.length(); j++) {
//                    if (str.charAt(i) == str.charAt(j)) {
//                        System.out.println(" i= " + i + " , j = "+ j);
//                        count++;
//                    } else {
//                        str.replace(i + 1, j, String.valueOf(count));
//                        System.out.println(str);
//                        i = j;
//                        count = 1;
//                        break;
//                    }
//
//                }
//
//            }
//
//        }
//        System.out.println(str);
//
//    }

    static void getOutput(StringBuilder str) {
        int len = str.length();
        System.out.println("length = " + len);
        int count = 1;
        int index = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {

                count++;
            } else {
                i = count - 2;
                str.replace(count - i, count, String.valueOf(count));
                System.out.println(str);
            }
        }


    }


    public static void main(String[] args) {

        System.out.println("aabbbccccc");
        StringBuilder str1 = new StringBuilder("aabbbccccc");
        getOutput(str1);


    }
}
