package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByDescending {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = scan.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            int num = scan.nextInt();
            list1.add(num);
        }

        Collections.sort(list1);

        System.out.println("Sorted array");

        for (Integer num : list1) {
            System.out.println(num + " ");
        }

        scan.close();

        // Bubble Sort

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter a number = ");
        // int n = scan.nextInt();

        // int[] nums = new int[n];

        // for (int i = 0; i < nums.length; i++) {
        // System.out.printf("num %d = ", i + 1);
        // int num = scan.nextInt();
        // nums[i] = num;
        // }

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] > nums[j]) {
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // }
        // }
        // }

        // for (Integer num : nums) {
        // System.out.println(num + " ");
        // }
    }
}
