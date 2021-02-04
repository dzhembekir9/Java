package Basics;

import java.util.Scanner;

public class LetterIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();

        String[] letters = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        String[] inputLetters = new String[n];

        for (int i = 0; i < n; i++) {

            String letter = scan.next();
            inputLetters[i] = letter;
        }

        System.out.println();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < inputLetters.length; j++) {
                if (inputLetters[j].contains(letters[i])) {
                    System.out.println(inputLetters[j] + " -> " + i);
                }
            }
        }

        scan.close();

    }
}
