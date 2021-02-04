package Basics;

public class MultipleOfEvensAndOdds {

    public static void GetMultipleOfEvensAndOdds(int n) {
        int sumEvens = GetSumEvens(n);
        int sumOdds = GetSumOdds(n);

        System.out.println(sumEvens * sumOdds);
    }

    public static int GetSumEvens(int number) {
        if (number < 0) {
            return -1;
        }
        int finalNumber = 0;
        while (number > 0) { // loop ends when all the numbers have been tested
            if (((number % 10) % 2) == 0) { // test for the last digit is even
                finalNumber += number % 10; // takes out the last digit
            }
            number /= 10; // takes out last digit to test the next digit
        }
        return finalNumber;
    }

    public static int GetSumOdds(int number) {
        if (number < 0) {
            return -1;
        }
        int finalNumber = 0;
        while (number > 0) { // loop ends when all the numbers have been tested
            if (((number % 10) % 2) != 0) { // test for the last digit is even
                finalNumber += number % 10; // takes out the last digit
            }
            number /= 10; // takes out last digit to test the next digit
        }
        return finalNumber;
    }

    public static void main(String[] args) {

        GetMultipleOfEvensAndOdds(12345);
    }
}
