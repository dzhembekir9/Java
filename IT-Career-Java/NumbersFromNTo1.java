import java.util.Scanner;
public class NumbersFromNTo1{
    public static void main(String[] args){
        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }   

        number.close();

    }
}