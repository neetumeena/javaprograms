package codingQuestions.strings;

public class MinimumDistanceBetweenXAndO {

    public static void main(String[] args) {
        String str="x..o.x..o";
        int min=getMinDis(str);
        System.out.println(min);
    }

    private static int getMinDis(String str) {
        int len=str.length();
        int minD=Integer.MAX_VALUE;
        int x=-1;
        int o=-1;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='x')
            {
                x=i;
            }
            else if(str.charAt(i)=='o')
            {
                o=i;
            }
            if(x!=-1 &&o!=-1)
            {
                minD=Math.min(minD,Math.abs(x-o));
            }
        }
        return minD;
    }
}
