package Basics;

import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        int[] numbers = new int[n];
        int[] numbersNew = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("num %d = ", i + 1);
            numbers[i] = scan.nextInt();
            numbersNew[i] = -1;
        }

        int counter;

        for (int i = 0; i < n; i++) {
            counter = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    counter++;
                    numbersNew[j] = 0;
                }

            }
            if (numbersNew[i] != 0) {
                numbersNew[i] = counter;
            }

        }

        for (int i = 0; i < n; i++) {
            if (numbersNew[i] != 0) {
                System.out.println(numbers[i] + " -> " + numbersNew[i]);
            }
        }

        scan.close();
    }
}
