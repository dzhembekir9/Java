package Basics;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();

        if (!(num == (long) num)) {
            System.out.println("Rainy");
        } else if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
            System.out.println("Sunny");
        } else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
            System.out.println("Cloudy");
        } else if (num > Integer.MAX_VALUE && (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)) {
            System.out.println("Windy");
        }

        scan.close();
    }
}
