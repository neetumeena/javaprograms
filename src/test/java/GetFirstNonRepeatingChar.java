import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonRepeatingChar {


    static void getOutput(String s) {
        int len = s.length();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < len; i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
                break;
            }

        }
    }


//    static void arrangeNum(int[] arr)
//    {
//        int len=arr.length;
//        int i=0, j=len-1;
//        while (i<j)
//        {
//            if(arr[i]==1 && arr[j]==0)
//            {
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//            }
//            else if(arr[i]==0)
//            {
//                i++;
//            }
//            else if(arr[j]==1)
//            {
//                j--;
//            }
//
//        }
//
//        for(int a: arr)
//        {
//            System.out.print(a +" , ");
//        }
//
//    }


    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1};
//        arrangeNum(arr);
        getOutput("nneetu");
    }

//    output.txt
//    grep 'ss' ou

    // SELECT name from table_abc order by age desc limit 2,1;

}
