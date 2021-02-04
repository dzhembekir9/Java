import java.util.Scanner;
public class Factoriel{
    public static void main(String[] args){

        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();
        int fact = 1;

        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }

        System.out.println(fact);

        number1.close();
    }
}