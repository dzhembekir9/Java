package Basics;

import java.util.Scanner;

public class TwelveNumbersAfterDecimalPoint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("r = ");
        double r = scan.nextDouble();
        double area = Math.PI * r * r;

        System.out.printf("%.12f", area);

        scan.close();
    }
}
