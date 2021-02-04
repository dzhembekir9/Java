import java.util.Scanner;
public class LoopByStep3{
    public static void main(String[] args){
        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }

        number.close();
    }
}