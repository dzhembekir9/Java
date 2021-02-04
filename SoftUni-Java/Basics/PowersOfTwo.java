package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        ArrayList<Integer> newNums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            int num = scan.nextInt();
            if (num == Math.sqrt(num) * Math.sqrt(num)) {
                newNums.add(num);
            }
        }

        for (Integer num : newNums) {
            System.out.println(num + " ");
        }

        scan.close();
    }
}
