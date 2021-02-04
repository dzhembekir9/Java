package Basics;

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();
        int remainderSum = 0;
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                remainder = a % b;
                remainderSum += remainder;
            }
        }

        System.out.println("Sum of remainders is: " + remainderSum);
        scan.close();
    }
}
