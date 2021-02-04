package Basics;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String surname = scan.nextLine();
        int age = scan.nextInt();

        System.out.println(String.format("Hello, %s %s. You are %d years old.", name, surname, age));

        scan.close();
    }
}
