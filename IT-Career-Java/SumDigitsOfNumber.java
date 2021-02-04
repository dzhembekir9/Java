import java.util.Scanner;
public class SumDigitsOfNumber{
    public static void main(String[] args){
        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();

        int sum = 0;

        while (true) {

            sum = sum + n1 % 10;
            n1 = n1 / 10;

            if (n1 == 0) {
                break;
            }
        }
        
        System.out.println(sum);

        number1.close();
    
    }
}