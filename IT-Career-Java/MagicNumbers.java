import java.util.Scanner;
public class MagicNumbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = scan.nextInt();

        int result = 1;
        
        for (int i = 100000; i < 1000000; i++) {

            int d1 = i % 10;
            int d2 = i % 100 / 10;
            int d3 = i % 1000 / 100;
            int d4 = i % 10000 / 1000;
            int d5 = i % 100000 / 10000;
            int d6 = i % 1000000 / 100000;

            result = d1 * d2 * d3 * d4 * d5 * d6;

            if (result == n) {
                System.out.print(i + " ");
            }
            
        }

    }
}
