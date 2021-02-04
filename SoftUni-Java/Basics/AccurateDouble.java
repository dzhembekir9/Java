package Basics;

import java.util.Scanner;

public class AccurateDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long num1 = scan.nextLong();
            sum = sum + num1;
        }

        System.out.println(sum);

        scan.close();

    }
}
