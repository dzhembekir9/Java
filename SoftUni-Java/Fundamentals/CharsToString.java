package Fundamentals;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);
        char c = scan.next().charAt(0);
        System.out.printf("%c%c%c", a, b, c);
        scan.close();
    }
}
