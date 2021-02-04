package Basics;

import java.util.Scanner;

public class ClientData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("name:");
        String name = scan.nextLine();
        System.out.println("surname");
        String surname = scan.nextLine();
        System.out.println("age:");
        int age = scan.nextInt();
        System.out.println("gender:");
        char gender = scan.next().charAt(0);
        System.out.println("id:");
        int id = scan.nextInt();
        System.out.println("number:");
        int number = scan.nextInt();

        System.out.println(String.format(
                "First name: %s \nLast name: %s \nAge: %d \nGender: %c \nPersonal ID: %d \nUnique Employee number: %d",
                name, surname, age, gender, id, number));

        scan.close();
    }
}
