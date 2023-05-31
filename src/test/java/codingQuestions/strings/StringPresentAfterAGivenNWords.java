package codingQuestions.strings;

import java.util.ArrayList;

public class StringPresentAfterAGivenNWords {


    public static void main(String[] agr) {


//        String s= "Siddhesh is a smart guy the city he lives in is a smart city";
        String s="David loves to play and David loves to write sometimes";
        ArrayList<String> lis = new ArrayList<String>();
//        lis.add("is");
//        lis.add("a");
//        lis.add("smart");
        lis.add("loves");
        lis.add("to");

        // Function call
       findOccurrences(s, lis);
    }

    private static void findOccurrences(String s, ArrayList<String> lis) {

        String[] str = s.split(" ");
        int j = 0;
        int len = lis.size();
        ArrayList<String> res=new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(lis.get(j))) {
                int prev = i;
                while (j < len) {
                    if (str[i].equalsIgnoreCase(lis.get(j))) {
                        i++;
                        j++;
                        if(j==len-1)
                        {
                            res.add(str[i+1]);
                        }
                    } else {
                        i = prev;
                        break;
                    }
                }

            }
            j=0;
        }
        for (String s1:res)
        {
            System.out.println(s1);
        }
    }
}
