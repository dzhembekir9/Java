package Basics;

import java.util.Scanner;

public class PouringWater {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        int litresPoured = 0;

        for (int i = 0; i < n; i++) {

            int litresToBePoured = scan.nextInt();

            if (litresPoured + litresToBePoured > 255) {

                System.out.println("Insufficient capacity!");
            } else {

                litresPoured += litresToBePoured;
            }

        }

        System.out.println("Total L: " + litresPoured);

        scan.close();
    }
}