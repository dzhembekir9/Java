package Fundamentals;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
        scan.close();
    }
}
