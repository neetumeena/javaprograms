package codingQuestions.strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortSentance {


    public static String sort(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                int ch1 = s1.charAt(s1.length() - 1);
                int ch2 = s2.charAt(s2.length() - 1);
                if (ch1 <= ch2) {
                    return -1;
                } else return 1;
            }
        });
        StringBuilder str = new StringBuilder();
        for (String st : arr) {
            String temp = st.substring(0, st.length() - 1);
            str.append(temp + " ");
        }
        return str.toString().trim();
    }

    public static void main(String[] arg) {
        String result = sort("is4 sente2nce This3 a1");
        System.out.println(result);

    }

//    public static String sort1(String words)
//    {
//
//        char[] charArr= words.toCharArray();
//        int charArrLen=charArr.length;
//        if(words.length()<1)
//            return "";
//        String result1="";
//        boolean digitP=false;
//        StringBuilder sb=new StringBuilder();
//        for (int i=0;i<charArrLen;i++)
//        {
//            if(!Character.isDigit(charArr[i]))
//            {
//                result1=result1+charArr[i];
//
//            }
//            else
//            {
//                digitP=true;
//            }
//        }
//        if(digitP)
//        {
//        String arr[]=words.split(" ");
//        String [] res=new String[arr.length];
//        for(int i=0;i<arr.length;i++)
//        {
//            int k=arr[i].length()-1;
//            int m=arr[i].charAt(k)-'0';
//            res[m-1]=arr[i].substring(0,k);
//
//
//        }
//
//        for (int j=0;j<res.length;j++)
//        {
//            sb.append(res[j]+" ");
//        }}
//        else return "";
//
//
//        return (sb.toString()).trim();
//    }


    public static String order(String words) {

        char[] charArr = words.toCharArray();
        int charArrLen = charArr.length;
        if (words.length() < 1)
            return "";
        String result1 = "";
        boolean digitP = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArrLen; i++) {
            if (!Character.isDigit(charArr[i])) {
                result1 = result1 + charArr[i];

            } else {
                digitP = true;
            }
        }
        if (digitP) {
            String arr[] = words.split(" ");
            String[] res = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                int k = arr[i].length() - 1;
                int m = arr[i].charAt(k) - '0';
                res[m - 1] = arr[i].substring(0, k);


            }


        }
        else
            return "";
        return (sb.toString()).trim();


    }
}
