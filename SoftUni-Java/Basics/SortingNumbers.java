package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            nums.add(scan.nextInt());
        }

        Collections.sort(nums);

        for (int i = 0; i < nums.size() - 1; i++) {
            System.out.print(nums.get(i) + " <= ");
        }
        System.out.println(nums.get(nums.size() - 1));

        scan.close();
    }
}
