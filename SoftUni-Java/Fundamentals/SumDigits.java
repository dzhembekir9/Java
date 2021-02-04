package Fundamentals;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
        scan.close();
    }
}
