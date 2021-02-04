package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Min = " + arr[0]);
        System.out.println("Max = " + arr[n - 1]);

        double sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }

        System.out.println("Sum = " + (int) sum);
        System.out.println("Average = " + sum / (double) n);

        scan.close();
    }
}
