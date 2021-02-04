package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<String> nums = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String num = scan.next();
            nums.add(num);
        }

        Collections.reverse(nums);

        for (String i : nums) {
            System.err.println(i + " ");
        }

        scan.close();
    }
}
