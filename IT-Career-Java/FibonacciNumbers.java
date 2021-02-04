import java.util.Scanner;
public class FibonacciNumbers{
    public static void main(String[] args){
        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();

        int result = 0;
        int previousNumber = 0;
        int currentNumber = 1;

        for (int i = 0; i < n1; i++) {
            result = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = result;
        }

        System.out.println(result);

        number1.close();

    }
}

