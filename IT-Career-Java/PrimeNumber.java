import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        System.out.print("Enter num1 = ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();
        boolean prime = true;

        for (int i = 2; i < Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                prime = false;
                break;
            }
        }  
        if (prime) {
            System.out.println("Prime!");
        }   
        else{
            System.out.println("Not prime!");
        }

        number1.close();
    }
}