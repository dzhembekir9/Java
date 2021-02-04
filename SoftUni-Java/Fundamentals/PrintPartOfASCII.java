package Fundamentals;

import java.util.Scanner;

public class PrintPartOfASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        for (int i = n1; i <= n2; i++) {
            char ch = (char) i;
            System.out.print(ch + " ");
        }
        scan.close();
    }

}
