package Basics;

import java.util.Scanner;

public class ChangeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        int a = scan.nextInt();

        System.out.print("b = ");
        int b = scan.nextInt();

        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scan.close();
    }
}
