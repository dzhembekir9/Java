package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        ArrayList<Integer> newList = new ArrayList<Integer>();

        int firstItem = nums.size() - n;

        System.out.println("First item = " + firstItem);

        for (int i = firstItem; i < nums.size(); i++) {
            newList.add(nums.get(firstItem));
            firstItem++;
        }

        for (int i = 0; i < nums.size() - n; i++) {
            newList.add(nums.get(i));
        }

        for (Integer integer : newList) {
            System.out.println(integer);
        }

        scan.close();

    }
}
