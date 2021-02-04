package Basics;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("num of people = ");
        double n = scan.nextDouble();

        System.out.print("elevator capacity = ");
        double p = scan.nextDouble();

        System.out.println((int) Math.ceil(n / p));

        scan.close();
    }
}
