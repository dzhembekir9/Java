package Fundamentals;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            BigDecimal num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);
        }
        System.out.println("Sum = " + sum);
        scan.close();
    }
}
