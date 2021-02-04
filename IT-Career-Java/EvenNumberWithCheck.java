import java.util.Scanner;
public class EvenNumberWithCheck{
    public static void main(String[] args){
        System.out.print("Enter even number = ");

        try {
            Scanner number1 = new Scanner(System.in);
            int n1 = number1.nextInt();
            number1.close();
            if (!(n1 % 2 == 0)) {
                System.out.println("This number is not even");
            }
            else{
                System.out.println("The number is " + n1);
            }
        } catch (Exception e){
            System.out.println("Invalid number!");
        }


    }
}