import java.util.Scanner;
public class DrawRocket {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n (even) = ");
        int n = scan.nextInt();

        String dot = ".";
        String left = "\\";
        String right = "/";
        String star = "*";
        String space = " ";

        int dotCounterBottom = n / 2;
        int starCounterBottom = n * 2 - 2;
        int spaceCounter = 0;
        int dotCounterTopMid = (((n * 2) + n) - 2) / 2;
        
        for (int i = 0; i < n; i++) {
            System.out.println(dot.repeat(dotCounterTopMid) + right + space.repeat(spaceCounter) + left + 
            dot.repeat(dotCounterTopMid));
            dotCounterTopMid--;
            spaceCounter += 2;
        }

        System.out.println(dot.repeat(n / 2) + star.repeat(n * 2) + dot.repeat(n / 2));

        for (int i = 0; i < n * 2; i++) {
            System.out.println(dot.repeat(n / 2) + "|" + left.repeat(n * 2 - 2) + "|" + dot.repeat(n / 2));
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(dot.repeat(dotCounterBottom) + right + star.repeat(starCounterBottom) + 
            left + dot.repeat(dotCounterBottom));
            dotCounterBottom--;
            starCounterBottom += 2;
        }

    }
}
