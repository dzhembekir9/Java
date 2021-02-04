package Basics;

import java.util.Scanner;

public class VariableLimits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type:");
        String type = scan.nextLine();

        if (type.equals("int")) {
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
        } else if (type.equals("long")) {
            System.out.println(Long.MIN_VALUE);
            System.out.println(Long.MAX_VALUE);
        } else if (type.equals("byte")) {
            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);
        }

        scan.close();

    }
}
