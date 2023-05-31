package codingQuestions.arrayBased;

/*

You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.

You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.

There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.

Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.

Return the minimum number of minutes needed to pick up all the garbage.

Example 1:

Input: garbage = ["G","P","GP","GG"], travel = [2,4,3]
Output: 21
Explanation:
The paper garbage truck:
1. Travels from house 0 to house 1
2. Collects the paper garbage at house 1
3. Travels from house 1 to house 2
4. Collects the paper garbage at house 2
Altogether, it takes 8 minutes to pick up all the paper garbage.
The glass garbage truck:
1. Collects the glass garbage at house 0
2. Travels from house 0 to house 1
3. Travels from house 1 to house 2
4. Collects the glass garbage at house 2
5. Travels from house 2 to house 3
6. Collects the glass garbage at house 3
Altogether, it takes 13 minutes to pick up all the glass garbage.
Since there is no metal garbage, we do not need to consider the metal garbage truck.
Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.
 */
public class GarbageCollectionMinimumAmountOfTime {
    public static void main(String[] args) {
/*case 1
        String[] garbage = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

 */
        //case 2
        String[] garbage = {"G", "M"};
        int[] travel = {1};


        System.out.println(new GarbageCollectionMinimumAmountOfTime().garbageCollection_1(garbage, travel));
    }

    public int garbageCollection_1(String[] garbage, int[] travel) {

        int lastIndex_p = 0;
        int lastIndex_g = 0;
        int lastIndex_m = 0;
        int garbageUnits = 0;
        int requiredTime = 0;
        for (int i = 0; i < garbage.length; i++) {
            for (char c : garbage[i].toCharArray()) {
                if (c == 'G') lastIndex_g = i;
                else if (c == 'M') lastIndex_m = i;
                else if (c == 'P') lastIndex_p = i;

            }
            garbageUnits += garbage[i].toCharArray().length;
        }
        for (int i = 1; i < travel.length; i++) {
            travel[i] = travel[i] + travel[i - 1];
        }
        requiredTime = requiredTime + (lastIndex_p == 0 ? 0 : travel[lastIndex_p - 1]);
        requiredTime = requiredTime + (lastIndex_g == 0 ? 0 : travel[lastIndex_g - 1]);
        requiredTime = requiredTime + (lastIndex_m == 0 ? 0 : travel[lastIndex_m - 1]);
        return requiredTime + garbageUnits;
    }


//--- this one is wrong
//    public int garbageCollection(String[] garbage, int[] travel) {
//
//        int lastIndex_p = -1;
//        int lastIndex_g = -1;
//        int lastIndex_m = -1;
//        int garbageUnits = 0;
//        int requiredTime = 0;
//        for (int i = 0; i < garbage.length; i++) {
//            for (int j = 0; j < garbage[i].length(); j++) {
//                if (garbage[i].charAt(j) == 'G') {
//                    lastIndex_g = i;
//                } else if (garbage[i].charAt(j) == 'M')
//                    lastIndex_m = i;
//                else if (garbage[i].charAt(j) == 'P')
//                    lastIndex_p = i;
//
//            }
//            garbageUnits = garbageUnits + garbage[i].toCharArray().length;
//        }
//        for (int i = 1; i < travel.length; i++) {
//            travel[i] = travel[i] + travel[i - 1];
//        }
//        requiredTime = requiredTime + (lastIndex_p == -1 ? 0 : travel[lastIndex_p - 1]);
//        requiredTime = requiredTime + (lastIndex_g == -1 ? 0 : travel[lastIndex_g - 1]);
//        requiredTime = requiredTime + (lastIndex_m == -1 ? 0 : travel[lastIndex_m - 1]);
//        return requiredTime + garbageUnits;
//    }


}
