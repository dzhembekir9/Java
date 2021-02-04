package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayOfIntegers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (Integer num : arr) {
            nums.add((num));
        }

        nums.add(3);
        Collections.sort(nums);

        for (Integer num : nums) {
            System.out.println(num + " ");
        }

    }
}
