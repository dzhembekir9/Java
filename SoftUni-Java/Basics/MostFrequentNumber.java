package Basics;

import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scan.nextInt();
        }

        int mostFrequent = 0;
        int counter = 1;

        for (int i = 0; i < numbers.length; i++) {
            int tempCounter = 1;
            int tempFrequent = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == tempFrequent) {
                    tempCounter++;
                }
            }

            if (tempCounter > counter) {
                counter = tempCounter;
                mostFrequent = tempFrequent;
            }

        }

        System.out.println("Most frquent = " + mostFrequent + ", frequency: " + counter);

        scan.close();

    }
}
