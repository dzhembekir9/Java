package Fundamentals;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = scan.next().charAt(0);
            sum += ch;
        }
        System.out.println(sum);
        scan.close();
    }
}
