package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovedNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            int num = scan.nextInt();
            if (num > 0) {
                nums.add(num);
            }
        }

        if (nums.size() == 0) {
            System.out.println("Empty");
        } else {
            for (Integer num : nums) {
                System.out.println(num + " ");
            }
        }

        scan.close();

    }
}
