//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Test5 {
//    /*
//
//    i/p = int i =283 || o/p = 382
//Write a prog where ip is 283 & the o/p should be 382
//123 = 321
//321=123
//     */
//    public static void main(String[] agrs)
//    {
////        int a=1234;
//        int a=283;
//        reverseNumber(a);
//    }
//    static void reverseNumber(int a) {
//        int n=a;
//        int r;
//        int result = 0;
//        while (n>0) {
//            r = n % 10; // 283%10=3 , 28/10=8, 2%10=2
//            result = result * 10 + r;  // r=0*10+3 =3 , 3*10+8=38 , 38*10+2=382
//            n = n / 10; // n=283/10=28.3 ==28 , 28/10=2.8=>2 , 2/10 =0.2 , 0
//        }
//        System.out.println(result);
//    }
//
//
//    static void printDuplicateValuesAndIndices(int[] a, int len) {
//    /*
//     print the indices and the values which are not unique in array arr=[25,45,25,96,45,250,25]
//Expected o/p 0 25 2 1 45 4
//     */
//
////        for(int i=0; i<len;i++)
////        {
////            for(int j=0; j<len;j++)
////            {
////                if(i<j && a[i]==a[j])
////                {
////                    System.out.print( + "," + a[]);
////                }
////
////            }
////        }
//
//        HashMap<Integer, ArrayList<Integer>> map =new HashMap<>();
//        for(int i=0; i<len;i++)
//        {
//            ArrayList<Integer> list =new ArrayList<>();
//            if(map.containsKey(a[i]))
//            {
//                map.put(a[i],list.add(i));
//            }
//        }
//
//    }
//}
