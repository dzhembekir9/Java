package Basics;

public class ArrayToNumber {
    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        int num = nums.length - 1;
        int[] condenced = new int[num];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - 1; j++) {

                condenced[j] = nums[i] + nums[j + 1];
            }

            nums = condenced;
        }

        System.out.println(nums[0]);

    }
}
