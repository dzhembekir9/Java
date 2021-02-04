package Basics;

import java.util.Scanner;

public class RectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        double a = scan.nextDouble();

        System.out.print("b = ");
        double b = scan.nextDouble();

        double area = a * b;
        double perimeter = 2 * a + 2 * b;

        System.out.println("area = " + area);
        System.out.println("Perimeter = " + perimeter);

        scan.close();
    }
}
