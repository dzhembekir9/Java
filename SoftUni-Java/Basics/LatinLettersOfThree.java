package Basics;

public class LatinLettersOfThree {
    public static void main(String[] args) {

        for (char ch1 = 'a'; ch1 <= 'c'; ch1++) {
            for (char ch2 = 'a'; ch2 <= 'c'; ch2++) {
                for (char ch3 = 'a'; ch3 <= 'c'; ch3++) {
                    System.out.print(ch1);
                    System.out.print(ch2);
                    System.out.println(ch3);
                }
            }
        }

    }
}
