package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOfGreatestAndSmallestNum {
    public static void main(String[] args) {

        // The program does not work with array of equal numbers

        int[] nums = { 5, 4, 8, 5, 7, 8, 2, 1 };
        // int[] nums = {1, 1, 1};
        // int[] nums = {4, 2, 8, 3, 5, 9, 2, 3};

        Arrays.sort(nums);
        int minCounter = 1;
        int maxCounter = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                minCounter++;
            } else {
                break;
            }
        }

        for (int i = 0; i < minCounter; i++) {
            System.out.println(nums[i] + " ");
        }

        ArrayList<Integer> reverseNums = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            reverseNums.add(nums[i]);
        }

        Collections.reverse(reverseNums);

        for (int i = 0; i < reverseNums.size() - 1; i++) {
            if (reverseNums.get(i) == reverseNums.get(i + 1)) {
                maxCounter++;
            } else {
                break;
            }
        }

        for (int i = 0; i < maxCounter; i++) {
            System.out.println(reverseNums.get(i));
        }
    }
}
