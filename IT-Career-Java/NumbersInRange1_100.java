import java.util.Scanner;
public class NumbersInRange1_100 {
    public static void main(String[] args){

        int n;
        do {
            System.out.println("Enter a number in the range [1...100]");
            Scanner number = new Scanner(System.in);
            n = number.nextInt();
            number.close();
            if (n > 1 && n < 100) {
                System.out.println("The number is " + n);
                break;
            }
            else{
                System.out.println("Invalid number");
            }
        } while (n < 1 || n > 100);


    }
}
