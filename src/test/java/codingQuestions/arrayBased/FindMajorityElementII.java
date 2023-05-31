package codingQuestions.arrayBased;

import java.util.ArrayList;
import java.util.List;

public class FindMajorityElementII {


    public static void main(String[] args) {

        int[] a = {2, 2, 1, 3};

        List<Integer> list = findMajorityElement(a);
        for (int i : list)
            System.out.print(i + ",");

    }

    public static List<Integer> findMajorityElement(int[] a) {

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int el1_count = 0;
        int el2_count = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int j : a) {
            if (j == element1) {
                el1_count++;
            } else if (j == element2)
                el2_count++;
            else if (el1_count == 0) {
                element1 = j;
                el1_count++;
            } else if (el2_count == 0) {
                element2 = j;
                el2_count++;
            } else {
                el1_count--;
                el2_count--;
            }
        }
        el1_count = 0;
        el2_count = 0;
        for (int j : a) {
            if (j == element1)
                el1_count++;
            else if (j == element2)
                el2_count++;
        }
        if (el2_count > a.length / 3) {
            list1.add(element2);
        }
        if (el1_count > a.length / 3)
            list1.add(element1);

        return list1;
    }


}
