import java.util.Scanner;
public class PyramidOfNumbers{
    public static void main(String[] args){
        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();
        int counter = 1;

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter);
                counter++;
                if (counter == n1 + 1) {
                    break;
                }
            }
            if (counter == n1 + 1) {
                break;
            }
            System.out.println();

        }

        number1.close();
    
    }
}