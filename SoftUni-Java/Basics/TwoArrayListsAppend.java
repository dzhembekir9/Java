package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayListsAppend {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = scan.nextInt();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.println("List 1:");

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            int num = scan.nextInt();
            list1.add(num);
        }

        System.out.println("List 2:");

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            int num = scan.nextInt();
            list2.add(num);
        }

        list1.addAll(list2);

        for (Integer num : list1) {
            System.out.println(num + " ");
        }

        scan.close();
    }
}
