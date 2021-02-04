package Basics;

import java.util.Scanner;

public class CheckingIntegerOrFloat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("num = ");
        double numDouble = scan.nextDouble();

        if (numDouble == (int) numDouble) {
            System.out.println("Integer");
        } else {
            System.out.println("Floating-point");
        }

        scan.close();

    }
}
