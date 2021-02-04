package Basics;

import java.util.Scanner;

public class CharsAndObjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        Object o = str1 + " " + str2;

        System.out.println(o);

        scan.close();
    }
}
