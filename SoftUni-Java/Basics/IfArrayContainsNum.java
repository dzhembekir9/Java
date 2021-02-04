package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class IfArrayContainsNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 9 };

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (Integer num : arr) {
            nums.add((num));
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = scan.nextInt();

        if (nums.contains(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
