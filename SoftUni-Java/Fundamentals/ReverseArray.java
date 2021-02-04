package Fundamentals;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        int j = n - 1;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("num = ");
            int num = scan.nextInt();
            nums[j] = num;
            j--;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        scan.close();
    }
}
