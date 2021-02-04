import java.util.Scanner;
import java.math.*;
public class Smart_Lilly {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age = ");
        double age = scan.nextDouble();

        System.out.print("Enter washing machine price = ");
        double machineCost = scan.nextDouble();

        System.out.print("Enter toy cost = ");
        double toyCost = scan.nextDouble();

        double moneyGained = 0;
        double toysGained = 0;
        double totalMoneySaved = 0;
        double moneyForBrother = 0;
        double moneyCount = 10;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                toysGained++;
            }
            else {
                moneyGained = moneyGained + moneyCount;
                moneyForBrother++;
                moneyCount += 10;
            }
        }

        totalMoneySaved = moneyGained + (toysGained * toyCost);

        double moneyLeft = Math.abs(totalMoneySaved - (machineCost + moneyForBrother));

        if (totalMoneySaved >= machineCost) {
            System.out.printf("Yes! " + "%.2f", moneyLeft);
        }
        else {
            System.out.printf("No! " + "%.2f", moneyLeft);
        }

    }
}
