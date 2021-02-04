import java.util.Scanner;
public class NumbersPowerOf2 {
    public static void main(String[] args){
        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        for (int i = 1; i <= Math.pow(2, n); i *= 2) {
            System.out.println(i);
        }   

        number.close();

    }
}
