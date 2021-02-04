package Fundamentals;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name 1: ");
        String name1 = scan.nextLine();
        System.out.print("Name 2: ");
        String name2 = scan.nextLine();
        System.out.print("delimiter: ");
        String delimiter = scan.nextLine();
        System.out.printf("%s%s%s", name1, delimiter, name2);
        scan.close();
    }
}
