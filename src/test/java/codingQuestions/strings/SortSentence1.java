package codingQuestions.strings;

public class SortSentence1 {



    public static void main(String[] arg) {
        String result = order("is4 sente2nce This3 a1");
        System.out.println(result);

    }



    public static String order(String words) {

        char[] charArr = words.toCharArray();
        int charArrLen = charArr.length;
        if (words.length() < 1)
            return "";
        StringBuilder result1 = new StringBuilder();
        boolean digitP = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : charArr) {
            if (!Character.isDigit(c)) {
                result1.append(c);

            } else {
                digitP = true;
            }
        }
        String[] arr=words.split(" ");
        String[] res =new String[arr.length];

        if (digitP) {

            for(int i=0;i<arr.length;i++)

            {
                char[] char1=arr[i].toCharArray();
                for(int j=0;j<char1.length;j++)
                {
                    if(Character.isDigit(char1[j]))
                        res[Integer.parseInt(String.valueOf(char1[j]))-1]=arr[i];
                }
            }

            for (int j = 0; j < res.length; j++) {
                sb.append(res[j]).append(" ");
            }
            for (int j = 0; j < sb.length(); j++) {
               if(!Character.isDigit(sb.charAt(j)))
               {
                   sb2.append(sb.charAt(j));
               }

            }
        }
        return sb2.toString().trim();
    }
}
