import java.util.Scanner;
public class StopNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = number.nextInt();

        System.out.print("Enter m = ");
        int m = number.nextInt();

        System.out.print("Enter s = ");
        int s = number.nextInt();

        for (int i = m; i >= n; i--) {

            if ((i % 2 == 0) && (i % 3 == 0)) {
                if (i == s) {
                    break;
                }
                System.out.print(i + " ");
            }
        }   

    }
}
