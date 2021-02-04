package Basics;

import java.util.Scanner;

public class FromStringToBoolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("str1 = ");
        String str1 = scan.nextLine();
        boolean b1 = Boolean.parseBoolean(str1);
        if (b1 == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print("str1 = ");
        String str2 = scan.nextLine();
        boolean b2 = Boolean.parseBoolean(str2);
        if (b2 == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
