import java.util.Scanner;
public class StupidPasswordGenerator {
    public static void main(String[] args){

        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        System.out.print("Enter l = ");
        int l = number.nextInt();
        
        for (int num1 = 1; num1 <= n; num1++) {
            for (int num2 = 1; num2 <= n; num2++) {
                for (char l1 = 'a'; l1 <= 'a' + 1; l1++) {
                    for (char l2 = 'a'; l2 <= 'a' + 1; l2++) {
                        for (int lastNum = 2; lastNum <= n; lastNum++) {
                            System.out.print(num1);
                            System.out.print(num2);
                            System.out.print(l1);
                            System.out.print(l2);
                            System.out.print(lastNum);
                            System.out.print(" ");   
                        }
                    }
                }
            }
        }

    }
}
