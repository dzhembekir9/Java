import java.util.Scanner;
public class TheLCD{
    public static void main(String[] args){
        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();

        System.out.print("Enter num2 = ");
        Scanner number2 = new Scanner(System.in);
        int n2 = number2.nextInt();

        while (n2 != 0) {
            var oldN2 = n2;
            n2 = n1 % n2;
            n1 = oldN2;
        }

        System.out.println("GDC = " + n1);

        number1.close();
        number2.close();

    }
}