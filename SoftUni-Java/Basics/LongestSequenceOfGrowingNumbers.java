package Basics;

public class LongestSequenceOfGrowingNumbers {
    public static void main(String[] args) {

        int[] nums = { 2, 1, 2, 3, 4, 5, 6, 2, 2, 1 };
        // int[] nums = { 4, 4, 4, 4 };
        // int[] nums = { 0, 1, 1, 5, 2, 2, 6, 3, 3 };

        int lastNum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                System.out.println(nums[i]);
                lastNum = nums[i + 1];
            }
        }

        System.out.println(lastNum);
    }
}
