package Basics;

import java.util.Scanner;

public class ConvertingSpeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("distance in meters = ");
        float distance = scan.nextFloat();

        System.out.print("hours = ");
        float h = scan.nextFloat();

        System.out.print("minutes = ");
        float m = scan.nextFloat();

        System.out.print("seconds = ");
        float s = scan.nextFloat();

        float totalSeconds = (h * 60 * 60) + (m * 60) + s;

        float speedMetresPerSeconds = (float) (distance / totalSeconds);
        float speedKilometresPerHours = (float) (speedMetresPerSeconds * 3.6);
        float speedMilesPerHours = (float) (speedMetresPerSeconds * 2.23694);

        System.out.println(speedMetresPerSeconds);
        System.out.println(speedKilometresPerHours);
        System.out.println(speedMilesPerHours);

        scan.close();

    }
}
