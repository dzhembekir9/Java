package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOfNames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = scan.nextInt();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("name %d = ", i + 1);
            names.add(scan.next());
        }

        Collections.reverse(names);

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(names.get(i));
                break;
            }
            System.out.println(names.get(i) + "; ");

        }
        scan.close();
    }
}
