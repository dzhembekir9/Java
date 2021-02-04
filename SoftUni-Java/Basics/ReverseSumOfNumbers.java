package Basics;

public class ReverseSumOfNumbers {
    public static void main(String[] args) {

        // int[] nums = {123, 234, 12};
        // int[] nums = {12, 12, 34, 84, 66, 12};
        int[] nums = { 120, 1200, 12000 };

        int[] reversed = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != 0) {
                int digit = nums[i] % 10;
                reversed[i] = reversed[i] * 10 + digit;
                nums[i] /= 10;
            }
            sum = sum + reversed[i];
        }

        System.out.println("sum = " + sum);
    }
}
