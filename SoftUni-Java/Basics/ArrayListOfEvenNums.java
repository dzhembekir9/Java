package Basics;

import java.util.ArrayList;

public class ArrayListOfEvenNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(4);
        nums.add(8);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(2);
        nums.add(1);

        // nums.add(1);
        // nums.add(2);
        // nums.add(4);
        // nums.add(3);

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
    }
}
