package codingQuestions.arrayBased;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinDeletionInsertionInArrayToGetExactOcc {
    public int solution(int[] a) {
        // Implement your solution here
        int s=a.length;
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int count =0;
        int e=0;
        int d=0;

        for(int i=0;i<s;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
                map.put(a[i],1);

        }

        for(int j=0;j<s;j++)
        {


            int i=a[j];
            int f=map.get(i);
            if (f>0){
                if(f>i)
                {
                    e=f-i;
                    d+=e;
                    count+=d;
                    s=s-f;
                }
                else if(f<i)
                {
                    if(i>s )
                    {
                        d+=f;
                        count+=f;
                        if(count==s)
                        {
                            return count;
                        }

                    }
                    else if(i<s)
                    {
                        if(d<(i-f))
                        {
                            d+=f;
                        }
                        else
                        {
                            d=d-(i-f);
                            count=count+(i-f);
                            s=s-f;
                        }



                    }


                }
                map.put(a[i],0);
            }
        }

        return count;
    }

    


    public static void main(String[] args) {

    }
}


