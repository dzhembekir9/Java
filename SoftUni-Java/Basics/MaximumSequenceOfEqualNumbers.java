package Basics;

public class MaximumSequenceOfEqualNumbers {
    public static void main(String[] args) {

        int[] nums = { 3, 4, 4, 5, 5, 5, 2, 2 };

        int tempCounter = 1;
        int num = 0;
        int counter = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                tempCounter++;
            } else {
                tempCounter = 1;
            }
            if (tempCounter > counter) {
                counter = tempCounter;
                num = nums[i];
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(num);
        }
    }
}
