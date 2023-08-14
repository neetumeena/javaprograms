//package codingQuestions;
//
///*
//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.
//Input: str=btreeare
//Output: eeerrabt
//
//input 1- qwed
//o/p- qwed
//
//input 1- aabd
//
//MAx_char 0,6,1,0,4,0,,0,1,,0,0,
//HashMap<char, int>  e-3
//r-3
//a-3
//b=1
//t-1
//
//arraylist.
//rrraaabt
// */
//
//import groovy.util.MapEntry;
//
//import java.util.*;
//
//public class Problem1 {
//
//
//    public static void main(String[] args) {
//
//        String str = "btreeare";
//        String res = solution1(str);
//    }
//
//    private static String solution1(String str) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        String str1="";
//        for (int i = 0; i < str.length(); i++) {
//            if (map.containsKey(str.charAt(i))) {
//                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//            }
//            else
//                map.put(str.charAt(i),1);
//        }
//        Collections.checkedSortedMap(map);
//        getAndSortArraylist(map,arrayList);
//
//        int j=0;
//        for(int i:arrayList)
//        {
//            while (j<i)
//            {
//
//                str1=str1+map.get()
//            }
//        }
//    }
//    private static void getAndSortArraylist(HashMap<Character, Integer> map,ArrayList<Integer> arrayList) {
//
//        for(Map.Entry<Character, Integer> mapValues: map.entrySet())
//        {
//            arrayList.add(mapValues.getValue());
//        }
//        Collections.sort(arrayList);
//    }
//}
