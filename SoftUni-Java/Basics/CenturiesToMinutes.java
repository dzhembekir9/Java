package Basics;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("centuries = ");
        int centuries = scan.nextInt();

        int years = centuries * 100;
        ;
        int days = (int) (years * 365);
        int hours = (int) (days * 24);
        long minutes = (int) (hours * 60);

        System.out.println(centuries + " centuries = " + years + " years = " + days + " days = " + hours + " hours = "
                + minutes + " minutes");

        scan.close();
    }
}