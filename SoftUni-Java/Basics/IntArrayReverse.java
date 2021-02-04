package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            nums.add(num);
        }

        Collections.reverse(nums);

        for (int i : nums) {
            System.err.println(i + " ");
        }

        scan.close();
    }
}
