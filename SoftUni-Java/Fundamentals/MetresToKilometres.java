package Fundamentals;

import java.util.Scanner;

public class MetresToKilometres {
    public static void main(String[] args) {
        System.out.print("metres = ");
        Scanner scan = new Scanner(System.in);
        double metres = scan.nextInt();
        System.out.printf("%.2f", metres / 1000);
        scan.close();
    }
}
