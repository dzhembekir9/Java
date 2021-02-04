package Basics;

public class LongestSequenceOfSameNumbers {
    public static void main(String[] args) {

        int[] nums = { 2, 1, 1, 2, 3, 3, 2, 2, 2, 1 };
        // int[] nums = { 4, 4, 4, 4 };
        // int[] nums = { 0, 1, 1, 5, 2, 2, 6, 3, 3 };

        int tempLen = 1;
        int len = 0;
        int number = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                tempLen++;
            } else {
                tempLen = 1;
            }
            if (tempLen > len) {
                len = tempLen;
                number = nums[i];
            }
        }

        System.out.println("length = " + len);
        System.out.println("num = " + number);

    }
}
